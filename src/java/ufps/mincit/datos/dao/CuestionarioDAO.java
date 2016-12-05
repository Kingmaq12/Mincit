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
import ufps.mincit.datos.dto.CuestionarioDTO;
import ufps.mincit.datos.interf.ICuestionarioDAO;

/**
 *
 * @author user
 */
public class CuestionarioDAO implements ICuestionarioDAO{
    
        private Connection conn = null;

    
      public ArrayList<CuestionarioDTO> mostrarCuestionario() throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<CuestionarioDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM  `Cuestionario` ORDER BY fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //mostrar datos ordenados por fecha
                resul.add(new CuestionarioDTO(res.getString(2), Integer.parseInt(res.getString(3)), res.getString(4), Integer.parseInt(res.getString(5))));
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
    public int contarAlto() throws Exception {

        conn = ConexionSQL.conectar();
        int resul = -1;
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT count(*) FROM `Cuestionario` WHERE `respuesta` like '3'");
            ResultSet res = stmt.executeQuery();
             res.next() ;
                resul = res.getInt(1);
            
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
    public int contarMedio() throws Exception {
        conn = ConexionSQL.conectar();
        int resul = 0;
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT count(*) FROM `Cuestionario` WHERE `respuesta` like '2'");
            ResultSet res = stmt.executeQuery();
            res.next();
                resul = res.getInt(1);
            
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
    public int contarBajo() throws Exception {
        conn = ConexionSQL.conectar();
        int resul = 0;
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT count(*) FROM `Cuestionario` WHERE `respuesta` like '1'");
            ResultSet res = stmt.executeQuery();
            res.next();
                resul = res.getInt(1);
            
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
