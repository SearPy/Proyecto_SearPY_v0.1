/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import Models.Det_servicios;

/**
 *
 * @author Ramc
 */
public interface Det_servicios_dao {
    void guardar(Det_servicios detorden);
    void actualizar(Det_servicios detorden);
    void eliminar (int id);
    List<Det_servicios> list();
    Det_servicios buscarPorId(int id);
}
