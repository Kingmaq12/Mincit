/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.datos.dto;

/**
 *
 * @author user
 */
public class Comentario {
 
    private int id;
    private String nombre_empresa;
    private String email;
    private String asunsto;
    private String mensaje;
    private boolean estado;

    public Comentario() {
    }

    public Comentario(int id, String nombre_empresa, String email, String asunsto, String mensaje, boolean estado) {
        this.id = id;
        this.nombre_empresa = nombre_empresa;
        this.email = email;
        this.asunsto = asunsto;
        this.mensaje = mensaje;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAsunsto() {
        return asunsto;
    }

    public void setAsunsto(String asunsto) {
        this.asunsto = asunsto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
