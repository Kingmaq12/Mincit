/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.datos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import ufps.mincit.datos.conexion.ConexionSQL;
import ufps.mincit.datos.interf.IComentarioDAO;
import ufps.mincit.datos.dto.Comentario;


/**
 *
 * @author user
 */
public class ComentarioDAO implements IComentarioDAO{

    
    private Connection conn = null;
    
    @Override
    public boolean recibirMensaje(Comentario comen) throws Exception{
        
        conn = ConexionSQL.conectar();
        boolean exito =false;
        PreparedStatement stmt = null;
        try{
              stmt = conn.prepareStatement("INSERT INTO Comentario (id, nombre_empresa,nombre_empleado,email,asunto,mensaje,estado) values(?,?,?,?,?,?,?)");
            stmt.setString(1, null);
            stmt.setString(2, comen.getNombre_empresa());
            stmt.setString(3, comen.getNombre_empleado());
            stmt.setString(4, comen.getEmail());
            stmt.setString(5, comen.getAsunsto());
            stmt.setString(6, comen.getMensaje());
            stmt.setString(7, "0");
            int total = stmt.executeUpdate();
            if (total > 0) {
                stmt.close();
                exito = true;
            }
             stmt.close();
        }catch(Exception e){
          e.printStackTrace();
        }
        return exito;
    }
     
}
