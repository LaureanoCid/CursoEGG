package Objetos;

import Interfaces.calculosFormas;

public class Rectangulo implements calculosFormas{
    
    protected double altura;
    protected double base;

    public Rectangulo() {
    }

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }        
    
    @Override
    public void area(){
        double area = (this.base*this.altura);
        System.out.println("El area del rectangulo es: " + area);
    }
    
    @Override
    public void perimetro(){
        double perim = (this.base+this.altura)*2;
        System.out.println("El perimetro del rectangulo es: " + perim);
    }
    
}