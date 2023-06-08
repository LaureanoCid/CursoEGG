package Entidad;

import java.util.ArrayList;

public class Cine {

    private Pelicula pelicula;
    private char[][] sala;
    private double precioEntrada;
    private ArrayList<Espectador> Espectadores;

    public Cine() {
    }

    public Cine(Pelicula pelicula, char[][] sala, double precioEntrada, ArrayList<Espectador> Espectadores) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precioEntrada = precioEntrada;
        this.Espectadores = Espectadores;
    }

    public void CargarDatos() {
        //Espectadores
        Espectadores = new ArrayList();
        Espectador e1 = new Espectador("Laureano", 24, 10.00);
        Espectador e2 = new Espectador("Gustavo", 9, 10.00);
        Espectador e3 = new Espectador("Mario", 10, 5.00);
        Espectador e4 = new Espectador("Nagger", 40, 10.00);
        Espectadores.add(e1);
        Espectadores.add(e2);
        Espectadores.add(e3);
        Espectadores.add(e4);

        //Peliccula
        Pelicula p1 = new Pelicula("Buscando a Dori", 1, 10, "Pixar");
        pelicula = p1;
    }

    public void Llenarcine() {
        precioEntrada = 10.00;
        int n = 6;
        int m = 8;

        sala = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sala[i][j] = ' ';
            }
        }
        System.out.println("SALA VACIA");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print((i + 1) + " " + (char) ('A' + j) + " " + sala[i][j] + " | ");
            }
            System.out.println(" ");
        }

        Boolean asiento = true;
        System.out.println("ESPECTADORES");
        for (Espectador aux : Espectadores) {
            if (aux.getDineroDisp() >= precioEntrada && aux.getEdad() >= pelicula.getEdadMinima()) {
                System.out.println(aux);
                do {
                    int i = (int) (Math.random() * 6);
                    int j = (int) (Math.random() * 8);

                    System.out.println(i + "," + j);

                    if (sala[i][j] == ' ') {
                        sala[i][j] = 'X';

                        asiento = false;
                    }
                } while (asiento = false);
            }
        }

        System.out.println("SALA LLENA ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print((i + 1) + " " + (char) ('A' + j) + " " + sala[i][j] + " | ");
            }
            System.out.println(" ");
        }
    }

    @Override
    public String toString() {
        return "Cine[" + "Pelicula = " + pelicula + " - Sala = " + sala + " - Precio Entrada = $" + precioEntrada + ']';
    }
}