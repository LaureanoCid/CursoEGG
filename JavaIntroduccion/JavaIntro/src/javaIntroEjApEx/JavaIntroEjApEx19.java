/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package javaIntroEjApEx;

import java.util.Scanner;

public class JavaIntroEjApEx19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de sus vectores: ");
        int n = leer.nextInt(), cont = 0;      
        int [] vector1 = new int [n];
        int [] vector2 = new int [n];
        
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("Ingrese un numero para el vector 1");
            vector1[i] = leer.nextInt();
            System.out.println("Ingrese un numero para el vector 2");
            vector2[i] = leer.nextInt();
            if (vector1[i] != vector2[i]) {
                break;
            }else{
                cont++;
            }
        }
        if (cont == n) {
            System.out.println("Los vectores son iguales!");
        }else{
            System.out.println("Los vectores no coinciden :(");
        }
    }  
}