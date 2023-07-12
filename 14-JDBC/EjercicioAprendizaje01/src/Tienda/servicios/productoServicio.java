package Tienda.servicios;

import Tienda.persistencia.DAOProducto;
import java.util.ArrayList;

public class productoServicio {

    DAOProducto DAOP = new DAOProducto();

    public void Menu() {
    }

    public void listarNombreProductos() throws Exception {
        ArrayList<String> nombres = new ArrayList<String>();
        DAOP.listarNombresProductos(nombres);
        for (String aux : nombres) {
            System.out.println(aux);
        }
    }

    public void listarNombrePrecioProductos() throws Exception {
        ArrayList<String> nombres = new ArrayList<String>();
        DAOP.listarNombresPreciosProductos(nombres);
        for (String aux : nombres) {
            System.out.println(aux);
        }
    }

    public void productosEntrePrecios() throws Exception {
        ArrayList<String> nombres = new ArrayList<String>();
        DAOP.listarProductosEntrePrecios(nombres);
        for (String aux : nombres) {
            System.out.println(aux);
        }
    }

    public void productosPortatiles() throws Exception {
        ArrayList<String> nombres = new ArrayList<String>();
        DAOP.listarProductosPortatiles(nombres);
        for (String aux : nombres) {
            System.out.println(aux);
        }
    }

}
