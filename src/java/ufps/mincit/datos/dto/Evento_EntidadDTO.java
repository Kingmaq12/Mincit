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
public class Evento_EntidadDTO {
    
    private String nit_entidad;
    private int id_evento;

    public Evento_EntidadDTO() {
    }

    public Evento_EntidadDTO(String nit_entidad, int id_evento) {
        this.nit_entidad = nit_entidad;
        this.id_evento = id_evento;
    }

    public String getNit_entidad() {
        return nit_entidad;
    }

    public void setNit_entidad(String nit_entidad) {
        this.nit_entidad = nit_entidad;
    }

    public int getId_evento() {
        return id_evento;
    }

    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }
    
    
}
