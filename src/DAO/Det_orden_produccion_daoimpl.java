/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import Models.Det_orden_produccion;
import org.hibernate.Session;

/**
 *
 * @author Ramc
 */
public class Det_orden_produccion_daoimpl implements Det_orden_produccion_dao{
    private final Session st;

    public Det_orden_produccion_daoimpl(Session st) {
        this.st = st;
    }
    @Override
    public void guardar(Det_orden_produccion detorden) {
       st.beginTransaction();
       st.persist(detorden);
       st.getTransaction().commit();
    }
    
    @Override
    public void actualizar(Det_orden_produccion detorden) {
       st.beginTransaction();
       st.persist(detorden);
       st.getTransaction().commit();
    }
    
    @Override
    public void eliminar(int id) {
    
        Det_orden_produccion detorden = buscarPorId(id);
        st.beginTransaction();
        st.delete(detorden);
        st.getTransaction().commit();
       
    }

    @Override
    public List<Det_orden_produccion> list() {
       return st.createQuery("FROM Det_orden_produccion dt").list();
    }

    @Override
    public Det_orden_produccion buscarPorId(int id) {
        return (Det_orden_produccion) st.load(Det_orden_produccion.class, id);
    }
    
}
