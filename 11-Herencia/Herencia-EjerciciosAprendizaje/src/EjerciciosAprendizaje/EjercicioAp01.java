/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package EjerciciosAprendizaje;

import Objetos.Animal;
import Objetos.Caballo;
import Objetos.Gato;
import Objetos.Perro;

public class EjercicioAp01 {

    public static void main(String[] args) {
        //Declaracion objeto Perro
        Animal perro1 = new Perro("Stich", 15, "Doberman", "Carnivoro");
        perro1.alimentarse();
        
        //Declaracion objeto Gato
        Animal gato1 = new Gato("Pelusa", 15, "Siames", "Galletas");
        gato1.alimentarse();
        
        //Declaracion objeto Caballo
        Animal caballo1 = new Caballo("Spark", 25, "Fino", "Pasto");
        caballo1.alimentarse();
        
        //Declaracion objeto Perro
        Animal perro2 = new Perro("Teddy", 10, "Chihuahua", "Croquetas");
        perro2.alimentarse();
    }    
    
}