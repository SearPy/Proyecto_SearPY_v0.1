/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import Models.Det_ajuste_stock;

/**
 *
 * @author Ramc
 */
public interface Det_ajuste_stock_dao {
    void guardar(Det_ajuste_stock detajuste);
    void actualizar(Det_ajuste_stock detajuste);
    void eliminar (int id);
    List<Det_ajuste_stock> list();
    Det_ajuste_stock buscarPorId(int id);
}
