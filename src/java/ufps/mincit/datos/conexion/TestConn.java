/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.datos.conexion;
import java.sql.*;
/**
 *
 * @author Mauricio
 */
public class TestConn {
    public static void main(String[] args) throws Exception{
        ConexionSQL.conectar();
        if(ConexionSQL.hayConexion()){
            System.out.println("Conexión exitosa!");
        }else{
            System.out.println("rip");
        }
    }
}
