//Crear una clase llamada Operacion que tenga como atributos privados numero1 y
//numero2. A continuación, se deben crear los siguientes métodos:
//    -a) Método constructor con todos los atributos pasados por parámetro.
//    -b) Metodo constructor sin los atributos pasados por parámetro.
//    -c) Métodos get y set.
//    -d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
//        en los atributos del objeto.
//    -e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//    -f) Método restar(): calcular la resta de los números y devolver el resultado al main.
//    -g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
//        fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
//        Si no, se hace la multiplicación y se devuelve el resultado al main
//    -h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//        una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//        informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
package EjercicioAprendizaje;
import Objetos.Operacion;
import Servicio.OperacionServicio;
import java.util.Scanner;

public class POOEjAp03 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        OperacionServicio service = new OperacionServicio();

        Operacion op1 = service.crearOperacion();

        int opcion = 0;

        do {
            System.out.println("---------------------");
            System.out.println("MENU");
            System.out.println("1 - SUMA");
            System.out.println("2 - RESTA");
            System.out.println("3 - MULTIPLICACION");
            System.out.println("4 - DIVISION");
            System.out.println("5 - SALIR");
            System.out.println("---------------------");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    service.sumar(op1);
                    break;
                case 2:
                    service.restar(op1);
                    break;
                case 3:
                    service.multiplicar(op1);
                    break;
                case 4:
                    service.dividir(op1);
                    break;
                case 5:
                    System.out.println("Saliendo . . . .");
                    break;
                default:
                    System.out.println("Error al elegir una opcion. Intente nuevamente.");
                    break;
            }
        } while (opcion != 5);
    }
}