/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por
trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 */
package javaIntroEjApEx;
import java.util.Scanner;

public class JavaIntroEjApEx21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [][] notas = new int [10][4];
        double [] notasF = new double[10];
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingrese la nota " + (j+1) + " del alumno " + (i+1) + ":");
                notas[i][j] = (int)(Math.random()*10);
            } 
            notasF[i] = (notas[i][0]*0.10)+(notas[i][1]*0.15)+(notas[i][2]*0.25)+(notas[i][3]*0.50);
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println("La nota del alumno "+(i+1)+" es: "+notasF[i]);
        }
    }  
}