package Objetos;

public class Persona {
    protected String nombre, apellido, estadoCivil;
    protected int numId;

    public Persona() {
    }
        
    public Persona(String nombre, String apellido, String estadoCivil, int numId) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.numId = numId;
    } 

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }       

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(nombre);
        sb.append(" ").append(apellido);
        sb.append("] - [").append(estadoCivil);
        sb.append("] - [").append(numId);
        sb.append(']');
        return sb.toString();
    }
    
}