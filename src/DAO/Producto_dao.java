/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import Models.Producto;

/**
 *
 * @author RAMC
 */
public interface Producto_dao {
     void guardar(Producto producto);
    void actualizar(Producto producto);
    void eliminar (int id);
    List<Producto> list();
    Producto buscarPorId(int id);
}
