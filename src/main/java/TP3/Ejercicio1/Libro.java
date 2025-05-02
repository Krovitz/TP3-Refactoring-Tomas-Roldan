package TP3.Ejercicio1;

abstract class Libro {
    public static final int INFANTILES = 2;
    public static final int REGULARES = 0;
    public static final int NUEVO_LANZAMIENTO = 1;
    private String nombre;
    private int codigoPrecio;

    public Libro(String nombre) {
        this.nombre = nombre;
    }

    protected abstract int codigoPrecio();

    protected abstract double calcularMonto(int diasAlquilados);

    public String nombre() {
        return nombre;
    }
}
