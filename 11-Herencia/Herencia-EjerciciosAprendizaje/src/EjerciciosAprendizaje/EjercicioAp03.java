/*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package EjerciciosAprendizaje;

import Objetos.Electrodomestico;
import Objetos.Lavadora;
import Objetos.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioAp03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();
        int precioLava = 0, precioTele = 0, precioT = 0, op = 0;        

        do {
            System.out.println("----------------");
            System.out.println("Que desea comprar?");
            System.out.println("1 - Lavadora");
            System.out.println("2 - Televisor");
            System.out.println("3 - Salir");
            System.out.println("----------------");
            op = leer.nextInt();
            while (op != 1 && op != 2 && op != 3) {
                System.out.println("Error. Ingrese una opcion válida.");
                System.out.println("----------------");
                System.out.println("Que desea comprar?");
                System.out.println("1 - Lavadora");
                System.out.println("2 - Televisor");
                System.out.println("3 - Salir");
                System.out.println("----------------");
                op = leer.nextInt();
            }
            switch (op) {
                case 1:
                    Lavadora lava = new Lavadora();
                    lava.crearLavadora();
                    electrodomesticos.add(lava);
                    precioLava += lava.getPrecio();
                    precioT += lava.getPrecio();
                    break;
                case 2:
                    Televisor tele = new Televisor();
                    tele.crearTelevisor();
                    electrodomesticos.add(tele);
                    precioTele += tele.getPrecio();
                    precioT += tele.getPrecio();
                    break;
                case 3:
                    System.out.println("Saliendo . . . .");
                    break;
            }
        } while ((electrodomesticos.size() < 4) && (op != 3));
        System.out.println("El dinero gastado en lavadoras es: $" + precioLava);
        System.out.println("El dinero gastado en televisor es: $" + precioTele);
        System.out.println("El dinero total gastado en electrodomesticos es: $" + precioT);
    }
}