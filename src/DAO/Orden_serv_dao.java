 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import Models.Orden_serv;

/**
 *
 * @author Ramc
 */
public interface Orden_serv_dao {
    void guardar(Orden_serv orden);
    void actualizar(Orden_serv orden);
    List<Orden_serv> list();
    Orden_serv buscarPorId(int id);
}
