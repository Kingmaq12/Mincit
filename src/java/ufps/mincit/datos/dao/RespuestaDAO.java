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
import ufps.mincit.datos.interf.IRespuestaDAO;

/**
 *
 * @author user
 */
public class RespuestaDAO implements IRespuestaDAO{
    
    private Connection conn = null;
    
    
    @Override
    public ArrayList<String> consultarRespuestas()throws Exception{
        conn = ConexionSQL.conectar();
        ArrayList<String> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Respuesta`");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                resul.add(res.getString(1)+"="+res.getString(2));
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
