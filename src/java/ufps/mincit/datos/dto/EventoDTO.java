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
public class EventoDTO {
    
    
    private String nombre; 
    private String fecha; 
    private String hora;
    private String lugar ;
    private String patrocinadores ;
    private String continente ;
    private String pais ;
    private String ciudad;
    private String participantes;
    private String tipo_evento ;
    private String sector_economico ;
    private String url;
    private String imagen ;
    private String logros ;
    private String descripcion;
    private String estado;

    public EventoDTO() {
    }

    public EventoDTO(String nombre, String fecha, String hora, String lugar, String patrocinadores, String continente, String pais, String ciudad, String participantes, String tipo_evento, String sector_economico,String url, String imagen, String logros, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.patrocinadores = patrocinadores;
        this.continente = continente;
        this.pais = pais;
        this.ciudad = ciudad;
        this.participantes = participantes;
        this.tipo_evento = tipo_evento;
        this.sector_economico = sector_economico;
        this.url=url;
        this.imagen = imagen;
        this.logros = logros;
        this.descripcion = descripcion;
        this.estado = "1";
    }

        public EventoDTO(String fecha, String hora, String lugar, String patrocinadores, String continente, String pais, String ciudad, String participantes, String tipo_evento, String sector_economico,String url, String imagen, String logros, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.patrocinadores = patrocinadores;
        this.continente = continente;
        this.pais = pais;
        this.ciudad = ciudad;
        this.participantes = participantes;
        this.tipo_evento = tipo_evento;
        this.sector_economico = sector_economico;
        this.url=url;
        this.imagen = imagen;
        this.logros = logros;
        this.descripcion = descripcion;
        this.estado = "1";
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
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

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
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

    public String getParticipantes() {
        return participantes;
    }

    public void setParticipantes(String participantes) {
        this.participantes = participantes;
    }

    public String getTipo_evento() {
        return tipo_evento;
    }

    public void setTipo_evento(String tipo_evento) {
        this.tipo_evento = tipo_evento;
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

    public String getLogros() {
        return logros;
    }

    public void setLogros(String logros) {
        this.logros = logros;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
