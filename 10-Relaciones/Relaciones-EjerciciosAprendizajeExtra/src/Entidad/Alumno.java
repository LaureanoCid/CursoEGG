package Entidad;

import java.util.Comparator;

public class Alumno {

    private String nombreCompleto;
    private long Dni;
    private Integer cantidadVotos;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, long Dni, Integer cantidadVotos) {
        this.nombreCompleto = nombreCompleto;
        this.Dni = Dni;
        this.cantidadVotos = cantidadVotos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getDni() {
        return Dni;
    }

    public void setDni(long Dni) {
        this.Dni = Dni;
    }

    public Integer getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(Integer cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }
    public static Comparator<Alumno> compararVotos = new Comparator<Alumno>(){
        @Override
        public int compare(Alumno alu1, Alumno alu2){
            return alu2.getCantidadVotos().compareTo(alu1.getCantidadVotos());
        }
     };

    @Override
    public String toString() {
        return "Alumno[" + nombreCompleto + "] - [Dni = " + Dni + "] - [Cantidad de votos = " + cantidadVotos + ']';
    }
    
}