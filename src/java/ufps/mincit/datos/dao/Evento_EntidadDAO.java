/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.datos.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import ufps.mincit.datos.conexion.ConexionSQL;
import ufps.mincit.datos.dto.Evento_EntidadDTO;
import ufps.mincit.datos.interf.IEvento_EntidadDAO;

/**
 *
 * @author user
 */
public class Evento_EntidadDAO implements IEvento_EntidadDAO {

    private Connection conn = null;

    public boolean registrarEve_Entidad(Evento_EntidadDTO eveDTO) throws Exception {
        System.out.println("nit entidad: " + eveDTO.getNit_entidad());
        System.out.println("id evento: " + eveDTO.getId_evento());
        conn = ConexionSQL.conectar();
        boolean exito = false;
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("INSERT INTO `Evento_Entidad`(`nit_entidad` ,`id_evento`)VALUES (?,?)");
            stmt.setString(1, eveDTO.getNit_entidad());
            stmt.setInt(2, eveDTO.getId_evento());
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

    @Override
    public String consultarPorId(String id) throws Exception {

        conn = ConexionSQL.conectar();
        String resul = "";
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento_Entidad` WHERE  `id_evento` =?");
            stmt.setInt(1, Integer.parseInt(id));
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                resul += res.getString(1) + ",";
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
    public boolean borrarEve_Entidad(int id) throws Exception {
        conn = ConexionSQL.conectar();
        boolean exito = false;
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("DELETE FROM  `Evento_Entidad` WHERE  `id_evento` = ?");
            stmt.setInt(1, id);
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

    @Override
    public String consultarPorId2(String nit) throws Exception {
       
        String resul = "";
            conn = ConexionSQL.conectar();
            PreparedStatement stmt = null;
            try {
                stmt = conn.prepareStatement("SELECT * FROM `Entidad adscrita` WHERE  `nit` =?");
                stmt.setInt(1, Integer.parseInt(nit));
                ResultSet res = stmt.executeQuery();
                while (res.next()) {
                    resul = res.getString(3);
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
