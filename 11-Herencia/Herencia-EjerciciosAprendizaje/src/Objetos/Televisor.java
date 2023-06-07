package Objetos;

public class Televisor extends Electrodomestico {

    protected int resolucion;
    protected boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizador, double precio, String color, char cEnergetico, double peso) {
        super(precio, color, cEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public void crearTelevisor() {
        System.out.println("Diseñe su Televisor: ");
        crearElectrodomestico();
        System.out.println("Ingrese la resolucion de su TV (en pulgadas): ");
        this.resolucion = leer.nextInt();
        System.out.println("Su TV tiene sintonizador? (S/N): ");
        String op = leer.next().toUpperCase();
        while (!(op.equalsIgnoreCase("S")) && (!(op.equalsIgnoreCase("N")))) {
            System.out.println("ERROR: Ingrese una opcion correcta!");
            System.out.println("Su TV tiene sintonizador? (S/N): ");
            op = leer.next().toUpperCase();
        }
        if (op.equalsIgnoreCase("S")) {
            this.sintonizador = true;
        } else {
            this.sintonizador = false;
        }
        precioFinal();
        System.out.println("El precio su televisor es: $" + this.precio);
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.resolucion > 40) {
            this.precio += (super.precio * 0.3);
        }
        if (this.sintonizador) {
            this.precio += 500;
        }
    }
    
}
