package Objetos;

public class Animal implements Despedida{
    public void hacerRuido(){
        System.out.println("Hola soy un animal :)");
    }

    @Override
    public void despedirse() {
        System.out.println("Chaitoo");
    }    
}