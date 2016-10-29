/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.mincit.negocio.administrador;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.Date;
import ufps.mincit.datos.dao.Entidad_adscritaDAO;
import ufps.mincit.datos.dao.EventoDAO;
import ufps.mincit.datos.dao.Evento_EntidadDAO;
import ufps.mincit.datos.dao.Evento_logroDAO;
import ufps.mincit.datos.dao.Evento_paisDAO;
import ufps.mincit.datos.dao.Evento_sectorDAO;
import ufps.mincit.datos.dao.PaisesDAO;
import ufps.mincit.datos.dao.UsuarioDAO;
import ufps.mincit.datos.dto.EventoDTO;
import ufps.mincit.datos.dto.Evento_EntidadDTO;
import ufps.mincit.datos.dto.Evento_logroDTO;
import ufps.mincit.datos.dto.Evento_paisDTO;
import ufps.mincit.datos.dto.Evento_sectorDTO;
import ufps.mincit.datos.dto.Usuario;

/**
 *
 * @author CESAR
 */
public class Administrador {

    public String iniciarSesion(String cedula, String contraseña) throws Exception {
        String result = "";

        Usuario usu = new Usuario(cedula, contraseña);
        UsuarioDAO aux = new UsuarioDAO();

        String usuario = aux.iniciarSesion(usu);
        System.out.println(usuario);
        if (!usuario.isEmpty()) {
            String[] divi = usuario.split(",");
            if (divi[3].equalsIgnoreCase("1")) {
                return "S";
            }
            if (divi[3].equalsIgnoreCase("2")) {
                return "A";
            }
        }
        return "N";
    }

    public String registrarEvento(String nombre, String fecha, String hora, String lugar, String entidad_adscrita, String continente, String pais, String ciudad, String participantes, String tipo_evento, String sector_economico, String url, String imagen, String logros, String descripcion) throws Exception {

        //Por cada evento que se registra se registra:
        //1. Datos de este evento 
        //2. Por cada entidad adscrita un registro en la tabla Evento_entidad 
        //3. Por cada logro un registro en la tabla Evento_logro
        //4. Un registro en Evento_pais
        //5. Por cada sector economico un registro en la tabla Evento_sector
        EventoDTO dto = new EventoDTO(nombre, fecha, hora, lugar, continente, pais, ciudad, participantes, tipo_evento, url, imagen, descripcion);
        EventoDAO dao = new EventoDAO();
        Evento_EntidadDAO eveEnt = new Evento_EntidadDAO();
        Evento_logroDAO eveLog = new Evento_logroDAO();
        Evento_paisDAO evePais = new Evento_paisDAO();
        Evento_sectorDAO eveSec = new Evento_sectorDAO();

        boolean resp = dao.registrarEvento(dto);

        if (resp) {
            int id = dao.consultarId();

            String[] entidades = entidad_adscrita.split(",");

            Entidad_adscritaDAO entiDAO = new Entidad_adscritaDAO();
            for (int i = 0; i < entidades.length; i++) {
                if (!entidades[i].isEmpty()) {
                    String nit_entidad = entiDAO.consultarEntidad(entidades[i]);
                    Evento_EntidadDTO eveDTO = new Evento_EntidadDTO(nit_entidad, id);
                    eveEnt.registrarEve_Entidad(eveDTO);
                }

            }

            String[] logross = logros.split(",");

            for (int i = 0; i < logross.length; i++) {
                if (!logross[i].isEmpty()) {
                    Evento_logroDTO eveDTO = new Evento_logroDTO(id, Integer.parseInt(logross[i]));
                    eveLog.registrarEve_Logro(eveDTO);
                }

            }

            PaisesDAO paises = new PaisesDAO();
            String id_pais = paises.buscarPais(pais);
            Evento_paisDTO evePaisDTO = new Evento_paisDTO(id, Integer.parseInt(id_pais));
            evePais.registrarEve_Pais(evePaisDTO);

            String[] sectores = sector_economico.split(",");

            for (int i = 0; i < sectores.length; i++) {
                if (!sectores[i].isEmpty()) {
                    Evento_sectorDTO eveDTO = new Evento_sectorDTO(id, Integer.parseInt(sectores[i]));
                    eveSec.registrarEve_Sec(eveDTO);
                }
            }

            return "S";
        }
        return "N";

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
