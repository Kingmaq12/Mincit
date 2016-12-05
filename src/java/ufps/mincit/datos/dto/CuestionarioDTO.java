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
public class CuestionarioDTO {
    
    private String cedula_usuario;
    private int respuesta;
    private String fecha;
    private int valor;

    public CuestionarioDTO() {
    }

    public CuestionarioDTO(String cedula_usuario, int respuesta, String fecha, int valor) {
        this.cedula_usuario = cedula_usuario;
        this.respuesta = respuesta;
        this.fecha = fecha;
        this.valor = valor;
    }

    public String getCedula_usuario() {
        return cedula_usuario;
    }

    public void setCedula_usuario(String cedula_usuario) {
        this.cedula_usuario = cedula_usuario;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
