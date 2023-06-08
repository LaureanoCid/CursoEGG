package EjerciciosGuia;

import Objeto.Dni;
import Objeto.Persona;

public class EjercicioGuia01 {

    public static void main(String[] args) {
        Persona p1 = new Persona("Laureano", "Cid", new Dni(40454454, 'A'));
        System.out.println(p1.toString());
    } 
    
}