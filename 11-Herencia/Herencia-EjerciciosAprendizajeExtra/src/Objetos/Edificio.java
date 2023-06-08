package Objetos;

import java.util.Scanner;

public abstract class Edificio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected double ancho, alto, largo;

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }
    public abstract void calcularSuperficie();
    
    public abstract void calcularVolumen();
}