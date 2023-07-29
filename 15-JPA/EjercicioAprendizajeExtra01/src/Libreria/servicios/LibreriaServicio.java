/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.servicios;

import java.util.Scanner;

/**
 *
 * @author agus_
 */
public class LibreriaServicio {

    public void menu() throws Exception {
        int ope = 0;
        AutorServicio serviceAutor = new AutorServicio();
        EditorialServicio serviceEditorial = new EditorialServicio();
        LibroServicio serviceLibro = new LibroServicio();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int op = 0;

        do {
            System.out.println("-----------MENU----------");
            System.out.println("0 - Mostrar listas");
            System.out.println("1 - Dar de alta");
            System.out.println("2 - Dar de baja");
            System.out.println("3 - Editar");
            System.out.println("4 - Busqueda");
            System.out.println("5 - Salir");
            op = leer.nextInt();
            switch (op) {
                case 0:
                    System.out.println("-----------------------");
                    do {
                        System.out.println("Indique que desea mostrar: \n1:Autor\n2:Editorial\n3:Libro\n4:Volver hacia atras");
                        ope = leer.nextInt();
                        if (ope == 1) {
                            serviceAutor.mostrarAutor();
                        } else if (ope == 2) {
                            serviceEditorial.mostrarEditoriales();
                        } else if (ope == 3) {
                            serviceLibro.mostrarLibros();
                        } else if (ope == 4) {
                            System.out.println("Volviendo. . .");
                        } else {
                            System.out.println("Opcion incorrecta!");
                        }
                        System.out.println("-----------------------");
                    } while (ope != 4);
                    break;
                case 1:
                    System.out.println("-----------------------");
                    do {
                        System.out.println("Indique que desea dar de alta: \n1:Autor\n2:Editorial\n3:Libro\n4:Volver hacia atras");
                        ope = leer.nextInt();
                        if (ope == 1) {
                            serviceAutor.crearAutor();
                        } else if (ope == 2) {
                            serviceEditorial.crearEditorial();
                        } else if (ope == 3) {
                            serviceLibro.crearLibro();
                        } else if (ope == 4) {
                            System.out.println("Volviendo. . .");
                        } else {
                            System.out.println("Opcion incorrecta!");
                        }
                        System.out.println("-----------------------");
                    } while (ope != 4);
                    break;
                case 2:
                    System.out.println("-----------------------");
                    do {
                        System.out.println("Indique que desea dar de baja: \n1:Autor\n2:Editorial\n3:Libro\n4:Volver hacia atras");
                        ope = leer.nextInt();
                        if (ope == 1) {
                            serviceAutor.eliminarAutor();
                        } else if (ope == 2) {
                            serviceEditorial.eliminarEditorial();
                        } else if (ope == 3) {
                            serviceLibro.eliminarLibro();
                        } else if (ope == 4) {
                            System.out.println("Volviendo. . .");
                        } else {
                            System.out.println("Opcion incorrecta!");
                        }
                        System.out.println("-----------------------");
                    } while (ope != 4);
                    break;
                case 3:
                    System.out.println("-----------------------");
                    do {
                        System.out.println("Indique que desea editar: \n1:Autor\n2:Editorial\n3:Libro\n4:Volver hacia atras");
                        ope = leer.nextInt();
                        if (ope == 1) {
                            serviceAutor.editarAutor();
                        } else if (ope == 2) {
                            serviceEditorial.editarEditorial();
                        } else if (ope == 3) {
                            serviceLibro.editarLibro();
                        } else if (ope == 4) {
                            System.out.println("Volviendo. . .");
                        } else {
                            System.out.println("Opcion incorrecta!");
                        }
                        System.out.println("-----------------------");
                    } while (ope != 4);
                    break;
                case 4:
                    System.out.println("-----------------------");
                    do {
                        System.out.println("Indique que desea buscar: \n1: Autor por nombre \n2: Libro por ISBN \n3: Libro por titulo \n4: Libro por Autor \n5: Libro por editorial\n6:Volver hacia atras");
                        ope = leer.nextInt();
                        if (ope == 1) {
                            serviceAutor.buscarAutorNombre();
                        } else if (ope == 2) {
                            serviceLibro.buscarLibroIsbn();
                        } else if (ope == 3) {
                            serviceLibro.buscarLibroTitulo();
                        } else if (ope == 4) {
                            serviceLibro.buscarLibroAutor();
                        } else if (ope == 5) {
                            serviceLibro.buscarLibroEditorial();
                        } else if (ope == 6) {
                            System.out.println("Volviendo. . .");
                        } else {
                            System.out.println("Opcion incorrecta!");
                        }
                        System.out.println("-----------------------");
                    } while (ope != 6);
                    break;
                case 5:
                    System.out.println("-----------------------");
                    System.out.println("Saliendo. . . .");
                    System.out.println("-----------------------");
                    break;
                default:
                    System.out.println("-----------------------");
                    System.out.println("Error. Ingrese una opcion valida");
                    System.out.println("-----------------------");
            }
        } while (op != 5);
    }
}