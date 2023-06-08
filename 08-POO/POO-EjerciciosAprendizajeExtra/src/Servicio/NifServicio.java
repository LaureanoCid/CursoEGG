package Servicio;

import Objeto.Nif;
import java.util.Scanner;

public class NifServicio {
    Scanner leer = new Scanner(System.in);
    public Nif crearNif(){
        Nif nif = new Nif();
        String [] vector1 = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};        
        String letra = "";
        System.out.println("Ingrese su DNI: ");
        nif.setDni(leer.nextLong());
        letra = vector1[(int) nif.getDni() %  23];
        nif.setNif(String.valueOf(nif.getDni()).concat("-" + letra));       
        return nif;
    }
    public void mostrarNif(Nif nif){
        System.out.println("Su numero de NIF es: " + nif.getNif());
    }
}