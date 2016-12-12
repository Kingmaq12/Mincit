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
import ufps.mincit.datos.interf.IEvento_VisitanteDAO;

/**
 *
 * @author CESAR
 */
public class Evento_VisitanteDAO implements IEvento_VisitanteDAO{

    public Evento_VisitanteDAO() {
    }
    
    private Connection conn = null;
    
    @Override
    public boolean registrarEvento_Visitante(String cedula,int id)throws Exception{

         conn = ConexionSQL.conectar();
        boolean exito = false;
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("INSERT INTO Evento_visitante(`id_evento` ,`cedula_usuario`)VALUES (?,?)");
            stmt.setInt(1,id);
            stmt.setString(2, cedula);
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
