//Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
//numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
//    Las operaciones asociadas a dicha clase son:
//    -a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
//    -b) Agregar los métodos getters y setters correspondientes
//    -c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
//    -d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
//        y se la sumara a saldo actual.
//    -e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
//        la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//        pondrá el saldo actual en 0.
//    -f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
//        usuario no saque más del 20%.
//    -g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//    -h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.
package EjercicioAprendizaje;

import Objetos.Cuenta;
import Servicio.CuentaServicio;
import java.util.Scanner;

public class POOEjAp05 {

    public static void main(String[] args) {
        CuentaServicio service = new CuentaServicio();
        Cuenta cuenta1 = service.crearCuenta();
        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("---------------------");
            System.out.println("MENU");
            System.out.println("1 - Ingresar dinero");
            System.out.println("2 - Retirar dinero");
            System.out.println("3 - Extraccion rapida");
            System.out.println("4 - Consultar saldo");
            System.out.println("5 - Consultar datos");
            System.out.println("6 - SALIR");
            System.out.println("---------------------");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    service.ingresarDinero(cuenta1);
                    break;
                case 2:
                    service.retirarDinero(cuenta1);
                    break;
                case 3:
                    service.extraccionRapida(cuenta1);
                    break;
                case 4:
                    service.consultarSaldo(cuenta1);
                    break;
                case 5:
                    service.consultarDatos(cuenta1);
                    break;
                case 6:
                    System.out.println("Saliendo . . . .");
                    break;
                default:
                    System.out.println("Error al elegir una opcion. Intente nuevamente.");
                    break;
            }
        } while (opcion != 6);
    }
    
}