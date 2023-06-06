//¡Es tu turno! Crea una lista de Libros y muestra el título de cada uno con un bucle.
package EjerciciosGuia;
import Objetos.Libro;
import ObjetosServicio.LibroServicio;
import java.util.ArrayList;

public class Ejercicio03 {

    public static void main(String[] args) {
        
        LibroServicio service = new LibroServicio();
        ArrayList<Libro> libros = new ArrayList();
        libros.add(service.LlenarLibro());                       
        libros.add(service.LlenarLibro());                       
        libros.add(service.LlenarLibro());   
        
        for (Libro libro : libros) {
            System.out.println(libro.getNombre());
        }
    }    
}