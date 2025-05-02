package TP3.Ejercicio3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReporteDeGastoTest {
    @Test
    public void gastosDesayunoMayorA1000() {
        var g1 = new GastoDesayuno(10000);
        var reporte = new ReporteDeGastos();

        assertEquals("Expenses 2025-04-21\r\n" +
                "Desayuno\t10000\tX\r\n" +
                "Gastos de comida: 10000\r\n" +
                "Total de gastos: 10000\r\n", reporte.imprimir(List.of(g1), LocalDate.of(2025, 04, 21)));
    }

    @Test
    public void gastosDesayunoMenorA1000() {
        var g1 = new GastoDesayuno(800);
        var reporte = new ReporteDeGastos();

        assertEquals("Expenses 2025-04-21\r\n" +
                "Desayuno\t800\t \r\n" +
                "Gastos de comida: 800\r\n" +
                "Total de gastos: 800\r\n", reporte.imprimir(List.of(g1), LocalDate.of(2025, 04, 21)));
    }

    @Test
    public void gastosCenaMenor5000() {
        var g1 = new GastoCena(4999);
        var reporte = new ReporteDeGastos();

        assertEquals("Expenses 2025-04-21\r\n" +
                "Cena\t4999\t \r\n" +
                "Gastos de comida: 4999\r\n" +
                "Total de gastos: 4999\r\n", reporte.imprimir(List.of(g1), LocalDate.of(2025, 04, 21)));
    }

    @Test
    public void gastosCenaMayor5000() {
        var g1 = new GastoCena(6000);
        var reporte = new ReporteDeGastos();

        assertEquals("Expenses 2025-04-21\r\n" +
                "Cena\t6000\tX\r\n" +
                "Gastos de comida: 6000\r\n" +
                "Total de gastos: 6000\r\n", reporte.imprimir(List.of(g1), LocalDate.of(2025, 04, 21)));
    }

    @Test
    public void gastosMultiples() {
        var g1 = new GastoDesayuno(10000);
        var g2 = new GastoCena(200);
        var reporte = new ReporteDeGastos();

        assertEquals("Expenses 2025-04-21\r\n" +
                "Desayuno\t10000\tX\r\n" +
                "Cena\t200\t \r\n" +
                "Gastos de comida: 10200\r\n" +
                "Total de gastos: 10200\r\n", reporte.imprimir(List.of(g1, g2), LocalDate.of(2025, 04, 21)));
    }

    @Test
    public void gastosMultipleCenaYAlquilerAuto() {
        var g1 = new GastoAlquilerAuto(20000);
        var g2 = new GastoCena(200);
        var reporte = new ReporteDeGastos();

        assertEquals("Expenses 2025-04-21\r\n" +
                "Alquiler de Autos\t20000\t \r\n" +
                "Cena\t200\t \r\n" +
                "Gastos de comida: 200\r\n" +
                "Total de gastos: 20200\r\n", reporte.imprimir(List.of(g1, g2),
                LocalDate.of(2025, 04, 21)));
    }
}
