/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package javaIntroEjApEx;

public class JavaIntroEjApEx02 {

    public static void main(String[] args) {
        int a = 10, b = 20, c = 30, d = 40, aux;
        
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);
        
        aux = b;        
        b = c;
        c = a;
        a = d;
        d = aux;
        
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);
    }    
}
