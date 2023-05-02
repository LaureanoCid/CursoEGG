//Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
package EjerciciosGuia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Ejercicio01 {
    
    public static void main(String[] args) {
         ArrayList<Integer> listado = new ArrayList();
        TreeSet<String> nombre = new TreeSet();
        HashMap<Integer, String> personas = new HashMap();
       
        for (int i = 0; i < 5; i++) {
            listado.add(i);
            nombre.add(String.valueOf(i));
            personas.put((int)(Math.random()*10), String.valueOf(i+1));
        }
    }    
}