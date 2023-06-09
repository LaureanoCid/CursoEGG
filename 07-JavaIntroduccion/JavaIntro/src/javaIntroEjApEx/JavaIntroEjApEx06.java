/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package javaIntroEjApEx;

import java.util.Scanner;

public class JavaIntroEjApEx06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double promedio = 0, promedio2 = 0, altura;
        int aux = 0;
        System.out.println("Ingrese la cantidad de personas que desea comparar: ");
        int n = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la estatura de la persona: ");
            altura = leer.nextDouble();
            promedio2 += altura;
            if (altura<1.60) {
                promedio += altura;
                aux++;
            }
        }
        promedio = promedio / aux;
        promedio2 = promedio2 / n;
        
        System.out.println("El promedio de las " + aux + " personas que miden menos de 1.60 es: " + promedio);
        System.out.println("El promedio de las " + n + " personas es: " + promedio2);
    }    
}
