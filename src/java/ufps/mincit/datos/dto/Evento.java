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
public class Evento {
    
    private int id;
    private String nombre;
    private Date fecha;
    private String hora;
    private String lugar;
    private String tipo_evento;
    private String URL;
    private String img;
    private String descripcion;
    private String pais;
    private String ciudad;
    private String continente;
    private boolean estado;

    public Evento() {
    }

    public Evento(int id, String nombre, Date fecha, String hora, String lugar, String tipo_evento, String URL, String img, String descripcion, String pais, String ciudad, String continente, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.tipo_evento = tipo_evento;
        this.URL = URL;
        this.img = img;
        this.descripcion = descripcion;
        this.pais = pais;
        this.ciudad = ciudad;
        this.continente = continente;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTipo_evento() {
        return tipo_evento;
    }

    public void setTipo_evento(String tipo_evento) {
        this.tipo_evento = tipo_evento;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
