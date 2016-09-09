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
public class RangoDTO {
    
    private String rango;
    private String descripcion;

    public RangoDTO(String rango, String descripcion) {
        this.rango = rango;
        this.descripcion = descripcion;
    }

    public RangoDTO() {
    }
    
    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
