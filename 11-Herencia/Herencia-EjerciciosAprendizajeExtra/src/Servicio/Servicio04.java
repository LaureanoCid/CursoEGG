package Servicio;

import Objetos.Empleado;
import Objetos.Estudiante;
import Objetos.Persona;
import Objetos.PersonalServicio;
import Objetos.Profesor;
import java.util.ArrayList;
import java.util.Scanner;

public class Servicio04 {

    public void menu() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Persona> personas = new ArrayList();

        //Agregando Estudiantes
        personas.add(new Estudiante("primer año", "juan", "perez", "casado", 1234));
        personas.add(new Estudiante("primer año", "maria", "gomez", "casada", 1235));
        personas.add(new Estudiante("segundo año", "ernesto", "quearesma", "soltero", 1236));
        personas.add(new Estudiante("segundo año", "sofia", "candela", "casada", 1237));

        //Agregando Profesores
        personas.add(new Profesor("matematicas", 2005, 1, "ernesto", "perez", "soltero", 1238));
        personas.add(new Profesor("arquitectura", 2001, 2, "sofia", "gomez", "casada", 1239));
        personas.add(new Profesor("lenguajes", 2010, 3, "maria", "quearesma", "soltera", 1240));
        personas.add(new Profesor("computacion", 2012, 4, "juan", "candela", "soltero", 1241));

        //Agregando Personal de Servicio
        personas.add(new PersonalServicio("biblioteca", 2013, 10, "ernesto", "candela", "soltero", 1242));
        personas.add(new PersonalServicio("decanato", 2013, 10, "juan", "quearesma", "soltero", 1243));
        personas.add(new PersonalServicio("biblioteca", 2013, 10, "maria", "perez", "casada", 1244));
        personas.add(new PersonalServicio("secretaría", 2013, 10, "sofia", "gomez", "casada", 1245));

        int op = 0;
        String nombreP, apellidoP;

