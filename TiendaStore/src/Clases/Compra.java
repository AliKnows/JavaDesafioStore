package Clases;

public class Compra {
    private String descripcion;
    private double valor;


    public Compra(double valor, String descripcion) {
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: " + " Tipo='" + descripcion + ", valor=" + valor;
    }
}
