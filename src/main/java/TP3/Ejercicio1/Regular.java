package TP3.Ejercicio1;

public class Regular extends Libro {

    public Regular(String nombre) {
        super(nombre);
    }

    @Override
    protected int codigoPrecio() {
        return 0;
    }

    @Override
    protected double calcularMonto(int diasAlquilados) {
        return 2 + ((diasAlquilados > 2) ? (diasAlquilados - 2) * 1.5 : 0);
    }
}
