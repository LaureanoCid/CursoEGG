package Objetos;

import java.util.Date;

public class Yate extends BarcoMotor{
    protected int numCamarote;

    public Yate() {
    }

    public Yate(int numCamarote, int potenciaCV, int matricula, double tamanio, Date anioFab) {
        super(potenciaCV, matricula, tamanio, anioFab);
        this.numCamarote = numCamarote;
    }
    
    
}