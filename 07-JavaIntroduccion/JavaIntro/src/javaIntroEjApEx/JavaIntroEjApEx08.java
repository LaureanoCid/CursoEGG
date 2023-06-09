/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package javaIntroEjApEx;

import java.util.Scanner;

public class JavaIntroEjApEx08 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int par=0, impar=0, num;
        do{
        System.out.println("Ingrese un número");        
        num = leer.nextInt();
            if (num < 0) {
                continue;               
            }                       
            if (num%5 == 0) {
              break;  
            }
            if (num%2 == 0) {
                par++;               
            }else {
                impar++;
            }
        }while (num%5 != 0);        
        System.out.println("La cantidad de números impares es " + impar);       
        System.out.println("La cantidad de números pares es " + par);
        System.out.println("La cantidad de números ingresados " + (par + impar));       
    }    
}