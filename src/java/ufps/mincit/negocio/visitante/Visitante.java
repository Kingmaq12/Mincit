/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.negocio.visitante;

import java.util.ArrayList;
import ufps.mincit.datos.dao.ComentarioDAO;
import ufps.mincit.datos.dao.EventoDAO;
import ufps.mincit.datos.dao.Evento_EntidadDAO;
import ufps.mincit.datos.dao.Evento_logroDAO;
import ufps.mincit.datos.dao.Evento_sectorDAO;
import ufps.mincit.datos.dto.ComentarioDTO;
import ufps.mincit.datos.dto.EventoDTO;

/**
 *
 * @author user
 */
public class Visitante {

    public boolean recibirMensaje(String nombre_empresa, String nombre_empleado, String email, String asunto, String mensaje) throws Exception {

        ComentarioDTO comen = new ComentarioDTO(nombre_empresa, nombre_empleado, email, asunto, mensaje, true);
        ComentarioDAO dao = new ComentarioDAO();

        return dao.recibirMensaje(comen);
    }

    public ArrayList<EventoDTO> consultarEventos(String fechaI, String fechaF, String entidad, String pais, String ciudad, String continente, String sector, String logro) throws Exception {
        System.out.print(fechaI + "---fechaI---" + fechaF + "---fechaF---" + entidad + "---entidad---" + pais + "---pais---" + ciudad + "---ciudad---" + continente + "---continente---" + sector + "---sector---" + logro);

        //todos llenos -------------------------------------------------------------------------------------------------------------------------------------------------------
        if (!fechaI.isEmpty() && !fechaF.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && !logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar1(fechaI, fechaF, entidad, pais, ciudad, continente, sector, logro);
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------
        if (!fechaI.isEmpty() && !fechaF.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar2(fechaI, fechaF);
        }
        if (!fechaI.isEmpty() && !fechaF.isEmpty() && !entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar3(fechaI, fechaF, entidad);
        }
        if (!fechaI.isEmpty() && !fechaF.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar4(fechaI, fechaF, entidad, pais);
        }
        if (!fechaI.isEmpty() && !fechaF.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar5(fechaI, fechaF, entidad, pais, ciudad);
        }
        if (!fechaI.isEmpty() && !fechaF.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar6(fechaI, fechaF, entidad, pais, ciudad, continente);
        }
        if (!fechaI.isEmpty() && !fechaF.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar7(fechaI, fechaF, entidad, pais, ciudad, continente, sector);
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------
        if (fechaI.isEmpty() && fechaF.isEmpty() && !entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar8(entidad);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar9(entidad, pais);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar10(entidad, pais, ciudad);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar11(entidad, pais, ciudad, continente);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar12(entidad, pais, ciudad, continente, sector);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && !logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar13(entidad, pais, ciudad, continente, sector, logro);
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && !pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar14(pais);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar15(pais, ciudad);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar16(pais, ciudad, continente);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar17(pais, ciudad, continente, sector);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && !logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar18(pais, ciudad, continente, sector, logro);
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && !ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar19(ciudad);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar20(ciudad, continente);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar21(ciudad, continente, sector);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && !logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar22(ciudad, continente, sector, logro);
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && !continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar23(continente);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar24(continente, sector);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && !logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar25(continente, sector, logro);
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && !sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar26(sector);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && !sector.equals("ninguno") && !logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar27(sector, logro);
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && !logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar28(logro);

        }
        //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && !pais.equals("ninguno") && ciudad.isEmpty() && !continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar29(pais, continente);
        }

//        ArrayList<EventoDTO> M =new ArrayList<>();
//        EventoDTO o = new EventoDTO();
//        o.setNombre("laskdjfalksjdal");
//        M.add(o);
        return null;
    }

    public EventoDTO verEvento(String id) throws Exception {

        EventoDAO dao = new EventoDAO();
        EventoDTO dto = dao.consultarPorId(id);

        Evento_EntidadDAO eveEnt = new Evento_EntidadDAO();
        Evento_logroDAO eveLog = new Evento_logroDAO();
        Evento_sectorDAO eveSec = new Evento_sectorDAO();

        String id_entidades_adscritas = eveEnt.consultarPorId(id);
        String logros = eveLog.consultarPorId(id);
        String sectores_economicos = eveSec.consultarPorId(id);

        String[] nitEntidad = id_entidades_adscritas.split(",");
        String[] idLogro = logros.split(",");
        String[] idSector = sectores_economicos.split(",");
        //obtengo nombres de las entidades
        String nombreEntidad = "";
        for (int x = 0; x < nitEntidad.length; x++) {
            nombreEntidad += eveEnt.consultarPorId2(nitEntidad[x]) + ",";
        }
        //obtengo nombre de los logros
        String nombreLogro = "";
        for (int x = 0; x < idLogro.length; x++) {
            nombreLogro += eveLog.consultarPorId2(idLogro[x]) + ",";
        }
        //obtengo nombre de los sectores
        String nombreSector = "";
        for (int x = 0; x < idSector.length; x++) {
            nombreSector += eveSec.consultarPorId2(idSector[x]) + ",";
        }
        System.out.println(nombreEntidad);
        System.out.println(nombreLogro);
        System.out.println(nombreSector);
        dto.setEntidades_adscritas(nombreEntidad);
        dto.setLogros(nombreLogro);
        dto.setSectores_economicos(nombreSector);

        return dto;
    }
}
