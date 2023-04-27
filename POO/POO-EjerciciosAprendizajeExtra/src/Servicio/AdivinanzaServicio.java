package Servicio;
import Objeto.Adivinanza;
import java.util.Scanner;

public class AdivinanzaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void adivinarMes(Adivinanza adivinanza){
        String mes, adivinaMes = adivinanza.getAdivinanza();        
        System.out.println("BIENVENID@ A LA ADIVINANZA DE MESES:");
        System.out.println("Ingrese un mes: ");
        mes = leer.next().toLowerCase();
        while(!mes.equalsIgnoreCase(adivinaMes)){
            System.out.println("Ha fallado! Ingrese un mes nuevamente: ");
            mes = leer.next().toLowerCase();
        }
        System.out.println("Felicidades! has acertado!");
        
    }
}