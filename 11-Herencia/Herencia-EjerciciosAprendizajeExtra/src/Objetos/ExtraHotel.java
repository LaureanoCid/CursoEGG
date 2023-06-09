package Objetos;

public class ExtraHotel extends Alojamiento{
    protected boolean privado; //Alojamiento privado o publico
    protected double mCuadrados; // Metros cuadrados que ocupa el alojamiento extra hotelero

    public ExtraHotel() {
    }

    public ExtraHotel(boolean privado, double mCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.mCuadrados = mCuadrados;
    }       

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExtraHotel{");
        sb.append("privado=").append(privado);
        sb.append(", mCuadrados=").append(mCuadrados);
        sb.append('}');
        return sb.toString();
    }           
}