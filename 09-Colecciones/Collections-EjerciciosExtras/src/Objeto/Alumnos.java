package Objeto;
import java.util.Comparator;
import java.util.Date;

public class Alumnos {  
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private Date fechaNacimiento;

    public Alumnos() {
    }

    public Alumnos(String nombre, String apellido, String nacionalidad, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Alumno[" + "[" + nombre + " " + apellido + "] - [" + nacionalidad + "] - [Fecha de Nacimiento = " + fechaNacimiento + ']';
    }   
    public static Comparator<Alumnos> compararAlumnosAscAp = new Comparator<Alumnos>() {
        @Override
        public int compare(Alumnos a1, Alumnos a2) {
            return a1.getApellido().compareTo(a2.getApellido());
        }
    };
    public static Comparator<Alumnos> compararAlumnosDesNom = new Comparator<Alumnos>() {
        @Override
        public int compare(Alumnos a1, Alumnos a2) {
            return a2.getNombre().compareTo(a1.getNombre());
        }
    };
}