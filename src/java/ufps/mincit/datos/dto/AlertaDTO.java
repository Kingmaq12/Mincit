/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.datos.dto;

import java.util.Date;

/**
 *
 * @author user
 */
public class AlertaDTO {
    
    private int id;
    private int id_evento;
    private String fecha;
    private String descripcion;

    public AlertaDTO() {
    }

    public AlertaDTO(int id_evento, String fecha, String descripcion) {
        this.id_evento = id_evento;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }
    
    public AlertaDTO(int id,int id_evento, String fecha,String descripcion) {
        this.id=id;
        this.id_evento = id_evento;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_evento() {
        return id_evento;
    }

    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
