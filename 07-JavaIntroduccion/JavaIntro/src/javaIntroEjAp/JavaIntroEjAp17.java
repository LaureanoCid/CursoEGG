/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package javaIntroEjAp;

import java.util.Scanner;

public class JavaIntroEjAp17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0, contador5 = 0, cant = 0;
        
        System.out.println("Inrese el tamaño de su vector: ");
        n = leer.nextInt();
        int[] vectorNumeros = new int[n];
        
        for (int i = 0; i < vectorNumeros.length; i++) {
            vectorNumeros[i] += (Math.random() * 100000);
            System.out.println(vectorNumeros[i]);
            String numero = String.valueOf(vectorNumeros[i]);
            cant = numero.length();
            
            switch(cant){
                case 1:
                    contador1++;
                    break;
                case 2:
                    contador2++;
                    break;
                case 3:
                    contador3++;
                    break;
                case 4:
                    contador4++;
                    break;
                case 5:
                    contador5++;
                    break;
            }
        }
        
        System.out.println("Hay " + contador1 + " numeros de 1 digito.");
        System.out.println("Hay " + contador2 + " numeros de 2 digitos.");
        System.out.println("Hay " + contador3 + " numeros de 3 digitos.");
        System.out.println("Hay " + contador4 + " numeros de 4 digitos.");
        System.out.println("Hay " + contador5 + " numeros de 5 digitos.");
    }    
}