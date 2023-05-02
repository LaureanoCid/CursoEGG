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
            System.out.println("7 - Salir");
            System.out.println("--------------------------");
            
            switch(op){
                case 1:                    
                    sumarFracciones(fracciones);
                    break;
                case 2:
                    restarFracciones(fracciones);
                    break;
                case 3:
                    multiFracciones(fracciones);
                    break;
                case 4:
                    dividirFracciones(fracciones);
                    break;
                case 5:
                    mostrarFracciones(fracciones);
                    break;
                case 6:
                    simplificar(fracciones);
                    break;
                case 7:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("ERROR. Ingrese una opcion valida.");
            }            
        } while (op !=7);        
    }
    public void sumarFracciones(Fraccion fracciones){
        
    }
    public void restarFracciones(Fraccion fracciones){
        
    }
    public void multiFracciones(Fraccion fracciones){
        
    }
    public void dividirFracciones (Fraccion fracciones){
        
    }
    public void simplificar(Fraccion fracciones){
        
    }
}