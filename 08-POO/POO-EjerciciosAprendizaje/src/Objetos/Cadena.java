package Objetos;

public class Cadena {

    private String cadena;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String cadena, int longitud) {
        this.cadena = cadena;
        this.longitud = longitud;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}