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
import ufps.mincit.datos.dto.EventoDTO;
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
}
