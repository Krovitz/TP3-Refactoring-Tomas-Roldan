package TP3.Ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlquilerTest {
    @Test
    public void calcularDeudaYPuntosRegularTest() {
        Libro elTunel = new Regular("El Túnel");
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Cliente yo = new Cliente("Javier");

        yo.alquilar(alquilerElTunel);
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
        assertEquals(6.5, resultado[0]);
        assertEquals(1, resultado[1]);
    }

    @Test
    public void calcularDeudaYPuntosInfantilTest() {
        Libro elTunel = new Infantil("El Túnel");
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Cliente yo = new Cliente("Javier");

        yo.alquilar(alquilerElTunel);
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
        assertEquals(4.5, resultado[0]);
        assertEquals(1, resultado[1]);
    }

    @Test
    public void calcularDeudaYPuntosNuevoLanzamientoTest() {
        Libro elTunel = new NuevoLanzamiento("El Túnel");
        CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
        Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
        Cliente yo = new Cliente("Javier");

        yo.alquilar(alquilerElTunel);
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
        assertEquals(15.0, resultado[0]);
        assertEquals(2, resultado[1]);
    }
}
