package Objetos;

public class Profesor extends Empleado{
    protected String despacho; //(lenguajes, matemáticas, arquitectura, ...)

    public Profesor() {
    }

    public Profesor(String despacho, int anioIncorporacion, int numDespacho, String nombre, String apellido, String estadoCivil, int numId) {
        super(anioIncorporacion, numDespacho, nombre, apellido, estadoCivil, numId);
        this.despacho = despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getDespacho() {
        return despacho;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(nombre);
        sb.append(" ").append(apellido);
        sb.append("] - [Despacho = ").append(despacho);
        sb.append("] - [").append(estadoCivil);
        sb.append("] - [").append(numId);
        sb.append("] - [Anio de Incorporacion = ").append(anioIncorporacion);
        sb.append("] - [Despacho Num = ").append(numDespacho);       
        sb.append(']');
        return sb.toString();
    }        
}