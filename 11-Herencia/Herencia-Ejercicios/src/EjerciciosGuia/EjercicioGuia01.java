/*
Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.
*/
package EjerciciosGuia;

import Objetos.Animal;
import Objetos.Gato;
import Objetos.Perro;
import java.util.ArrayList;

public class EjercicioGuia01 {

    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList();
        
        animales.add(new Animal());
        animales.add(new Perro());
        animales.add(new Gato());
        for (Animal aux : animales) {
            aux.hacerRuido();
        }
    }   
    
}