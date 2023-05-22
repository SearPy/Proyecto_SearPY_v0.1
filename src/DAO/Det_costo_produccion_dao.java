/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import Models.Det_costo_produccion;

/**
 *
 * @author Ramc
 */
public interface Det_costo_produccion_dao {
    void guardar(Det_costo_produccion detpresupuesto);
    void actualizar(Det_costo_produccion detpresupuesto);
    void eliminar (int id);
    List<Det_costo_produccion> list();
    Det_costo_produccion buscarPorId(int id);
}
