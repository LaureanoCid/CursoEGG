package Entidad;

import java.util.ArrayList;
import java.util.Random;

public class Espectador {
    private String nombre;
    private int edad;
    private double dineroDisp;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, double dineroDisp) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisp = dineroDisp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDineroDisp() {
        return dineroDisp;
    }

    public void setDineroDisp(double dineroDisp) {
        this.dineroDisp = dineroDisp;
    }   

    @Override
    public String toString() {
        return "Espectador[" + "Nombre = " + nombre + " - Edad = " + edad + " - Dinero Disponible = $" + dineroDisp + ']';
    }        
}