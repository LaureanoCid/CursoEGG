package Objetos;

public class Empleado extends Persona{
    protected int anioIncorporacion; // Año de incorporacion a la facultad
    protected int numDespacho;

    public Empleado() {
    }

    public Empleado(int anioIncorporacion, int numDespacho, String nombre, String apellido, String estadoCivil, int numId) {
        super(nombre, apellido, estadoCivil, numId);
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }    

    public int getNumDespacho() {
        return numDespacho;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(nombre);
        sb.append(" ").append(apellido);
        sb.append("] - [Despacho Num = ").append(numDespacho);
        sb.append("] - [").append(estadoCivil);
        sb.append("] - [").append(numId);
        sb.append("] - [Anio de Incorporacion = ").append(anioIncorporacion);        
        sb.append(']');
        return sb.toString();
    }    
}