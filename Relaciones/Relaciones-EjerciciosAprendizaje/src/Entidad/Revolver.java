package Entidad;

public class Revolver {

    private int posicionAgua;
    private int posicionActual;

    public Revolver() {
    }

    public Revolver(int posicionAgua, int posicionActual) {
        this.posicionAgua = posicionAgua;
        this.posicionActual = posicionActual;
    }

    @Override
    public String toString() {
        return "Revolver[" + "PosicionAgua = " + posicionAgua + " -  PosicionActual = " + posicionActual + ']';
    }

    public void llenarRevolver() {
        posicionActual = 1;
        posicionAgua = (int) (Math.random() * 6 + 1);
    }

    public Boolean mojar(Revolver rev) {
        boolean mojado = false;
        if (posicionActual == posicionAgua) {
            mojado = true;
        }
        return mojado;
    }

    public void siguienteChorro(Revolver rev) {
        posicionActual++;
    }
}
