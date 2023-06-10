/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Ramc
 */
@Entity
public class Mercaderias implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descripcion;
    private String tipo;
    private String estado;
    private String Embalaje;
    private String iva;
    private int stock;
    private int preciocom;
    private int precioven;
    

    public Mercaderias() {
    }

    public Mercaderias(String descripcion, String tipo, String estado, String Embalaje, String iva) {
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.estado = estado;
        this.Embalaje = Embalaje;
        this.iva = iva;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEmbalaje() {
        return Embalaje;
    }

    public void setEmbalaje(String Embalaje) {
        this.Embalaje = Embalaje;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }
    
    
    
    
    
    
    
}
