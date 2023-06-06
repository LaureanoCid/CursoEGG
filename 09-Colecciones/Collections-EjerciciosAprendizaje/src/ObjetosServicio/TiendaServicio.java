package ObjetosServicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void menu() {
        HashMap<String, Double> tienda1 = new HashMap();
        int op = 0;

        do {
            System.out.println("----------------");
            System.out.println("MENU");
            System.out.println("1 - Ingresar producto");
            System.out.println("2 - Modificar precio");
            System.out.println("3 - Eliminar producto");
            System.out.println("4 - Mostrar producto");
            System.out.println("5 - Salir");
            System.out.println("----------------");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    crearProducto(tienda1);    
                    break;
                case 2:
                    modificarPrecio(tienda1);
                    break;
                case 3:
                    eliminarProducto(tienda1);
                    break;
                case 4:
                    mostrarProducto(tienda1);
                    break;
                case 5:
                    System.out.println("Saliendo . . .");
                    break;
                default:
                    System.out.println("Error. Ingrese una opcion valida");
                    break;
            }
        } while (op != 5);
    }

    public void crearProducto(HashMap<String, Double> tienda1) {
        System.out.println("Ingrese el nuevo producto: ");
        System.out.println("Nombre del producto: ");
        String nombre = leer.next();
        System.out.println("Ingrese el valor del producto: ");
        double precio = leer.nextDouble();
        tienda1.put(nombre, precio);
    }
    public void modificarPrecio(HashMap<String, Double> tienda1){
        System.out.println("Ingrese el producto a modificar: ");
        String nombre = leer.next();
        int cont = 0;
        for (Map.Entry<String, Double> entry : tienda1.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            if (nombre.equalsIgnoreCase(key)) {
                System.out.println("Ingrese el nuevo precio: ");
                entry.setValue(leer.nextDouble());
                System.out.println("El nuevo precio del producto " + entry.getKey() + " es $" + entry.getValue());
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("Producto no encontrado");
        }
    }
    public void eliminarProducto(HashMap<String, Double> tienda1){
        System.out.println("Ingrese el producto a eliminar: ");
        String nombre = leer.next();
        int cont = 0;
        for (Map.Entry<String, Double> entry : tienda1.entrySet()) {
            String key = entry.getKey();
            if (nombre.equalsIgnoreCase(key)) {
                tienda1.remove(nombre);
                System.out.println("Producto eliminado");
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("Producto no encontrado");
        }
    }
    public void mostrarProducto(HashMap<String, Double> tienda1){
        System.out.println("Ingrese el producto a mostrar: ");
        String nombre = leer.next();
        int cont = 0;
        for (Map.Entry<String, Double> entry : tienda1.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            if (nombre.equalsIgnoreCase(key)) {
                System.out.println(entry.getKey() + " = $" + entry.getValue());
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("Producto no encontrado");
        }
    }
}