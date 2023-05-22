/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import Models.Cobros;

/**
 *
 * @author RAMC
 */
public interface CobrosDao {
    void guardar(Cobros cliente);
    void actualizar(Cobros cliente);
    void eliminar (int id);
    List<Cobros> list();
    Cobros buscarPorId(int id);
    Cobros buscarPorNom(String nombre);
}
