package Objeto;

public class Persona {
    private String nombre;
    private String apellido;
    private Dni numero;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Dni numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Dni getNumero() {
        return numero;
    }

    public void setNumero(Dni numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Persona[" + "" + nombre + " - " + apellido + " - DNI = " + numero + ']';
    }   
}