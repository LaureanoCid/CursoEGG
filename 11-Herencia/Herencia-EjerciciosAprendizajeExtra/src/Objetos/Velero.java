package Objetos;

public class Velero extends Barco{
    protected int numMastil;

    public Velero() {
    }

    public Velero(int numMastil, int matricula, double tamanio, int anioFab) {
        super(matricula, tamanio, anioFab);
        this.numMastil = numMastil;
    }
    
    @Override
    public void crearBarco(){
        super.crearBarco();
        System.out.println("Ingrese la cantidad de mastiles: ");
        numMastil = leer.nextInt();
    }
    
    @Override
    public double modulo() {
        return super.modulo()+numMastil;
    }
    
}