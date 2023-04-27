package Servicio;

import Objetos.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    Scanner leer = new Scanner(System.in);

    public void mostrarVocales(Cadena cadena) {
        int cantidadVocales = 0;

        for (int i = 0; i < cadena.getLongitud(); i++) {
            char letra = cadena.getCadena().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                cantidadVocales++;
            }
        }
        System.out.println("La cantidad de vocales es: " + cantidadVocales);
    }

    public void invertirFrase(Cadena cadena) {
        for (int i = cadena.getLongitud(); i > 0; i--) {
            System.out.print(cadena.getCadena().substring(i - 1, i));
        }
        System.out.println("");
    }

    public void vecesRepetido(Cadena cadena) {
        char letra;
        int cant = 0;
        System.out.println("Ingrese la letra a buscar: ");
        letra = leer.next().charAt(0);
        int posicion = cadena.getCadena().indexOf(letra);
        while (posicion != -1) {
            cant++;
            posicion = cadena.getCadena().indexOf(letra, posicion + 1);
        }
        System.out.println("Se encontro " + cant + " de veces el caracter " + letra + ".");
    }

    public void compararLongitud(Cadena cadena) {
        System.out.println("Ingrese una nueva frase: ");
        String frase2 = leer.next();
        if (frase2.length() > cadena.getLongitud()) {
            System.out.println("La frase " + frase2 + " es más larga.");
        } else if (frase2.length() < cadena.getLongitud()) {
            System.out.println("La frase " + cadena.getCadena() + " es más larga.");
        } else {
            System.out.println("Las frases contienen la misma longitud.");
        }
    }

    public void unirFrases(Cadena cadena) {
        System.out.println("Ingrese una nueva frase: ");
        String frase2 = leer.next();
        System.out.println(cadena.getCadena().concat(frase2));
    }

    public void reemplazar(Cadena cadena) {
        System.out.println("Ingrese un caracter para reemplazar la letra a.");
        char letra = leer.next().charAt(0);
        String frase = cadena.getCadena();
        int posicion = cadena.getCadena().indexOf("a");
        while (posicion != -1) {
            frase = frase.replace(frase.charAt(posicion), letra);
            posicion = cadena.getCadena().indexOf("a", posicion + 1);
        }
        System.out.println("La frase nueva es: " + frase);
    }

    public void contiene(Cadena cadena) {
        System.out.println("Ingrese una letra a buscar dentro de la frase: ");
        char letra = leer.next().charAt(0);

        if (cadena.getCadena().contains(Character.toString(letra))) {
            System.out.println("La frase si contiene la letra " + letra + ".");
        } else {
            System.out.println("La frase no contien la letra que busca.");
        }
    }
}