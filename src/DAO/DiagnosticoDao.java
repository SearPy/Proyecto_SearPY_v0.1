/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import Models.Diagnostico;

/**
 *
 * @author RAMC
 */
public interface DiagnosticoDao {
    void guardar(Diagnostico cliente);
    void actualizar(Diagnostico cliente);
    void eliminar (int id);
    List<Diagnostico> list();
    Diagnostico buscarPorId(int id);
}
