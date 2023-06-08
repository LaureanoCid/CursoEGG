package Servicio;

import Objeto.SopaLetras;
import java.util.Scanner;

public class SopaLetraServicio {
    Scanner leer = new Scanner(System.in);
    public SopaLetras crearSopa(){
        SopaLetras sopa1 = new SopaLetras();
        System.out.println("Cargando sopa de letras...");
        char[][] matriz = new char[][]{
            {'p', 'e', 'r', 'r', 'o', 'c', 'a', 't', 'o', 'r'},
            {'a', 's', 'i', 't', 'i', 'o', 'c', 'e', 'r', 'o'},
            {'l', 'e', 'c', 'h', 'e', 'm', 'o', 't', 'o', 'r'},
            {'o', 's', 'o', 's', 'o', 's', 'o', 's', 'o', 's'},
            {'p', 'e', 'r', 'r', 'o', 'p', 'e', 'r', 'r', 'o'},
            {'a', 's', 'i', 't', 'i', 'o', 'a', 's', 'i', 't'},
            {'l', 'e', 'c', 'h', 'e', 'l', 'e', 'c', 'h', 'e'},
            {'o', 's', 'o', 's', 'o', 's', 'o', 's', 'o', 's'},
            {'m', 'o', 't', 'o', 'r', 'm', 'o', 't', 'o', 'r'},
            {'r', 'a', 't', 'a', 's', 'r', 'a', 't', 'a', 's'}
        };
        sopa1.setMatriz(matriz);
        imprimir(sopa1);
        
        do {            
            System.out.println("Ingrese una palabra de maximo 5 caracteres");
            sopa1.setPalabra(leer.nextLine());
            if (sopa1.getPalabra().length()>5) {
                System.out.println("Palabra no valida.");
            }
        } while (sopa1.getPalabra().length()>5);                
        
        return sopa1;
        
    }
    
    public void buscarPalabra(SopaLetras a){
        
        for (int i = 0; i < a.getMatriz().length; i++) {
            for (int j = 0; j < a.getMatriz()[0].length; j++) {
                if (a.getMatriz()[i][j] == a.getPalabra().charAt(0)) {                    
                    if (j+a.getPalabra().length()<=a.getMatriz().length) {
                        String palabra2 = new String(a.getMatriz()[i],j,a.getPalabra().length()); //Sobrecarga de constructor 
                        if (palabra2.equalsIgnoreCase(a.getPalabra())) {
                            System.out.println("La posicion es: ("+i+","+j+")");
                        }
                    }
                }
            }
        }
    }
    
    public void imprimir(SopaLetras b){
        //System.out.println(Arrays.deepToString(b.getMatriz()));
        
        for (int i = 0; i < b.getMatriz().length; i++) {
            System.out.print("|");
            for (int j = 0; j < b.getMatriz()[0].length; j++) {
                System.out.print(b.getMatriz()[i][j]+"  ");
            }
            System.out.println("|");
            
        }
        
    }
    
    public void reemplazar(SopaLetras c) {
        System.out.println("Ingrese la palabra que desea reemplazar (que ya se encuentra en la matriz)");
        c.setPalabra(leer.nextLine());
        System.out.println("Ingrese la palabra nueva");
        String palabraNueva = leer.nextLine();
        buscarPalabra(c);//DEBE DEVOLVER LAS POSICIONES DONDE ENCONTRÓ LA PALABRA
       
        
        for (int i = 0; i < c.getMatriz().length; i++) {
            for (int j = 0; j < c.getMatriz()[0].length; j++) {
                if (c.getMatriz()[i][j] == c.getPalabra().charAt(0)) {
                    if (j + c.getPalabra().length() <= c.getMatriz().length) {
                        
                        String palabra2 = new String(c.getMatriz()[i], j, c.getPalabra().length()); //Sobrecarga de constructor 
                        
                        if (palabra2.equalsIgnoreCase(c.getPalabra())) {
                            int z = 0;
                            for (int k = j; k < (j+palabraNueva.length()); k++) {                                
                                c.getMatriz()[i][k] = palabraNueva.charAt(z);
                                z++;                                
                            }
                        }
                    }
                }
            }
        }
        
        imprimir(c);
    }
    
    public void imprimirTrans(SopaLetras b){
        for (int i = 0; i < b.getMatriz().length; i++) {
            System.out.print("|");
            for (int j = 0; j < b.getMatriz()[0].length; j++) {
                System.out.print(b.getMatriz()[j][i]+"  ");
            }
            System.out.println("|");            
        }
    }
    
}