/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.dto;

/**
 *
 * @author user
 */
public class EmpresaDTO {
    
    private String nombre;
    private String nit;
    private String email;

    public EmpresaDTO(String nombre, String nit, String email) {
        this.nombre = nombre;
        this.nit = nit;
        this.email = email;
    }

    public EmpresaDTO() {
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
