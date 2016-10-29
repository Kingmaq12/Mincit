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
import ufps.mincit.datos.dto.EventoDTO;
import ufps.mincit.datos.interf.IEventoDAO;

/**
 *
 * @author user
 */
public class EventoDAO implements IEventoDAO{
    
     private Connection conn = null;
     
     @Override
     public boolean registrarEvento(EventoDTO dto) throws Exception{
        
        conn = ConexionSQL.conectar();
        boolean exito =false;
        PreparedStatement stmt = null;
        try{
            stmt = conn.prepareStatement("INSERT INTO Evento(`id` ,`nombre` ,`fecha` ,`hora` ,`lugar` ,`continente` ,`pais` ,`ciudad` ,`participantes` ,`tipo_evento`,`url` ,`ruta_imagen` ,`descripcion` ,`estado`)VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, null);
            stmt.setString(2, dto.getNombre());
            stmt.setString(3, dto.getFecha());
            stmt.setString(4, dto.getHora());
            stmt.setString(5, dto.getLugar());
            stmt.setString(6, dto.getContinente());
            stmt.setString(7, dto.getPais());
            stmt.setString(8, dto.getCiudad());
            stmt.setString(9, dto.getParticipantes());
            stmt.setString(10, dto.getTipo_evento());
            stmt.setString(11, dto.getUrl());
            stmt.setString(12, dto.getImagen());
            stmt.setString(13, dto.getDescripcion() );
            stmt.setInt(14, Integer.parseInt(dto.getEstado()));
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
     public int consultarId() throws Exception{
         
          conn = ConexionSQL.conectar();
        int resul=0;
        PreparedStatement stmt = null;
        try{
            stmt = conn.prepareStatement("SELECT MAX( id ) AS id FROM Evento" );
            ResultSet res = stmt.executeQuery();
            while(res.next()){
               resul= Integer.parseInt(res.getString(1));
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
     
     
     @Override
    public ArrayList<EventoDTO> consultar1(String fecha, String entidad, String pais, String ciudad, String continente, String sector, String logro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar2(String fecha) throws Exception {
        
        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul= new ArrayList<>();
        PreparedStatement stmt = null;
        try{           
            stmt = conn.prepareStatement("SELECT * FROM `Evento` where Evento.fecha = " + fecha);
            ResultSet res = stmt.executeQuery();
            while(res.next()){
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
               EventoDTO e =new EventoDTO(res.getString(2),res.getString(3), res.getString(4),res.getString(8),res.getString(11));
               resul.add(e);
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

    @Override
    public ArrayList<EventoDTO> consultar3(String fecha, String entidad) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar4(String fecha, String entidad, String pais) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar5(String fecha, String entidad, String pais, String ciudad) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar6(String fecha, String entidad, String pais, String ciudad, String continente) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar7(String fecha, String entidad, String pais, String ciudad, String continente, String sector) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar8(String entidad) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar9(String entidad, String pais) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar10(String entidad, String pais, String ciudad) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar11(String entidad, String pais, String ciudad, String continente) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar12(String entidad, String pais, String ciudad, String continente, String sector) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar13(String entidad, String pais, String ciudad, String continente, String sector, String logro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar14(String pais) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar15(String pais, String ciudad) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar16(String pais, String ciudad, String continente) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar17(String pais, String ciudad, String continente, String sector) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar18(String pais, String ciudad, String continente, String sector, String logro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar19(String ciudad) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar20(String ciudad, String continente) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar21(String ciudad, String continente, String sector) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar22(String ciudad, String continente, String sector, String logro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar23(String continente) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar24(String continente, String sector) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar25(String continente, String sector, String logro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar26(String sector) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar27(String sector, String logro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EventoDTO> consultar28(String logro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     
}
