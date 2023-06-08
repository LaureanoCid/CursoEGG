package Objetos;

public class Cafetera {

    private double cantidadMaxima;
    private double cantidadActual;

    public Cafetera() {
    }

    public Cafetera(double cantidadMaxima, double cantidadActual) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public double getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(double cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
}