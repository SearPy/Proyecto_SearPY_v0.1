/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import Models.Registro_produccion;

/**
 *
 * @author Ramc
 */
public interface Registro_produccion_dao {
    void guardar(Registro_produccion orden);
    void actualizar(Registro_produccion orden);
    List<Registro_produccion> list();
    Registro_produccion buscarPorId(int id);
}
