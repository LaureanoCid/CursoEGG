package Entidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Persona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int documento, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public void crearPersona(ArrayList<Persona> personas, int cant) {

        for (int i = 0; i < cant; i++) {
            System.out.println("----------------------");
            Persona persona = new Persona();
            System.out.println("Ingrese el nombre de la persona: ");
            persona.setNombre(leer.next());
            System.out.println("Ingrese el apellido de la persona: ");
            persona.setApellido(leer.next());
            System.out.println("Ingrese la edad de la persona: ");
            persona.setEdad(leer.nextInt());
            System.out.println("Ingrese el documento de la persona: ");
            persona.setDocumento(leer.nextInt());

            System.out.println("----------------------");
            personas.add(persona);
        }
    }

    public void eleccion(ArrayList<Persona> personas, ArrayList<Perro> perros) {
        String nombre;
        for (Persona persona1 : personas) {
            System.out.println(persona1.getNombre() + " elija su macota: ");

            perros.forEach((x) -> System.out.println(x.toString()));

            System.out.println("-- -- --");
            nombre = leer.next();
            System.out.println("-- -- --");

            for (int i = 0; i < perros.size(); i++) {
                if (perros.get(i).getNombre().equalsIgnoreCase(nombre)) {
                    persona1.setPerro(perros.get(i));
                    perros.remove(i);
                    System.out.println(persona1.toString());
                    break;
                }
            }
            while (persona1.getPerro() == null) {
                System.out.println("Perrito no encontrado. Ingrese un nombre nuevamente: ");
                
                perros.forEach((x) -> System.out.println(x.toString()));
                
                System.out.println("-- -- --");
                nombre = leer.next();
                System.out.println("-- -- --");

                for (int i = 0; i < perros.size(); i++) {
                    if (perros.get(i).getNombre().equalsIgnoreCase(nombre)) {
                        persona1.setPerro(perros.get(i));
                        perros.remove(i);
                        System.out.println(persona1.toString());
                        break;
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Persona[" + "Nombre = " + nombre + " - Apellido = " + apellido + " - Edad = " + edad + " - Documento = " + documento + " - Perro = " + perro + ']';
    }
}