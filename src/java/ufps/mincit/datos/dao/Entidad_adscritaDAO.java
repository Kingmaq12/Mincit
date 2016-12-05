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
import ufps.mincit.datos.interf.IEntidad_adscritaDAO;

/**
 *
 * @author user
 */
public class Entidad_adscritaDAO implements IEntidad_adscritaDAO{

    private Connection conn = null;
    
    public ArrayList<String> mostrarEntidades()throws Exception{
        
        conn = ConexionSQL.conectar();
        ArrayList<String> resul= new ArrayList<>();
        PreparedStatement stmt = null;
        try{
            stmt = conn.prepareStatement("SELECT * FROM  `Entidad adscrita`" );
            ResultSet res = stmt.executeQuery();
            while(res.next()){
               String cad=res.getString(1)+","+res.getString(3);
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
    
    
    public String consultarEntidad(String id)throws Exception{
        conn = ConexionSQL.conectar();
        String resul= "";
        PreparedStatement stmt = null;
        try{
            stmt = conn.prepareStatement("SELECT * FROM  `Entidad adscrita` WHERE  `id` = ? " );
            stmt.setString(1, id);
            ResultSet res = stmt.executeQuery();
            while(res.next()){
              resul=res.getString(2);
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
    
    public String consultarEntidadNombre(String nombre)throws Exception{
        conn = ConexionSQL.conectar();
        String resul= "";
        PreparedStatement stmt = null;
        try{
            stmt = conn.prepareStatement("SELECT * FROM  `Entidad adscrita` WHERE  `nombre` = ? " );
            stmt.setString(1, nombre);
            ResultSet res = stmt.executeQuery();
            while(res.next()){
              resul=res.getString(2);
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
    
        public ArrayList<String> mostrarEntidad()throws Exception{
        
        conn = ConexionSQL.conectar();
        ArrayList<String> resul= new ArrayList<>();
        PreparedStatement stmt = null;
        try{
            //NIT DE LA ENTIDAD
            stmt = conn.prepareStatement("SELECT * FROM  `Entidad adscrita`" );
            ResultSet res = stmt.executeQuery();
            while(res.next()){
               String cad=res.getString(2)+","+res.getString(3);
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
    
            public String consultarEntidades(String nit)throws Exception{
        conn = ConexionSQL.conectar();
        String resul= "";
        PreparedStatement stmt = null;
        try{
            stmt = conn.prepareStatement("SELECT * FROM  `Entidad adscrita` WHERE  `nit` = ? " );
            stmt.setString(1, nit);
            ResultSet res = stmt.executeQuery();
            while(res.next()){
              resul=res.getString(2);
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
