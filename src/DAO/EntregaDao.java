/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import Models.Entrega;

/**
 *
 * @author RAMC
 */
public interface EntregaDao {
    void guardar(Entrega cliente);
    void actualizar(Entrega cliente);
    void eliminar (int id);
    List<Entrega> list();
    Entrega buscarPorId(int id);
    Entrega buscarPorNom(String nombre);
}
