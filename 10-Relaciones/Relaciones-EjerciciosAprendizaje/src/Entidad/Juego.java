package Entidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public int crearJuego(Revolver rev) {
        System.out.println("----------------");
        System.out.println("Cargando revolver....");
        rev.llenarRevolver();
        System.out.println("Revolver cargado.");
        System.out.println("----------------");
        Juego juego1 = new Juego();
        ArrayList<Jugador> jugadores2 = new ArrayList<Jugador>();
        String nombre;
        System.out.println("----------------");
        System.out.println("Ingrese la cantidad de jugadores(1-6): ");
        int cantidad = leer.nextInt();
        while (cantidad > 6) {
            System.out.println("Error. Ingrese la cantidad de jugadores(1-6): ");
            cantidad = leer.nextInt();
        }
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre del jugador: ");
            nombre = leer.next();
            Jugador j1 = new Jugador((i + 1), nombre);
            jugadores2.add(j1);
        }
        jugadores = jugadores2;

        return cantidad;
    }

    public void ronda(Revolver rev, Juego juego1) {
        System.out.println("----------------");
        System.out.println("Comienza el juego.");
        ArrayList<Jugador> jugadores3 = jugadores;
        boolean fin = false;
        do {
            for (Jugador jugador : jugadores3) {
                if (jugador.disparo(rev) == true) {
                    System.out.println("Juego finalizado");
                    fin = true;
                }
            }
        } while (fin != true);

        System.out.println("----------------");
        System.out.println("Los jugadores tienen el siguiente status: ");
        for (Jugador jugador : jugadores3) {
            System.out.println(jugador.toString());
        }
        System.out.println("----------------");
    }    
}