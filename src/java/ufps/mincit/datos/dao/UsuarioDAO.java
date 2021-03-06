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
import ufps.mincit.datos.dto.UsuarioDTO;
import ufps.mincit.datos.interf.IUsuarioDAO;

/**
 *
 * @author user
 */
public class UsuarioDAO implements IUsuarioDAO {

    private Connection conn = null;

    public String iniciarSesion(UsuarioDTO usu) throws Exception {

        conn = ConexionSQL.conectar();
        String resul = "";
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("select all Usuario.* from Usuario where Usuario.cedula LIKE ? AND Usuario.contraseña LIKE ?");
            stmt.setString(1, usu.getCedula());
            stmt.setString(2, usu.getContraseña());
            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                resul = res.getString(1) + "," + res.getString(2) + "," + res.getString(3) + "," + res.getString(4) + "," + res.getString(5);
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
    public UsuarioDTO consultarUsuarioTipo(int tipoUsuario) throws Exception {

        conn = ConexionSQL.conectar();
        UsuarioDTO resul = null;
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM  `Usuario` WHERE  `tipo_usuario` = ?");
            stmt.setInt(1, tipoUsuario);

            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                resul = new UsuarioDTO(res.getString(1), res.getString(2), res.getString(3), Integer.parseInt(res.getString(4)), res.getString(5));
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
    public boolean consultarContraseña(String cedula, String antigua) throws Exception {
        conn = ConexionSQL.conectar();
        boolean resul = false;
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM  `Usuario` WHERE  `cedula` = ? AND `contraseña` = ?");
            stmt.setString(1, cedula);
            stmt.setString(2, antigua);

            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                resul = true;
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
    public boolean cambiarContraseña(String cedula, String tipo_usuario, String nueva) throws Exception {
        conn = ConexionSQL.conectar();
        boolean resul = false;
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("UPDATE  `ufps_7`.`Usuario` SET  `contraseña` = ? WHERE  `Usuario`.`cedula` = ? AND  `Usuario`.`tipo_usuario` = ?;");
            stmt.setString(1, nueva);
            stmt.setString(2, cedula);
            stmt.setInt(3, Integer.parseInt(tipo_usuario));
            int total = stmt.executeUpdate();
            if (total > 0) {
                stmt.close();
                resul = true;
            }
            stmt.close();

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
    public boolean registrarUsuario(UsuarioDTO dto) throws Exception {

        conn = ConexionSQL.conectar();
        boolean exito = false;
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("INSERT INTO Usuario(`nombre` ,`email` ,`cedula`,`tipo_usuario` ,`contraseña`)VALUES (?,?,?,?,?)");
            stmt.setString(1, dto.getNombre());
            stmt.setString(2, dto.getEmail());
            stmt.setString(3, dto.getCedula());
            stmt.setInt(4, 3);
            stmt.setString(5, "123");

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
    public String consultarEmprendedor(String cedula) throws Exception {
        //para las estadisticas
        conn = ConexionSQL.conectar();
        String resul = null;
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM  `Usuario` WHERE  `cedula` = ?");
            stmt.setString(1, cedula);

            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                resul = res.getString(1) + " , " + res.getString(2) + " , " + res.getString(3);
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
    public UsuarioDTO consultarVisitante(String id) throws Exception {

        conn = ConexionSQL.conectar();
        UsuarioDTO resul = null;
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("SELECT * FROM  `Usuario` as usuario INNER JOIN `Evento_visitante` as evento on usuario.cedula= evento.cedula_usuario and evento.id_evento= ?");
            stmt.setString(1, id);

            ResultSet res = stmt.executeQuery();
            while (res.next()) {
                resul = new UsuarioDTO(res.getString(1), res.getString(2), res.getString(3), res.getInt(4), res.getString(5));
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
