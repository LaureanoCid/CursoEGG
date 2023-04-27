package Servicio;
import Objeto.Raices;

public class RaicesServicio {

    public double sacarDiscriminante(Raices raices) {
        double discriminante;

        discriminante = (Math.pow(raices.getB(), 2)) - (4 * raices.getA() * raices.getC());

        return discriminante;
    }

    public boolean tieneRaices(Raices raices) {
        boolean tieneRaices = false;

        if (sacarDiscriminante(raices) >= 0) {
            tieneRaices = true;
        }

        return tieneRaices;
    }

    public boolean tienRaiz(Raices raices) {
        boolean tieneRaiz = false;

        if (sacarDiscriminante(raices) == 0) {
            tieneRaiz = true;
        }

        return tieneRaiz;
    }

    public void obtenerRaices(Raices raices) {

        double raiz1 = (-raices.getB() + Math.sqrt((Math.pow(raices.getB(), 2) - (4 * raices.getA() * raices.getC())))) / (2 * raices.getA());
        double raiz2 = (-raices.getB() - Math.sqrt((Math.pow(raices.getB(), 2) - (4 * raices.getA() * raices.getC())))) / (2 * raices.getA());

        System.out.println("Raiz 1: " + (int) raiz1);
        System.out.println("Raiz 2: " + (int) raiz2);
    }

    public void obtenerRaiz(Raices raices) {
        double raiz1;
        if ((-raices.getB() + Math.sqrt((Math.pow(raices.getB(), 2) - (4 * raices.getA() * raices.getC())))) % (2 * raices.getA()) == 0) {
            raiz1 = (-raices.getB() + Math.sqrt((Math.pow(raices.getB(), 2) - (4 * raices.getA() * raices.getC())))) / (2 * raices.getA());
        } else {
            raiz1 = (-raices.getB() - Math.sqrt((Math.pow(raices.getB(), 2) - (4 * raices.getA() * raices.getC())))) / (2 * raices.getA());
        }
        System.out.println("La raiz es: " + (int) raiz1);
    }

    public void calcular(Raices raices) {

        if (raices.getDiscriminante() == 0) {
            obtenerRaiz(raices);
        } else {
            obtenerRaices(raices);
        }
    }
}