/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package javaIntroEjAp;

import java.util.Scanner;

public class JavaIntroEjAp04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double cent, far;
        System.out.println("Ingrese la temperatura para mostrar su equivalencia ");
        cent = leer.nextDouble();
        far = 32 + (9 * cent / 5);
        
        System.out.println("El equivalente en Fahrenheit es: " + far);
    }    
}