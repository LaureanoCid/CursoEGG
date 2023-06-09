/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package javaIntroEjAp;

import java.util.Scanner;

public class JavaIntroEjAp02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        System.out.println("Introduce un nombre: ");
        cadena = leer.nextLine();
        System.out.println("Mi nombre es " + cadena);    
    }    
}