package Entidad;

import java.util.ArrayList;
import java.util.HashSet;

public class Voto {
    private Alumno votante;
    private HashSet<Alumno> votados;

    public Voto() {
    }

    public Voto(Alumno votante) {
        this.votante = votante;
    }    

    public Voto(Alumno votante, HashSet<Alumno> votados) {
        this.votante = votante;
        this.votados = votados;
    }

    public Alumno getVotante() {
        return votante;
    }

    public void setVotante(Alumno votante) {
        this.votante = votante;
    }

    public HashSet<Alumno> getVotados() {
        return votados;
    }

    public void setVotados(HashSet<Alumno> votados) {
        this.votados = votados;
    }

    @Override
    public String toString() {
        return "El/La votante " + votante.getNombreCompleto() + " votó a = " + votados + ']';
    }        
}