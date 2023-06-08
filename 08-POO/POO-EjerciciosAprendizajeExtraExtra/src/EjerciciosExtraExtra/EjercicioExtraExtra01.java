/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package EjerciciosExtraExtra;

import Objeto.Fraccion;
import Servicio.FraccionServicio;

public class EjercicioExtraExtra01 {

    public static void main(String[] args) { 
        FraccionServicio service = new FraccionServicio();        
        Fraccion fracciones = service.crearFracciones();
        service.mostrarFracciones(fracciones);
        service.menu(fracciones);
    }    
    
}