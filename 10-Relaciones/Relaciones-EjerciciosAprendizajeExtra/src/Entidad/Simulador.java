package Entidad;

import static Entidad.Alumno.compararVotos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Simulador {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> alumnos = new ArrayList();
    Random r = new Random();

    public ArrayList<Alumno> listaAlumno() {
        System.out.println("Ingrese la cantidad de alumnos: ");
        int cant = leer.nextInt();

        String[] nombres = {"Pao", "Lau", "Fran", "Dorys", "Mario", "Fran2"};
        String[] apellidos = {"A", "B", "C", "D", "M", "F2"};

        for (int i = 0; i < cant; i++) {
            Alumno a1 = new Alumno((nombres[(int) (Math.random() * 6)].concat(apellidos[(int) (Math.random() * 6)])), 0, 0);
            alumnos.add(a1);
        }
        llenarDNI();
        return alumnos;
    }

    public void llenarDNI() {
        for (Alumno aux : alumnos) {
            aux.setDni(10000000 + r.nextInt(80000000));
        }
    }

    public void mostrarALumnos() {
        for (Alumno aux : alumnos) {
            System.out.println(aux.toString());
        }
    }

    public void votacion() {
        int cont = 0;
        HashSet<Alumno> votados1 = new HashSet();
        for (Alumno al : alumnos) {
            Voto v1 = new Voto(al);
            do {
                Alumno aux = alumnos.get((int) (Math.random() * alumnos.size()));
                while (aux.equals(al)) {
                    aux = alumnos.get((int) (Math.random() * alumnos.size()));
                }
                if (!(votados1.contains(aux))) {
                    for (Alumno alum : alumnos) {
                        if (alum.equals(aux)) {
                            alum.setCantidadVotos(alum.getCantidadVotos() + 1);
                            cont++;
                            votados1.add(aux);
                            System.out.println(al.getNombreCompleto() + " voto a: " + aux.getNombreCompleto());
                            break;
                            //System.out.println(al.getNombreCompleto() + " voto a " + var);
                        }
                    }
                }      
                System.out.println("Votados: " + votados1.size());
            } while (votados1.size() < 3);
            v1.setVotados(votados1);
            votados1.clear();
        }
        System.out.println("Hay " + cont + " de votos");
    }
    public void facilitador(){
        ArrayList<Alumno> facilitadoresT = new ArrayList();
        ArrayList<Alumno> facilitadoresS = new ArrayList();
        Collections.sort(alumnos, compararVotos);
        for (int i = 0; i < 5; i++) {
            facilitadoresT.add(alumnos.get(0));
            alumnos.remove(0);
        }
        for (int i = 0; i < 5; i++) {
            facilitadoresS.add(alumnos.get(0));
            alumnos.remove(0);
        }
        System.out.println("--------------------------");
        System.out.println("Los facilitadores titulares son: ");
        for (Alumno alumno : facilitadoresT) {
            System.out.println(alumno.toString());
        }
        System.out.println("--------------------------");
        System.out.println("Los facilitadores suplentes son: ");
        for (Alumno alumno : facilitadoresS) {
            System.out.println(alumno.toString());
        }
        System.out.println("--------------------------");
    }
}
