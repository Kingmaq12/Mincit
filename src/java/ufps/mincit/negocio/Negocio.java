/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.negocio;

import java.util.ArrayList;
import java.util.Date;
import ufps.mincit.datos.dao.Entidad_adscritaDAO;
import ufps.mincit.datos.dao.LogroDAO;
import ufps.mincit.datos.dao.PaisesDAO;
import ufps.mincit.datos.dao.Sector_economicoDAO;
import ufps.mincit.datos.dao.UsuarioDAO;
import ufps.mincit.datos.dto.EventoDTO;
import ufps.mincit.datos.dto.Usuario;
import ufps.mincit.negocio.administrador.Administrador;
import ufps.mincit.negocio.visitante.Visitante;

/**
 *
 * @author CESAR
 */
public class Negocio {
    
    private Administrador admin;
    private Visitante visi;
    
    public Negocio(){
        admin=new Administrador();
        visi=new Visitante();
    }
    
    public String iniciarSesion(String cedula, String contraseña) throws Exception{

       return admin.iniciarSesion(cedula, contraseña);
       
    }
    
    public boolean recibirMensaje(String nombre_empresa, String email, String asunto, String mensaje)throws Exception{
        return true;
    }
    
     public ArrayList<String> mostrarPaises()throws Exception{
        
        PaisesDAO dao = new PaisesDAO();
        
        return dao.mostrarPaises();
    }
    
    public ArrayList<String> mostrarEntidades()throws Exception{
        
        Entidad_adscritaDAO dao = new Entidad_adscritaDAO();
        
        return dao.mostrarEntidades();
        
    }
    
    public ArrayList<String> mostrarSectores()throws Exception{
        
        Sector_economicoDAO dao = new Sector_economicoDAO();
        
        return dao.mostrarSectores();
        
    }
    
    public ArrayList<String> mostrarLogros()throws Exception{
        
        LogroDAO dao = new LogroDAO();
        
        return dao.mostrarLogros();
        
    }
   
    public ArrayList<EventoDTO> consultarEventos (String fecha, String entidad, String pais, String cuidad, String continente, String sector, String logro) throws Exception{
        
        return this.admin.consultarEventos(fecha, entidad, pais, cuidad, continente, sector,  logro);
    }
    
    public ArrayList<EventoDTO> consultarEventos2 (String fecha, String entidad, String pais, String ciudad, String continente, String sector, String logro) throws Exception{
        System.out.println(fecha+"-"+entidad+"-"+pais+"-"+ciudad+"-"+continente+"-"+sector+"-"+logro);
        return  this.visi.consultarEventos(fecha, entidad, pais, ciudad, continente, sector,  logro);

    }
    
    public String registrarEvento(String nombre, String fecha,String hora,String lugar,String entidad_adscrita,String continente,String pais,String ciudad,String participantes,String tipo_evento,String sector_economico,String url,String imagen,String logros,String descripcion) throws Exception{
        
     return this.admin.registrarEvento(nombre, fecha, hora, lugar, entidad_adscrita, continente, pais, ciudad, participantes, tipo_evento, sector_economico, url, imagen, logros, descripcion);
     
    }
    
    public Usuario consultarUsuarioTipo(int tipoUsuario)throws Exception{
        
        UsuarioDAO dao = new UsuarioDAO();
        
        return dao.consultarUsuarioTipo(tipoUsuario);
        
        
    } 
    
    public boolean consultarContraseña(String cedula, String antigua)throws Exception{
        
        UsuarioDAO dao = new UsuarioDAO();
        
        return dao.consultarContraseña(cedula,antigua);
        
    }
    
    public boolean cambiarContraseña(String cedula,String tipo_usuario,String nueva)throws Exception{
        
        UsuarioDAO dao = new UsuarioDAO();
        
        return dao.cambiarContraseña(cedula,tipo_usuario,nueva);
        
    }
    
    
}


