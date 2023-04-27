/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package javaIntroEjAp;
import java.util.Scanner;

public class JavaIntroEjAp05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un número");
        int num= leer.nextInt();
        
        System.out.println("el doble de ese número es: "+(num*2));
        System.out.println("el triple de ese número es: "+(num*3));
        System.out.println("la raíz cuadrada (aproximada) de ese número es: "+Math.sqrt(num));
    }    
}