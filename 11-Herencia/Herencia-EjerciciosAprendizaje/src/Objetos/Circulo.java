package Objetos;

import Interfaces.calculosFormas;

public class Circulo implements calculosFormas {

    protected double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }        

    @Override
    public void area() {
        double area = PI * (Math.pow(radio, 2));
        System.out.println("EL area del circulo es: " + area);
    }

    @Override
    public void perimetro() {
        double perim = PI * (radio * 2);
        System.out.println("EL perimetro del circulo es: " + perim);
    }
}