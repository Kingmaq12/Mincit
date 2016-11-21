/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.datos.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import static javax.print.attribute.Size2DSyntax.MM;
import ufps.mincit.datos.conexion.ConexionSQL;
import ufps.mincit.datos.dto.EventoDTO;
import ufps.mincit.datos.interf.IEventoDAO;

/**
 *
 * @author user
 */
public class EventoDAO implements IEventoDAO {

    private Connection conn = null;

    @Override
    public boolean registrarEvento(EventoDTO dto) throws Exception {

        conn = ConexionSQL.conectar();
        boolean exito = false;
        PreparedStatement stmt = null;

        try {
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
            stmt.setString(13, dto.getDescripcion());
            stmt.setInt(14, Integer.parseInt(dto.getEstado()));
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
    public int consultarId() throws Exception {

        conn = ConexionSQL.conectar();
        int resul = 0;
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT MAX( id ) AS id FROM Evento");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                resul = Integer.parseInt(res.getString(1));
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
    public ArrayList<EventoDTO> consultar1(String fecha, String entidad, String pais, String ciudad, String continente, String sector, String logro) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x INNER JOIN `Evento_Entidad` AS e INNER JOIN `Entidad_adscrita` AS a  INNER JOIN `Evento_logro` AS ee INNER JOIN `Logro` AS aa INNER JOIN `Evento_pais` AS eee INNER JOIN `paises` AS aaa INNER JOIN `Evento_sector` AS eeee INNER JOIN `Sector_Economico` AS aaaa ON x.id = e.id_evento AND x.id=ee.id_evento AND x.id=eee.id_evento AND x.id=eeee.id_evento AND e.nit=a.nit_entidad AND ee.id_logro=aa.id AND eee.id_pais=aaa.id AND eeee.id_sector=aaaa.id AND a.id=" + "'" + entidad + "'" + " AND aa.id=" + "'" + logro + "'" + " AND aaa.id=" + "'" + pais + "'" + " AND aaaa.id=" + "'" + sector + "'" + " AND x.fecha=" + "'" + fecha + "'" + "AND x.ciudad=" + "'" + ciudad + "'" + " AND x.continente=" + "'" + continente + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar2(String fecha) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT *FROM `Evento`WHERE `fecha` = '" + fecha + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar3(String fecha, String entidad) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x INNER JOIN `Evento_Entidad` AS e INNER JOIN `Entidad adscrita` AS a ON x.fecha =" + "'" + fecha + "'" + " AND x.id = e.id_evento AND e.nit_entidad = a.nit AND a.id =" + "'" + entidad + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar4(String fecha, String entidad, String pais) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x INNER JOIN `Evento_Entidad` AS e INNER JOIN `Entidad adscrita` AS a INNER JOIN `paises` as p INNER JOIN `Evento_pais` as pp ON x.fecha =" + "'" + fecha + "'" + " AND x.id = e.id_evento AND e.nit_entidad = a.nit AND a.id =" + "'" + entidad + "'" + "AND x.id=pp.id_evento AND p.id=" + "'" + pais + "' AND p.id = pp.id_pais");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar5(String fecha, String entidad, String pais, String ciudad) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x INNER JOIN `Evento_Entidad` AS e INNER JOIN `Entidad adscrita` AS a INNER JOIN `paises` as p INNER JOIN `Evento_pais` as pp ON x.fecha =" + "'" + fecha + "'" + " AND x.id = e.id_evento AND e.nit_entidad = a.nit AND a.id =" + "'" + entidad + "'" + "AND x.id=pp.id_evento AND p.id=" + "'" + pais + "' AND p.id = pp.id_pais AND x.ciudad='" + ciudad + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar6(String fecha, String entidad, String pais, String ciudad, String continente) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x INNER JOIN `Evento_Entidad` AS e INNER JOIN `Entidad adscrita` AS a INNER JOIN `paises` as p INNER JOIN `Evento_pais` as pp ON x.fecha =" + "'" + fecha + "'" + " AND x.id = e.id_evento AND e.nit_entidad = a.nit AND a.id =" + "'" + entidad + "'" + "AND x.id=pp.id_evento AND p.id=" + "'" + pais + "' AND p.id = pp.id_pais AND x.ciudad='" + ciudad + "' AND x.continente='" + continente + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar7(String fecha, String entidad, String pais, String ciudad, String continente, String sector) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x INNER JOIN `Evento_Entidad` AS e INNER JOIN `Entidad_adscrita` AS a   INNER JOIN `Evento_pais` AS eee INNER JOIN `paises` AS aaa INNER JOIN `Evento_sector` AS eeee INNER JOIN `Sector_Economico` AS aaaa ON x.id = e.id_evento AND x.id=ee.id_evento AND x.id=eee.id_evento AND x.id=eeee.id_evento AND e.nit=a.nit_entidad AND eee.id_pais=aaa.id AND eeee.id_sector=aaaa.id AND a.id=" + "'" + entidad + "'" + " AND aaa.id=" + "'" + pais + "'" + " AND aaaa.id=" + "'" + sector + "'" + " AND x.fecha=" + "'" + fecha + "'" + "AND x.ciudad=" + "'" + ciudad + "'" + " AND x.continente=" + "'" + continente + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar8(String entidad) throws Exception {
        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x INNER JOIN `Evento_Entidad` AS e INNER JOIN `Entidad adscrita` AS a ON x.id = e.id_evento AND e.nit_entidad = a.nit AND a.id =" + "'" + entidad + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar9(String entidad, String pais) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x INNER JOIN `Evento_Entidad` AS e INNER JOIN `Entidad adscrita` AS a INNER JOIN `paises` as p INNER JOIN `Evento_pais` as pp ON  x.id = e.id_evento AND e.nit_entidad = a.nit AND a.id =" + "'" + entidad + "'" + "AND x.id=pp.id_evento AND p.id=" + "'" + pais + "' AND p.id = pp.id_pais");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar10(String entidad, String pais, String ciudad) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x INNER JOIN `Evento_Entidad` AS e INNER JOIN `Entidad adscrita` AS a INNER JOIN `paises` as p INNER JOIN `Evento_pais` as pp ON  x.id = e.id_evento AND e.nit_entidad = a.nit AND a.id =" + "'" + entidad + "'" + "AND x.id=pp.id_evento AND p.id=" + "'" + pais + "' AND p.id = pp.id_pais AND x.ciudad='" + ciudad + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar11(String entidad, String pais, String ciudad, String continente) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x INNER JOIN `Evento_Entidad` AS e INNER JOIN `Entidad adscrita` AS a INNER JOIN `paises` as p INNER JOIN `Evento_pais` as pp ON x.id = e.id_evento AND e.nit_entidad = a.nit AND a.id =" + "'" + entidad + "'" + "AND x.id=pp.id_evento AND p.id=" + "'" + pais + "' AND p.id = pp.id_pais AND x.ciudad='" + ciudad + "' AND x.continente='" + continente + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar12(String entidad, String pais, String ciudad, String continente, String sector) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x INNER JOIN `Evento_Entidad` AS e INNER JOIN `Entidad_adscrita` AS a   INNER JOIN `Evento_pais` AS eee INNER JOIN `paises` AS aaa INNER JOIN `Evento_sector` AS eeee INNER JOIN `Sector_Economico` AS aaaa ON x.id = e.id_evento AND x.id=ee.id_evento AND x.id=eee.id_evento AND x.id=eeee.id_evento AND e.nit=a.nit_entidad AND eee.id_pais=aaa.id AND eeee.id_sector=aaaa.id AND a.id=" + "'" + entidad + "'" + " AND aaa.id=" + "'" + pais + "'" + " AND aaaa.id=" + "'" + sector + "'AND x.ciudad=" + "'" + ciudad + "'" + " AND x.continente=" + "'" + continente + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar13(String entidad, String pais, String ciudad, String continente, String sector, String logro) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x INNER JOIN `Evento_Entidad` AS e INNER JOIN `Entidad_adscrita` AS a  INNER JOIN `Evento_logro` AS ee INNER JOIN `Logro` AS aa INNER JOIN `Evento_pais` AS eee INNER JOIN `paises` AS aaa INNER JOIN `Evento_sector` AS eeee INNER JOIN `Sector_Economico` AS aaaa ON x.id = e.id_evento AND x.id=ee.id_evento AND x.id=eee.id_evento AND x.id=eeee.id_evento AND e.nit=a.nit_entidad AND ee.id_logro=aa.id AND eee.id_pais=aaa.id AND eeee.id_sector=aaaa.id AND a.id=" + "'" + entidad + "'" + " AND aa.id=" + "'" + logro + "'" + " AND aaa.id=" + "'" + pais + "'" + " AND aaaa.id=" + "'" + sector + "'" + " AND x.ciudad=" + "'" + ciudad + "'" + " AND x.continente=" + "'" + continente + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar14(String pais) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x INNER JOIN `Evento_pais` AS e INNER JOIN `paises` AS a ON x.id = e.id_evento AND e.id_pais = a.id AND a.id =" + "'" + pais + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar15(String pais, String ciudad) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x  INNER JOIN `paises` as p INNER JOIN `Evento_pais` as pp ON  x.id = e.id_evento AND x.id=pp.id_evento AND p.id=" + "'" + pais + "' AND p.id = pp.id_pais AND x.ciudad='" + ciudad + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar16(String pais, String ciudad, String continente) throws Exception {
        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x  INNER JOIN `paises` as p INNER JOIN `Evento_pais` as pp ON  x.id = e.id_evento AND x.id=pp.id_evento AND p.id=" + "'" + pais + "' AND p.id = pp.id_pais AND x.ciudad='" + ciudad + "'AND x.continente='" + continente + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar17(String pais, String ciudad, String continente, String sector) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x INNER JOIN `Evento_pais` AS eee INNER JOIN `paises` AS aaa INNER JOIN `Evento_sector` AS eeee INNER JOIN `Sector_Economico` AS aaaa ON  x.id=eee.id_evento AND x.id=eeee.id_evento AND  eee.id_pais=aaa.id AND eeee.id_sector=aaaa.id  AND aaa.id=" + "'" + pais + "'" + " AND aaaa.id=" + "'" + sector + "'" + "'" + "AND x.ciudad=" + "'" + ciudad + "'" + " AND x.continente=" + "'" + continente + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar18(String pais, String ciudad, String continente, String sector, String logro) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x INNER JOIN `Evento_logro` AS ee INNER JOIN `Logro` AS aa INNER JOIN `Evento_pais` AS eee INNER JOIN `paises` AS aaa INNER JOIN `Evento_sector` AS eeee INNER JOIN `Sector_Economico` AS aaaa ON x.id=ee.id_evento AND x.id=eee.id_evento AND x.id=eeee.id_evento  AND ee.id_logro=aa.id AND eee.id_pais=aaa.id AND eeee.id_sector=aaaa.id  AND aa.id=" + "'" + logro + "'" + " AND aaa.id=" + "'" + pais + "'" + " AND aaaa.id=" + "'" + sector + "'" + "AND x.ciudad=" + "'" + ciudad + "'" + " AND x.continente=" + "'" + continente + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar19(String ciudad) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` WHERE `ciudad` =" + "'" + ciudad + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar20(String ciudad, String continente) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x ON x.ciudad='" + ciudad + "'AND x.continente='" + continente + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar21(String ciudad, String continente, String sector) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x INNER JOIN `Evento_sector` AS eeee INNER JOIN `Sector_Economico` AS aaaa ON   eeee.id_sector=aaaa.id  AND  aaaa.id=" + "'" + sector + "'" + "'" + "AND x.ciudad=" + "'" + ciudad + "'" + " AND x.continente=" + "'" + continente + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar22(String ciudad, String continente, String sector, String logro) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x INNER JOIN `Evento_logro` AS ee INNER JOIN `Logro` AS aa INNER JOIN `Evento_sector` AS eeee INNER JOIN `Sector_Economico` AS aaaa ON x.id=ee.id_evento AND x.id=eee.id_evento AND x.id=eeee.id_evento  AND ee.id_logro=aa.id AND eeee.id_sector=aaaa.id  AND aa.id=" + "'" + logro + "'" + " AND aaaa.id=" + "'" + sector + "'" + "AND x.ciudad=" + "'" + ciudad + "'" + " AND x.continente=" + "'" + continente + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar23(String continente) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` WHERE `continente` =" + "'" + continente + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar24(String continente, String sector) throws Exception {
        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x INNER JOIN `Evento_sector` AS eeee INNER JOIN `Sector_Economico` AS aaaa ON   eeee.id_sector=aaaa.id  AND  aaaa.id=" + "'" + sector + "'" + "'" + " AND x.continente=" + "'" + continente + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar25(String continente, String sector, String logro) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x INNER JOIN `Evento_logro` AS ee INNER JOIN `Logro` AS aa INNER JOIN `Evento_sector` AS eeee INNER JOIN `Sector_Economico` AS aaaa ON x.id=ee.id_evento AND x.id=eee.id_evento AND x.id=eeee.id_evento  AND ee.id_logro=aa.id AND eeee.id_sector=aaaa.id  AND aa.id=" + "'" + logro + "'" + " AND aaaa.id=" + "'" + sector + "'" + " AND x.continente=" + "'" + continente + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar26(String sector) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x INNER JOIN `Evento_sector` AS e INNER JOIN `Sector_economico` AS a ON x.id = e.id_evento AND e.id_sector = a.id AND a.id =" + "'" + sector + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar27(String sector, String logro) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x INNER JOIN `Evento_logro` AS ee INNER JOIN `Logro` AS aa INNER JOIN `Evento_sector` AS eeee INNER JOIN `Sector_Economico` AS aaaa ON x.id=ee.id_evento AND x.id=eee.id_evento AND x.id=eeee.id_evento  AND ee.id_logro=aa.id AND eeee.id_sector=aaaa.id  AND aa.id=" + "'" + logro + "'" + " AND aaaa.id=" + "'" + sector + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public ArrayList<EventoDTO> consultar28(String logro) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x INNER JOIN `Evento_logro` AS e INNER JOIN `Logro` AS a ON x.id = e.id_evento AND e.id_logro = a.id AND a.id =" + "'" + logro + "'");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1),res.getString(2), res.getString(5), res.getString(3), res.getString(4), res.getString(8));
                resul.add(e);
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
    public EventoDTO consultarPorId(String id) throws Exception {

        conn = ConexionSQL.conectar();
        EventoDTO resul = null;
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` WHERE  `id` = ?");
            stmt.setInt(1, Integer.parseInt(id));
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                resul=new EventoDTO(res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11), res.getString(12), res.getString(13),null,null,null);
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
    public boolean actualizarDatos(String id,String nombre, String fecha, String hora, String lugar, String continente, String pais, String ciudad, String participantes, String tipo_evento,String url,String descripcion) throws Exception{
        conn = ConexionSQL.conectar();
        boolean exito =false;
        PreparedStatement stmt = null;
        try{
              stmt = conn.prepareStatement("UPDATE  `Evento` SET  `nombre` =  ?,`fecha` = ?,`hora` = ?,`lugar` = ?,`continente` = ?,`pais` = ?,`ciudad` = ?,`participantes` = ?,`tipo_evento` = ?,`url` = ?,`descripcion` = ?  WHERE `id` = ?");
            stmt.setString(1, nombre);
            stmt.setString(2, fecha);
            stmt.setString(3, hora);
            stmt.setString(4, lugar);
            stmt.setString(5, continente);
            stmt.setString(6, pais);
            stmt.setString(7, ciudad);
            stmt.setString(8, participantes);
            stmt.setString(9, tipo_evento);
            stmt.setString(10, url);
            stmt.setString(11, descripcion);
            stmt.setString(12, id);
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
