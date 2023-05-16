package EjerciciosGuia;

import Objeto.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioGuia02 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Jugador> jugadores = new ArrayList();
        
        System.out.println("---Equipo Sacachispas---");
        System.out.println("Ingrese jugadores: ");
        
        for (int i = 0; i < 3; i++) {
            Jugador j1 = new Jugador();
            
            System.out.println("Ingrese nombre: ");
            j1.setNombre(leer.next());
            System.out.println("Ingrese apellido: ");
            j1.setApellido(leer.next());
            System.out.println("Ingrese posicion: ");
            j1.setPosicion(leer.next());
            System.out.println("Ingrese numero: ");
            j1.setNumero(leer.nextInt());
            
            jugadores.add(j1);
        }
        System.out.println("La lista de jugadores del equipo es: ");
        for (Jugador j1 : jugadores) {
            System.out.println(j1.toString());
        }
    }    
}