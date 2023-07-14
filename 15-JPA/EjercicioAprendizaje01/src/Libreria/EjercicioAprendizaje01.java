package Libreria;

import java.util.Scanner;

public class EjercicioAprendizaje01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int op = 0;
        
        do {
            System.out.println("-----------MENU----------");
            System.out.println("1 - ");
            System.out.println("2 - ");
            System.out.println("3 - ");
            System.out.println("4 - ");
            System.out.println("5 - ");
            System.out.println("6 - ");
            System.out.println("7 - ");
            System.out.println("8 - ");
            System.out.println("9 - ");
            System.out.println("10 - ");
            System.out.println("11 - ");
            System.out.println("12 - ");
            System.out.println("13 - ");
            System.out.println("14 - Salir");
            op = leer.nextInt();
            
            switch (op) {
                case 1:
                    
                    break;
                case 14:
                    System.out.println("Saliendo. . . .");
                    break;
                default:
                    System.out.println("Error. Ingrese una opcion valida");
            }
        } while (op != 14);
    }    
}