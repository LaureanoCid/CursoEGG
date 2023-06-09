package Objetos;

public class Camping extends ExtraHotel{
    protected int capacidadMaxCarpas, cantBanios;
    protected boolean restaurante;

    public Camping() {
    }

    public Camping(int capacidadMaxCarpas, int cantBanios, boolean restaurante, boolean privado, double mCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, mCuadrados, nombre, direccion, localidad, gerente);
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.cantBanios = cantBanios;
        this.restaurante = restaurante;
    }        

    public boolean isRestaurante() {
        return restaurante;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Camping{");
        sb.append("nombre=").append(nombre);
        sb.append(", direccion=").append(direccion);
        sb.append(", localidad=").append(localidad);
        sb.append(", gerente=").append(gerente);
        sb.append("privado=").append(privado);
        sb.append(", mCuadrados=").append(mCuadrados);
        sb.append("capacidadMaxCarpas=").append(capacidadMaxCarpas);
        sb.append(", cantBanios=").append(cantBanios);
        sb.append(", restaurante=").append(restaurante);
        sb.append('}');
        return sb.toString();
    }    
}