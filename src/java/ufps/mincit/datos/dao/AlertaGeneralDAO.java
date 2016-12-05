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
import ufps.mincit.datos.dto.AlertaGeneralDTO;
import ufps.mincit.datos.interf.IAlertaGeneralDAO;

/**
 *
 * @author CESAR
 */
public class AlertaGeneralDAO implements IAlertaGeneralDAO{
    
    private Connection conn = null;
    
    @Override
    public boolean modificarAlerta(AlertaGeneralDTO dto)throws Exception{
        conn = ConexionSQL.conectar();
        boolean exito =false;
        PreparedStatement stmt = null;
        try{
              stmt = conn.prepareStatement("UPDATE  `Alerta_general` SET  `dias_antes` =  ? WHERE `numero_alerta` = ?");
            stmt.setString(1, dto.getDia());
            stmt.setString(2, dto.getNumero_alerta());
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
    public ArrayList<String> consultarAlertas()throws Exception{
        
        conn = ConexionSQL.conectar();
        ArrayList<String> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Alerta_general`");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                resul.add(res.getString(2));
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
}
