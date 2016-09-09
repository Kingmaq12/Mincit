/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.negocio;

import ufps.mincit.dao.AdministradorDAO;
import ufps.mincit.dao.ComentarioDAO;

/**
 *
 * @author CESAR
 */
public class Negocio {
    
    
    public boolean iniciarSesion(String cedula, String contraseña) throws Exception{
        
        AdministradorDAO dao= new AdministradorDAO();
        return dao.iniciarSesion(cedula, contraseña);
    }
    
    public boolean recibirMensaje(String nombre_empresa, String email, String asunto, String mensaje)throws Exception{
        
        ComentarioDAO dao = new ComentarioDAO();
        return dao.recibirMensaje(nombre_empresa, email, asunto, mensaje);        
    }
}
