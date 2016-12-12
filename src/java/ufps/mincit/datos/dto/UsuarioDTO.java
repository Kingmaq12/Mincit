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
public class UsuarioDTO {
    
    private String nombre;
    private String email;
    private String cedula;
    private int tipo_usuario;
    private String contraseña;

    public UsuarioDTO(String cedula, String contraseña) {
        this.nombre = "";
        this.email = "";
        this.cedula = cedula;
        this.tipo_usuario = -1;
        this.contraseña = contraseña;
    }

    
    public UsuarioDTO(String nombre, String email, String cedula, int tipo_usuario, String contraseña) {
        this.nombre = nombre;
        this.email = email;
        this.cedula = cedula;
        this.tipo_usuario = tipo_usuario;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(int tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
}
