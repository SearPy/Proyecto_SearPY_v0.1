 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import Models.Servicios;

/**
 *
 * @author Ramc
 */
public interface Servicios_dao {
    void guardar(Servicios orden);
    void actualizar(Servicios orden);
    List<Servicios> list();
    Servicios buscarPorId(int id);
}
