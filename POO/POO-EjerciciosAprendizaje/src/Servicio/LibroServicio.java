package Servicio;
import Objetos.Libro;
import java.util.Scanner;

public class LibroServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro() {
        Libro libro1 = new Libro();

        System.out.println("Ingrese el numero de ISBN: ");
        libro1.setIsbn(leer.nextInt());
        System.out.println("Ingrese el nombre del titulo: ");
        libro1.setTitulo(leer.next());
        System.out.println("Ingrese el nombre del autor: ");
        libro1.setAutor(leer.next());
        System.out.println("Ingrese el numero de paginas: ");
        libro1.setnPaginas(leer.nextInt());

        return libro1;
    }

    public void mostrarLibro(Libro libro1) {
        System.out.println(libro1.toString());
    }
}