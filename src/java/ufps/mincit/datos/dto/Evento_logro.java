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
public class Evento_logro {
    
    private int id_evento;
    private int id_logro;

    public Evento_logro() {
    }

    public Evento_logro(int id_evento, int id_logro) {
        this.id_evento = id_evento;
        this.id_logro = id_logro;
    }

    public int getId_evento() {
        return id_evento;
    }

    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }

    public int getId_logro() {
        return id_logro;
    }

    public void setId_logro(int id_logro) {
        this.id_logro = id_logro;
    }
    
    
}
