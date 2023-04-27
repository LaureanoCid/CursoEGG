package Objeto;
public class SopaLetras {
    private char[][] matriz;
    private String palabra;

    public SopaLetras() {
    }

    public SopaLetras(char[][] matriz, String palabra) {
        this.matriz = matriz;
        this.palabra = palabra;
    }

    public char[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(char[][] matriz) {
        this.matriz = matriz;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
}