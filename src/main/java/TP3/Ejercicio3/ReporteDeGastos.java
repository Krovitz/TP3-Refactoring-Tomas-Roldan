package TP3.Ejercicio3;

import java.time.LocalDate;
import java.util.List;


abstract class Gasto {
    private int monto;

    public Gasto(int monto) {
        this.monto = monto;
    }

    public abstract String nombre();

    public int monto() {
        return this.monto;
    }

    protected abstract int montoComida();

    protected abstract boolean esExcesoComida();
}

public class ReporteDeGastos {
    private static String esExceso(Gasto gasto) {
        return gasto.esExcesoComida() ? "X" : " ";
    }

    public String imprimir(List<Gasto> gastos, LocalDate fechaDeReporte) {
        String reporte = "";
        int total = 0;
        int gastosDeComida = 0;

        reporte = "Expenses " + fechaDeReporte + System.lineSeparator();

        for (Gasto gasto : gastos) {

            gastosDeComida += gasto.montoComida();

            reporte += gasto.nombre() + "\t"
                    + gasto.monto()
                    + "\t" + esExceso(gasto)
                    + System.lineSeparator();

            total += gasto.monto();
        }

        reporte += "Gastos de comida: " + gastosDeComida + System.lineSeparator();
        reporte += "Total de gastos: " + total + System.lineSeparator();

        return reporte;
    }
}
