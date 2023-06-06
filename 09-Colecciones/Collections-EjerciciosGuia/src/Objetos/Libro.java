package Objetos;
public class Libro {
    private String autor;
    private String nombre;
    private String NPaginas;

    public Libro() {
    }

    public Libro(String autor, String nombre, String NPaginas) {
        this.autor = autor;
        this.nombre = nombre;
        this.NPaginas = NPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNPaginas() {
        return NPaginas;
    }

    public void setNPaginas(String NPaginas) {
        this.NPaginas = NPaginas;
    }

    @Override
    public String toString() {
        return "Libro[" + "Autor = " + autor + "] - [Nombre = " + nombre + "] - [NPaginas = " + NPaginas + ']';
    }        
}