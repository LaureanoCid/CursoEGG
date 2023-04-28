package Servicio;

import Objeto.Pass;
import java.util.Scanner;

public class PassService {   
    Scanner leer = new Scanner(System.in);

    public Pass CrearPass() {
        Pass p1 = new Pass("Pao",25123123);
        System.out.println("Ingrese una clave de 10 digitos");
        p1.setPass(leer.nextLine());
        if (10 == p1.getPass().length()) {
            System.out.println("Su contraseña sera guardada");
        } else {
            System.out.println("Ingrese de nuevo su contraseña con 10 digitos");
            p1.setPass(leer.nextLine());
        }
        System.out.println(p1.toString());
        return p1;
    }
    
    public void AnalizarPass(Pass p1) {
        
        int cont = 0, cont1 = 0;
        String Z = "z", A = "a";
        char Letra ;
        for (int i = 0; i < p1.getPass().length(); i++) {
            Letra = p1.getPass().charAt(i);
            String passValue = String.valueOf(Letra);
            if (passValue.matches(Z)) {
                cont++;
                 
            }
            if (passValue.matches(A)) {
               cont1++;
               
            }
        }
         if (cont >= 1 && cont1 >= 2) {
          System.out.println("Su contraseña es de seguridad ALTA");    
       } else if (cont >= 1 || cont1 >= 2 ) {
           System.out.println("su contraseña es de nivel MEDIO");
       } else {
           System.out.println("Su contraseña es insegura");
       }
                    
    }

    public void CambioNombre(Pass P1, int cont) {   
            System.out.println("ingrese el nuevo nombre");
            P1.setNombre(leer.nextLine());
    }

    public int Validacion(Pass P1) {
        String contra;
        int cont = 0;
        do {
            System.out.println("Ingrese la contraseña");
            contra = leer.nextLine();
            cont++;
            System.out.println(cont);
        } while ((!contra.equals(P1.getPass())) &&  cont < 3);
        
        
        return cont;
    }

    public void CambioDNI(Pass P1, int cont) {
        System.out.println("ingrese el nuevo DNI");
        P1.setDni(leer.nextInt());
    }

    public void CambioContra(Pass p1) {
        System.out.println("ingrese la nueva contraseña");
        p1.setPass(leer.nextLine());
        if (10 == p1.getPass().length()) {
            System.out.println("Su contraseña sera guardada");
        } else {
            System.out.println("Ingrese de nuevo su contraseña con 10 digitos");
            p1.setPass(leer.nextLine());
        }
    }
}