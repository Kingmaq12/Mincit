/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.negocio.administrador;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.Date;
import ufps.mincit.datos.dao.EventoDAO;
import ufps.mincit.datos.dao.UsuarioDAO;
import ufps.mincit.datos.dto.EventoDTO;
import ufps.mincit.datos.dto.Usuario;

/**
 *
 * @author CESAR
 */
public class Administrador {
    
     public String iniciarSesion(String cedula, String contraseña) throws Exception{
        String result="";
        
        Usuario usu = new Usuario(cedula,contraseña);
        UsuarioDAO aux = new UsuarioDAO();
        
        String usuario =aux.iniciarSesion(usu);
        System.out.println(usuario);
        if(!usuario.isEmpty()){
            String[] divi= usuario.split(",");
            if(divi[3].equalsIgnoreCase("1")){
                return "S";
            }
            if(divi[3].equalsIgnoreCase("2")){
                return "A";
            }
        }
        return "N";
    }
    
     public String registrarEvento(String nombre,String fecha,String hora,String lugar,String patrocinadores,String continente,String pais,String ciudad,String participantes,String tipo_evento,String sector_economico,String url,String imagen, String logros,String descripcion) throws Exception{
         
         System.out.println("Negocio, RegistrarEvento");
         EventoDTO dto = new EventoDTO(nombre, fecha, hora, lugar, patrocinadores, continente, pais, ciudad, participantes, tipo_evento, sector_economico, url, imagen, logros, descripcion);
         EventoDAO dao = new EventoDAO();
         
         boolean resp = dao.registrarEvento(dto);
         if(resp){
             return "S";
         }
         
         return "N";
     }
     
          
     public ArrayList<EventoDTO> consultarEventos(Date fecha, String entidad, String pais, String cuidad, String continente, String sector, String logro) throws Exception{
         
         if(fecha!=null ){
             
         }
         
         
         return null;
     }
}