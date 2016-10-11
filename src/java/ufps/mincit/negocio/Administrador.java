/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.negocio;

import ufps.mincit.datos.dao.UsuarioDAO;
import ufps.mincit.datos.dto.Usuario;

/**
 *
 * @author CESAR
 */
public class Administrador {
    
     public String iniciarSesion(String cedula, String contraseña) throws Exception{
//        System.out.println(cedula);
//        System.out.println(contraseña);

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
    
}
