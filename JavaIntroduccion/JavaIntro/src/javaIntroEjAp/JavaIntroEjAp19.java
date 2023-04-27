/*
 Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package javaIntroEjAp;
import java.util.Scanner;

public class JavaIntroEjAp19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] [] MatrizA = new int [3][3];
        int [] [] MatrizB = new int [3][3];
        
        System.out.println("Ingrese los valores de su matriz: ");
        //Llenado de matriz1 normal       
        for (int i = 0 ; i < 3 ; i++) {
            for ( int j = 0 ; j < 3 ; j++ ){
                MatrizA [i][j] = leer.nextInt();
            }
        }
        //Llenado de matriz 2 traspuesta
        for (int i = 0 ; i < 3 ; i++) {
            for ( int j = 0 ; j < 3 ; j++ ){
                MatrizB [i][j] = MatrizA [j][i];
            }
        }
        boolean esAntiSimetrica = true;

        for (int i = 0; i < MatrizA.length; i++) {
            for (int j = 0; j < MatrizA[i].length; j++) {
                if (MatrizA[i][j] != MatrizB[j][i]) {
                    esAntiSimetrica = false;
                    break;
                }
            }
        }
        if (esAntiSimetrica) {
            System.out.println("La matriz es antisimetrica!");            
        }else{
            System.out.println("La matriz no es antisimetrica :(");
        }
    }    
}