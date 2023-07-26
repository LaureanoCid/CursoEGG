/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.servicios;

import Libreria.entidades.Autor;
import Libreria.entidades.Editorial;
import Libreria.entidades.Libro;
import Libreria.persistencia.AutorJpaController;
import Libreria.persistencia.EditorialJpaController;
import Libreria.persistencia.LibroJpaController;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author agus_
 */
public class LibroServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    AutorJpaController autorJpa = new AutorJpaController();
    LibroJpaController libroJpa = new LibroJpaController();
    EditorialJpaController editorialJpa = new EditorialJpaController();
    AutorServicio autorS = new AutorServicio();
    EditorialServicio editorialS = new EditorialServicio();
    Libro libro = new Libro();

    public void crearLibro() throws Exception {

        try {
            boolean repetido = false;
            System.out.println("-----------------------");
            if (libro == null) {
                throw new Exception("El libro no puede esta vacio");
            }

            System.out.println("Ingrese el titulo del libro");
            libro.setTitulo(leer.next());
            do {
                repetido = false;
                List<Libro> listaLibros = libroJpa.findLibroEntities();
                while (libro.getTitulo().trim().isEmpty()) {
                    System.out.println("Error! Ingrese el titulo de su libro: ");
                    libro.setTitulo(leer.nextLine());
                }
                for (Libro aux : listaLibros) {
                    if (aux.getTitulo().equalsIgnoreCase(libro.getTitulo())) {
                        repetido = true;
                        System.out.println("Autor existente! Ingrese un nuevo nombre: ");
                        libro.setTitulo(leer.nextLine());
                    }
                }
            } while (repetido);
            System.out.println("Ingrese año del libro");
            libro.setAnio(leer.nextInt());
            System.out.println("Ingrese la cantidad de ejemplares");
            libro.setEjemplares(leer.nextInt());
            System.out.println("Ingrese la cantidad de ejemplares prestados");
            libro.setEjemplaresPrestados(leer.nextInt());
            while (libro.getEjemplares() < libro.getEjemplaresPrestados()) {
                System.out.println("Error! La cantidad de ejemplares prestados no puede superar al stock!");
                System.out.println("Ingrese la cantidad de ejemplares prestados: ");
                libro.setEjemplaresPrestados(leer.nextInt());
            }
            libro.setEjemplaresRestantes(libro.getEjemplares() - libro.getEjemplaresPrestados());
            libro.setAlta(true);

            autorS.mostrarAutor();
            System.out.println("Ingrese el ID del autor");
            int idA = leer.nextInt();
            Autor autor = autorJpa.getEntityManager().find(Autor.class, idA);
            libro.setAutor(autor);

            editorialS.mostrarEditoriales();
            System.out.println("Ingrese el ID de la editorial");
            int idE = leer.nextInt();
            Editorial editorial = editorialJpa.getEntityManager().find(Editorial.class, idE);
            libro.setEditorial(editorial);

            libroJpa.create(libro);
            System.out.println("Alta exitosa!");
            System.out.println("-----------------------");
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarLibros() {
        try {
            List<Libro> listaLibros = libroJpa.findLibroEntities();
            for (Libro aux : listaLibros) {
                System.out.println(aux.toString());
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarLibro() throws Exception {
        try {
            System.out.println("-----------------------");
            mostrarLibros();
            System.out.println("Ingrese el ID a eliminar: ");
            libroJpa.destroy(leer.nextInt());
            System.out.println("Baja exitosa!!");
            System.out.println("-----------------------");
        } catch (Exception e) {
            throw e;
        }
    }

    public void editarLibro() throws Exception {
        try {
            System.out.println("-----------------------");
            mostrarLibros();
            System.out.println("Ingrese el ID a editar: ");
            int idL = leer.nextInt();
            Libro libro = libroJpa.getEntityManager().find(Libro.class, idL);
            System.out.println("Que desea editar? \n1: Titulo \n2: Anio del libro \n3: Cantidad de ejemplares \n4: Ejemplares prestados \n5: Autor \n6: Editorial");
            int op = leer.nextInt();
            switch (op) {
                case 1:
                    boolean repetido = false;
                    System.out.println("El titulo es: " + libro.getTitulo());
                    System.out.println("Ingrese el titulo del libro a cambiar: ");
                    libro.setTitulo(leer.next());
                    do {
                        repetido = false;
                        List<Libro> listaLibros = libroJpa.findLibroEntities();
                        while (libro.getTitulo().trim().isEmpty()) {
                            System.out.println("Error! Ingrese el titulo de su libro: ");
                            libro.setTitulo(leer.nextLine());
                        }
                        for (Libro aux : listaLibros) {
                            if (aux.getTitulo().equalsIgnoreCase(libro.getTitulo())) {
                                repetido = true;
                                System.out.println("Autor existente! Ingrese un nuevo nombre: ");
                                libro.setTitulo(leer.nextLine());
                            }
                        }
                    } while (repetido);
                    break;
                case 2:
                    System.out.println("El anio actual es: " + libro.getAnio());
                    System.out.println("Ingrese año del libro a cambiar: ");
                    libro.setAnio(leer.nextInt());
                    break;
                case 3:
                    System.out.println("La cantidad actual de ejemplares es: " + libro.getEjemplares());
                    System.out.println("Ingrese la cantidad de ejemplares");
                    libro.setEjemplares(leer.nextInt());
                    break;
                case 4:
                    System.out.println("La cantidad actual de ejemplares prestado es: " + libro.getEjemplaresPrestados());
                    System.out.println("Ingrese la cantidad de ejemplares prestados");
                    libro.setEjemplaresPrestados(leer.nextInt());
                    while (libro.getEjemplares() < libro.getEjemplaresPrestados()) {
                        System.out.println("Error! La cantidad de ejemplares prestados no puede superar al stock!");
                        System.out.println("Ingrese la cantidad de ejemplares prestados: ");
                        libro.setEjemplaresPrestados(leer.nextInt());
                    }
                    break;
                case 5:
                    System.out.println("El autor actual es: " + libro.getAutor().getNombre());
                    autorS.mostrarAutor();
                    System.out.println("Ingrese el ID del autor");
                    int idA = leer.nextInt();
                    Autor autor = autorJpa.getEntityManager().find(Autor.class, idA);
                    libro.setAutor(autor);
                    break;
                case 6:
                    System.out.println("La editorial actual es: " + libro.getEditorial().getNombre());
                    editorialS.mostrarEditoriales();
                    System.out.println("Ingrese el ID de la editorial");
                    int idE = leer.nextInt();
                    Editorial editorial = editorialJpa.getEntityManager().find(Editorial.class, idE);
                    libro.setEditorial(editorial);
                    break;
                default:
                    System.out.println("Error. Ingrese una opcion valida!");
            }
            libroJpa.edit(libro);
            System.out.println("Edicion exitosa!");
            System.out.println("-----------------------");
        } catch (Exception e) {
            throw e;
        }
    }

    public void buscarLibroIsbn() {
        try {
            System.out.println("-----------------------");
            boolean encontrado = false;
            System.out.println("Ingrese el numero de ISBN de su libro: ");
            int isbn = leer.nextInt();
            List<Libro> listaLibros = libroJpa.findLibroEntities();
            for (Libro aux : listaLibros) {
                if (aux.getId() == isbn) {
                    System.out.println(aux.toString());
                    encontrado = true;
                }
            }
            if (encontrado == false) {
                System.out.println("El libro no existe!");
            }
            System.out.println("-----------------------");
        } catch (Exception e) {
            throw e;
        }
    }

    public void buscarLibroTitulo() {
        try {
            System.out.println("-----------------------");
            boolean encontrado = false;
            System.out.println("Ingrese el titulo de su libro: ");
            String tituloL = leer.next();
            List<Libro> listaLibros = libroJpa.findLibroEntities();
            for (Libro aux : listaLibros) {
                if (aux.getTitulo().equalsIgnoreCase(tituloL)) {
                    System.out.println(aux.toString());
                    encontrado = true;
                }
            }
            if (encontrado == false) {
                System.out.println("El libro no existe!");
            }
            System.out.println("-----------------------");
        } catch (Exception e) {
            throw e;
        }
    }

    public void buscarLibroAutor() throws Exception {
        try {
            System.out.println("-----------------------");
            boolean encontrado = false;
            autorS.mostrarAutor();
            System.out.println("Seleccione el id del autor: ");
            int idA = leer.nextInt();
            List<Libro> listaLibros = libroJpa.findLibroEntities();
            for (Libro aux : listaLibros) {
                if (aux.getAutor().getId() == idA) {
                    System.out.println(aux.toString());
                    encontrado = true;
                }
            }
            if (encontrado == false) {
                System.out.println("El libro no existe!");
            }
            System.out.println("-----------------------");
        } catch (Exception e) {
            throw e;
        }
    }

    public void buscarLibroEditorial() throws Exception {
        try {
            System.out.println("-----------------------");
            boolean encontrado = false;
            editorialS.mostrarEditoriales();
            System.out.println("Seleccione el id de la editorial: ");
            int idE = leer.nextInt();
            List<Libro> listaLibros = libroJpa.findLibroEntities();
            for (Libro aux : listaLibros) {
                if (aux.getEditorial().getId() == idE) {
                    System.out.println(aux.toString());
                    encontrado = true;
                }
            }
            if (encontrado == false) {
                System.out.println("El libro no existe!");
            }
            System.out.println("-----------------------");
        } catch (Exception e) {
            throw e;
        }
    }
}
