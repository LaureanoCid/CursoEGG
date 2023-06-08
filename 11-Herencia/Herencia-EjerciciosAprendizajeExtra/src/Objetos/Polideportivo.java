package Objetos;

public class Polideportivo extends Edificio {
    
    protected String nombre;
    protected boolean techado;

    public Polideportivo() {
        
    }

    public Polideportivo(String nombre, boolean techado, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public boolean isTechado() {
        return techado;
    }
    public Polideportivo crearPolideportivo(){
        Polideportivo poli1 = new Polideportivo();
        System.out.println("--------------");
        System.out.println("Ingrese el nombre: ");
        nombre = leer.next();
        System.out.println("¿El polideportivo tiene techo? S/N");
        String var = leer.next();
        if (var.equalsIgnoreCase("S")) {
            techado = true;
        }else{
            techado = false;
        }
        System.out.println("Ingrese el ancho del polideportivo: ");
        ancho = leer.nextDouble();
        System.out.println("Ingrese el alto del polideportivo: ");
        alto = leer.nextDouble();
        System.out.println("Ingrese el largo del polideportivo: ");
        largo = leer.nextDouble();
        System.out.println("--------------");
        
        calcularSuperficie();
        calcularVolumen();
        
        if (techado) {
            System.out.println("El polideportivo es techado :)");
        }else{
            System.out.println("EL polideportivo no es techado :(");
        }
        
        return poli1;
    }
    

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del polideportivo es: " + (ancho*largo));
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del polideportivo es: " + (ancho*largo*alto));
    }      
}