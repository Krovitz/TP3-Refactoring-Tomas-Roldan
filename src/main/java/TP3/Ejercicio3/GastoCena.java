package TP3.Ejercicio3;

public class GastoCena extends Gasto {
    public GastoCena(int monto) {
        super(monto);
    }

    @Override
    public String nombre() {
        return "Cena";
    }

    @Override
    protected int montoComida() {
        return this.monto();
    }

    @Override
    protected boolean esExcesoComida() {
        if (this.monto() > 5000) {
            return true;
        }
        return false;
    }
}
