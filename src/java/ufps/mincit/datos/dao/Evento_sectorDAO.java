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
import ufps.mincit.datos.dto.Evento_sectorDTO;
import ufps.mincit.datos.interf.IEvento_sectorDAO;

/**
 *
 * @author user
 */
public class Evento_sectorDAO implements IEvento_sectorDAO{

    private Connection conn = null;
    
    public boolean registrarEve_Sec(Evento_sectorDTO eveDTO)throws Exception{
        
        conn = ConexionSQL.conectar();
        boolean exito =false;
        PreparedStatement stmt = null;
        try{
            stmt = conn.prepareStatement("INSERT INTO `Evento_sector`(`id_evento`,`id_sector`)VALUES (?,?)");
            stmt.setInt(1, eveDTO.getId_evento());
            stmt.setInt(2, eveDTO.getId_sector());
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
            stmt = conn.prepareStatement("SELECT * FROM `Evento_sector` WHERE  `id_evento` =?");
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
    public boolean borrarEve_Sectores(int id)throws Exception{
        conn = ConexionSQL.conectar();
        boolean exito =false;
        PreparedStatement stmt = null;
        try{
              stmt = conn.prepareStatement("DELETE FROM  `Evento_sector` WHERE  `id_evento` = ?" );
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
