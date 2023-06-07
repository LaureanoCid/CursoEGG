package Objetos;

import java.util.Scanner;

public class Barco {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected int matricula;
    protected double tamanio;
    protected int anioFab;

    public Barco() {
    }

    public Barco(int matricula, double tamanio, int anioFab) {
        this.matricula = matricula;
        this.tamanio = tamanio;
        this.anioFab = anioFab;
    }

    public void crearBarco(){
        System.out.println("Ingrese el numero de matricula: ");
        matricula = leer.nextInt();
        System.out.println("Ingrese el tamanio de la eslora: ");
        tamanio = leer.nextDouble();
        System.out.println("Ingrese la fecha de fabricacion: ");
        anioFab = leer.nextInt();
    }

    public double modulo() {
        return 10 * tamanio;
    }
}
