package Objetos;

public class PersonalServicio extends Empleado{
    protected String seccion; //(biblioteca, decanato, secretaría, ...)

    public PersonalServicio() {
    }

    public PersonalServicio(String seccion, int anioIncorporacion, int numDespacho, String nombre, String apellido, String estadoCivil, int numId) {
        super(anioIncorporacion, numDespacho, nombre, apellido, estadoCivil, numId);
        this.seccion = seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(nombre);
        sb.append(" ").append(apellido);
        sb.append("] - [Seccion = ").append(seccion);
        sb.append("] - [").append(estadoCivil);
        sb.append("] - [").append(numId);
        sb.append("] - [Anio de Incorporacion = ").append(anioIncorporacion);
        sb.append("] - [Despacho Num = ").append(numDespacho);        
        sb.append(']');
        return sb.toString();
    }    
}