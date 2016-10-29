/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.negocio.visitante;

import java.util.ArrayList;
import ufps.mincit.datos.dao.ComentarioDAO;
import ufps.mincit.datos.dao.EventoDAO;
import ufps.mincit.datos.dto.ComentarioDTO;
import ufps.mincit.datos.dto.EventoDTO;

/**
 *
 * @author user
 */
public class Visitante {
    
     public boolean recibirMensaje(String nombre_empresa,String nombre_empleado,String email, String asunto, String mensaje)throws Exception{
         
     ComentarioDTO comen = new ComentarioDTO(nombre_empresa, nombre_empleado, email, asunto, mensaje, true);
     ComentarioDAO dao = new ComentarioDAO();
         
        return dao.recibirMensaje(comen);
    }
    
     public ArrayList<EventoDTO> consultarEventos(String fecha, String entidad, String pais, String ciudad, String continente, String sector, String logro) throws Exception {

        //todos llenos -------------------------------------------------------------------------------------------------------------------------------------------------------
        if (!fecha.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && !logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar1(fecha, entidad, pais, ciudad, continente, sector, logro);
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------
        if (!fecha.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar2(fecha);
        }
        if (!fecha.isEmpty() && !entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar3(fecha, entidad);
        }
        if (!fecha.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar4(fecha, entidad, pais);
        }
        if (!fecha.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar5(fecha, entidad, pais, ciudad);
        }
        if (!fecha.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar6(fecha, entidad, pais, ciudad, continente);
        }
        if (!fecha.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar7(fecha, entidad, pais, ciudad, continente, sector);
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------
        if (fecha.isEmpty() && !entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar8(entidad);
        }
        if (fecha.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar9(entidad, pais);
        }
        if (fecha.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar10(entidad, pais, ciudad);
        }
        if (fecha.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar11(entidad, pais, ciudad, continente);
        }
        if (fecha.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar12(entidad, pais, ciudad, continente, sector);
        }
        if (fecha.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && !logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar13(entidad, pais, ciudad, continente, sector, logro);
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------
        if (fecha.isEmpty() && entidad.equals("ninguno") && !pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar14(pais);
        }
        if (fecha.isEmpty() && entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar15(pais, ciudad);
        }
        if (fecha.isEmpty() && entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar16(pais, ciudad, continente);
        }
        if (fecha.isEmpty() && entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar17(pais, ciudad, continente, sector);
        }
        if (fecha.isEmpty() && entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && !logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar18(pais, ciudad, continente, sector, logro);
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------
        if (fecha.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && !ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar19(ciudad);
        }
        if (fecha.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar20(ciudad, continente);
        }
        if (fecha.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar21(ciudad, continente, sector);
        }
        if (fecha.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && !logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar22(ciudad, continente, sector, logro);
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------
        if (fecha.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && !continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar23(continente);
        }
        if (fecha.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar24(continente, sector);
        }
        if (fecha.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && !logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar25(continente, sector, logro);
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------
        if (fecha.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && !sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar26(sector);
        }
        if (fecha.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && !sector.equals("ninguno") && !logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar27(sector, logro);
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------
        if (fecha.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && !logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar28(logro);

        }
//        ArrayList<EventoDTO> M =new ArrayList<>();
//        EventoDTO o = new EventoDTO();
//        o.setNombre("laskdjfalksjdal");
//        M.add(o);
        return null;
    }
}
     
     
}
