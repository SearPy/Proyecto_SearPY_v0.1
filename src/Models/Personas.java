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
public class Personas implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String documento;
    private String tipdocumento;
    private String nombre;
    private String telefono;
    private String email;
    private String direccion;
    private String tippersona;
    private String cliente;
    private String proveedor;
    private int credito;

    public Personas() {
    }

    public Personas(String documento, String tipdocumento, String nombre, String telefono, String email, String direccion, String tippersona, String cliente, String proveedor, int credito) {
        this.documento = documento;
        this.tipdocumento = tipdocumento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.tippersona = tippersona;
        this.cliente = cliente;
        this.proveedor = proveedor;
        this.credito = credito;
    }

    public int getId() {
        return id;
    }

    
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipdocumento() {
        return tipdocumento;
    }

    public void setTipdocumento(String tipdocumento) {
        this.tipdocumento = tipdocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTippersona() {
        return tippersona;
    }

    public void setTippersona(String tippersona) {
        this.tippersona = tippersona;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
    
    
    
    
    
}
