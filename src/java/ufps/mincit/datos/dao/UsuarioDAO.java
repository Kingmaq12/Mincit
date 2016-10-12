/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.datos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import ufps.mincit.datos.conexion.ConexionSQL;
import ufps.mincit.datos.dto.UsuarioDTO;
import ufps.mincit.datos.interf.IUsuarioDAO;

/**
 *
 * @author user
 */
public class UsuarioDAO implements IUsuarioDAO{
    
    
     private Connection conn = null;
    
    public String iniciarSesion(UsuarioDTO usu) throws Exception{
        
        conn = ConexionSQL.conectar();
        String resul= "";
        PreparedStatement stmt = null;
        try{
            stmt = conn.prepareStatement("select all Usuario.* from Usuario where Usuario.cedula LIKE ? AND Usuario.contraseña LIKE ?");
            stmt.setString(1, usu.getCedula());
            stmt.setString(2, usu.getContraseña());
            ResultSet res = stmt.executeQuery();
            while(res.next()){
               resul= res.getString(1)+","+res.getString(2)+","+res.getString(3)+","+res.getString(4)+","+res.getString(5);
            }
            stmt.close();
            res.close();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(conn != null){
                conn.close();
            }
        }
        return resul;
    }
}
