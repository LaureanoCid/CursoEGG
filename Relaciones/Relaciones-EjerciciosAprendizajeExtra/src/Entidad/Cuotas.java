package Entidad;

import java.time.LocalTime;

public class Cuotas {
    private Poliza poliza;
    private int numeroCuotaCancelada;
    private double montoTotalAdeudado;
    private boolean cuotaPaga;
    private LocalTime fechaVencimientoCuota;
    private String [] formaPAgoCuota;
}