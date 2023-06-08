package Servicio;

import Objetos.Rectangulo;
import java.util.Scanner;

public class RectanguloServicio {

    Scanner leer = new Scanner(System.in);

    public Rectangulo crearRectangulo() {
        Rectangulo rec = new Rectangulo();

        System.out.println("Ingrese la base de su rectangulo: ");
        rec.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura de su rectangulo: ");
        rec.setAltura(leer.nextDouble());

        return rec;
    }

    public void superficieRectangulo(Rectangulo rec) {
        double sup = rec.getAltura() * rec.getBase();
        System.out.println("La superficie del rectangulo es de: " + sup);
    }

    public void perimetroRectangulo(Rectangulo rec) {
        double per = (rec.getAltura() + rec.getBase()) * 2;
        System.out.println("El perimetro del rectangulo es de: " + per);
    }

    public void dibujarRectangulo(Rectangulo rec) {
        System.out.println("---------");
        System.out.println("Modelo: ");
        System.out.println("---------");
        for (int i = 0; i < rec.getAltura(); i++) {
            for (int j = 0; j < rec.getBase(); j++) {
                if (i == 0 || j == 0 || i == rec.getAltura() - 1 || j == rec.getBase() - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
    
}