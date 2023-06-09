package Objetos;

public class Hotel extends Alojamiento{
    protected int cantHabitaciones, numCamas, cantPisos;
    protected double precioHabitacion;

    public Hotel() {
    }

    public Hotel(int cantHabitaciones, int numCamas, int cantPisos, double precioHabitacion) {
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHabitacion = precioHabitacion;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }            

    public Hotel(int cantHabitaciones, int numCamas, int cantPisos, double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHabitacion = precioHabitacion;
    }        

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hotel{");
        sb.append("cantHabitaciones=").append(cantHabitaciones);
        sb.append(", numCamas=").append(numCamas);
        sb.append(", cantPisos=").append(cantPisos);
        sb.append(", precioHabitacion=").append(precioHabitacion);
        sb.append('}');
        return sb.toString();
    }

   
    
}