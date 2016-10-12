/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.negocio;

import ufps.mincit.datos.dao.UsuarioDAO;
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
    
    Negocio(){
        admin=new Administrador();
        visi=new Visitante();
    }
    
    public String iniciarSesion(String cedula, String contraseña) throws Exception{

       return admin.iniciarSesion(cedula, contraseña);
       
    }
    
    public boolean recibirMensaje(String nombre_empresa, String email, String asunto, String mensaje)throws Exception{
        return true;
    }
}
