/*
Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables
por pantalla.
 */
package javaIntroEjercicios;
import java.util.Scanner;

public class JavaIntroEj04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite los grados celsius a modificar: ");
        int temperatura = leer.nextInt();
        
        double fahrenheit = 32 +(9 * temperatura/ 5);
        
        System.out.println("La temperatura de grados Fahrenheit es: " + fahrenheit);
    }   
}