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
public class Evento_paisDTO {
    
 private int id_evento;
 private int id_pais;
 private String code_continente;

    public Evento_paisDTO() {
    }

    public Evento_paisDTO(int id_evento, int id_pais, String code_continente) {
        this.id_evento = id_evento;
        this.id_pais = id_pais;
        this.code_continente = code_continente;
    }

    public String getCode_continente() {
        return code_continente;
    }

    public void setCode_continente(String code_continente) {
        this.code_continente = code_continente;
    }

    public int getId_evento() {
        return id_evento;
    }

    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }

    public int getId_pais() {
        return id_pais;
    }

    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }
 
 
    
}
