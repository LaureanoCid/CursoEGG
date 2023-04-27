/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package javaIntroEjApEx;
import java.util.Scanner;

public class JavaIntroEjApEx20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de su verctor: ");
        int n = leer.nextInt();
        int [] vector1 = new int [n];
        
        llenadoVector(vector1);
        imprimir(vector1);
    }  
    public static int [] llenadoVector(int[] vector1){
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = (int)(Math.random()*10);
        }        
        return vector1;
    }
    public static void imprimir(int [] vector1){
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("("+vector1[i]+")");
        }
        System.out.println("");
    }
}