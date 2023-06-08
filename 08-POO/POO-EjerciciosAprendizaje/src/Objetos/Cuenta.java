package Objetos;

public class Cuenta {

    private int numeroCuenta;
    private long dni;
    private int saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int dni, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }  

    @Override
    public String toString() {
        return "Cuenta[" + "NumeroCuenta = " + numeroCuenta + "] - [DNI = " + dni + "] - [Saldo Actual = " + saldoActual + ']';
    }   
    
}