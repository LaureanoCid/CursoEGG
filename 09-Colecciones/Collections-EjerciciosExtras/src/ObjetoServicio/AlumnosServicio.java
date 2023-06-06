package ObjetoServicio;
import Objeto.Alumnos;
import static Objeto.Alumnos.compararAlumnosAscAp;
import static Objeto.Alumnos.compararAlumnosDesNom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class AlumnosServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void menu() {
        ArrayList<Alumnos> clase = new ArrayList<Alumnos>();
        ArrayList<Alumnos> argentina = new ArrayList<Alumnos>();
        ArrayList<Alumnos> chile = new ArrayList<Alumnos>();
        ArrayList<Alumnos> venezuela = new ArrayList<Alumnos>();
        int op = 0;
        do {
            System.out.println("---------------");
            System.out.println("MENU");
            System.out.println("0 - Salir");
            System.out.println("1 - Alta de alumno");
            System.out.println("2 - Baja de alumno");
            System.out.println("3 - Modificar alumno");
            System.out.println("4 - Mostrar datos de alumno");
            System.out.println("5 - Crear lista de alumnos");
            System.out.println("6 - Mostrar lista completa de alumnos");
            System.out.println("7 - Mostrar lista de alumnos ordenada");
            System.out.println("8 - Obtener edad");
            System.out.println("---------------");
            op = leer.nextInt();

            switch (op) {
                case 0:
                    System.out.println("Saliendo . . .");
                    break;
                case 1:
                    alta(argentina, chile, venezuela, clase);
                    break;
                case 2:
                    baja(clase);
                    break;
                case 3:
                    modificar(clase);
                    break;
                case 4:
                    mostrarAlumno(clase);
                    break;
                case 5:
                    crearLista(argentina, chile, venezuela, clase);
                    break;
                case 6:
                    mostrarLista(clase);
                    break;
                case 7:
                    mostrarListaOrdenada(clase);
                    break;
                case 8:
                    obtenerEdad(clase);
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
                    break;
            }
        } while (op != 0);
    }

    public void alta(ArrayList<Alumnos> argentina, ArrayList<Alumnos> chile, ArrayList<Alumnos> venezuela, ArrayList<Alumnos> clase) {
        System.out.println("---------------------------------");
        Alumnos alumno = new Alumnos();
        String op;

        System.out.println("Ingrese el nombre del alumno: ");
        op = leer.next();
        alumno.setNombre(op);

        System.out.println("Ingrese el apellido del alumno: ");
        op = leer.next();
        alumno.setApellido(op);

        System.out.println("Ingrese el pais de nacionalidad del alumno(Argentina - Chile - Venezuela): ");
        op = leer.next();
        while ((!op.equalsIgnoreCase("Argentina")) && (!op.equalsIgnoreCase("Chile")) && (!op.equalsIgnoreCase("Venezuela"))) {
            System.out.println("Error! Ingrese una opcion valida.");
            System.out.println("Ingrese el pais de nacionalidad del alumno(Argentina - Chile - Venezuela): ");
            op = leer.next();
        }
        alumno.setNacionalidad(op);

        System.out.println("Ingrese la fecha de nacimiento del alumno: ");
        System.out.println("Dia: ");
        int dia = leer.nextInt();
        while (dia < 1 && dia > 31) {
            System.out.println("Error. Ingrese una opcion valida:");
            System.out.println("Dia: ");
            dia = leer.nextInt();
        }
        System.out.println("Mes: ");
        int mes = leer.nextInt();
        while (mes < 1 && mes > 12) {
            System.out.println("Error. Ingrese una opcion valida:");
            System.out.println("Mes: ");
            mes = leer.nextInt();
        }
        System.out.println("Anio:");
        int anio = leer.nextInt();
        while (anio < 1900 && anio > 2023) {
            System.out.println("Error. Ingrese una opcion valida:");
            System.out.println("Anio: ");
            anio = leer.nextInt();
        }
        Date fechaNac = new Date(anio - 1900, mes - 1, dia);
        alumno.setFechaNacimiento(fechaNac);
        clase.add(alumno);
        elegirNacionalidad(argentina, chile, venezuela, clase);
        System.out.println("---------------------------------");
    }

    public void baja(ArrayList<Alumnos> clase) {
        int cont = 0;
        System.out.println("---------------------------------");
        System.out.println("Ingrese el alumno que desea dar de baja: ");
        String borrado = leer.next();
        for (Alumnos alumno : clase) {
            if (alumno.getNombre().equalsIgnoreCase(borrado)) {
                clase.remove(alumno);
                cont++;
                System.out.println("Alumno borrado!");
                break;
            }
        }
        if (cont == 0) {
            System.out.println("Alumno no encontrado!");
        }
        System.out.println("---------------------------------");
    }

    public void modificar(ArrayList<Alumnos> clase) {
        int cont = 0;
        int op = 0;
        String modificado;
        System.out.println("De que alumno desea cambiar los datos: ");
        modificado = leer.next();
        for (Alumnos alumno : clase) {
            if (alumno.getNombre().equalsIgnoreCase(modificado)) {
                do {
                    System.out.println("Que dato del alumno desea modificar: ");
                    System.out.println("1 - Nombre");
                    System.out.println("2 - Apellido");
                    System.out.println("3 - Nacionalidad");
                    System.out.println("4 - Fecha de nacimiento");
                    System.out.println("5 - Salir");
                    op = leer.nextInt();
                    switch (op) {
                        case 1:
                            System.out.println("Ingrese el nuevo nombre: ");
                            alumno.setApellido(leer.next());
                            break;
                        case 2:
                            System.out.println("Ingrese el nuevo apellido: ");
                            alumno.setApellido(leer.next());
                            break;
                        case 3:
                            System.out.println("Ingrese el pais de nacionalidad del alumno(Argentina - Chile - Venezuela): ");
                            String eleccion = leer.next();
                            while ((!eleccion.equalsIgnoreCase("Argentina")) && (!eleccion.equalsIgnoreCase("Chile")) && (!eleccion.equalsIgnoreCase("Venezuela"))) {
                                System.out.println("Error! Ingrese una opcion valida.");
                                System.out.println("Ingrese el pais de nacionalidad del alumno(Argentina - Chile - Venezuela): ");
                                eleccion = leer.next();
                            }
                            alumno.setNacionalidad(eleccion);
                            break;
                        case 4:
                            System.out.println("Ingrese la nueva fecha de nacimiento del alumno: ");
                            System.out.println("Dia: ");
                            int dia = leer.nextInt();
                            while (dia < 1 && dia > 31) {
                                System.out.println("Error. Ingrese una opcion valida:");
                                System.out.println("Dia: ");
                                dia = leer.nextInt();
                            }
                            System.out.println("Mes: ");
                            int mes = leer.nextInt();
                            while (mes < 1 && mes > 12) {
                                System.out.println("Error. Ingrese una opcion valida:");
                                System.out.println("Mes: ");
                                mes = leer.nextInt();
                            }
                            System.out.println("Anio:");
                            int anio = leer.nextInt();
                            while (anio < 1900 && anio > 2023) {
                                System.out.println("Error. Ingrese una opcion valida:");
                                System.out.println("Anio: ");
                                anio = leer.nextInt();
                            }
                            Date fechaNac = new Date(anio - 1900, mes - 1, dia);
                            alumno.setFechaNacimiento(fechaNac);
                            break;
                        case 5:
                            System.out.println("Saliendo . . .");
                            break;
                        default:
                            System.out.println("ERROR. Ingrese una opcion valida!");
                            break;
                    }
                } while (op != 5);
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("Alumno no encontrado!");
        }
    }

    public void mostrarAlumno(ArrayList<Alumnos> clase) {
        int cont = 0;
        System.out.println("---------------------------------");
        System.out.println("Ingrese el alumno que desea buscar: ");
        String buscado = leer.next();
        for (Alumnos alumno : clase) {
            if (alumno.getNombre().equalsIgnoreCase(buscado)) {
                System.out.println(alumno.toString());
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("Alumno no encontrado!");
        }
        System.out.println("---------------------------------");
    }

    public void crearLista(ArrayList<Alumnos> argentina, ArrayList<Alumnos> chile, ArrayList<Alumnos> venezuela, ArrayList<Alumnos> clase) {
        Random random = new Random();
        System.out.println("Cantidad de alumnos a ingresar: ");
        int cantidad = leer.nextInt();
        String[] nombre = {"Juan", "María", "Pedro", "Ana", "Carlos", "Laura", "Luis", "Valentina", "Javier", "Isabella"};
        String[] apellido = {"González", "Mendoza", "Martínez", "Vargas", "Ortega", "López", "Pérez", "Moreno", "Torres", "Rodríguez"};
        String[] nacionalidad = {"Argentina", "Chile", "Venezuela"};
        for (int i = 0; i < cantidad; i++) {
            clase.add(new Alumnos(nombre[(int) (Math.random() * 10)], apellido[(int) (Math.random() * 10)], nacionalidad[(int) (Math.random() * 3)], new Date((random.nextInt(124) + 1900) - 1900, (random.nextInt(12) + 1) - 1, (random.nextInt(31) + 1) - 1)));
        }
        elegirNacionalidad(argentina, chile, venezuela, clase);
    }

    public void mostrarLista(ArrayList<Alumnos> clase) {
        for (Alumnos alumno : clase) {
            System.out.println(alumno.toString());
        }
    }

    public void mostrarListaOrdenada(ArrayList<Alumnos> clase) {
        System.out.println("---------------------------------");

        System.out.println("Los alumnos ordenados por apellido alfabeticamente: ");
        Collections.sort(clase, compararAlumnosAscAp);
        for (Alumnos alumno : clase) {
            System.out.println(alumno.toString());
        }

        System.out.println("---------------------------------");

        System.out.println("Los alumnos ordenados por nombre alfabeticamente de forma inversa: ");
        Collections.sort(clase, compararAlumnosDesNom);
        for (Alumnos alumno : clase) {
            System.out.println(alumno.toString());
        }

        System.out.println("---------------------------------");
    }

    public void obtenerEdad(ArrayList<Alumnos> clase) {
        System.out.println("---------------------------------");

        System.out.println("Ingrese el nombre del alumno: ");
        String nombre = leer.next();
        Date fechaActual = new Date();
        int edad = 0;

        for (Alumnos alumno : clase) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                if (fechaActual.getDay() >= alumno.getFechaNacimiento().getDay()) {
                    if (fechaActual.getMonth() >= alumno.getFechaNacimiento().getMonth()) {
                        edad = fechaActual.getYear() - alumno.getFechaNacimiento().getYear();
                    } else {
                        if (fechaActual.getMonth() >= alumno.getFechaNacimiento().getMonth()) {
                            edad = fechaActual.getYear() - alumno.getFechaNacimiento().getYear();
                        } else {
                            edad = fechaActual.getYear() - alumno.getFechaNacimiento().getYear() - 1;
                        }
                    }
                }
            }
        }
        System.out.println("La edad del alumno es: " + edad);

        System.out.println("---------------------------------");
    }
    
    public void elegirNacionalidad(ArrayList<Alumnos> argentina, ArrayList<Alumnos> chile, ArrayList<Alumnos> venezuela, ArrayList<Alumnos> clase){
        System.out.println("---------------------------------");
        argentina.clear();
        chile.clear();
        venezuela.clear();
        for (Alumnos alumno : clase) {
            if (alumno.getNacionalidad().equalsIgnoreCase("argentina")) {
                argentina.add(alumno);
            }else if (alumno.getNacionalidad().equalsIgnoreCase("chile")) {
                chile.add(alumno);
            }else{
                venezuela.add(alumno);
            }
        }
        System.out.println("---------------------------------");
        
        System.out.println("Alumnos de Argentina: ");
        for (Alumnos alumno : argentina) {
            System.out.println(alumno.toString());
        }
        
        System.out.println("---------------------------------");
        
        System.out.println("Alumnos de Chile: ");
        for (Alumnos alumno : chile) {
            System.out.println(alumno.toString());
        }
        
        System.out.println("---------------------------------");
        
        System.out.println("Alumnos de Venezuela: ");
        for (Alumnos alumno : venezuela) {
            System.out.println(alumno.toString());
        }        
    }
}
