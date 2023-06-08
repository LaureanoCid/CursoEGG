package Objeto;

import java.util.ArrayList;

public class Equipo {
    private ArrayList<Jugador> jugadores = new ArrayList();

    public Equipo() {
    }        

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo[" + "Jugador = " + jugadores + ']';
    } 
        
}