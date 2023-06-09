/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package javaIntroEjApEx;

import java.util.Scanner;

public class JavaIntroEjApEx13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera: ");
        int altura = leer.nextInt();
        String escalera = "";
        
        for (int i = 1; i < altura+1; i++) {
            escalera=escalera.concat(Integer.toString(i));
            System.out.println(escalera);           
        }        
    } 
}