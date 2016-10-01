/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.datos.dto;

import java.sql.Date;

/**
 *
 * @author user
 */
public class EstadisticaDTO {
 
    private Date fecha;
    private String valor;

    public EstadisticaDTO(Date fecha, String valor) {
        this.fecha = fecha;
        this.valor = valor;
    }

    public EstadisticaDTO() {
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
    
}
