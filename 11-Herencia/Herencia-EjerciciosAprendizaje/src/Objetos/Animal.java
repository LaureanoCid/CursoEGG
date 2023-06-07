package Objetos;

public class Animal {
    protected String nombre;
    protected int edad;
    protected String raza;
    protected String alimento;

    public Animal() {
    }

    public Animal(String nombre, int edad, String raza, String alimento) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.alimento = alimento;
    } 
    
    public void alimentarse(){
        System.out.println(nombre + " come: " + alimento);
    }
    
}