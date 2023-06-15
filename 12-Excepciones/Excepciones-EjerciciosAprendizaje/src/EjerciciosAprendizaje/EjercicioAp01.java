/*
Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
*/
package EjerciciosAprendizaje;

import Objeto.Persona;

public class EjercicioAp01 {

    public static void main(String[] args) {

        try{
            Persona per1 = null;
            per1.mayorDeEdad(per1);
        }catch (NullPointerException e) {
            System.out.println("La persona no ha sido creada");
        }        
    }    
}