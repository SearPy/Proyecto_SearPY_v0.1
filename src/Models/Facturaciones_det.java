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
import javax.persistence.ManyToOne;

/**
 *
 * @author Ramc
 */
@Entity
public class Facturaciones_det implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int cantidad;
    private int precio;
    @ManyToOne
    private Mercaderias id_mer;
    @ManyToOne
    private Facturaciones id_fac;

    public Facturaciones_det() {
    }

    public Facturaciones_det(int cantidad, int precio, Mercaderias id_mer, Facturaciones id_fac) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.id_mer = id_mer;
        this.id_fac = id_fac;
    }

    public int getId() {
        return id;
    }


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Mercaderias getId_mer() {
        return id_mer;
    }

    public void setId_mer(Mercaderias id_mer) {
        this.id_mer = id_mer;
    }

    public Facturaciones getId_fac() {
        return id_fac;
    }

    public void setId_fac(Facturaciones id_fac) {
        this.id_fac = id_fac;
    }

    
    
}
