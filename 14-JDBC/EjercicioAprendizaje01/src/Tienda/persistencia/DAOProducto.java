package Tienda.persistencia;

import java.util.ArrayList;

public class DAOProducto extends DAO {

    public void listarNombresProductos(ArrayList<String> nombres) throws Exception {
        try {
            String sql = "SELECT DISTINCT nombre FROM producto";
            consultarBase(sql);            
            while (resultado.next()) {
                nombres.add(resultado.getString("nombre"));
            }
            desconectarBase();
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    public void listarNombresPreciosProductos(ArrayList<String> nombres) throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto";
            consultarBase(sql);            
            while (resultado.next()) {
                nombres.add(resultado.getString("nombre") + " - $" + resultado.getString("precio"));
            }
            desconectarBase();
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    public void listarProductosEntrePrecios(ArrayList<String> nombres) throws Exception{
        try {
            String sql = "SELECT * FROM producto WHERE precio BETWEEN 120 AND 202";
            consultarBase(sql);            
            while (resultado.next()) {
                nombres.add(resultado.getString("nombre") + " - $" + resultado.getString("precio"));
            }
            desconectarBase();
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
    
    public void listarProductosPortatiles(ArrayList<String> nombres) throws Exception{
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%Portatil%'";
            consultarBase(sql);            
            while (resultado.next()) {
                nombres.add(resultado.getString("nombre") + " - $" + resultado.getString("precio"));
            }
            desconectarBase();
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
}
