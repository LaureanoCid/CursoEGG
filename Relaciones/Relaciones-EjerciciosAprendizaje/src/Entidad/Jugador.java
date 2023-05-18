package Entidad;

public class Jugador {
    private int Id;
    private String nombre;
    private boolean mojado = false;

    public Jugador() {
    }
    
    public Jugador(int Id, String nombre) {
        this.Id = Id;
        this.nombre = nombre;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador[" + "Id = " + Id + ", nombre = " + nombre + ", mojado = " + mojado + ']';
    }
    

    public boolean disparo(Revolver rev){
        
        mojado = false;
        mojado = rev.mojar(rev);
        rev.siguienteChorro(rev);
        
        return mojado;
    }    
}