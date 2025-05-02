package TP3.Ejercicio1;

public class NuevoLanzamiento extends Libro {
    public NuevoLanzamiento(String nombre) {
        super(nombre);
    }

    @Override
    protected int codigoPrecio() {
        return 1;
    }

    @Override
    protected double calcularMonto(int diasAlquilados) {
        return diasAlquilados * 3;
    }
}
