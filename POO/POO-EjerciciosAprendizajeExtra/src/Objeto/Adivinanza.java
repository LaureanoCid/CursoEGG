package Objeto;
public class Adivinanza {
    String [] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    String adivinanza = mes [10];

    public Adivinanza() {
    }

    public String[] getMes() {
        return mes;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public String getAdivinanza() {
        return adivinanza;
    }

    public void setAdivinanza(String adivinanza) {
        this.adivinanza = adivinanza;
    }        
}