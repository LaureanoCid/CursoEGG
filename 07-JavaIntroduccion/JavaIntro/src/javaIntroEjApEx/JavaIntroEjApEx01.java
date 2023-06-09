/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package javaIntroEjApEx;

import java.util.Scanner;

public class JavaIntroEjApEx01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de minutos: ");
        double minutos = leer.nextDouble();
        
        cambio(minutos);
    }

    public static void cambio (double minutos){        
        System.out.println("La cantidad de horas es: " + (minutos/60));
        System.out.println("La cantidad de dias es: " + (minutos/1440));
    }
}
