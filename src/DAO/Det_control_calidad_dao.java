/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import Models.Det_control_calidad;

/**
 *
 * @author Ramc
 */
public interface Det_control_calidad_dao {
    void guardar(Det_control_calidad detajuste);
    void actualizar(Det_control_calidad detajuste);
    void eliminar (int id);
    List<Det_control_calidad> list();
    Det_control_calidad buscarPorId(int id);
}
