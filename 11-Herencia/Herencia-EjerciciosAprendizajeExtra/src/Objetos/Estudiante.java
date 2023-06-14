package Objetos;

public class Estudiante extends Persona{
    protected String nombreCurso;

    public Estudiante() {
    }

    public Estudiante(String nombreCurso, String nombre, String apellido, String estadoCivil, int numId) {
        super(nombre, apellido, estadoCivil, numId);
        this.nombreCurso = nombreCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(nombre);
        sb.append(" ").append(apellido);
        sb.append("] - [Curso = ").append(nombreCurso);
        sb.append("] - [").append(estadoCivil);
        sb.append("] - [").append(numId);        
        sb.append(']');
        return sb.toString();
    }            
}