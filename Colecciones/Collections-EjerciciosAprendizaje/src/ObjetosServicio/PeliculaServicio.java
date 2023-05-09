package ObjetosServicio;

import Objetos.Pelicula;
import static Objetos.Pelicula.compararPelisAscD;
import static Objetos.Pelicula.compararPelisAscH;
import static Objetos.Pelicula.compararPelisAscT;
import static Objetos.Pelicula.compararPelisDesH;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pelicula crearPelicula() {
        Pelicula peli = new Pelicula();

        System.out.println("Ingrese el titulo de la pelicula: ");
        peli.setTitulo(leer.next());
        System.out.println("Ingrese el director de la pelicula: ");
        peli.setDirector(leer.next());
        System.out.println("Ingrese la duracion de la pelicula en horas: ");
        peli.setDuracion(leer.nextDouble());

        return peli;
    }

    public void menu() {
        ArrayList<Pelicula> peliculas = new ArrayList();
        int op = 0;

        do {
            peliculas.add(crearPelicula());
            System.out.println("¿Desea ingresar otra pelicula?");
            System.out.println("1 - Si");
            System.out.println("2 - No");
            op = leer.nextInt();
            while (op != 1 && op != 2) {
                System.out.println("ERROR. Ingrese una opcion correcta: ");
                System.out.println("¿Desea ingresar otra pelicula?");
                System.out.println("1 - Si");
                System.out.println("2 - No");
                op = leer.nextInt();
            }
        } while (op != 2);
        
        System.out.println("------------------------------------------------------------");                
        
        System.out.println("Las peliculas ingresadas son: ");
        mostrarPeliculas(peliculas);
        
        System.out.println("------------------------------------------------------------"); 
        
        System.out.println("Las peliculas que duran mas de una hora son: ");
        mostrarPeliculasLargas(peliculas);
        
        System.out.println("------------------------------------------------------------"); 
        
        System.out.println("Peliculas ordenadas: ");
        ordenarPeliculas(peliculas);
        
        System.out.println("------------------------------------------------------------"); 
    }
    
    public void mostrarPeliculas(ArrayList<Pelicula> peliculas){
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }
    public void mostrarPeliculasLargas(ArrayList<Pelicula> peliculas){
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula.toString());
            }
        }
    }
    public void ordenarPeliculas(ArrayList<Pelicula> peliculas){
        System.out.println("Las peliculas ordenadas de mayor a menor segun su duracion: ");
        Collections.sort(peliculas, compararPelisDesH);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
        
        System.out.println("------------------------------------------------------------"); 
        
        System.out.println("Las peliculas ordenadas de menor a mayor segun su duracion: ");
        Collections.sort(peliculas, compararPelisAscH);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
        
        System.out.println("------------------------------------------------------------"); 
        
        System.out.println("Las peliculas ordenadas de menor a mayor segun su titulo: ");
        Collections.sort(peliculas, compararPelisAscT);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
        
        System.out.println("------------------------------------------------------------"); 
        
        System.out.println("Las peliculas ordenadas de menor a mayor segun su director: ");
        Collections.sort(peliculas, compararPelisAscD);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
        
        System.out.println("------------------------------------------------------------"); 
    }
}
