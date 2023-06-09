/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package javaIntroEjercicios;

import java.util.Scanner;

public class JavaIntroEj13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i;
        String nombres[]= new String[6];
        for(i=0; i<6; i++){
            System.out.println("ingrese el nombre del integrante #"+(i+1));
            nombres[i]=leer.nextLine();
        }
        
        for(i=0;i<6;i++){
            System.out.print(nombres[i]+", ");
        }
    }  
    
}