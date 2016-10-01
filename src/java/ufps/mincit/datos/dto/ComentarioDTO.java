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
public class ComentarioDTO {
    
   private String  nombre_empresa;
   private String email;
   private String asunto;
   private String mensaje;

    public ComentarioDTO(String nombre_empresa, String email, String asunto, String mensaje) {
        this.nombre_empresa = nombre_empresa;
        this.email = email;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

    public ComentarioDTO() {
    }
  
    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
   
   
    
}
