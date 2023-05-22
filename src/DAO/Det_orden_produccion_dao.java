/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import Models.Det_orden_produccion;

/**
 *
 * @author Ramc
 */
public interface Det_orden_produccion_dao {
    void guardar(Det_orden_produccion detorden);
    void actualizar(Det_orden_produccion detorden);
    void eliminar (int id);
    List<Det_orden_produccion> list();
    Det_orden_produccion buscarPorId(int id);
}
