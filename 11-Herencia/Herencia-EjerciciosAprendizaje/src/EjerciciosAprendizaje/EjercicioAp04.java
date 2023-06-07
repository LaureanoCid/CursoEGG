/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package EjerciciosAprendizaje;

import Objetos.Circulo;
import Objetos.Rectangulo;
import java.util.Scanner;

public class EjercicioAp04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int op = 0;
        do {
            System.out.println("--------------------");
            System.out.println("¿Que figura desea crear?");
            System.out.println("1 - Circulo");
            System.out.println("2 - Rectangulo");
            System.out.println("3 - Salir");
            System.out.println("--------------------");
            op = leer.nextInt();
            while (op != 1 && op != 2 && op != 3) {
                System.out.println("--------------------");
                System.out.println("¿Que figura desea crear?");
                System.out.println("1 - Circulo");
                System.out.println("2 - Rectangulo");
                System.out.println("3 - Salir");
                System.out.println("--------------------");
                op = leer.nextInt();
            }
            switch (op) {
                case 1:
                    Circulo cir = new Circulo();
                    System.out.println("Ingrese el radio de su circulo: ");
                    cir.setRadio(leer.nextDouble());
                    cir.area();
                    cir.perimetro();
                    break;
                case 2:
                    Rectangulo rect = new Rectangulo();
                    System.out.println("Ingrese la base de su rectangulo: ");
                    rect.setBase(leer.nextDouble());
                    System.out.println("Ingrese la altura de su rectangulo: ");
                    rect.setAltura(leer.nextDouble());
                    rect.area();
                    rect.perimetro();
                    break;
                case 3:
                    System.out.println("Saliendo . . .");
                    break;
            }
        } while (op != 3);
    }
}