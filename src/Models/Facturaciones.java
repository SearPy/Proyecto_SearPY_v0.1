/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Ramc
 */
@Entity
public class Facturaciones implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Calendar fecha;
    private String tipo;
    @ManyToOne
    private Personas id_prov;
    @ManyToOne
    private Usuario id_us;
    
    @OneToMany(mappedBy = "id_fac", cascade = CascadeType.ALL)
    private List<Facturaciones_det> detalles = new ArrayList<>();

    public Facturaciones() {
    }

    public Facturaciones(Calendar fecha, String tipo, Personas id_prov, Usuario id_us) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.id_prov = id_prov;
        this.id_us = id_us;
    }

    public int getId() {
        return id;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Personas getId_prov() {
        return id_prov;
    }

    public void setId_prov(Personas id_prov) {
        this.id_prov = id_prov;
    }

    public Usuario getId_us() {
        return id_us;
    }

    public void setId_us(Usuario id_us) {
        this.id_us = id_us;
    }

    public List<Facturaciones_det> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Facturaciones_det> detalles) {
        this.detalles = detalles;
    }
    
    

    
}
