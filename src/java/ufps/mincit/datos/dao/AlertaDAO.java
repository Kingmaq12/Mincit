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
import ufps.mincit.datos.dto.AlertaDTO;
import ufps.mincit.datos.interf.IAlertaDAO;

/**
 *
 * @author user
 */
public class AlertaDAO implements IAlertaDAO{
    
    private Connection conn = null;
    
    @Override
    public ArrayList<AlertaDTO> consultarAlertasEspe(String id)throws Exception{
        
        conn = ConexionSQL.conectar();
        ArrayList<AlertaDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Alerta` WHERE id_evento = ?");
            stmt.setString(1, id);
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                AlertaDTO dto = new AlertaDTO(Integer.parseInt(res.getString(1)), Integer.parseInt(res.getString(2)), res.getString(3), res.getString(4));
                resul.add(dto);
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
    public boolean eliminarAlertaEspe(String id_alerta)throws Exception{
        
        conn = ConexionSQL.conectar();
        boolean exito =false;
        PreparedStatement stmt = null;
        try{
              stmt = conn.prepareStatement("DELETE FROM  `Alerta` WHERE  `id` = ?" );
            stmt.setString(1, id_alerta);
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
    
    public boolean registrarAlertaEspe(AlertaDTO dto)throws Exception{
        conn = ConexionSQL.conectar();
        boolean exito = false;
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("INSERT INTO Alerta(`id` ,`id_evento` ,`fecha`, `descripcion`)VALUES (?,?,?,?)");
            stmt.setString(1, null);
            stmt.setString(2, String.valueOf(dto.getId_evento()));
            stmt.setString(3, dto.getFecha());
            stmt.setString(4, dto.getDescripcion());
            int total = stmt.executeUpdate();
            if (total > 0) {
                stmt.close();
                exito = true;
            }
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return exito;
    }
    
}
