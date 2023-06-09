/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
package javaIntroEjApEx;

import java.util.Scanner;

public class JavaIntroEjApEx18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de su vector: ");
        int [] numeros = new int [leer.nextInt()];
        int suma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = leer.nextInt();
            suma += numeros[i];
            System.out.println("-----------------");
        }        
        System.out.println("La suma de su vector es: " + suma);
    } 
}