package Servicio;
import Objetos.Matematica;

public class MatematicaServicio {

    public void devolverMayor(Matematica objeto1) {
        if (objeto1.getNum1() > objeto1.getNum2()) {
            System.out.println("EL numero 1-[" + objeto1.getNum1() + "] es el mayor.");
        } else {
            System.out.println("EL numero 2-[" + objeto1.getNum2() + "] es el mayor.");
        }
    }

    public void calcularPotencia(Matematica objeto1) {
        if (objeto1.getNum1() > objeto1.getNum2()) {
            System.out.println("El numero 1 elevado al numero 2 es: " + Math.pow(Math.round(objeto1.getNum1()), Math.round(objeto1.getNum2())));
        } else {
            System.out.println("El numero 2 elevado al numero 1 es: " + Math.pow(Math.round(objeto1.getNum2()), Math.round(objeto1.getNum1())));
        }
    }

    public void calcularRaiz(Matematica objeto1) {
        if (objeto1.getNum1() > objeto1.getNum2()) {
            System.out.println("La raiz del numero 2 es: " + Math.sqrt(Math.abs(objeto1.getNum2())));
        } else {
            System.out.println("La raiz del numero 1 es: " + Math.sqrt(Math.abs(objeto1.getNum1())));
        }
    }
}