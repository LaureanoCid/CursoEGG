/*
 Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package EjerciciosAprendizajeExtra;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioApEx01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona persona = new Persona();
        Perro perro = new Perro();
        ArrayList<Perro> perros = new ArrayList();
        ArrayList<Persona> personas = new ArrayList();
        System.out.println("-------------------");
        System.out.println("PERRERA PERRITOS");
        System.out.println("-------------------");
        System.out.println("Ingrese la cantidad de personas que van a adoptar: ");
        int cant = leer.nextInt();       
        
        System.out.println("-------------------");
        System.out.println("Ingrese los candidatos que van a adoptar");
        persona.crearPersona(personas, cant);
        System.out.println("-------------------");
        
        System.out.println("-------------------");
        System.out.println("Ingrese los perritos que se daran en adopcion: ");
        perro.crearPerro(perros, cant);
        System.out.println("-------------------");
        
        System.out.println("-------------------");
        System.out.println("Que comience la adopcion: ");
        persona.eleccion(personas, perros);
        System.out.println("-------------------");
        
        System.out.println("-------------------");
        System.out.println("Los perritos han conseguido dueños :)");
        for (Persona persona1 : personas) {
            System.out.println(persona1.toString());
        }
        System.out.println("-------------------");
    }
    
}