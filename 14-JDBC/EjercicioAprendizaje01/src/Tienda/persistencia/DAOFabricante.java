package Tienda.persistencia;

import Tienda.entidades.Fabricante;

public class DAOFabricante extends DAO{
    
     public void crearFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("El fabricante no puede estar vacio");
            }
            String sql = "INSERT INTO fabricante (codigo,nombre)" + "values('"
                    + fabricante.getCodigo() + "' , '" + fabricante.getNombre() + "');";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
}