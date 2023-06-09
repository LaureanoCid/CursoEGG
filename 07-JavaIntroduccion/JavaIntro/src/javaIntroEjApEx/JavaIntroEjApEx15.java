/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package javaIntroEjApEx;

import java.util.Scanner;

public class JavaIntroEjApEx15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros: ");
        int opcion, num1 = leer.nextInt(), num2 = leer.nextInt();
        
        do {
            System.out.println("-------------");
            System.out.println("1-SUMAR");
            System.out.println("2-RESTAR");
            System.out.println("3-MULTIPLICAR");
            System.out.println("4-DIVIDIR");
            System.out.println("0-SALIR");
            System.out.println("-------------");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:                    
                    System.out.println("La suma es: " + sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + restar(num1, num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es: " + multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println("La division es: " + dividir(num1, num2));
                    break;
                default:
                    System.out.println("Saliendo.....");
                    break;                   
            }            
        } while (opcion != 0);                
    } 
    public static int sumar(int num1, int num2){       
        return num1+num2;
    }
    public static int restar(int num1, int num2){        
        return num1-num2;
    }
    public static int multiplicar(int num1, int num2){
        return num1*num2;
    }
    public static double dividir(int num1, int num2){
        return num1/num2;
    }
}
