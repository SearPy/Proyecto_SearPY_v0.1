/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import Models.datos_login;

/**
 *
 * @author RAMC
 */
public interface LoginDao {
     void guardar(datos_login dl);
    void actualizar(datos_login dl);
    List<datos_login> list();
    datos_login buscarPorId(int id);
}
