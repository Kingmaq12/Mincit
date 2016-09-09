/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import ufps.mincit.cons.ConexionSQL;
import ufps.mincit.interf.IAdministradorDAO;

/**
 *
 * @author CESAR
 */
public class AdministradorDAO implements IAdministradorDAO{
    
    
    private Connection conn = null;
    
    
    @Override
    public boolean iniciarSesion(String cedula, String contraseña) throws Exception {
        conn = ConexionSQL.conectar();
        boolean exito =false;
        PreparedStatement stmt = null;
        try{
              stmt = conn.prepareStatement("SELECT * FROM Administrador WHERE Administrador.cedula = ? AND Administrador.contraseña = ?");
            stmt.setString(1, cedula);
            stmt.setString(2, contraseña);
            
           ResultSet res = stmt.executeQuery();
            if(res.next()){
               exito=true;
            }
            stmt.close();
            res.close();  
        }catch(Exception e){
          e.printStackTrace();
        }
        return exito;
    }
    
}
