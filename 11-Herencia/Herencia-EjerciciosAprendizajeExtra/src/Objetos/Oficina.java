package Objetos;

public class Oficina extends Edificio{
    protected int numOficinas, cantPersonasPorOficina, numPisos;

    public Oficina() {
    }

    public Oficina(int numOficinas, int cantPersonasPorOficina, int numPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantPersonasPorOficina = cantPersonasPorOficina;
        this.numPisos = numPisos;
    }
    public Oficina crearOficina(){
        Oficina ofi1 = new Oficina();
        
        System.out.println("--------------");
        System.out.println("Ingrese el numero de oficinas: ");
        numOficinas = leer.nextInt();
        System.out.println("Ingrese la cantidad de personas que hay por cada oficina: ");
        cantPersonasPorOficina = leer.nextInt();
        System.out.println("Ingrese la cantidd de pisos: ");
        numPisos = leer.nextInt();
        System.out.println("Ingrese el ancho del edificio: ");
        ancho = leer.nextDouble();
        System.out.println("Ingrese el alto del edificio: ");
        alto = leer.nextDouble();
        System.out.println("Ingrese el largo del edificio: ");
        largo = leer.nextDouble();
        System.out.println("--------------");
        
        calcularSuperficie();
        calcularVolumen();
        cantPersonas();
        
        return ofi1;
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del edificio es: " + (ancho*largo));
    }

    @Override
    public void calcularVolumen() {
        System.out.println("El volumen del edificio es: " + (ancho*largo*alto));
    }    

    public void cantPersonas(){
        System.out.println("La cantidad de personas por piso es: " + (numOficinas*cantPersonasPorOficina));
        System.out.println("La cantidad de personas por piso es: " + (numOficinas*cantPersonasPorOficina*numPisos));
    }
}