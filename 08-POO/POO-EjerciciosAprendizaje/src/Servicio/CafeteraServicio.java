package Servicio;

import Objetos.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);

    public Cafetera crearCafetera() {
        Cafetera cafetera = new Cafetera();
        System.out.println("Ingrese la capacidad máxima de la cafetera en ml: ");
        cafetera.setCantidadMaxima(leer.nextDouble());
        return cafetera;
    }

    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCantidadMaxima());
        System.out.println("La cafetera tiene " + cafetera.getCantidadActual() + " ml de cafe.");
    }

    public void servirTaza(Cafetera cafetera) {
        System.out.println("Ingrese el tamaño de su taza en ml: ");
        double taza = leer.nextDouble();
        if (taza <= cafetera.getCantidadActual()) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
            System.out.println("Se ha llenado su taza!. Restan " + cafetera.getCantidadActual() + " ml de cafe.");
        } else {
            System.out.println("Cafe insuficiente.");
            System.out.println("El porcentaje que se ha llenado de la taza es: " + (100 * cafetera.getCantidadActual()) / taza + "%.");
            cafetera.setCantidadActual(0);
        }
    }

    public void vaciarCafetera(Cafetera cafetera) {
        if (cafetera.getCantidadActual() == 0) {
            System.out.println("La cafetera se encuentra vacia.");
        } else {
            cafetera.setCantidadActual(0);
            System.out.println("Se ha vaciado por completo la cafetera.");
        }
    }

    public void agregarCafe(Cafetera cafetera) {
        System.out.println("Puede agregar un maximo de: " + (cafetera.getCantidadMaxima() - cafetera.getCantidadActual()) + " ml de cafe.");
        cafetera.setCantidadActual(cafetera.getCantidadActual() + leer.nextInt());
        System.out.println("Se ha agregado su cafe. Ahora cuenta con " + cafetera.getCantidadActual() + " ml de cafe.");
    }
}