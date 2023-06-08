package Servicio;

import Objeto.Cancion;
import java.util.Scanner;

public class CancionServicio {
    Scanner leer = new Scanner(System.in);
    
    public Cancion crearCancion(){
        Cancion c1 = new Cancion();
        
        System.out.println("Ingrese el nombre del autor: ");
        c1.setAutor(leer.next());
        System.out.println("Ingrese el nombre de la cancion: ");
        c1.setTitulo(leer.next());                
        
        return c1;
    }    
    
}