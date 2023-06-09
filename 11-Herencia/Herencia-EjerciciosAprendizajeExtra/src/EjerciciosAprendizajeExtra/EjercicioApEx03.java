/*
Una compañía de promociones turísticas desea mantener información sobre la infraestructura
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */
package EjerciciosAprendizajeExtra;

import Objetos.Alojamiento;
import Objetos.Camping;
import Objetos.Hotel;
import Objetos.Hotel4;
import Objetos.Hotel5;
import Objetos.Residencia;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class EjercicioApEx03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int op = 0;
        ArrayList<Alojamiento> alojamientos = new ArrayList();
        Hotel[] hoteles = {new Hotel4('A', "Rest1", 40, 10, 2, 5, 0, "Hotel1", "Direcc1", "Bragado", "Gerente1"),
        new Hotel4('B', "Rest2", 50, 5, 1, 10, 0, "Hotel2", "Direcc2", "Bragado", "Gerente2"),
        new Hotel5(2, 3, 10, 'A', "Rest3", 40, 10, 2, 5, 0, "Hotel3", "Direcc3", "Bragado", "Gerente3"),
        new Hotel5(7, 2, 20, 'B', "Rest4", 50, 5, 1, 10, 0, "Hotel4", "Direcc4", "Bragado", "Gerente4")
        };
        //Hoteles 4 Star
        alojamientos.add(new Hotel4('A', "Rest1", 40, 10, 2, 5, 0, "Hotel1", "Direcc1", "Bragado", "Gerente1"));
        alojamientos.add(new Hotel4('B', "Rest2", 50, 5, 1, 10, 0, "Hotel2", "Direcc2", "Bragado", "Gerente2"));        
        
        //Hoteles 5 Star
        alojamientos.add(new Hotel5(2, 3, 10, 'A', "Rest3", 40, 10, 2, 5, 0, "Hotel3", "Direcc3", "Bragado", "Gerente3"));
        alojamientos.add(new Hotel5(7, 2, 20, 'B', "Rest4", 50, 5, 1, 10, 0, "Hotel4", "Direcc4", "Bragado", "Gerente4"));        
        
        //Campings
        alojamientos.add(new Camping(50, 5, true, false, 200, "Camping1", "Direcc5", "Bragado", "Gerente5"));
        alojamientos.add(new Camping(35, 10, false, false, 150, "Camping2", "Direcc6", "Bragado", "Gerente6"));

        //Residencias
        alojamientos.add(new Residencia(10, false, true, true, 300, "Residencia1", "Direcc7", "Bragado", "Gerente7"));
        alojamientos.add(new Residencia(8, true, false, false, 150, "Residencia2", "Direcc8", "Bragado", "Gerente8"));

        do {
            System.out.println("""
                               ---------------------------------------
                               -----------------MENU------------------
                               1 - Ver todos los alojamientos
                               2 - Hoteles del mas caro al mas barato
                               3 - Campings con restaurante
                               4 - Residencias con descuentos
                               5 - Salir
                               ---------------------------------------
                               """);
            op = leer.nextInt();
            switch (op) {
                case 1:
                    for (Alojamiento aux : alojamientos) {
                        System.out.println("---------------------------------------");
                        System.out.println(aux.toString());
                        System.out.println("---------------------------------------");
                    }
                    break;
                case 2:
                    Arrays.sort(hoteles, Comparator.comparingDouble(Hotel::getPrecioHabitacion).reversed());
                    for (Hotel aux : hoteles) {
                        System.out.println(aux.toString());
                    }
                    break;
                case 3:
                    for (Alojamiento aux : alojamientos) {
                        if (aux instanceof Camping) {
                            if (((Camping) aux).isRestaurante()) {
                                System.out.println(aux.toString());
                            }
                        }
                    }
                    break;
                case 4:
                    for (Alojamiento aux : alojamientos) {
                        if (aux instanceof Residencia){
                            if (((Residencia) aux).isDescuento()) {
                                System.out.println(aux.toString());
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saliendo . . .");
                    break;
                default:
                    System.out.println("Error! Ingrese una opcion valida!");
            }
        } while (op != 5);
    }
}