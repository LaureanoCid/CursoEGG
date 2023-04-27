package Servicio;
import Objetos.Circunferencia;
import java.util.Scanner;

public class CircunferenciaServicio {

    Scanner leer = new Scanner(System.in);

    public Circunferencia crearCircunferencia() {
        Circunferencia c1 = new Circunferencia();

        System.out.println("Ingrese el radio: ");
        c1.setRadio(leer.nextDouble());

        return c1;
    }

    public void area(Circunferencia c1) {
        double area = 3.14 * (Math.pow(c1.getRadio(), 2));
        System.out.println("El area es: " + area);
    }

    public void perimetro(Circunferencia c1) {
        double perimetro = 2 * 3.14 * c1.getRadio();
        System.out.println("El perimetro es: " + perimetro);
    }
}