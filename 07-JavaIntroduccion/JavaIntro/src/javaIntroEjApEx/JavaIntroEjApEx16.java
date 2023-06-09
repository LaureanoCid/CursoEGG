/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package javaIntroEjApEx;

import java.util.Scanner;

public class JavaIntroEjApEx16 {

    public static void main(String[] args) {
        Scanner leerN = new Scanner(System.in);
        Scanner leerS = new Scanner(System.in);
        String opcion = "";
        System.out.println("Ingrese la cantidad de personas a ingresar: ");
        int cantidadP = leerN.nextInt();
        String [] nombre = new String [cantidadP];
        int [] edad = new int [cantidadP];
        
        for (int i = 0; i < cantidadP; i++) {
            System.out.println("Ingrese un nombre: ");
            nombre[i]=leerS.nextLine();
            System.out.println("Ingrese su edad: ");
            edad[i]=leerN.nextInt();            
            System.out.println("Nombre: " + nombre[i]);
            System.out.println("Edad: " + edad[i]);
            if (edad[i]>= 18) {
                System.out.println("Es mayor de edad!");
            }else{
                System.out.println("No es mayor de edad :(");
            }
            System.out.println("Quiere seguir visualizando? S/N");
            opcion = leerS.nextLine();
            if (opcion.equalsIgnoreCase("n")) {
                break;
            }
        }        
    }  
}
