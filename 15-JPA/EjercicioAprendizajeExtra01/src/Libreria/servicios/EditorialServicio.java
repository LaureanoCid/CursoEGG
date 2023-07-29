/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.servicios;

import Libreria.entidades.Editorial;
import Libreria.persistencia.EditorialJpaController;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author agus_
 */
public class EditorialServicio {

    EditorialJpaController editorialJPA = new EditorialJpaController();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Editorial editorial = new Editorial();

    public void crearEditorial() {
        Editorial editorial = new Editorial();
        try {
            boolean repetido = false;
            System.out.println("-----------------------");
            if (editorial == null) {
                System.out.println("No se pueden ingresar datos vacios");
            }
            System.out.println("Ingrese el nombre de la editorial");
            editorial.setNombre(leer.nextLine());
            do {
                repetido = false;
                List<Editorial> listaEditorial = editorialJPA.findEditorialEntities();
                while (editorial.getNombre().trim().isEmpty()) {
                    System.out.println("Error! Ingrese el nombre de su editorial: ");
                    editorial.setNombre(leer.nextLine());
                }
                for (Editorial aux : listaEditorial) {
                    if (aux.getNombre().equalsIgnoreCase(editorial.getNombre())) {
                        repetido = true;
                        System.out.println("Editorial existente! Ingrese un nuevo nombre: ");
                        editorial.setNombre(leer.nextLine());
                    }
                }
            } while (repetido);
            editorial.setAlta(true);
            editorialJPA.create(editorial);
            System.out.println("Alta exitosa!");
            System.out.println("-----------------------");
        } catch (Exception e) {
            throw e;
        }
    }

    public void mostrarEditoriales() {
        try {
            List<Editorial> listaEditoriales = editorialJPA.findEditorialEntities();
            for (Editorial aux : listaEditoriales) {
                System.out.println(aux.toString());
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void eliminarEditorial() throws Exception {
        try {
            System.out.println("-----------------------");
            mostrarEditoriales();
            System.out.println("Ingrese el ID de la editorial a eliminar: ");
            int idE = leer.nextInt();
            if (!(editorialJPA.getEntityManager().find(Editorial.class, idE) == null)) {
                editorialJPA.destroy(idE);
                System.out.println("Baja exitosa!");
            } else {
                System.out.println("Error! Editorial no encontrada!");
            }
            System.out.println("-----------------------");
        } catch (Exception e) {
            throw e;
        }
    }

    public void editarEditorial() throws Exception {
        try {
            System.out.println("-----------------------");
            boolean repetido = false;
            mostrarEditoriales();
            System.out.println("Ingrese el ID a editar: ");
            int idE = leer.nextInt();
            if (!(editorialJPA.getEntityManager().find(Editorial.class, idE) == null)) {
                Editorial editorial = editorialJPA.getEntityManager().find(Editorial.class, idE);
                System.out.println("Ingrese el nuevo nombre de la editorial: ");
                editorial.setNombre(leer.next());
                do {
                    repetido = false;
                    List<Editorial> listaEditorial = editorialJPA.findEditorialEntities();
                    while (editorial.getNombre().trim().isEmpty()) {
                        System.out.println("Error! Ingrese el nombre de su editorial: ");
                        editorial.setNombre(leer.nextLine());
                    }
                    for (Editorial aux : listaEditorial) {
                        if (aux.getNombre().equalsIgnoreCase(editorial.getNombre())) {
                            repetido = true;
                            System.out.println("Editorial existente! Ingrese un nuevo nombre: ");
                            editorial.setNombre(leer.nextLine());
                        }
                    }
                } while (repetido);
                editorialJPA.edit(editorial);
                System.out.println("Edicion exitosa!");
            } else {
                System.out.println("Error! Editorial no encontrada!");
            }
            System.out.println("-----------------------");
        } catch (Exception e) {
            throw e;
        }
    }
}