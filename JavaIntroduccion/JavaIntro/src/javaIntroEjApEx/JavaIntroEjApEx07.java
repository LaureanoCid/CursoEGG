/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
números serán introducidos por el usuario. Realice dos versiones del programa, una
usando el bucle “while” y otra con el bucle “do - while”.
 */
package javaIntroEjApEx;
import java.util.Scanner;

public class JavaIntroEjApEx07 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int menor = 0, mayor = 0, i = 0, num;
        double promedio = 0;
        System.out.println("Ingrese la cantidad de numeros a ingresa: ");
        int n = leer.nextInt();
        while(n<0){
            System.out.println("Ingrese la cantidad de numeros a ingresa: ");
            n = leer.nextInt();
        }
        do {
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();
            if (i==0) {
                menor = num;
                mayor = num;
            }
            if (num<menor) {
                menor = num;
            }else if (num>mayor) {
                mayor = num;
            }
            promedio += num;
            i++;
        } while (i<n);
        System.out.println("El numero menor es: " + menor);
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El promedio es: " + (promedio/n));       
    }   
}