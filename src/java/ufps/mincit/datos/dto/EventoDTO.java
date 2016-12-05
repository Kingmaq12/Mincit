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
    
    private String id;
    private String nombre; 
    private String fecha; 
    private String hora;
    private String lugar ;
    private String ciudad;
    private String participantes;
    private String tipo_evento;
    private String url;
    private String imagen ;
    private String descripcion;
    private String estado;
    private String entidades_adscritas;
    private String logros;
    private String sectores_economicos;

    public EventoDTO() {
    }

     public EventoDTO (String id,String nombre, String lugar,  String fecha ,String hora, String ciudad){
        this.id=id;
        this.nombre=nombre;
        this.fecha=fecha;
        this.lugar =lugar;
        this.hora=hora;
        this.ciudad=ciudad;
    }
    public EventoDTO(String nombre, String fecha, String hora, String lugar, String ciudad, String participantes, String tipo_evento, String url, String imagen, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.ciudad = ciudad;
        this.participantes = participantes;
        this.tipo_evento = tipo_evento;
        this.url = url;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.estado = "1";
    }
    
    public EventoDTO(String nombre, String fecha, String hora, String lugar, String ciudad, String participantes, String tipo_evento, String url, String imagen, String descripcion,String entidades_adscritas,String logros,String sectores_economicos){
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.ciudad = ciudad;
        this.participantes = participantes;
        this.tipo_evento = tipo_evento;
        this.url = url;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.estado = "1";
        this.entidades_adscritas=entidades_adscritas;
        this.logros=logros;
        this.sectores_economicos=sectores_economicos;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEntidades_adscritas() {
        return entidades_adscritas;
    }

    public void setEntidades_adscritas(String entidades_adscritas) {
        this.entidades_adscritas = entidades_adscritas;
    }

    public String getLogros() {
        return logros;
    }

    public void setLogros(String logros) {
        this.logros = logros;
    }

    public String getSectores_economicos() {
        return sectores_economicos;
    }

    public void setSectores_economicos(String sectores_economicos) {
        this.sectores_economicos = sectores_economicos;
    }

    
    
}
