package Entidad;

import java.time.LocalTime;
import java.util.Collection;
import java.util.Map;

public class Poliza {
    private Cliente cliente;
    private Map<Cliente, Collection<Vehiculo>> poliza;
    private int numeroPoliza;
    private String formaPago;
    private LocalTime fechaInicio;
    private double montoTotal;
    private String tipoCobertura;
    
}