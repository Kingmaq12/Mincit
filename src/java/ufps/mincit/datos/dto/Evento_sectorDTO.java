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
public class Evento_sectorDTO {
    
    private int id_evento;
    private int id_sector;

    public Evento_sectorDTO() {
    }

    public Evento_sectorDTO(int id_evento, int id_sector) {
        this.id_evento = id_evento;
        this.id_sector = id_sector;
    }

    public int getId_evento() {
        return id_evento;
    }

    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }

    public int getId_sector() {
        return id_sector;
    }

    public void setId_sector(int id_sector) {
        this.id_sector = id_sector;
    }
    
    
    
}
