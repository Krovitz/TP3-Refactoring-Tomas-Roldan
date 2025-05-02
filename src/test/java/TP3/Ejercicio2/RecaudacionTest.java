package TP3.Ejercicio2;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecaudacionTest {
    @Test
    public void testExecuteQueryGivenCompany() throws IOException {
        var r1 = new Recaudacion(new LectorCSV("src/main/resources/data.csv"));
        var resultados = r1.filtrarPor(Recaudacion.COMPANY_NAME, "Facebook").executeQuery();
        assertEquals(resultados.size(), 7);
    }

    @Test
    public void testExecuteQueryGivenCity() throws IOException {
        var r1 = new Recaudacion(new LectorCSV("src/main/resources/data.csv"));
        var resultados = r1.filtrarPor(Recaudacion.CITY, "Tempe").executeQuery();
        assertEquals(resultados.size(), 3);
    }

    @Test
    public void testExecuteQueryGivenState() throws IOException {
        var r1 = new Recaudacion(new LectorCSV("src/main/resources/data.csv"));
        var resultados = r1.filtrarPor(Recaudacion.STATE, "CA").executeQuery();
        assertEquals(resultados.size(), 873);
    }

    @Test
    public void testExecuteQueryGivenRound() throws IOException {
        var r1 = new Recaudacion(new LectorCSV("src/main/resources/data.csv"));
        var resultados = r1.filtrarPor(Recaudacion.ROUND, "a").executeQuery();
        assertEquals(resultados.size(), 582);
    }

    @Test
    public void testMultipleOptions() throws IOException {
        var r1 = new Recaudacion(new LectorCSV("src/main/resources/data.csv"));
        var resultados = r1.filtrarPor(Recaudacion.ROUND, "a").filtrarPor(Recaudacion.COMPANY_NAME, "Facebook").executeQuery();
        assertEquals(resultados.size(), 1);
    }

    @Test
    public void testExecuteQueryNotExists() throws IOException {
        var r1 = new Recaudacion(new LectorCSV("src/main/resources/data.csv"));
        var resultados = r1.filtrarPor(Recaudacion.COMPANY_NAME, "NotFacebook").executeQuery();
        assertEquals(resultados.size(), 0);
    }

    @Test
    public void testExecuteQueryCorrectKeys() throws IOException {
        var r1 = new Recaudacion(new LectorCSV("src/main/resources/data.csv"));
        var row = r1.filtrarPor(Recaudacion.COMPANY_NAME, "Facebook").executeQuery().get(0);

        assertEquals(row.get("permalink"), "facebook");
        assertEquals(row.get("company_name"), "Facebook");
        assertEquals(row.get("number_employees"), "450");
        assertEquals(row.get("category"), "web");
        assertEquals(row.get("city"), "Palo Alto");
        assertEquals(row.get("state"), "CA");
        assertEquals(row.get("funded_date"), "1-Sep-04");
        assertEquals(row.get("raised_amount"), "500000");
        assertEquals(row.get("round"), "angel");

    }
}
