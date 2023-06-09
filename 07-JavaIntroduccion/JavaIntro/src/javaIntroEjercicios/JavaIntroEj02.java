/*
¿Recuerdas las variables que creaste en el ejercicio anterior? Ahora deberás asignarles un valor.
 */
package javaIntroEjercicios;

import java.util.Scanner;

public class JavaIntroEj02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digite su nombre:");
        String nombre = leer.next();
        
        System.out.println("Su nombre es: " + nombre);
    }  
    
}