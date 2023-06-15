/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
*/
package EjerciciosAprendizaje;

public class EjercicioAp02 {

    public static void main(String[] args) {
        
        int [] array = new int [6];
        
        try{            
            array[8] = 100;
        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Indice fuera de rango");
        }
        finally{
            System.out.println(". . . .");
        }
    }    
}