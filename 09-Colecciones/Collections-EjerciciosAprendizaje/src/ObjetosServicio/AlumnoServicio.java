package ObjetosServicio;
import Objetos.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Alumno> crearAlumno() {
        ArrayList<Alumno> listaAlumnos = new ArrayList();
        String respuesta;
        do {
            Alumno alumno = new Alumno();
            System.out.println("Ingrese el nombre del alumno: ");
            alumno.setNombre(leer.next());

            ArrayList<Integer> nota = new ArrayList();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota del alumno: ");
                nota.add(leer.nextInt());

            }
            alumno.setListaNotas(nota);
            System.out.println("Desea agregar otro alumno?(si/no) ");
            respuesta = leer.next();
            while ((!respuesta.equalsIgnoreCase("si")) && (!respuesta.equalsIgnoreCase("no"))) {
                System.out.println("Error! Ingrese nuevamente su respuesta.");
                System.out.println("Desea agregar otro alumno?(si/no) ");
                respuesta = leer.next();
            }
            listaAlumnos.add(alumno);

        } while ("si".equals(respuesta));

        listaAlumnos.forEach((alumno) -> System.out.println("El nombre del alumno es : " + alumno.getNombre() + " " + " Sus notas son: " + alumno.getListaNotas()));

        return listaAlumnos;
    }

    public double notaFinal(ArrayList<Integer> notasFinales) {
        double suma = 0;

        for (Integer nota : notasFinales) {
            suma += nota;
        }

        return suma / notasFinales.size();
    }
}