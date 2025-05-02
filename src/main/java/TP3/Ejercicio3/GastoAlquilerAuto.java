package TP3.Ejercicio3;

public class GastoAlquilerAuto extends Gasto {
    public GastoAlquilerAuto(int monto) {
        super(monto);
    }

    @Override
    public String nombre() {
        return "Alquiler de Autos";
    }

    @Override
    protected int montoComida() {
        return 0;
    }

    @Override
    protected boolean esExcesoComida() {
        return false;
    }
}
