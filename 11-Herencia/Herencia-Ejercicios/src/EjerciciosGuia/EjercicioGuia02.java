/*
Vamos a crear una interfaz con un método abstracto. Luego desde el main intentaremos instanciar
un objeto a partir de la interfaz
*/
package EjerciciosGuia;

import Objetos.Animal;
import Objetos.Gato;
import Objetos.Perro;
import java.util.ArrayList;

public class EjercicioGuia02 {

    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList();
        
        animales.add(new Animal());
        animales.add(new Perro());
        animales.add(new Gato());
        for (Animal aux : animales) {
            aux.hacerRuido();
            aux.despedirse();
        }
    }    
}