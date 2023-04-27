/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
Ejemplo:

Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices:
4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.
 */
package javaIntroEjAp;

import java.util.Scanner;

public class JavaIntroEjAp21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matri10=new int [10][10];
        boolean comp = false;
       
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matri10[i][j]=(int)(Math.random()*10);
            }
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                System.out.print("["+matri10[i][j]+"]");
            }
        }
        
        int[][] matri3= new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingrese un valor");
                matri3[i][j]=leer.nextInt();
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(matri10[i][j]==matri3[0][0]){
                    int aux1=i,aux2=j;
                    comparar(matri10,matri3,aux1,aux2,comp);
                }
                if(comp=true){
                    break;
                }
            }
            if(comp=true){
                System.out.println("se encontró la matriz");
                break;
            }
        }
        if(comp=false){
            System.out.println("NO se ha enocntrado la matriz");
        }     
    }
    
    public static boolean comparar(int[][]matri10, int[][] matri3,int aux1,int aux2, boolean comp){
        int k=0,l=0;
        for (int i = aux1; i < aux1+3; i++) {
            l=0;
            for (int j = aux2; j < aux2+3; j++) {
                if (matri10[i][j]==matri3[k][l]) {
                    comp=true;
                }else{
                    comp=false;
                    break;
                }
                l++;
            }
            k++;
        }        
        return comp;
    }                   
}