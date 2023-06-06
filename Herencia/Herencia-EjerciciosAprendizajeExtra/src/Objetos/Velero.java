package Objetos;

import java.util.Date;

public class Velero extends Barco{
    protected int numMastil;

    public Velero() {
    }

    public Velero(int numMastil, int matricula, double tamanio, Date anioFab) {
        super(matricula, tamanio, anioFab);
        this.numMastil = numMastil;
    }
    
    
}