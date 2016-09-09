/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.negocio;

import ufps.mincit.dao.AdministradorDAO;

/**
 *
 * @author CESAR
 */
public class Negocio {
    
    
    public boolean iniciarSesion(String cedula, String contraseña) throws Exception{
        
        AdministradorDAO dao= new AdministradorDAO();
        return dao.iniciarSesion(cedula, contraseña);
    }
    
    
}
