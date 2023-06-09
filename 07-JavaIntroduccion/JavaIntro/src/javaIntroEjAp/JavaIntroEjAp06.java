/*
Crear un programa que dado un numero determine si es par o impar.
 */
package javaIntroEjAp;

import java.util.Scanner;

public class JavaIntroEjAp06 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        
        if(num%2==0){
            System.out.println("EL NUMERO ES PAR!");
        }else{
            System.out.println("EL NUMERO ES IMPAR!");
        }
    }   
}