package Objetos;

public class Hotel4 extends Hotel{
    protected char gimnasio;
    protected String nombreRest;
    protected int capacidadRest;

    public Hotel4() {
    }

    public Hotel4(char gimnasio, String nombreRest, int capacidadRest, int cantHabitaciones, int numCamas, int cantPisos, double precioHabitacion) {
        super(cantHabitaciones, numCamas, cantPisos, precioHabitacion);
        this.gimnasio = gimnasio;
        this.nombreRest = nombreRest;
        this.capacidadRest = capacidadRest;
    }   

    public Hotel4(char gimnasio, String nombreRest, int capacidadRest, int cantHabitaciones, int numCamas, int cantPisos, double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, numCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerente);        
        this.gimnasio = gimnasio;
        this.nombreRest = nombreRest;
        this.capacidadRest = capacidadRest;
        this.precioHabitacion = precioHabitacion();
    }
    

    public double precioHabitacion(){
        double aux = 1;
        
        double precio = 50 + (aux*cantHabitaciones*numCamas*cantPisos) + (valorAgregadoRestaurante()) + (valorAgregadoGimnasio());        
                
        return precio;
    }
    
    public double valorAgregadoRestaurante(){
        double precio = 0;
        
        if (capacidadRest < 30) {
            precio = 10;
        }else if (capacidadRest >= 30 && capacidadRest <= 50) {
            precio = 30;
        }else{
            precio = 50;
        }
        
        return precio;
    }
    public double valorAgregadoGimnasio(){
        double precio = 0;
        
        if (gimnasio == 'A') {
            precio = 50;
        }else{
            precio = 30;
        }
        
        return precio;
    }   

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hotel4{");
        sb.append("nombre=").append(nombre);
        sb.append(", direccion=").append(direccion);
        sb.append(", localidad=").append(localidad);
        sb.append(", gerente=").append(gerente);
        sb.append("cantHabitaciones=").append(cantHabitaciones);
        sb.append(", numCamas=").append(numCamas);
        sb.append(", cantPisos=").append(cantPisos);
        sb.append(", precioHabitacion=").append(precioHabitacion);
        sb.append("gimnasio=").append(gimnasio);
        sb.append(", nombreRest=").append(nombreRest);
        sb.append(", capacidadRest=").append(capacidadRest);
        sb.append('}');
        return sb.toString();
    }
    
}