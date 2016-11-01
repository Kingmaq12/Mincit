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
    
    @Override
    public String consultarPorId(String id) throws Exception {

        conn = ConexionSQL.conectar();
        String resul ="";
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento_logro` WHERE  `id_evento` =?");
            stmt.setInt(1, Integer.parseInt(id));
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                resul+=res.getString(2)+",";
            }
            stmt.close();
            res.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return resul;

    }
    
    @Override 
    public boolean borrarEve_Logros(int id)throws Exception{
        conn = ConexionSQL.conectar();
        boolean exito =false;
        PreparedStatement stmt = null;
        try{
              stmt = conn.prepareStatement("DELETE FROM  `Evento_logro` WHERE  `id_evento` = ?" );
            stmt.setInt(1, id);
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
