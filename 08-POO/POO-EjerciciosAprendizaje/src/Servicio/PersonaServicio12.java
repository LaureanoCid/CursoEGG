package Servicio;

import Objetos.Persona12;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio12 {

    Scanner leer = new Scanner(System.in);

    public Persona12 crearPersona() {

        Persona12 persona = new Persona12();
        int dia, mes, anio;

        System.out.println("Ingrese su nombre: ");
        persona.setNombre(leer.next());

        System.out.println("Ingrese la fecha de nacimiento: ");
        System.out.println("Dia: ");
        dia = leer.nextInt();
        System.out.println("Mes: ");
        mes = leer.nextInt();
        System.out.println("Anio: ");
        anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        persona.setFechaNacimiento(fecha);

        return persona;
    }

    public int calcularEdad(Persona12 persona) {
        Date fechaActual = new Date();
        int edad = 0;
        if (persona.getFechaNacimiento().getMonth() == fechaActual.getMonth()) {
            if (persona.getFechaNacimiento().getDay() == fechaActual.getDay()) {
                edad = fechaActual.getYear() - persona.getFechaNacimiento().getYear();
            }
        } else {
            edad = (fechaActual.getYear() - persona.getFechaNacimiento().getYear()) - 1;
        }
        System.out.println("La persona tiene " + edad + " anios.");
        return edad;
    }

    public boolean menorQue(int edad) {
        boolean menor = false;
        int edadReceptor = 0;

        System.out.println("Ingrese su edad: ");
        edadReceptor = leer.nextInt();
        if (edadReceptor < edad) {
            menor = true;
        }

        return menor;
    }

    public void mostrarPersona(Persona12 persona) {
        System.out.println(persona.toString());
    }    
}