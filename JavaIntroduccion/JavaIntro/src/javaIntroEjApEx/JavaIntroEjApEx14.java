/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package javaIntroEjApEx;

import java.util.Scanner;

public class JavaIntroEjApEx14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int familia, hijos, hijosT = 0, promedio = 0;
        
        System.out.println("Ingrese la cantidad de familias: ");
        familia = leer.nextInt();
        
        for (int i = 0; i < familia; i++) {
            System.out.println("Familia "+(i+1)+": Ingrese la cantidad de hijos");
            hijos = leer.nextInt();
            hijosT += hijos;
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese la edad del hijo N°"+(i+1)+":");
                promedio += leer.nextInt();
            }
        }
        System.out.println("La edad promedio de los hijos de todas las familias es: " + (promedio/hijosT));
    }  
}