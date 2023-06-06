package ObjetosServicio;
import Objetos.Libro;
import java.util.Scanner;

public class LibroServicio {
    Scanner leer = new Scanner(System.in);
    public Libro LlenarLibro() {
        Libro libro1 = new Libro();
        System.out.println("ingrese nombre, autor y numero de paginas del libro.");
        libro1.setNombre(leer.nextLine());
        libro1.setAutor(leer.nextLine());        
        libro1.setNPaginas(leer.nextLine());
        return libro1;
    }
}