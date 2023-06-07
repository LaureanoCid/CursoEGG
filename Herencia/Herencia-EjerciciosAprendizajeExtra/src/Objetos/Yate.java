package Objetos;

public class Yate extends BarcoMotor{
    protected int numCamarote;

    public Yate() {
    }

    public Yate(int numCamarote, int potenciaCV, int matricula, double tamanio, int anioFab) {
        super(potenciaCV, matricula, tamanio, anioFab);
        this.numCamarote = numCamarote;
    }
    
    @Override
    public void crearBarco(){
        super.crearBarco();
        System.out.println("Ingrese la cantidad de camarotes: ");
        numCamarote = leer.nextInt();
    }
    
    @Override
    public double modulo() {
        return super.modulo()+numCamarote;
    }
    
}