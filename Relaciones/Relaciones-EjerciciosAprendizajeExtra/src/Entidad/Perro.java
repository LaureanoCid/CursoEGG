package Entidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Perro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String nombre;
    private String raza;
    private int edad;
    private String tamanio;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public void crearPerro(ArrayList<Perro> perros, int cant) {
        for (int i = 0; i < cant; i++) {
            System.out.println("----------------------");
            Perro perro = new Perro();

            System.out.println("Ingrese el nombre del perro: ");
            perro.setNombre(leer.next());
            System.out.println("Ingrese la raza del perro: ");
            perro.setRaza(leer.next());
            System.out.println("Ingrese la edad del perro: ");
            perro.setEdad(leer.nextInt());
            System.out.println("Ingrese el tamanio del perro: ");
            perro.setTamanio(leer.next());
            perros.add(perro);

            System.out.println("----------------------");
        }
    }

    @Override
    public String toString() {
        return "Perro[" + "Nombre = " + nombre + " - Raza = " + raza + " - Edad = " + edad + " - Tamanio = " + tamanio + ']';
    }
}
