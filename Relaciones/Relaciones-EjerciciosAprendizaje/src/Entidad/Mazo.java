package Entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Mazo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Carta> mazo;
    private ArrayList<Carta> mazoBorrado;

    public Mazo() {
    }

    public Mazo(ArrayList<Carta> mazo, ArrayList<Carta> mazoBorrado) {
        this.mazo = mazo;
        this.mazoBorrado = mazoBorrado;
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

    public ArrayList<Carta> getMazoBorrado() {
        return mazoBorrado;
    }

    public void setMazoBorrado(ArrayList<Carta> mazoBorrado) {
        this.mazoBorrado = mazoBorrado;
    }

    public void cargarMazo() {
        mazo = new ArrayList<>();
        mazoBorrado = new ArrayList<>();
        String[] clases = {"Oro", "Espada", "Basto", "Copa"};
        for (String clase : clases) {
            for (int num = 1; num <= 12; num++) {
                if (num != 8 && num != 9) {
                    mazo.add(new Carta(num, clase));
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(mazo);
        System.out.println("------------------------");
        System.out.println("Mazo  desordenado es: ");
        for (Carta carta : mazo) {
            System.out.println(carta.toString());
        }
        System.out.println("------------------------");
    }

    public void mostrarMazo() {
        System.out.println("------------------------");
        System.out.println("EL MAZO ES : ");
        for (Carta carta : mazo) {
            System.out.println(carta.toString());
        }
        System.out.println("------------------------");
    }

    public void sigCarta() {
        if (mazo.isEmpty()) {
            System.out.println("El mazo esta vacio");
        } else {
            Carta Carta1 = mazo.get(0);
            mazoBorrado.add(Carta1);
            mazo.remove(0);
            System.out.println("------------------------");
            System.out.println("Su carta es: " + Carta1);
            System.out.println("------------------------");
        }
    }

    public void cartasDisponibles() {
        System.out.println("------------------------");
        System.out.println("La cantidad de cartas disponibles es: " + mazo.size());
        System.out.println("------------------------");
    }

    public void darCartas() {
        System.out.println("Cuantas cartas quiere?");
        int nrocartas = leer.nextInt();
        if (nrocartas <= mazo.size()) {
            for (int i = 0; i < nrocartas; i++) {
                sigCarta();
            }
        } else {
            System.out.println("Las cartas no alcanzan :( ");
        }
    }
    
    public void cartasMonton(){
         if (mazoBorrado.isEmpty()) {
            System.out.println("No hay cartas usadas");
        } else {
            System.out.println("Las cartas ya usadas son: ");
            for (Carta carta : mazoBorrado) {
                System.out.println(carta);
            }
        }
    }
}
