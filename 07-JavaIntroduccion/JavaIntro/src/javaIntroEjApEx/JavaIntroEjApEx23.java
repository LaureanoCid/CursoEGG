/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
package javaIntroEjApEx;

import java.util.Scanner;

public class JavaIntroEjApEx23 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
        String abecedario = "abcdefghijklmnopqrstuvwxyz", palabraEspecial = "";
        int pos1 = 0, pos2 = 0, posicionLetra = 0;       
        String[][] sopaDeLetras = new String [20][20];
                
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                posicionLetra = (int)(Math.random()*abecedario.length());
                sopaDeLetras[i][j] = abecedario.toUpperCase().substring(posicionLetra, (posicionLetra+1));
                System.out.print("(" + sopaDeLetras[i][j] + ")");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese una palabra entre 3 y 5 caracteres: ");
            palabraEspecial = leer.nextLine().toLowerCase();
            while(palabraEspecial.length()<3 || palabraEspecial.length()>5){
                System.out.println("ERROR. Ingrese una palabra entre 3 y 5 caracteres: ");
                palabraEspecial = leer.nextLine().toLowerCase();
            }
            pos1 = (int)(Math.random()*20);
            pos2 = (int)(Math.random()*15);
            System.out.println("Pos 1: " + pos1);
            System.out.println("Pos 2: " + pos2);
            posicionLetra = 0;
            for (int a = pos1; a == pos1; a++) {
                for (int b = pos2; b < (pos2 + palabraEspecial.length()); b++) {
                    sopaDeLetras[a][b] = palabraEspecial.toLowerCase().substring(posicionLetra, (posicionLetra+1));
                    posicionLetra++;
                }
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("(" + sopaDeLetras[i][j] + ")");
            }
            System.out.println("");
        }                
    }      
}
