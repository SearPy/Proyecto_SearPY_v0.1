/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import Models.Det_presupuesto_serv;

/**
 *
 * @author Ramc
 */
public interface Det_presupuesto_serv_dao {
    void guardar(Det_presupuesto_serv detpresupuesto);
    void actualizar(Det_presupuesto_serv detpresupuesto);
    void eliminar (int id);
    List<Det_presupuesto_serv> list();
    Det_presupuesto_serv buscarPorId(int id);
}
