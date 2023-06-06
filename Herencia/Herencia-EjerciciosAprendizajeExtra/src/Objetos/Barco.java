package Objetos;

import java.util.Date;

public class Barco {
    protected int matricula;
    protected double tamanio;
    protected Date anioFab;

    public Barco() {
    }

    public Barco(int matricula, double tamanio, Date anioFab) {
        this.matricula = matricula;
        this.tamanio = tamanio;
        this.anioFab = anioFab;
    }
    
    
}