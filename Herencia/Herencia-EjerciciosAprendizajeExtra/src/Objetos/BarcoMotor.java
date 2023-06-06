package Objetos;

import java.util.Date;

public class BarcoMotor extends Barco{
    protected int potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(int potenciaCV, int matricula, double tamanio, Date anioFab) {
        super(matricula, tamanio, anioFab);
        this.potenciaCV = potenciaCV;
    }
    
    
}