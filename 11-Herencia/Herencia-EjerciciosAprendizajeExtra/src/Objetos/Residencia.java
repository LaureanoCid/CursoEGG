package Objetos;

public class Residencia extends ExtraHotel{
    protected int cantHabitaciones;
    protected boolean descuento, campoDeportivo;

    public Residencia() {
    }   
    
    public Residencia(int cantHabitaciones, boolean descuento, boolean campoDeportivo, boolean privado, double mCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, mCuadrados, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }     

    public boolean isDescuento() {
        return descuento;
    }    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Residencia{");
        sb.append("nombre=").append(nombre);
        sb.append(", direccion=").append(direccion);
        sb.append(", localidad=").append(localidad);
        sb.append(", gerente=").append(gerente);
        sb.append("privado=").append(privado);
        sb.append(", mCuadrados=").append(mCuadrados);
        sb.append("cantHabitaciones=").append(cantHabitaciones);
        sb.append(", descuento=").append(descuento);
        sb.append(", campoDeportivo=").append(campoDeportivo);
        sb.append('}');
        return sb.toString();
    }    
}