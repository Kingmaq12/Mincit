/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.datos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import ufps.mincit.datos.conexion.ConexionSQL;
import ufps.mincit.datos.dto.Evento_logroDTO;
import ufps.mincit.datos.interf.IEvento_logroDAO;

/**
 *
 * @author user
 */
public class Evento_logroDAO implements IEvento_logroDAO{

    
    private Connection conn = null;
    
    public boolean registrarEve_Logro(Evento_logroDTO eveDTO)throws Exception{
        
        conn = ConexionSQL.conectar();
        boolean exito =false;
        PreparedStatement stmt = null;
        try{
            stmt = conn.prepareStatement("INSERT INTO Evento_logro(`id_evento` ,`id_logro`)VALUES (?,?)");
            stmt.setInt(1, eveDTO.getId_evento());
            stmt.setInt(2, eveDTO.getId_logro());
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
