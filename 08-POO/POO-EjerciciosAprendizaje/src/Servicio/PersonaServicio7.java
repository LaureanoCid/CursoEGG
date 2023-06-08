package Servicio;

import Objetos.Persona7;
import java.util.Scanner;

public class PersonaServicio7 {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona7 crearPersona() {
        Persona7 persona1 = new Persona7();

        System.out.println("Ingrese su nombre: ");
        persona1.setNombre(leer.next());
        System.out.println("Ingrese su edad: ");
        persona1.setEdad(leer.nextInt());
        System.out.println("Ingrese su sexo(H - Hombre // M - Mujer // O - Otro): ");
        persona1.setSexo(leer.next().toUpperCase().charAt(0));
        while (persona1.getSexo() != 'H' && persona1.getSexo() != 'M' && persona1.getSexo() != 'O') {
            System.out.println("ERROR. Vuelva a ingresar su sexo(H - Hombre // M - Mujer // O - Otro): ");
            persona1.setSexo(leer.next().toUpperCase().charAt(0));
        }
        System.out.println("Ingrese su peso: ");
        persona1.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura: ");
        persona1.setAltura(leer.nextDouble());
        return persona1;
    }

    public int calcularIMC(Persona7 persona1) {
        int i = 0;
        double imc = persona1.getPeso() / (Math.pow(persona1.getAltura(), 2));
        if (imc < 20) {
            i = -1;
        } else if (imc >= 20 && imc <= 25) {
            i = 0;
        } else {
            i = 1;
        }
        return i;
    }
    public boolean mayorDeEdad(Persona7 persona1) {
        boolean mayorEdad = false;

        if (persona1.getEdad() >= 18) {
            mayorEdad = true;
        }

        return mayorEdad;
    }
    
}