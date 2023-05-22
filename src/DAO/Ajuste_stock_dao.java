/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import Models.Ajuste_stock;

/**
 *
 * @author Ramc
 */
public interface Ajuste_stock_dao {
    void guardar(Ajuste_stock ajuste);
    void actualizar(Ajuste_stock ajuste);
    List<Ajuste_stock> list();
    Ajuste_stock buscarPorId(int id);
}
