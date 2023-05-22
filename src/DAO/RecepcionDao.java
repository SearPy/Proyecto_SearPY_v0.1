/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import Models.Recepcion;

/**
 *
 * @author RAMC
 */
public interface RecepcionDao {
    void guardar(Recepcion cliente);
    void actualizar(Recepcion cliente);
    void eliminar (int id);
    List<Recepcion> list();
    Recepcion buscarPorId(int id);
}
