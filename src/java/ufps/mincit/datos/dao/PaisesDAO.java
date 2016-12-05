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
import ufps.mincit.datos.interf.IPaisesDAO;

/**
 *
 * @author user
 */
public class PaisesDAO implements IPaisesDAO {

    private Connection conn = null;

    public ArrayList<String> mostrarPaises(String continente) throws Exception {
        conn = ConexionSQL.conectar();
        ArrayList<String> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM  `countries` WHERE continent_code = ?");
            stmt.setString(1, continente);
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                resul.add(res.getString(3));
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

    public ArrayList<String> mostrarPaisesC(String continente) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<String> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM  `countries` WHERE continent_code = ?");
            stmt.setString(1, continente);
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                resul.add(res.getString(1) + "-" + res.getString(3));
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

    public ArrayList<String> mostrarPaises() throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<String> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM  `countries`");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                resul.add(res.getString(1) + "-" + res.getString(3));
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

    public String buscarPais(String pais) throws Exception {
        conn = ConexionSQL.conectar();
        String resul = "";
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `countries` WHERE `name` = ?");
            stmt.setString(1, pais);
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                resul = res.getString(1);
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
