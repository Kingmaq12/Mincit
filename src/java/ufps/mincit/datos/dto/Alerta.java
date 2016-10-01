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
public class Alerta {
    
    private int id_evento;
    private Date fecha;
    private int repetir;
    private String descripcion;

    public Alerta() {
    }

    public Alerta(int id_evento, Date fecha, int repetir, String descripcion) {
        this.id_evento = id_evento;
        this.fecha = fecha;
        this.repetir = repetir;
        this.descripcion = descripcion;
    }

    public int getId_evento() {
        return id_evento;
    }

    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getRepetir() {
        return repetir;
    }

    public void setRepetir(int repetir) {
        this.repetir = repetir;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
