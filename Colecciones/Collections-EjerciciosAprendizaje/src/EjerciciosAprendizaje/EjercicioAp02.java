//Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//la lista ordenada.
package EjerciciosAprendizaje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class EjercicioAp02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> razas = new ArrayList();
        int op = 0;
        do {
            System.out.println("----------------");
            System.out.println("MENU");
            System.out.println("1. Crear una raza");
            System.out.println("2. Salir");
            System.out.println("----------------");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Ingrese la raza de su perro: ");                   
                    razas.add(leer.next());
                    break;
                case 2:
                    System.out.println("Saliendo . . .");
                    break;
                default:
                    System.out.println("ERROR. Ingrese un valor correcto!");
                    break;
            }
        } while (op != 2);
        
        for (String raza : razas) {
            System.out.println(raza);
        }
        //Borrado de Raza
        System.out.println("Ingrese una raza a buscar");
        String raza1 = leer.next();
        int cont = razas.size();
        Iterator<String> it = razas.iterator();
        while (it.hasNext()) {
            if (it.next().equals(raza1)) {
                it.remove();
            }
        }
        if (cont == razas.size()) {
            System.out.println("NO ESTA!!!!");
        }
        
        Collections.sort(razas);
        
        for (String Raza : razas) {
            System.out.println(Raza);
        }
    }    
}