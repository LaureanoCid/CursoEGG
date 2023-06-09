/*
Define variables donde puedas alojar los resultados y prueba usar dos operadores de cada tipo.
 */
package javaIntroEjercicios;

import java.util.Scanner;

public class JavaIntroEj03 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite la frase:");
        
        String frase = leer.nextLine();
        
        System.out.println("---------------");
        System.out.println(frase.toLowerCase());
        System.out.println("---------------");
        System.out.println(frase.toUpperCase());
    }    
}