/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import Models.Caja;

/**
 *
 * @author RAMC
 */
public interface CajaDao {
    void guardar(Caja cliente);
    void actualizar(Caja cliente);
    void eliminar (int id);
    List<Caja> list();
    Caja buscarPorId(int id);
    Caja buscarPorNom(String nombre);
}
