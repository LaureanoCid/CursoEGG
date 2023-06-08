/*
Crear una clase Pass, donde declaremos los siguientes atributos:
    ● pass : Del tipo String
    ● nombre: Del tipo String
    ● dni: Del tipo int.
    Métodos para desarrollar:
    ● Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por
    teclado)
    ● Crear un método para ingresar una contraseña (crearPass). En este método, debemos
    validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
    Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
    ● Crear un método para analizar la contraseña(analizarPass). Donde:
        o SI Existe al menos una letra z : Es nivel MEDIO
        o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
        o Si ninguna condición se cumple es nivel BAJO
    ● Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
    debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
    acceso a modificar los datos.
    ● A través de un menú de opciones:
        o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
        contraseña valida).
        o B) Mensaje al usuario que tipo de NIVEL es su contraseña
        o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
        dar permiso
        o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
        SINO impedir cambios
        o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
        SINO impedir cambios
 */
package EjerciciosExtraExtra;

import Objeto.Pass;
import Servicio.PassService;
import java.util.Scanner;

public class EjercicioExtraExtra03 {

    public static void main(String[] args) {        
        Scanner leer = new Scanner(System.in);
        PassService PS = new PassService();
        Pass p = PS.CrearPass();
        int op, val;
        do {
            System.out.println("---------------------------");
            System.out.println("Menu");
            System.out.println("2- Que nivel de seguridad tiene la contraseña"); //analizarpass
            System.out.println("3- Modificar contraseña");//validacion y Cambiodecontra
            System.out.println("4- Modificar Nombre");//validacion y cambionombre
            System.out.println("5- Modificar DNI");//validacion y cambioDNI
            System.out.println("6- Salir");
            System.out.println("---------------------------");
            op = leer.nextInt();
            switch (op) {
                case 2:
                    PS.AnalizarPass(p);
                    break;
                case 3:
                    val = PS.Validacion(p);
                    if (val < 3) {
                        PS.CambioContra(p);
                    } else {
                        System.out.println("Puede Fallar, Recuerde y vuelva");
                    }

                    System.out.println(p.toString());
                    break;
                case 4:
                    val = PS.Validacion(p);
                    if (val < 3) {
                        PS.CambioNombre(p, val);
                    }
                    System.out.println("Su nombre se cambio con exito");
                    System.out.println(p.toString());
                    break;
                case 5:
                    val = PS.Validacion(p);
                    if (val < 3) {
                        PS.CambioDNI(p, val);
                    }
                    System.out.println("Su DNI se guardo con exito");
                    System.out.println(p.toString());
                    break;
                case 6:
                    System.out.println("Vuelvas prontos");
                    break;
                default:
                    System.out.println("ERROR! Ingrese una opcion valida");
                    ;
            }
        } while (op != 6);
    }
}