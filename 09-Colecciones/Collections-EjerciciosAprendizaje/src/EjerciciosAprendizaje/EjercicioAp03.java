//Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
//alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
//con sus 3 notas.
//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
//toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
//Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.
package EjerciciosAprendizaje;
import Objetos.Alumno;
import ObjetosServicio.AlumnoServicio;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioAp03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AlumnoServicio service = new AlumnoServicio();

        ArrayList<Alumno> alumnos = service.crearAlumno();

        System.out.println("Ingrese el nombre del estudiante que desea buscar: ");
        String nombre = leer.next();
        boolean aux = false;
        for (Alumno alum : alumnos) {
            if (alum.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("La nota final del alumno es: " + service.notaFinal(alum.getListaNotas()));
                aux = true;
            }
        }
        if (!aux) {
            System.out.println("No se encontro el alumno");

        }
    }
}
