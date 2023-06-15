/*
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
 */
package EjerciciosAprendizaje;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioAp04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        try {
            System.out.println("----------");
            System.out.println("Ingrese un numero: ");
            String num1 = leer.next();
            System.out.println("Ingrese otro numero: ");
            String num2 = leer.next();
            int num01 = Integer.parseInt(num1);
            int num02 = Integer.parseInt(num2);
            System.out.println("La division da como resultado: " + (num01 / num02));

        } catch (InputMismatchException ex) {
            System.out.println("Error! Ingrese solo numeros!");
        } catch (NumberFormatException ex) {
            System.out.println("Error! Ingrese solo numeros!");
        } catch (ArithmeticException ex) {
            System.out.println("Error! Noo puede dividir a un numero por cero!");
        }
        
    }
}