package Objetos;

import java.util.Date;

public class Persona12 {
    private String nombre;
    private Date fechaNacimiento;

    public Persona12() {
    }

    public Persona12(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }  

    @Override
    public String toString() {
        return "Persona[" + "Nombre = " + nombre + " - [Fecha de Nacimiento = " + fechaNacimiento + ']';
    }      
}