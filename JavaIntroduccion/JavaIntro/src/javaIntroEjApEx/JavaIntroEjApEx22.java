/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */
package javaIntroEjApEx;
public class JavaIntroEjApEx22 {

    public static void main(String[] args) {
        int n=3, m=3, suma=0;
        int [][] matriz = new int [n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int)(Math.random()*10);                
            }            
        }
        System.out.println("La matriz es: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("("+matriz[i][j]+")");
                suma += matriz[i][j];
            }            
            System.out.println("");
        }
        System.out.println("Y la suma de todos sus elementos es: "+suma);
    }   
}