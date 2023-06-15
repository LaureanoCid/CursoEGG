/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package EjerciciosAprendizaje;

import Objeto.DivisionNumero;
import java.util.Scanner;

public class EjercicioAp03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        DivisionNumero d = new DivisionNumero();
        
        System.out.println("---------------");
        System.out.println("Ingrese un numero: ");
        String num1 = leer.next();
        System.out.println("Ingrese otro numero:");
        String num2 = leer.next();
        d.conversor(num1, num2);
        System.out.println("---------------");
        
    }    
}