/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.
 */
package javaIntroEjAp;
import java.util.Scanner;

public class JavaIntroEjAp11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1, num2, opcion;
        String eleccion = null;        
        System.out.println("Ingrese dos numeros: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        do {
            System.out.println("---------------");
            System.out.println("---------------");
            System.out.println("MENU");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            System.out.println("Elija una opcion: ");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("La suma es: " + (num1+num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (num1-num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es: " + (num1*num2));
                    break;
                case 4:
                    System.out.println("La division es: " + (num1/num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    do {                                               
                        eleccion = leer.nextLine();   
                    } while (!eleccion.equalsIgnoreCase("s") && !eleccion.equalsIgnoreCase("n"));
                    break;
                default:
                    System.out.println("ERROR! Ingresa un numero del 1-5.");
                    break;
            }
        } while (!eleccion.equalsIgnoreCase("s"));
    }   
}