package Servicio;

import Objeto.Fraccion;
import java.util.Scanner;

public class FraccionServicio { 
    Scanner leer = new Scanner(System.in).useDelimiter("\n");    
    public Fraccion crearFracciones(){
        Fraccion fracciones = new Fraccion();
        System.out.println("Ingrese su primera fraccion: ");
        System.out.println("Numerador:");
        fracciones.setNumerador1(leer.nextInt());
        System.out.println("Denominador: ");
        fracciones.setDenominador1(leer.nextInt());
        System.out.println("Ingrese su segunda fraccion: ");
        System.out.println("Numerador:");
        fracciones.setNumerador2(leer.nextInt());
        System.out.println("Denominador: ");
        fracciones.setDenominador2(leer.nextInt());        
        return fracciones;
    }
    public void mostrarFracciones(Fraccion fracciones){
        System.out.println(fracciones.toString());
    }
    public void menu(Fraccion fracciones){
        int op = 0;
        do {
            System.out.println("--------------------------");
            System.out.println("Menu Fracciones");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Mostrar fracciones");
            System.out.println("6 - Simplificar");
            System.out.println("--------------------------");
            
        } while (op !=5);
        
    }
}