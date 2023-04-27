/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package javaIntroEjAp;
public class JavaIntroEjAp15 {

    public static void main(String[] args) {
        
        int[] primerosNum = new int [100];
        
        for (int i = 0; i < primerosNum.length; i++) {
            primerosNum[i] += i;
            //System.out.println(primerosNum[i]);
        }
        for (int i = primerosNum.length-1; i >= 0; i--) {
            System.out.println(primerosNum[i]);
        }
    }    
}