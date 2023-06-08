/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package EjerciciosAprendizajeExtra;

import Objetos.Edificio;
import Objetos.Oficina;
import Objetos.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioApEx02 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Edificio> edificios = new ArrayList();
        int op = 0, cantP = 0, cantO = 0;

        do {
            System.out.println("---------------");
            System.out.println("------MENU------");
            System.out.println("¿Que desea crear?");
            System.out.println("1 - Polideportivo");
            System.out.println("2 - Edificio de Oficinas");
            System.out.println("3 - Salir");
            System.out.println("---------------");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    edificios.add(new Polideportivo().crearPolideportivo());    
                    cantP++;
                    break;
                case 2:
                    edificios.add(new Oficina().crearOficina());
                    cantO++;
                    break;
                case 3:
                    System.out.println("Saliendo. . . .");
                    break;
                default:
                    System.out.println("Error, ingrese una opcion valida.");
            }
            System.out.println("---------------");
            System.out.println("Existen " + cantP + " polideportivos y " + cantO + " de edificios de oficinas.");
            System.out.println("---------------");
        } while (op != 3);
    }
}