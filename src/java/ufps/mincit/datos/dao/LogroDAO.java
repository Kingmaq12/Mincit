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
import ufps.mincit.datos.interf.ILogroDAO;

/**
 *
 * @author user
 */
public class LogroDAO implements ILogroDAO{

    private Connection conn = null;
    
    public ArrayList<String> mostrarLogros()throws Exception{
        
        conn = ConexionSQL.conectar();
        ArrayList<String> resul= new ArrayList<>();
        PreparedStatement stmt = null;
        try{
            stmt = conn.prepareStatement("SELECT * FROM  `Logro`" );
            ResultSet res = stmt.executeQuery();
            while(res.next()){
                String cad=res.getString(1)+","+res.getString(2);
               resul.add(cad);
            }
            stmt.close();
            res.close();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(conn != null){
                conn.close();
            }
        }
        return resul;
        
    }
    
    public String buscarLogroNombre(String nombre)throws Exception{
        conn = ConexionSQL.conectar();
        String resul= "";
        PreparedStatement stmt = null;
        try{
            stmt = conn.prepareStatement("SELECT * FROM  `Logro` WHERE  `titulo` = ? " );
            stmt.setString(1, nombre);
            ResultSet res = stmt.executeQuery();
            while(res.next()){
              resul=res.getString(1);
            }
            stmt.close();
            res.close();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(conn != null){
                conn.close();
            }
        }
        return resul;
    }
    
    
}
