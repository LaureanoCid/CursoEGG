//   Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
//      en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
//      día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
//      se repite el encuentro.
package Servicio;

import Objetos.Curso;
import java.util.Scanner;

public class CursoServicio {
    Scanner leer = new Scanner(System.in);

    public String[] cargarAlumnos(Curso curso1) {
        String[] alumnos = new String[curso1.getAlumnos().length];

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1) + ": ");
            alumnos[i] = leer.next();
        }
        return alumnos;
    }

    public Curso crearCurso() {
        Curso curso1 = new Curso();
        System.out.println("Ingrese el nombre del curso: ");
        curso1.setNombreCurso(leer.next());
        System.out.println("Ingrese la cantidad de horas por dia que tiene el curso:");
        curso1.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de dias a la semana que tiene el curso: ");
        curso1.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese el turno del curso: [MANIANA] - [TARDE]");
        curso1.setTurno(leer.next().toLowerCase());
        System.out.println("Ingrese el precio que le pagan por hora: ");
        curso1.setPrecioPorHora(leer.nextDouble());
        System.out.println("Ingrese el nombre de sus alumnos: ");
        curso1.setAlumnos(cargarAlumnos(curso1));

        return curso1;
    }

    public void calcularGananciaSemanal(Curso curso1) {
        double gananciaSemanal = curso1.getPrecioPorHora() * curso1.getCantidadHorasPorDia() * curso1.getCantidadDiasPorSemana() * curso1.getAlumnos().length;
        System.out.println("Usted tendrá una ganancia semanal de: $" + gananciaSemanal);
    }
    
}