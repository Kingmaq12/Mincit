/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.datos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import ufps.mincit.negocio.cons.ConexionSQL;
import ufps.mincit.datos.dto.ComentarioDTO;
import ufps.mincit.datos.interf.IComentarioDAO;

/**
 *
 * @author user
 */
public class ComentarioDAO implements IComentarioDAO{

        private Connection conn = null;

    
    @Override
    public boolean recibirMensaje(ComentarioDTO dto) throws Exception {
        
        conn = ConexionSQL.conectar();
        boolean exito =false;
        PreparedStatement stmt = null;
        try{
              stmt = conn.prepareStatement("INSERT INTO Comentario (nombre_empresa, email, asunto, mensaje) values(?,?,?,?)");
            stmt.setString(1, dto.getNombre_empresa());
            stmt.setString(2, dto.getEmail());
            stmt.setString(3, dto.getAsunto());
            stmt.setString(4, dto.getMensaje());
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
