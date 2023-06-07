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
    
    public void crearUsuario(){         
        System.out.println("----------------");
        System.out.println("Ingrese su nombre: ");
        nombre = leer.next();
        System.out.println("Ingrese su documento: ");
        documento = leer.nextInt();        
        posAmarre = (int)(Math.random()*5);
        crearBarco();              
        System.out.println("----------------");
    }
    
    public void crearBarco() {        
        System.out.println("Que tipo de barco posee?: ");
        System.out.println("1 - Barco Motor");
        System.out.println("2 - Velero");
        System.out.println("3 - Yate lujoso");
        int op = leer.nextInt();
        do {
            switch (op) {
                case 1:
                    BarcoMotor b1 = new BarcoMotor();
                    b1.crearBarco();
                    barco = b1;
                    break;
                case 2:
                    Velero v1 = new Velero();
                    v1.crearBarco();
                    barco = v1;
                    break;
                case 3:
                    Yate y1 = new Yate();
                    y1.crearBarco();
                    barco = y1;
                    break;
                default:
                    System.out.println("Error. Ingrese opcion nuevamente");
            }
        } while ((op != 1) && (op != 2) && (op != 3));
        double precio = diasAlquiler()*barco.modulo();
        
        System.out.println("EL precio por el alquiler del amarre es: $" + precio);
    }

    public double diasAlquiler() {
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

        return diasAlquiler;
    }    
}