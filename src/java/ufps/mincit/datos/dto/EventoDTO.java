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
public class EventoDTO {
    
    private String nombre;
    private Date fecha;
    private String hora;
    private String lugar;
    private String patrocinadores;
    private String participantes;
    private String tipo_de_evento;
    private String sector_economico;
    private String url;
    private String imagen;
    private String descripcion;
    private String pais;
    private String ciudad;

    public EventoDTO(String nombre, Date fecha, String hora, String lugar, String patrocinadores, String participantes, String tipo_de_evento, String sector_economico, String url, String imagen, String descripcion, String pais, String ciudad) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.patrocinadores = patrocinadores;
        this.participantes = participantes;
        this.tipo_de_evento = tipo_de_evento;
        this.sector_economico = sector_economico;
        this.url = url;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.pais = pais;
        this.ciudad = ciudad;
    }

    public EventoDTO() {
    }
       
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getPatrocinadores() {
        return patrocinadores;
    }

    public void setPatrocinadores(String patrocinadores) {
        this.patrocinadores = patrocinadores;
    }

    public String getParticipantes() {
        return participantes;
    }

    public void setParticipantes(String participantes) {
        this.participantes = participantes;
    }

    public String getTipo_de_evento() {
        return tipo_de_evento;
    }

    public void setTipo_de_evento(String tipo_de_evento) {
        this.tipo_de_evento = tipo_de_evento;
    }

    public String getSector_economico() {
        return sector_economico;
    }

    public void setSector_economico(String sector_economico) {
        this.sector_economico = sector_economico;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
    
}
