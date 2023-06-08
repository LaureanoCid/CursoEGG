/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package EjerciciosAprendizaje;

import Entidad.Perro;
import Entidad.Persona;

public class EjercicioAp01 {

    public static void main(String[] args) {
        Perro perro1 = new Perro("Luna", "Perro", 5, "Chiquito");
        Perro perro2 = new Perro("Yano", "Perro", 8, "Mediano");
        Persona p1 = new Persona("Sofia", "Candela", 21, 12345, perro1);
        Persona p2 = new Persona("Laureano", "Cid", 25, 40454454, perro2);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }    
    
}