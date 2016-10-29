/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.datos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import ufps.mincit.datos.conexion.ConexionSQL;
import ufps.mincit.datos.dto.Evento_paisDTO;
import ufps.mincit.datos.interf.IEvento_paisDAO;

/**
 *
 * @author user
 */
public class Evento_paisDAO implements IEvento_paisDAO{

    
    private Connection conn = null;
    
    public boolean registrarEve_Pais(Evento_paisDTO eveDTO)throws Exception{
        
        conn = ConexionSQL.conectar();
        boolean exito =false;
        PreparedStatement stmt = null;
        try{
            stmt = conn.prepareStatement("INSERT INTO Evento_pais(`id_evento` ,`id_pais`)VALUES (?,?)");
            stmt.setInt(1, eveDTO.getId_evento());
            stmt.setInt(2, eveDTO.getId_pais());
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
