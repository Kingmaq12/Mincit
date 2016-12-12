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
            stmt = conn.prepareStatement("INSERT INTO Evento(`id` ,`nombre` ,`fecha` ,`hora` ,`lugar`,`ciudad` ,`participantes` ,`tipo_evento`,`url` ,`ruta_imagen` ,`descripcion` ,`estado`)VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, null);
            stmt.setString(2, dto.getNombre());
            stmt.setString(3, dto.getFecha());
            stmt.setString(4, dto.getHora());
            stmt.setString(5, dto.getLugar());
            stmt.setString(6, dto.getCiudad());
            stmt.setString(7, dto.getParticipantes());
            stmt.setString(8, dto.getTipo_evento());
            stmt.setString(9, dto.getUrl());
            stmt.setString(10, dto.getImagen());
            stmt.setString(11, dto.getDescripcion());
            stmt.setInt(12, Integer.parseInt(dto.getEstado()));
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
    public EventoDTO consultarPorId(String id) throws Exception {

        conn = ConexionSQL.conectar();
        EventoDTO resul = null;
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` WHERE  `id` = ?");
            stmt.setInt(1, Integer.parseInt(id));
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                resul = new EventoDTO(res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11), null, null, null);
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
    public boolean actualizarDatos(String id, String nombre, String fecha, String hora, String lugar, String continente, String pais, String ciudad, String participantes, String tipo_evento, String url, String descripcion) throws Exception {
        conn = ConexionSQL.conectar();
        boolean exito = false;
        PreparedStatement stmt = null;
        try {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return exito;
    }

    @Override
    public ArrayList<EventoDTO> consultar1(String fechaI, String fechaF, String entidad, String pais, String ciudad, String continente, String sector, String logro) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento  INNER JOIN `Evento_Entidad` AS Eentidad  INNER JOIN `Entidad adscrita` AS entidadA  INNER JOIN `Evento_logro` AS Elogro\n"
                    + " INNER JOIN `Logro` AS logro  INNER JOIN `Evento_pais` AS Epais  INNER JOIN `countries` AS paises  INNER JOIN `Evento_sector` AS Esector  INNER JOIN `Sector_economico` AS sector ON evento.id = Eentidad.id_evento AND evento.id= Elogro.id_evento AND evento.id= Epais.id_evento AND evento.id = Esector.id_evento AND Eentidad.nit_entidad = entidadA.nit AND Elogro.id_logro = logro.id AND Epais.id_countries = paises.country_id AND Esector.id_sector = sector.id AND entidadA.nit = '" + entidad + "' AND logro.id = '" + logro + "' AND paises.country_id = '" + pais + "' AND sector.id = '" + sector + "'  AND paises.continent_code = '" + continente + "'AND evento.fecha BETWEEN '" + fechaI + "' AND '" + fechaF + "' AND evento.ciudad ='" + ciudad + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //id, nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultar2(String fechaI, String fechaF) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM Evento WHERE fecha BETWEEN '" + fechaI + "' AND '" + fechaF + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar3(String fechaI, String fechaF, String entidad) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento  INNER JOIN `Evento_Entidad` AS Eentidad INNER JOIN `Entidad adscrita` AS entidadA ON evento.fecha BETWEEN '" + fechaI + "' AND '" + fechaF + "' AND Eentidad.id_evento= evento.id AND Eentidad.nit_entidad= entidadA.nit AND entidadA.nit ='" + entidad + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar4(String fechaI, String fechaF, String entidad, String pais) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento  INNER JOIN `Evento_Entidad` AS Eentidad INNER JOIN `Entidad adscrita` AS entidadA INNER JOIN `Evento_pais` AS Epais INNER JOIN `countries` AS paises ON evento.fecha BETWEEN '" + fechaI + "' AND '" + fechaF + "' AND Eentidad.id_evento= evento.id AND Eentidad.nit_entidad= entidadA.nit AND entidadA.nit ='" + entidad + "' AND evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar5(String fechaI, String fechaF, String entidad, String pais, String ciudad) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento  INNER JOIN `Evento_Entidad` AS Eentidad INNER JOIN `Entidad adscrita` AS entidadA INNER JOIN `Evento_pais` AS Epais INNER JOIN `countries` AS paises ON evento.fecha BETWEEN '" + fechaI + "' AND '" + fechaF + "' AND Eentidad.id_evento= evento.id AND Eentidad.nit_entidad= entidadA.nit AND entidadA.nit ='" + entidad + "' AND evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND evento.ciudad ='" + ciudad + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar6(String fechaI, String fechaF, String entidad, String pais, String ciudad, String continente) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento  INNER JOIN `Evento_Entidad` AS Eentidad INNER JOIN `Entidad adscrita` AS entidadA INNER JOIN `Evento_pais` AS Epais INNER JOIN `countries` AS paises ON evento.fecha BETWEEN '" + fechaI + "' AND '" + fechaF + "' AND Eentidad.id_evento= evento.id AND Eentidad.nit_entidad= entidadA.nit AND entidadA.nit ='" + entidad + "' AND evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND evento.ciudad ='" + ciudad + "' AND paises.continent_code = '" + continente + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar7(String fechaI, String fechaF, String entidad, String pais, String ciudad, String continente, String sector) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento  INNER JOIN `Evento_Entidad` AS Eentidad INNER JOIN `Entidad adscrita` AS entidadA INNER JOIN `Evento_pais` AS Epais INNER JOIN `countries` AS paises  INNER JOIN `Evento_sector` AS Esector  INNER JOIN `Sector_economico` AS sector ON evento.fecha BETWEEN '" + fechaI + "' AND '" + fechaF + "' AND Eentidad.id_evento= evento.id AND Eentidad.nit_entidad= entidadA.nit AND entidadA.nit ='" + entidad + "' AND evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND evento.ciudad ='" + ciudad + "' AND paises.continent_code = '" + continente + "' AND evento.id = Esector.id_evento AND Esector.id_sector = sector.id AND sector.id = '" + sector + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultar8(String entidad) throws Exception {
        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
                stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_Entidad` AS Eentidad  INNER JOIN `Entidad adscrita` AS entidadA ON evento.id = Eentidad.id_evento  AND Eentidad.nit_entidad = entidadA.nit AND entidadA.nit = '" + entidad + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();

            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar9(String entidad, String pais) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_Entidad` AS Eentidad  INNER JOIN `Entidad adscrita` AS entidadA INNER JOIN `Evento_pais` AS Epais  INNER JOIN `countries` AS paises ON evento.id = Eentidad.id_evento AND Eentidad.nit_entidad = entidadA.nit AND entidadA.nit = '" + entidad + "' AND evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar10(String entidad, String pais, String ciudad) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_Entidad` AS Eentidad  INNER JOIN `Entidad adscrita` AS entidadA INNER JOIN `Evento_pais` AS Epais  INNER JOIN `countries` AS paises ON evento.id = Eentidad.id_evento AND Eentidad.nit_entidad = entidadA.nit AND entidadA.nit = '" + entidad + "' AND evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND evento.ciudad= '" + ciudad + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultar11(String entidad, String pais, String ciudad, String continente) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_Entidad` AS Eentidad  INNER JOIN `Entidad adscrita` AS entidadA INNER JOIN `Evento_pais` AS Epais  INNER JOIN `countries` AS paises ON evento.id = Eentidad.id_evento AND Eentidad.nit_entidad = entidadA.nit AND entidadA.nit = '" + entidad + "' AND evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND evento.ciudad= '" + ciudad + "' AND paises.continent_code = '" + continente + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar12(String entidad, String pais, String ciudad, String continente, String sector) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_Entidad` AS Eentidad  INNER JOIN `Entidad adscrita` AS entidadA INNER JOIN `Evento_pais` AS Epais  INNER JOIN `countries` AS paises INNER JOIN `Evento_sector` AS Esector  INNER JOIN `Sector_economico` AS sector ON evento.id = Eentidad.id_evento AND Eentidad.nit_entidad = entidadA.nit AND entidadA.nit = '" + entidad + "' AND evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND evento.ciudad= '" + ciudad + "' AND paises.continent_code = '" + continente + "'AND evento.id = Esector.id_evento AND Esector.id_sector = sector.id AND sector.id = '" + sector + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar13(String entidad, String pais, String ciudad, String continente, String sector, String logro) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_Entidad` AS Eentidad  INNER JOIN `Entidad adscrita` AS entidadA INNER JOIN `Evento_pais` AS Epais  INNER JOIN `countries` AS paises INNER JOIN `Evento_sector` AS Esector  INNER JOIN `Sector_economico` AS sector INNER JOIN `Evento_logro` AS Elogro  INNER JOIN `Logro` AS logro ON evento.id = Eentidad.id_evento AND Eentidad.nit_entidad = entidadA.nit AND entidadA.nit = '" + entidad + "' AND evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND evento.ciudad= '" + ciudad + "' AND paises.continent_code = '" + continente + "'AND evento.id = Esector.id_evento AND Esector.id_sector = sector.id AND sector.id = '" + sector + "' AND evento.id= Elogro.id_evento AND Elogro.id_logro = logro.id AND logro.id = '" + logro + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar14(String pais) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_pais` AS Epais   INNER JOIN `countries` AS paises ON  evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultar15(String pais, String ciudad) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_pais` AS Epais   INNER JOIN `countries` AS paises ON  evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND evento.ciudad= '" + ciudad + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultar16(String pais, String ciudad, String continente) throws Exception {
        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_pais` AS Epais   INNER JOIN `countries` AS paises ON  evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND evento.ciudad= '" + ciudad + "' AND paises.continent_code = '" + continente + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultar17(String pais, String ciudad, String continente, String sector) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_pais` AS Epais   INNER JOIN `countries` AS paises  INNER JOIN `Evento_sector` AS Esector INNER JOIN `Sector_economico` AS sector ON  evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND evento.ciudad= '" + ciudad + "' AND paises.continent_code = '" + continente + "' AND evento.id = Esector.id_evento AND Esector.id_sector = sector.id AND sector.id = '" + sector + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultar18(String pais, String ciudad, String continente, String sector, String logro) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_pais` AS Epais   INNER JOIN `countries` AS paises  INNER JOIN `Evento_sector` AS Esector INNER JOIN `Sector_economico` AS sector INNER JOIN `Evento_logro` AS Elogro  INNER JOIN `Logro` AS logro ON  evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND evento.ciudad= '" + ciudad + "' AND paises.continent_code = '" + continente + "' AND evento.id = Esector.id_evento AND Esector.id_sector = sector.id AND sector.id = '" + sector + "' AND evento.id= Elogro.id_evento AND Elogro.id_logro = logro.id AND logro.id = '" + logro + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar19(String ciudad) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` WHERE `ciudad` =" + "'" + ciudad + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultar20(String ciudad, String continente) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_pais` AS Epais   INNER JOIN `countries` AS paises ON Epais. id_countries = paises.country_id AND evento.id= Epais.id_evento AND paises.continent_code = '" + continente + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultar21(String ciudad, String continente, String sector) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_pais` AS Epais   INNER JOIN `countries` AS paises INNER JOIN `Evento_sector` AS Esector INNER JOIN `Sector_economico` AS sector ON  Epais. id_countries = paises.country_id AND evento.id= Epais.id_evento AND paises.continent_code = '" + continente + "' AND evento.id = Esector.id_evento AND Esector.id_sector = sector.id AND sector.id = '" + sector + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar22(String ciudad, String continente, String sector, String logro) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_pais` AS Epais   INNER JOIN `countries` AS paises INNER JOIN `Evento_sector` AS Esector INNER JOIN `Sector_economico` AS sector INNER JOIN `Evento_logro` AS Elogro  INNER JOIN `Logro` AS logro ON Epais. id_countries = paises.country_id AND evento.id= Epais.id_evento AND paises.continent_code = '" + continente + "' AND evento.id = Esector.id_evento AND Esector.id_sector = sector.id AND sector.id = '" + sector + "' AND evento.id= Elogro.id_evento AND Elogro.id_logro = logro.id AND logro.id = '" + logro + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar23(String continente) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento  INNER JOIN `Evento_pais` AS Epais   INNER JOIN `countries` AS paises ON  evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.continent_code = '" + continente + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar24(String continente, String sector) throws Exception {
        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento  INNER JOIN `Evento_pais` AS Epais   INNER JOIN `countries` AS paises INNER JOIN `Evento_sector` AS Esector INNER JOIN `Sector_economico` AS sector ON  evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.continent_code = '" + continente + "' AND evento.id = Esector.id_evento AND Esector.id_sector = sector.id AND sector.id = '" + sector + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultar25(String continente, String sector, String logro) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento  INNER JOIN `Evento_pais` AS Epais   INNER JOIN `countries` AS paises INNER JOIN `Evento_sector` AS Esector INNER JOIN `Sector_economico` AS sector INNER JOIN `Evento_logro` AS Elogro  INNER JOIN `Logro` AS logro ON  evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.continent_code = '" + continente + "' AND evento.id = Esector.id_evento AND Esector.id_sector = sector.id AND sector.id = '" + sector + "' AND evento.id= Elogro.id_evento AND Elogro.id_logro = logro.id AND logro.id = '" + logro + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar26(String sector) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_sector` AS Esector INNER JOIN `Sector_economico` AS sector ON evento.id = Esector.id_evento Esector.id_sector = sector.id AND sector.id = '" + sector + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar27(String sector, String logro) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_sector` AS Esector INNER JOIN `Sector_economico` AS sector INNER JOIN `Evento_logro` AS Elogro  INNER JOIN `Logro` AS logro ON evento.id = Esector.id_evento Esector.id_sector = sector.id AND sector.id = '" + sector + "' AND evento.id= Elogro.id_evento AND Elogro.id_logro = logro.id AND logro.id = '" + logro + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultar28(String logro) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x INNER JOIN `Evento_logro` AS e INNER JOIN `Logro` AS a ON x.id = e.id_evento AND e.id_logro = a.id AND a.id =" + "'" + logro + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultar29(String pais, String continente) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento   INNER JOIN `Evento_pais` AS Epais   INNER JOIN `countries` AS paises ON evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND paises.continent_code = '" + continente + "' AND evento.estado like 1 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultar11(String fechaI, String fechaF, String entidad, String pais, String ciudad, String continente, String sector, String logro) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento  INNER JOIN `Evento_Entidad` AS Eentidad  INNER JOIN `Entidad adscrita` AS entidadA  INNER JOIN `Evento_logro` AS Elogro\n"
                    + " INNER JOIN `Logro` AS logro  INNER JOIN `Evento_pais` AS Epais  INNER JOIN `countries` AS paises  INNER JOIN `Evento_sector` AS Esector  INNER JOIN `Sector_economico` AS sector ON evento.id = Eentidad.id_evento AND evento.id= Elogro.id_evento AND evento.id= Epais.id_evento AND evento.id = Esector.id_evento AND Eentidad.nit_entidad = entidadA.nit AND Elogro.id_logro = logro.id AND Epais.id_countries = paises.country_id AND Esector.id_sector = sector.id AND entidadA.nit = '" + entidad + "' AND logro.id = '" + logro + "' AND paises.country_id = '" + pais + "' AND sector.id = '" + sector + "'  AND paises.continent_code = '" + continente + "'AND evento.fecha BETWEEN '" + fechaI + "' AND '" + fechaF + "' AND evento.ciudad ='" + ciudad + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //id, nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultar22(String fechaI, String fechaF) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM Evento WHERE fecha BETWEEN '" + fechaI + "' AND '" + fechaF + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar33(String fechaI, String fechaF, String entidad) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento  INNER JOIN `Evento_Entidad` AS Eentidad INNER JOIN `Entidad adscrita` AS entidadA ON evento.fecha BETWEEN '" + fechaI + "' AND '" + fechaF + "' AND Eentidad.id_evento= evento.id AND Eentidad.nit_entidad= entidadA.nit AND entidadA.nit ='" + entidad + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar44(String fechaI, String fechaF, String entidad, String pais) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento  INNER JOIN `Evento_Entidad` AS Eentidad INNER JOIN `Entidad adscrita` AS entidadA INNER JOIN `Evento_pais` AS Epais INNER JOIN `countries` AS paises ON evento.fecha BETWEEN '" + fechaI + "' AND '" + fechaF + "' AND Eentidad.id_evento= evento.id AND Eentidad.nit_entidad= entidadA.nit AND entidadA.nit ='" + entidad + "' AND evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar55(String fechaI, String fechaF, String entidad, String pais, String ciudad) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento  INNER JOIN `Evento_Entidad` AS Eentidad INNER JOIN `Entidad adscrita` AS entidadA INNER JOIN `Evento_pais` AS Epais INNER JOIN `countries` AS paises ON evento.fecha BETWEEN '" + fechaI + "' AND '" + fechaF + "' AND Eentidad.id_evento= evento.id AND Eentidad.nit_entidad= entidadA.nit AND entidadA.nit ='" + entidad + "' AND evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND evento.ciudad ='" + ciudad + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar66(String fechaI, String fechaF, String entidad, String pais, String ciudad, String continente) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento  INNER JOIN `Evento_Entidad` AS Eentidad INNER JOIN `Entidad adscrita` AS entidadA INNER JOIN `Evento_pais` AS Epais INNER JOIN `countries` AS paises ON evento.fecha BETWEEN '" + fechaI + "' AND '" + fechaF + "' AND Eentidad.id_evento= evento.id AND Eentidad.nit_entidad= entidadA.nit AND entidadA.nit ='" + entidad + "' AND evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND evento.ciudad ='" + ciudad + "' AND paises.continent_code = '" + continente + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar77(String fechaI, String fechaF, String entidad, String pais, String ciudad, String continente, String sector) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento  INNER JOIN `Evento_Entidad` AS Eentidad INNER JOIN `Entidad adscrita` AS entidadA INNER JOIN `Evento_pais` AS Epais INNER JOIN `countries` AS paises  INNER JOIN `Evento_sector` AS Esector  INNER JOIN `Sector_economico` AS sector ON evento.fecha BETWEEN '" + fechaI + "' AND '" + fechaF + "' AND Eentidad.id_evento= evento.id AND Eentidad.nit_entidad= entidadA.nit AND entidadA.nit ='" + entidad + "' AND evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND evento.ciudad ='" + ciudad + "' AND paises.continent_code = '" + continente + "' AND evento.id = Esector.id_evento AND Esector.id_sector = sector.id AND sector.id = '" + sector + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultar88(String entidad) throws Exception {
        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_Entidad` AS Eentidad  INNER JOIN `Entidad adscrita` AS entidadA ON evento.id = Eentidad.id_evento  AND Eentidad.nit_entidad = entidadA.nit AND entidadA.nit = '" + entidad + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();

            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar99(String entidad, String pais) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_Entidad` AS Eentidad  INNER JOIN `Entidad adscrita` AS entidadA INNER JOIN `Evento_pais` AS Epais  INNER JOIN `countries` AS paises ON evento.id = Eentidad.id_evento AND Eentidad.nit_entidad = entidadA.nit AND entidadA.nit = '" + entidad + "' AND evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar100(String entidad, String pais, String ciudad) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_Entidad` AS Eentidad  INNER JOIN `Entidad adscrita` AS entidadA INNER JOIN `Evento_pais` AS Epais  INNER JOIN `countries` AS paises ON evento.id = Eentidad.id_evento AND Eentidad.nit_entidad = entidadA.nit AND entidadA.nit = '" + entidad + "' AND evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND evento.ciudad= '" + ciudad + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultar111(String entidad, String pais, String ciudad, String continente) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_Entidad` AS Eentidad  INNER JOIN `Entidad adscrita` AS entidadA INNER JOIN `Evento_pais` AS Epais  INNER JOIN `countries` AS paises ON evento.id = Eentidad.id_evento AND Eentidad.nit_entidad = entidadA.nit AND entidadA.nit = '" + entidad + "' AND evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND evento.ciudad= '" + ciudad + "' AND paises.continent_code = '" + continente + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar122(String entidad, String pais, String ciudad, String continente, String sector) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_Entidad` AS Eentidad  INNER JOIN `Entidad adscrita` AS entidadA INNER JOIN `Evento_pais` AS Epais  INNER JOIN `countries` AS paises INNER JOIN `Evento_sector` AS Esector  INNER JOIN `Sector_economico` AS sector ON evento.id = Eentidad.id_evento AND Eentidad.nit_entidad = entidadA.nit AND entidadA.nit = '" + entidad + "' AND evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND evento.ciudad= '" + ciudad + "' AND paises.continent_code = '" + continente + "'AND evento.id = Esector.id_evento AND Esector.id_sector = sector.id AND sector.id = '" + sector + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar133(String entidad, String pais, String ciudad, String continente, String sector, String logro) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_Entidad` AS Eentidad  INNER JOIN `Entidad adscrita` AS entidadA INNER JOIN `Evento_pais` AS Epais  INNER JOIN `countries` AS paises INNER JOIN `Evento_sector` AS Esector  INNER JOIN `Sector_economico` AS sector INNER JOIN `Evento_logro` AS Elogro  INNER JOIN `Logro` AS logro ON evento.id = Eentidad.id_evento AND Eentidad.nit_entidad = entidadA.nit AND entidadA.nit = '" + entidad + "' AND evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND evento.ciudad= '" + ciudad + "' AND paises.continent_code = '" + continente + "'AND evento.id = Esector.id_evento AND Esector.id_sector = sector.id AND sector.id = '" + sector + "' AND evento.id= Elogro.id_evento AND Elogro.id_logro = logro.id AND logro.id = '" + logro + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar144(String pais) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_pais` AS Epais   INNER JOIN `countries` AS paises ON  evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultar155(String pais, String ciudad) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_pais` AS Epais   INNER JOIN `countries` AS paises ON  evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND evento.ciudad= '" + ciudad + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultar166(String pais, String ciudad, String continente) throws Exception {
        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_pais` AS Epais   INNER JOIN `countries` AS paises ON  evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND evento.ciudad= '" + ciudad + "' AND paises.continent_code = '" + continente + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultar177(String pais, String ciudad, String continente, String sector) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_pais` AS Epais   INNER JOIN `countries` AS paises  INNER JOIN `Evento_sector` AS Esector INNER JOIN `Sector_economico` AS sector ON  evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND evento.ciudad= '" + ciudad + "' AND paises.continent_code = '" + continente + "' AND evento.id = Esector.id_evento AND Esector.id_sector = sector.id AND sector.id = '" + sector + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultar188(String pais, String ciudad, String continente, String sector, String logro) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_pais` AS Epais   INNER JOIN `countries` AS paises  INNER JOIN `Evento_sector` AS Esector INNER JOIN `Sector_economico` AS sector INNER JOIN `Evento_logro` AS Elogro  INNER JOIN `Logro` AS logro ON  evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND evento.ciudad= '" + ciudad + "' AND paises.continent_code = '" + continente + "' AND evento.id = Esector.id_evento AND Esector.id_sector = sector.id AND sector.id = '" + sector + "' AND evento.id= Elogro.id_evento AND Elogro.id_logro = logro.id AND logro.id = '" + logro + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar199(String ciudad) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` WHERE `ciudad` =" + "'" + ciudad + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultar200(String ciudad, String continente) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_pais` AS Epais   INNER JOIN `countries` AS paises ON Epais. id_countries = paises.country_id AND evento.id= Epais.id_evento AND paises.continent_code = '" + continente + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultar211(String ciudad, String continente, String sector) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_pais` AS Epais   INNER JOIN `countries` AS paises INNER JOIN `Evento_sector` AS Esector INNER JOIN `Sector_economico` AS sector ON  Epais. id_countries = paises.country_id AND evento.id= Epais.id_evento AND paises.continent_code = '" + continente + "' AND evento.id = Esector.id_evento AND Esector.id_sector = sector.id AND sector.id = '" + sector + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar222(String ciudad, String continente, String sector, String logro) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_pais` AS Epais   INNER JOIN `countries` AS paises INNER JOIN `Evento_sector` AS Esector INNER JOIN `Sector_economico` AS sector INNER JOIN `Evento_logro` AS Elogro  INNER JOIN `Logro` AS logro ON Epais. id_countries = paises.country_id AND evento.id= Epais.id_evento AND paises.continent_code = '" + continente + "' AND evento.id = Esector.id_evento AND Esector.id_sector = sector.id AND sector.id = '" + sector + "' AND evento.id= Elogro.id_evento AND Elogro.id_logro = logro.id AND logro.id = '" + logro + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar233(String continente) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento  INNER JOIN `Evento_pais` AS Epais   INNER JOIN `countries` AS paises ON  evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.continent_code = '" + continente + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar244(String continente, String sector) throws Exception {
        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento  INNER JOIN `Evento_pais` AS Epais   INNER JOIN `countries` AS paises INNER JOIN `Evento_sector` AS Esector INNER JOIN `Sector_economico` AS sector ON  evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.continent_code = '" + continente + "' AND evento.id = Esector.id_evento AND Esector.id_sector = sector.id AND sector.id = '" + sector + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultar255(String continente, String sector, String logro) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento  INNER JOIN `Evento_pais` AS Epais   INNER JOIN `countries` AS paises INNER JOIN `Evento_sector` AS Esector INNER JOIN `Sector_economico` AS sector INNER JOIN `Evento_logro` AS Elogro  INNER JOIN `Logro` AS logro ON  evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.continent_code = '" + continente + "' AND evento.id = Esector.id_evento AND Esector.id_sector = sector.id AND sector.id = '" + sector + "' AND evento.id= Elogro.id_evento AND Elogro.id_logro = logro.id AND logro.id = '" + logro + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar266(String sector) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_sector` AS Esector INNER JOIN `Sector_economico` AS sector ON evento.id = Esector.id_evento Esector.id_sector = sector.id AND sector.id = '" + sector + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public ArrayList<EventoDTO> consultar277(String sector, String logro) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento INNER JOIN `Evento_sector` AS Esector INNER JOIN `Sector_economico` AS sector INNER JOIN `Evento_logro` AS Elogro  INNER JOIN `Logro` AS logro ON evento.id = Esector.id_evento Esector.id_sector = sector.id AND sector.id = '" + sector + "' AND evento.id= Elogro.id_evento AND Elogro.id_logro = logro.id AND logro.id = '" + logro + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultar288(String logro) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS x INNER JOIN `Evento_logro` AS e INNER JOIN `Logro` AS a ON x.id = e.id_evento AND e.id_logro = a.id AND a.id =" + "'" + logro + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultar299(String pais, String continente) throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` AS evento   INNER JOIN `Evento_pais` AS Epais   INNER JOIN `countries` AS paises ON evento.id= Epais.id_evento AND Epais.id_countries = paises.country_id AND paises.country_id = '" + pais + "' AND paises.continent_code = '" + continente + "' AND NOT evento.estado like 3 AND NOT evento.estado like 2 ORDER BY evento.fecha DESC");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    }

    @Override
    public ArrayList<EventoDTO> consultarEventoVisitante() throws Exception {

        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM `Evento` where estado like 2");
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;

    }

    @Override
    public boolean rechazarEvento(String id) throws Exception {

        conn = ConexionSQL.conectar();
        boolean exito = false;
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("UPDATE `Evento` SET `estado`= 3 WHERE id like ?");
            stmt.setString(1, id);
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
    public boolean publicarEventosVisitante(String id) throws Exception {

        conn = ConexionSQL.conectar();
        boolean exito = false;
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("UPDATE `Evento` SET `estado`= 1 WHERE id like ?");
            stmt.setString(1, id);
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
    public ArrayList<EventoDTO> consultarCarrusel() throws Exception {
        
        conn = ConexionSQL.conectar();
        ArrayList<EventoDTO> resul = new ArrayList<>();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM Evento ORDER BY id DESC LIMIT 4");
                       ResultSet res = stmt.executeQuery();
            while (res.next()) {
                //columnas que se va a mostrar
                //nombre, Fecha, Hora, ciudad, URL
                EventoDTO e = new EventoDTO(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10), res.getString(11));
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
        if (resul.isEmpty()) {
            System.out.println("entro aqui, no hay eventos");
            resul = null;
        }
        return resul;
    
    }
}
