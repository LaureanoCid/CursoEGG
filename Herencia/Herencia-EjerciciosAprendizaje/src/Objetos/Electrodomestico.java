package Objetos;

import java.util.Scanner;

public class Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected double precio = 1000;
    protected String color;
    protected char cEnergetico; //Letras entre A-F
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char cEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        if (!(this.color.equalsIgnoreCase("Blanco")
                || this.color.equalsIgnoreCase("Negro")
                || this.color.equalsIgnoreCase("Rojo")
                || this.color.equalsIgnoreCase("Azul")
                || this.color.equalsIgnoreCase("Gris"))) {
            this.color = "Blanco";
        }
        this.cEnergetico = cEnergetico;
        this.peso = peso;
        if (!(this.cEnergetico <= 'A' && this.cEnergetico >= 'F')) {
            this.cEnergetico = 'F';
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getcEnergetico() {
        return cEnergetico;
    }

    public void setcEnergetico(char cEnergetico) {
        this.cEnergetico = cEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Electrodomestico crearElectrodomestico() {
        Electrodomestico e1 = new Electrodomestico();
        
        System.out.println("--------------------");
        System.out.println("Indique el color de su electrodomestico: ");
        this.color = leer.next();
        System.out.println("Indique el consumo energetico con una letra entre A-F: ");
        this.cEnergetico = leer.next().toUpperCase().charAt(0);
        System.out.println("Ingrese el peso de su electrodomestico: ");
        this.peso = leer.nextDouble();

        return e1;
    }

    public void precioFinal() {
        switch (this.cEnergetico) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            case 'F':
                this.precio += 100;
                break;
        }

        if (this.peso >= 1 && this.peso <= 19) {
            this.precio += 100;
        }
        if (this.peso >= 20 && this.peso <= 49) {
            this.precio += 500;
        }
        if (this.peso >= 50 && this.peso <= 79) {
            this.precio += 800;
        }
        if (this.peso >= 80) {
            this.precio += 1000;
        }
    }
}
