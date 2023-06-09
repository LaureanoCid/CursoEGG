/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 */
package javaIntroEjAp;

import java.util.Scanner;

public class JavaIntroEjAp10 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int limite, suma= 0, num;
        
        do {
            System.out.println("Ingrese el limite a superar");
            limite = leer.nextInt();
            } while (limite < 0);
                    
        do {
            System.out.println("Ingrese el numero a sumar");
            num = leer.nextInt();
            suma += num;
            } while (suma <= limite);
        
        System.out.println("La suma " + suma + " supero al Limite: " + limite);        
    }  
    
}