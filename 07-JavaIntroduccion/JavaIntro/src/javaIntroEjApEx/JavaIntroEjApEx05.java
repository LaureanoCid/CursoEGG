/*
Una obra social tiene tres clases de socios:
    o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
    todos los tipos de tratamientos.
    o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
    para los mismos tratamientos que los socios del tipo A.
    o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
    tratamientos.
    o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
    real que represente el costo del tratamiento (previo al descuento) y determine el
    importe en efectivo a pagar por dicho socio.
 */
package javaIntroEjApEx;

import java.util.Scanner;

public class JavaIntroEjApEx05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la clase de socio: ");
        System.out.println("Socio A");
        System.out.println("Socio B");
        System.out.println("Socio C");
        System.out.println("----------------");
        String socio = leer.nextLine();
        System.out.println("Ingrese el importe del producto: ");
        double precio = leer.nextDouble();
        System.out.println("----------------");
        System.out.println("Usted debera abonar $" + descuento(socio, precio));
    }    
    
    public static double descuento (String socio, double precio){
        switch(socio){
            case "A":
                precio = precio - (precio * 0.50);
                break;
            case "B":
                precio = precio - (precio * 0.35);
                break;
            case "C":
                precio = precio;
                break;
        }
        return precio;
    }
}