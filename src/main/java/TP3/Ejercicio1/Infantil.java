package TP3.Ejercicio1;

public class Infantil extends Libro {
    public Infantil(String nombre) {
        super(nombre);
    }

    @Override
    protected int codigoPrecio() {
        return 2;
    }

    @Override
    protected double calcularMonto(int diasAlquilados) {
        return 1.5 + ((diasAlquilados > 3) ? (diasAlquilados - 3) * 1.5 : 0);
    }
}
