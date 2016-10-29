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
    private String continente ;
    private String pais ;
    private String ciudad;
    private String participantes;
    private String tipo_evento;
    private String url;
    private String imagen ;
    private String descripcion;
    private String estado;

    public EventoDTO() {
    }

     public EventoDTO (String nombre, String fecha, String hora, String ciudad, String URL){
        this.nombre=nombre;
        this.fecha=fecha;
        this.hora=hora;
        this.ciudad=ciudad;
        this.url=URL;
    }
    
    
    public EventoDTO(String nombre, String fecha, String hora, String lugar, String continente, String pais, String ciudad, String participantes, String tipo_evento, String url, String imagen, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.continente = continente;
        this.pais = pais;
        this.ciudad = ciudad;
        this.participantes = participantes;
        this.tipo_evento = tipo_evento;
        this.url = url;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.estado = "1";
    }

    public String getTipo_evento() {
        return tipo_evento;
    }

    public void setTipo_evento(String tipo_evento) {
        this.tipo_evento = tipo_evento;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
