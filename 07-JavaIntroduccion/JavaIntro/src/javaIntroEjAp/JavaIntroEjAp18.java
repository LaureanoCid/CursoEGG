/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package javaIntroEjAp;

public class JavaIntroEjAp18 {

    public static void main(String[] args) {
        System.out.println("M A T R I Z   T R A N S P U E S T A");
        System.out.println();        
        int [] [] MatrizA = new int [4][4];
        
        for (int i = 0 ; i < 4 ; i++) {
            for ( int j = 0 ; j < 4 ; j++ ){
                MatrizA [i][j] = (int)(Math.random() * 10);
            }
        }
        
        for (int a = 0 ; a < 4 ; a++) {
            for (int b = 0 ; b < 4 ; b++){
                System.out.print(MatrizA [a][b] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        
        for (int a = 0 ; a < 4 ; a++) {
            for (int b = 0 ; b < 4 ; b++){
                System.out.print(MatrizA [b][a] + " ");
            }
            System.out.println();
        }
    }   
}