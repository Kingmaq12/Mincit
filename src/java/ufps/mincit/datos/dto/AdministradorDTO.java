/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.datos.dto;

/**
 *
 * @author CESAR
 */
public class AdministradorDTO {
    
    private String cedula;
    private String contraseña;

    public AdministradorDTO(String cedula, String contraseña) {
        this.cedula = cedula;
        this.contraseña = contraseña;
    }

    public AdministradorDTO() {
    }
   
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
    
}
