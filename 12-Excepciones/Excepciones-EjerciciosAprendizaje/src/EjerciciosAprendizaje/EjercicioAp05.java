/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package EjerciciosAprendizaje;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioAp05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int nAleatorio = (int) (Math.random() * 5); //Numero a adivinar
        int cont = 0; //Contador de intentos
        int n = 0; //Numero que el usuario ingresa

        System.out.println("Bienvenido al adivinador!");
        do {            
            System.out.println("Ingrese un numero: ");
            try {                
                n = leer.nextInt();

                if (n < nAleatorio) {
                    System.out.println("El numero debe ser mayor!");
                    cont++;
                } else if (n > nAleatorio) {
                    System.out.println("El numero debe ser menor!");
                    cont++;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Error! ingrese solo numeros!");
                cont++;
                leer.nextLine();
            }
        } while (nAleatorio != n);
        
        System.out.println("Has acertado! :)");
        System.out.println("Has hecho " + cont + " intentos.");
    }
}