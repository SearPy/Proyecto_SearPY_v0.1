/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import Models.Factura_com;

/**
 *
 * @author Ramc
 */
public interface Factura_com_dao {
    void guardar(Factura_com factura);
    void actualizar(Factura_com factura);
    List<Factura_com> list();
    Factura_com buscarPorId(int id);
}
