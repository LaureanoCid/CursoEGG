package Objetos;

public class Alojamiento {
    protected String nombre, direccion, localidad, gerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alojamiento{");
        sb.append("nombre=").append(nombre);
        sb.append(", direccion=").append(direccion);
        sb.append(", localidad=").append(localidad);
        sb.append(", gerente=").append(gerente);
        sb.append('}');
        return sb.toString();
    }       
}