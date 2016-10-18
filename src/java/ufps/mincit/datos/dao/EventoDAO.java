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
     
     public boolean registrarEvento(EventoDTO dto) throws Exception{
         System.out.println("DAO, registrar Evento");
        FileInputStream  archivofoto;
        conn = ConexionSQL.conectar();
        boolean exito =false;
        PreparedStatement stmt = null;
        try{
            stmt = conn.prepareStatement("INSERT INTO Evento(`id` ,`nombre` ,`fecha` ,`hora` ,`lugar` ,`patrocinadores` ,`continente` ,`pais` ,`ciudad` ,`participantes` ,`tipo_evento` ,`sector_economico` ,`url` ,`imagen` ,`archivo_foto` ,`logros` ,`descripcion` ,`estado`)VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, null);
            stmt.setString(2, dto.getNombre());
            stmt.setString(3, dto.getFecha());
            stmt.setString(4, dto.getHora());
            stmt.setString(5, dto.getLugar());
            stmt.setString(6, dto.getPatrocinadores());
            stmt.setString(7, dto.getContinente());
            stmt.setString(8, dto.getPais());
            stmt.setString(9, dto.getCiudad());
            stmt.setString(10, dto.getParticipantes());
            stmt.setString(11, dto.getTipo_evento());
            stmt.setString(12, dto.getSector_economico());
            stmt.setString(13, dto.getUrl());
            stmt.setString(14, dto.getImagen());
            archivofoto = new FileInputStream(dto.getImagen());
            stmt.setBinaryStream(15, archivofoto);
            stmt.setString(16, dto.getLogros() );
            stmt.setString(17, dto.getDescripcion() );
            stmt.setString(18, dto.getEstado());
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
     
}
