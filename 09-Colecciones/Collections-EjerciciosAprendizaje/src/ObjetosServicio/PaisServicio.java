package ObjetosServicio;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void menu() {
        TreeSet<String> paises = new TreeSet();
        int op = 0;
        do {
            crearPais(paises);
            System.out.println("Desea ingresar otro pais: ");
            System.out.println("1 - Si");
            System.out.println("2 - No");
            op = leer.nextInt();

            while (op != 1 && op != 2) {
                System.out.println("ERROR. Ingrese una opcion valida.");
                System.out.println("Desea ingresar otro pais: ");
                System.out.println("1 - Si");
                System.out.println("2 - No");
                op = leer.nextInt();
            }

        } while (op != 2);
        
        for (String p : paises) {
            System.out.println(p);
        }

        System.out.println("-----------------------");

        eliminarPais(paises);
        
        System.out.println("-----------------------");
        
        System.out.println("Lista actualizada: ");
        for (String p : paises) {
            System.out.println(p);
        }
    }
    
    public void crearPais(TreeSet<String> paises) {
        System.out.println("--------------------------------");
        System.out.println("Ingrese el nombre de un pais: ");
        System.out.println("--------------------------------");
        paises.add(leer.next());
    }
    
    public void eliminarPais(TreeSet<String> paises){
        Iterator <String> it = paises.iterator();
        int cont = 0;
        System.out.println("Ingrese el pais que desea eliminar: ");
        String paisEliminado = leer.next();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(paisEliminado)) {
                it.remove();
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("EL pais no se ha encontrado :(");
        }
    }
}