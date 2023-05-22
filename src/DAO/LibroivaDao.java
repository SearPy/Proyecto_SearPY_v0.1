/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import Models.Libroiva;

/**
 *
 * @author RAMC
 */
public interface LibroivaDao {
    void guardar(Libroiva libroiva);
    void actualizar(Libroiva libroiva);
    void eliminar (int id);
    List<Libroiva> list();
    Libroiva buscarPorId(int id);
    Libroiva buscarPorNom(int nombre);
    Libroiva buscarPorNom2(int nombre);
}
