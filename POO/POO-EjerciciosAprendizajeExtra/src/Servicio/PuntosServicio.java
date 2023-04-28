package Servicio;

import Objeto.Puntos;
import java.util.Scanner;

public class PuntosServicio {
    Scanner leer = new Scanner(System.in);
    
    public Puntos crearPuntos(){
        Puntos p1 = new Puntos();
        
        System.out.println("Ingrese el primer punto: ");
        System.out.println("Coordenada X: ");
        p1.setX1(leer.nextInt());
        System.out.println("Coordenada Y: ");
        p1.setY1(leer.nextInt());
        System.out.println("Ingrese el segundo punto: ");
        System.out.println("Coordenada X: ");
        p1.setX2(leer.nextInt());
        System.out.println("Coordenada Y: ");
        p1.setY2(leer.nextInt());
        
        return p1;
    }
    
    public double calcularDistancia(Puntos p1){
        double distancia = 0;
        distancia = Math.sqrt((Math.pow((p1.getX2()-p1.getX1()), 2))+(Math.pow((p1.getY2()-p1.getY1()), 2)));
        return distancia;
    }
}