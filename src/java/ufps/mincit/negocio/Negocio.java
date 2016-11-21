/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.negocio;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import ufps.mincit.datos.dao.Entidad_adscritaDAO;
import ufps.mincit.datos.dao.LogroDAO;
import ufps.mincit.datos.dao.PaisesDAO;
import ufps.mincit.datos.dao.Sector_economicoDAO;
import ufps.mincit.datos.dao.UsuarioDAO;
import ufps.mincit.datos.dto.EventoDTO;
import ufps.mincit.datos.dto.Usuario;
import ufps.mincit.negocio.administrador.Administrador;
import ufps.mincit.negocio.visitante.Visitante;
import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.Arrays;

import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import ufps.mincit.datos.dao.ComentarioDAO;

/**
 *
 * @author CESAR
 */
public class Negocio {

    private Administrador admin;
    private Visitante visi;

    public Negocio() {
        admin = new Administrador();
        visi = new Visitante();
    }

    public String iniciarSesion(String cedula, String contraseña) throws Exception {

        return admin.iniciarSesion(cedula, contraseña);

    }

    public boolean recibirMensaje(String nombre_empresa, String email, String asunto, String mensaje) throws Exception {
        return true;
    }

    public ArrayList<String> mostrarPaises(String continente) throws Exception {

        PaisesDAO dao = new PaisesDAO();

        return dao.mostrarPaises(continente);
    }

    public ArrayList<String> mostrarEntidades() throws Exception {

        Entidad_adscritaDAO dao = new Entidad_adscritaDAO();

        return dao.mostrarEntidades();

    }

    public ArrayList<String> mostrarSectores() throws Exception {

        Sector_economicoDAO dao = new Sector_economicoDAO();

        return dao.mostrarSectores();

    }

    public ArrayList<String> mostrarLogros() throws Exception {

        LogroDAO dao = new LogroDAO();

        return dao.mostrarLogros();

    }

    public ArrayList<EventoDTO> consultarEventos(String fecha, String entidad, String pais, String ciudad, String continente, String sector, String logro) throws Exception {
        System.out.println("consultar 1 --------------"+fecha + "-" + entidad + "-" + pais + "-" + ciudad + "-" + continente + "-" + sector + "-" + logro);
        return this.admin.consultarEventos(fecha, entidad, pais, ciudad, continente, sector, logro);
    }

    public ArrayList<EventoDTO> consultarEventos2(String fecha, String entidad, String pais, String ciudad, String continente, String sector, String logro) throws Exception {
        System.out.println("consultar 2 --------------"+fecha + "-" + entidad + "-" + pais + "-" + ciudad + "-" + continente + "-" + sector + "-" + logro);
        return this.visi.consultarEventos(fecha, entidad, pais, ciudad, continente, sector, logro);
   }
    public String registrarEvento(String nombre, String fecha, String hora, String lugar, String entidad_adscrita, String continente, String pais, String ciudad, String participantes, String tipo_evento, String sector_economico, String url, String imagen, String logros, String descripcion) throws Exception {

        return this.admin.registrarEvento(nombre, fecha, hora, lugar, entidad_adscrita, continente, pais, ciudad, participantes, tipo_evento, sector_economico, url, imagen, logros, descripcion);

    }
    
    public ArrayList<String> mostrarPaisesC() throws Exception {
        PaisesDAO dao = new PaisesDAO();
        return dao.mostrarPaisesC();
    }

    public Usuario consultarUsuarioTipo(int tipoUsuario) throws Exception {

        UsuarioDAO dao = new UsuarioDAO();

        return dao.consultarUsuarioTipo(tipoUsuario);

    }

    public boolean consultarContraseña(String cedula, String antigua) throws Exception {

        UsuarioDAO dao = new UsuarioDAO();

        return dao.consultarContraseña(cedula, antigua);

    }

    public boolean cambiarContraseña(String cedula, String tipo_usuario, String nueva) throws Exception {

        UsuarioDAO dao = new UsuarioDAO();

        return dao.cambiarContraseña(cedula, tipo_usuario, nueva);

    }

    public String registrarEventoExcel(File archivo) throws FileNotFoundException, IOException, Exception {

        FileInputStream file = new FileInputStream(new File(archivo.getAbsolutePath()));

        XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFSheet sheet = workbook.getSheetAt(0);

        Iterator<Row> rowIterator = sheet.iterator();

        Row row;

        ArrayList<String> evento = new ArrayList<>();
        int i = 0;
        while (rowIterator.hasNext()) {

            row = rowIterator.next();

            Iterator<Cell> cellIterator = row.cellIterator();

            Cell celda;

            while (cellIterator.hasNext()) {

                celda = cellIterator.next();
                //System.out.println(celda.getStringCellValue());
                evento.add(celda.getStringCellValue());
                i++;

            }

        }
        String res = this.registrarEventos(evento);
        file.close();
        workbook.close();

        return res;
    }

    public String registrarEventos(ArrayList<String> eventos) throws Exception {

        String res = "N";
        boolean ciclo = true;
        int array = 0;
        int fin = eventos.size();
        while (ciclo) {

            String[] evento = new String[15];

            boolean ciclo2 = true;
            int i = 0;

            while (ciclo2) {
                if (i < 15) {
                    evento[i] = eventos.get(array);
                    i++;
                    array++;
                } else {
                    ciclo2 = false;
                }
            }
            res =this.admin.registrarEventoExcel(evento);
            if (array == fin - 1) {
                ciclo = false;
            }
        }
        return res;
    }

    public EventoDTO consultarId(String id)throws Exception{
        
       return admin.consultarId(id);
        
    }
    
    public String actualizarDatos(String id,String nombre, String fecha, String hora, String lugar, String entidad_adscrita, String continente, String pais, String ciudad, String participantes, String tipo_evento, String sector_economico, String url, String imagen, String logros, String descripcion) throws Exception {
        
        return this.admin.actualizarDatos(id,nombre, fecha, hora, lugar, entidad_adscrita, continente, pais, ciudad, participantes, tipo_evento, sector_economico, url, imagen, logros, descripcion);
        
    }
    
    public ArrayList<String> mostrarComentario() throws Exception{
        
        ComentarioDAO p = new ComentarioDAO();
        return p.mostrarComentario();
    }
     public EventoDTO consultarVerEvento(String id)throws Exception{
        
       return visi.verEvento(id);
        
    }
}
