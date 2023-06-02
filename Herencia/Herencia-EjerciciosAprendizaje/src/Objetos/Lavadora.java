package Objetos;

public class Lavadora extends Electrodomestico{
    protected double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, double precio, String color, char cEnergetico, double peso) {
        super(precio, color, cEnergetico, peso);
        this.carga = carga;
    }    

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        System.out.println("Diseñe su Lavadora: ");
        crearElectrodomestico();        
        System.out.println("Ingrese el peso de la carga de su electrodomestico: ");
        this.carga = leer.nextDouble();
        precioFinal();
        System.out.println("El precio su lavadora es: $" + this.precio);
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        if (this.carga>30) {
            this.precio += 500;
        }
    }
}