        do {
            System.out.println(""
                    + "-------------------------\n"
                    + "----------MENU-----------\n"
                    + "1 - Cambiar estado civil\n" //Personas
                    + "2 - Reasignar despacho\n" //Empleado
                    + "3 - Matriculacion\n" //Estudiante
                    + "4 - Cambio de departamento\n" //Profesor
                    + "5 - Traslado de seccion\n" //Personal de servicio
                    + "6 - Imprimir informacion\n" //Cualquier persona
                    + "7 - Salir\n"
                    + "-------------------------");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("-------------------------");
                    System.out.println("Elija una persona de la lista: ");
                    for (Persona aux : personas) {
                        System.out.println(aux.getNombre() + " " + aux.getApellido());
                    }
                    System.out.println("-------------------------");
                    System.out.println("Nombre: ");
                    nombreP = leer.next().toLowerCase();
                    System.out.println("Apellido: ");
                    apellidoP = leer.next().toLowerCase();
                    System.out.println("-------------------------");
                    for (Persona aux : personas) {
                        if (aux.getNombre().equalsIgnoreCase(nombreP)) {
                            if (aux.getApellido().equalsIgnoreCase(apellidoP)) {
                                System.out.println(aux.getNombre() + " " + aux.getApellido() + " es: " + aux.getEstadoCivil());
                                System.out.println("Que estado civil posee ahora?: ");
                                aux.setEstadoCivil(leer.next());
                                System.out.println(aux.toString());
                                break;
                            }
                        }
                    }
                    System.out.println("-------------------------");
                    System.out.println("Estado civil modificado!");
                    System.out.println("-------------------------");
                    break;
                case 2:
                    System.out.println("-------------------------");
                    System.out.println("Elija una empleado de la lista: ");
                    for (Persona aux : personas) {
                        if (aux instanceof Empleado) {
                            System.out.println(aux.getNombre() + " " + aux.getApellido());
                        }
                    }
                    System.out.println("-------------------------");
                    System.out.println("Nombre: ");
                    nombreP = leer.next().toLowerCase();
                    System.out.println("Apellido: ");
                    apellidoP = leer.next().toLowerCase();
                    System.out.println("-------------------------");
                    for (Persona aux : personas) {
                        if (aux.getNombre().equalsIgnoreCase(nombreP)) {
                            if (aux.getApellido().equalsIgnoreCase(apellidoP)) {
                                System.out.println(aux.getNombre() + " " + aux.getApellido() + " trabaja en el despacho: " + ((Empleado) aux).getNumDespacho());
                                System.out.println("Reasigne despacho: ");
                                ((Empleado) aux).setNumDespacho(leer.nextInt());
                                System.out.println(aux.toString());
                                break;
                            }
                        }
                    }
                    System.out.println("-------------------------");
                    System.out.println("Despacho reasignado!");
                    System.out.println("-------------------------");
                    break;
                case 3:
                    System.out.println("-------------------------");
                    System.out.println("Elija un estudiante de la lista: ");
                    for (Persona aux : personas) {
                        if (aux instanceof Estudiante) {
                            System.out.println(aux.getNombre() + " " + aux.getApellido());
                        }
                    }
                    System.out.println("-------------------------");
                    System.out.println("Nombre: ");
                    nombreP = leer.next().toLowerCase();
                    System.out.println("Apellido: ");
                    apellidoP = leer.next().toLowerCase();
                    System.out.println("-------------------------");
                    for (Persona aux : personas) {
                        if (aux.getNombre().equalsIgnoreCase(nombreP)) {
                            if (aux.getApellido().equalsIgnoreCase(apellidoP)) {
                                System.out.println(aux.getNombre() + " " + aux.getApellido() + " esta en el curso: " + ((Estudiante) aux).getNombreCurso());
                                System.out.println("Reasigne curso: ");
                                ((Estudiante)aux).setNombreCurso(leer.next());
                                System.out.println(aux.toString());
                                break;
                            }
                        }
                    }
                    System.out.println("-------------------------");
                    System.out.println("Curso reasignado!");
                    System.out.println("-------------------------");
                    break;
                case 4:
                    System.out.println("-------------------------");
                    System.out.println("Elija un profesor de la lista: ");
                    for (Persona aux : personas) {
                        if (aux instanceof Profesor) {
                            System.out.println(aux.getNombre() + " " + aux.getApellido());
                        }
                    }
                    System.out.println("-------------------------");
                    System.out.println("Nombre: ");
                    nombreP = leer.next().toLowerCase();
                    System.out.println("Apellido: ");
                    apellidoP = leer.next().toLowerCase();
                    System.out.println("-------------------------");
                    for (Persona aux : personas) {
                        if (aux.getNombre().equalsIgnoreCase(nombreP)) {
                            if (aux.getApellido().equalsIgnoreCase(apellidoP)) {
                                System.out.println(aux.getNombre() + " " + aux.getApellido() + " trabaja en el departamento de: " + ((Profesor) aux).getDespacho());
                                System.out.println("Reasigne departamento: ");
                                ((Profesor) aux).setDespacho(leer.next());
                                System.out.println(aux.toString());
                                break;
                            }
                        }
                    }
                    System.out.println("-------------------------");
                    System.out.println("Departamento reasignado!");
                    System.out.println("-------------------------");
                    break;
                case 5:
                    System.out.println("-------------------------");
                    System.out.println("Elija un personal de servicio de la lista: ");
                    for (Persona aux : personas) {
                        if (aux instanceof PersonalServicio) {
                            System.out.println(aux.getNombre() + " " + aux.getApellido());
                        }
                    }
                    System.out.println("-------------------------");
                    System.out.println("Nombre: ");
                    nombreP = leer.next().toLowerCase();
                    System.out.println("Apellido: ");
                    apellidoP = leer.next().toLowerCase();
                    System.out.println("-------------------------");
                    for (Persona aux : personas) {
                        if (aux.getNombre().equalsIgnoreCase(nombreP)) {
                            if (aux.getApellido().equalsIgnoreCase(apellidoP)) {
                                System.out.println(aux.getNombre() + " " + aux.getApellido() + " trabaja en la seccion de: " + ((PersonalServicio) aux).getSeccion());
                                System.out.println("Reasigne seccion para traslado: ");
                                ((PersonalServicio) aux).setSeccion(leer.next());
                                System.out.println(aux.toString());
                                break;
                            }
                        }
                    }
                    System.out.println("-------------------------");
                    System.out.println("Traslado realizado!");
                    System.out.println("-------------------------");
                    break;
                case 6:
                    System.out.println("-------------------------");
                    System.out.println("Elija una persona de la lista para mostrar todos sus datos: ");
                    for (Persona aux : personas) {
                        System.out.println(aux.getNombre() + " " + aux.getApellido());
                    }
                    System.out.println("-------------------------");
                    System.out.println("Nombre: ");
                    nombreP = leer.next().toLowerCase();
                    System.out.println("Apellido: ");
                    apellidoP = leer.next().toLowerCase();
                    System.out.println("-------------------------");
                    for (Persona aux : personas) {
                        if (aux.getNombre().equalsIgnoreCase(nombreP)) {
                            if (aux.getApellido().equalsIgnoreCase(apellidoP)) {
                                System.out.println(aux.toString());
                                break;
                            }
                        }
                    }
                    break;
                case 7:
                    System.out.println("-------------------------"
                            + "Saliendo. . . ."
                            + "-------------------------");
                    break;
                default:
                    System.out.println("-------------------------\n"
                            + "Error! Opcion invalida! Ingrese una opcion nuevamente.\n"
                            + "-------------------------\n");
            }
        } while (op != 7);
    }
}