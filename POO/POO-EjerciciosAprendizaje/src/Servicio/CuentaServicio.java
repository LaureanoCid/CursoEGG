package Servicio;
import Objetos.Cuenta;
import java.util.Scanner;

public class CuentaServicio {

    Scanner leer = new Scanner(System.in);

    public Cuenta crearCuenta() {
        Cuenta cuenta1 = new Cuenta();

        System.out.println("Ingrese el numero de la cuenta: ");
        cuenta1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el numero de DNI: ");
        cuenta1.setDni(leer.nextLong());
        System.out.println("Ingrese el saldo que va a ingresar: ");
        cuenta1.setSaldoActual(leer.nextInt());

        return cuenta1;
    }

    public void ingresarDinero(Cuenta cuenta1) {
        System.out.println("Ingrese un importe a depositar: ");
        double ingreso = leer.nextDouble();
        cuenta1.setSaldoActual(cuenta1.getSaldoActual() + (int) ingreso);
        System.out.println("Se han ingresado $" + ingreso);
    }

    public void retirarDinero(Cuenta cuenta1) {
        System.out.println("Ingrese el importe que desea retirar: ");
        double retiro = leer.nextDouble();
        if ((cuenta1.getSaldoActual() - retiro) < 0) {
            System.out.println("Fondos insuficientes");
            System.out.println("Se ha retirado $" + cuenta1.getSaldoActual());
            cuenta1.setSaldoActual(0);
        } else {
            cuenta1.setSaldoActual((int) (cuenta1.getSaldoActual() - retiro));
            System.out.println("Se ha retirado $" + retiro);
        }        
    }

    public void extraccionRapida(Cuenta cuenta1) {
        double extraccion2 = 0, extraccion1 = cuenta1.getSaldoActual() * 0.20;
        do {
            System.out.println("Recuerde que solo podrá extraer un 20% de su saldo actual.");
            System.out.println("Ingrese el importe a extraear: ");
            extraccion2 = leer.nextDouble();
        } while (extraccion2 > extraccion1);

        cuenta1.setSaldoActual(cuenta1.getSaldoActual() - (int) extraccion2);
    }

    public void consultarSaldo(Cuenta cuenta1) {
        System.out.println("Su saldo actual es $" + cuenta1.getSaldoActual());
    }

    public void consultarDatos(Cuenta cuenta1) {
        System.out.println(cuenta1.toString());
    }
}