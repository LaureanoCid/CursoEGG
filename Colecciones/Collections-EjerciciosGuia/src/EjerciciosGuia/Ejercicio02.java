//Toma la Lista, el Conjunto y el Mapa que hiciste previamente y elimina en cada uno un objeto de
//cada forma que aprendiste arriba.
package EjerciciosGuia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Ejercicio02 {

    public static void main(String[] args) {
        ArrayList<Integer> listado = new ArrayList();
        TreeSet<String> nombre = new TreeSet();
        HashMap<Integer, String> personas = new HashMap();
       
        for (int i = 0; i < 5; i++) {
            listado.add(i);
            nombre.add(String.valueOf(i));
            personas.put((int)(Math.random()*10), String.valueOf(i+1));
        }
        System.out.println("-----------------");
        for (String aux : nombre) {
            System.out.println(aux);
        }
        System.out.println("-----------------");
        listado.remove(3);
        System.out.println("-----------------");
        for (Integer aux2 : listado) {
            System.out.println(aux2);
        }
        nombre.remove("2");
        System.out.println("-----------------");
        for (String aux1 : nombre) {
            System.out.println(aux1);
        }
        
        personas.remove(1);
        System.out.println("-----------------");
        for(Map.Entry<Integer, String> aux5 : personas.entrySet()){
            System.out.println("Llave: " + aux5.getKey() + " - Valor: " + aux5.getValue());
        }
    }
}    