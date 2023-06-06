package Objetos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Alquiler {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected String nombre;
    protected int documento;
    protected LocalDate fechaAlquiler;
    protected LocalDate fechaDevolucion;
    protected int posAmarre;
    protected Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, int documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posAmarre, Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posAmarre = posAmarre;
        this.barco = barco;
    }

    public void alquiler() {
        System.out.println("--------------------------------");
        System.out.println("Ingrese la fecha de alquiler: ");
        System.out.println("Dia: ");
        int diaA = leer.nextInt();
        System.out.println("Mes: ");
        int mesA = leer.nextInt();
        System.out.println("Anio: ");
        int anioA = leer.nextInt();
        fechaAlquiler = LocalDate.of(anioA, mesA, diaA);
        System.out.println("--------------------------------");

        System.out.println("--------------------------------");
        System.out.println("Ingrese la fecha de retorno: ");
        System.out.println("Dia: ");
        int diaR = leer.nextInt();
        System.out.println("Mes: ");
        int mesR = leer.nextInt();
        System.out.println("Anio: ");
        int anioR = leer.nextInt();
        fechaDevolucion = LocalDate.of(anioR, mesR, diaR);
        System.out.println("--------------------------------");
        
        long diasAlquiler = ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
        double precio = diasAlquiler *(10*barco.tamanio);
    }
}
