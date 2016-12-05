/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.datos.interf;

import java.util.ArrayList;
import ufps.mincit.datos.dto.EventoDTO;

/**
 *
 * @author user
 */
public interface IEventoDAO {

    public boolean registrarEvento(EventoDTO dto) throws Exception;

    public int consultarId() throws Exception;

    public EventoDTO consultarPorId(String id) throws Exception;

    public ArrayList<EventoDTO> consultar1(String fechaI, String fechaF, String entidad, String pais, String ciudad, String continente, String sector, String logro) throws Exception;

    public ArrayList<EventoDTO> consultar2(String fechaI, String fechaF) throws Exception;

    public ArrayList<EventoDTO> consultar3(String fechaI, String fechaF, String entidad) throws Exception;

    public ArrayList<EventoDTO> consultar4(String fechaI, String fechaF, String entidad, String pais) throws Exception;

    public ArrayList<EventoDTO> consultar5(String fechaI, String fechaF, String entidad, String pais, String ciudad) throws Exception;

    public ArrayList<EventoDTO> consultar6(String fechaI, String fechaF, String entidad, String pais, String ciudad, String continente) throws Exception;

    public ArrayList<EventoDTO> consultar7(String fechaI, String fechaF, String entidad, String pais, String ciudad, String continente, String sector) throws Exception;

    public ArrayList<EventoDTO> consultar8(String entidad) throws Exception;

    public ArrayList<EventoDTO> consultar9(String entidad, String pais) throws Exception;

    public ArrayList<EventoDTO> consultar10(String entidad, String pais, String ciudad) throws Exception;

    public ArrayList<EventoDTO> consultar11(String entidad, String pais, String ciudad, String continente) throws Exception;

    public ArrayList<EventoDTO> consultar12(String entidad, String pais, String ciudad, String continente, String sector) throws Exception;

    public ArrayList<EventoDTO> consultar13(String entidad, String pais, String ciudad, String continente, String sector, String logro) throws Exception;

    public ArrayList<EventoDTO> consultar14(String pais) throws Exception;

    public ArrayList<EventoDTO> consultar15(String pais, String ciudad) throws Exception;

    public ArrayList<EventoDTO> consultar16(String pais, String ciudad, String continente) throws Exception;

    public ArrayList<EventoDTO> consultar17(String pais, String ciudad, String continente, String sector) throws Exception;

    public ArrayList<EventoDTO> consultar18(String pais, String ciudad, String continente, String sector, String logro) throws Exception;

    public ArrayList<EventoDTO> consultar19(String ciudad) throws Exception;

    public ArrayList<EventoDTO> consultar20(String ciudad, String continente) throws Exception;

    public ArrayList<EventoDTO> consultar21(String ciudad, String continente, String sector) throws Exception;

    public ArrayList<EventoDTO> consultar22(String ciudad, String continente, String sector, String logro) throws Exception;

    public ArrayList<EventoDTO> consultar23(String continente) throws Exception;

    public ArrayList<EventoDTO> consultar24(String continente, String sector) throws Exception;

    public ArrayList<EventoDTO> consultar25(String continente, String sector, String logro) throws Exception;

    public ArrayList<EventoDTO> consultar26(String sector) throws Exception;

    public ArrayList<EventoDTO> consultar27(String sector, String logro) throws Exception;

    public ArrayList<EventoDTO> consultar28(String logro) throws Exception;

    public ArrayList<EventoDTO> consultar29(String pais, String continente) throws Exception;

    public boolean actualizarDatos(String id, String nombre, String fecha, String hora, String lugar, String continente, String pais, String ciudad, String participantes, String tipo_evento, String url, String descripcion) throws Exception;

}
