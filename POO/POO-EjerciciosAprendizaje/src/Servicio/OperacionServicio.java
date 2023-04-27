package Servicio;
import Objetos.Operacion;
import java.util.Scanner;

public class OperacionServicio {

    Scanner leer = new Scanner(System.in);

    public Operacion crearOperacion() {
        Operacion op1 = new Operacion();

        System.out.println("Ingrese el valor del primer numero: ");
        op1.setNum1(leer.nextInt());
        System.out.println("Ingrese el valor del segundo numero: ");
        op1.setNum2(leer.nextInt());

        return op1;
    }

    public void sumar(Operacion op1) {
        int suma = op1.getNum1() + op1.getNum2();
        System.out.println("La suma de ambos numeros es igual a: " + suma);
    }

    public void restar(Operacion op1) {
        int resta = op1.getNum1() - op1.getNum2();
        System.out.println("La resta de ambos numeros es igual a: " + resta);
    }

    public void multiplicar(Operacion op1) {
        if (op1.getNum1() == 0 || op1.getNum2() == 0) {
            System.out.println("Error. La multiplicacion da como resultado: 0");
        } else {
            int multi = op1.getNum1() * op1.getNum2();
            System.out.println("La multiplicacion de ambos numeros es igual a: " + multi);
        }
    }

    public void dividir(Operacion op1) {
        if (op1.getNum1() == 0 || op1.getNum2() == 0) {
            System.out.println("Error. La division da como resultado: 0");
        } else {
            double division = op1.getNum1() / op1.getNum2();
            System.out.println("La division de ambos numeros es igual a: " + division);
        }
    }
}