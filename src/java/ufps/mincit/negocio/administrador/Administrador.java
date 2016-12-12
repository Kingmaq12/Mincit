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
import ufps.mincit.datos.dao.AlertaDAO;
import ufps.mincit.datos.dao.AlertaGeneralDAO;
import ufps.mincit.datos.dao.CuestionarioDAO;
import ufps.mincit.datos.dao.Entidad_adscritaDAO;
import ufps.mincit.datos.dao.EventoDAO;
import ufps.mincit.datos.dao.Evento_EntidadDAO;
import ufps.mincit.datos.dao.Evento_VisitanteDAO;
import ufps.mincit.datos.dao.Evento_logroDAO;
import ufps.mincit.datos.dao.Evento_paisDAO;
import ufps.mincit.datos.dao.Evento_sectorDAO;
import ufps.mincit.datos.dao.LogroDAO;
import ufps.mincit.datos.dao.PaisesDAO;
import ufps.mincit.datos.dao.PreguntaDAO;
import ufps.mincit.datos.dao.RespuestaDAO;
import ufps.mincit.datos.dao.Sector_economicoDAO;
import ufps.mincit.datos.dao.UsuarioDAO;
import ufps.mincit.datos.dto.AlertaDTO;
import ufps.mincit.datos.dto.AlertaGeneralDTO;
import ufps.mincit.datos.dto.CuestionarioDTO;
import ufps.mincit.datos.dto.EventoDTO;
import ufps.mincit.datos.dto.Evento_EntidadDTO;
import ufps.mincit.datos.dto.Evento_logroDTO;
import ufps.mincit.datos.dto.Evento_paisDTO;
import ufps.mincit.datos.dto.Evento_sectorDTO;
import ufps.mincit.datos.dto.UsuarioDTO;

/**
 *
 * @author CESAR
 */
public class Administrador {

    public String iniciarSesion(String cedula, String contraseña) throws Exception {
        String result = "";

        UsuarioDTO usu = new UsuarioDTO(cedula, contraseña);
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

    public String registrarEventoExcel(String[] evento) throws Exception {

//        String res = "N";
//        
//        String[] nombre = evento[0].split("=");
//        String[] fecha = evento[1].split("=");
//        String[] hora = evento[2].split("=");
//        String[] lugar= evento[3].split("=");
//        String[] continente= evento[4].split("=");
////        String[] pais= evento[5].split("=");
////        String[] ciudad= evento[6].split("=");
//        String[] participantes= evento[7].split("=");
//        String[] tipo_evento= evento[8].split("=");
//        String[] url= evento[9].split("=");
//        String[] imagen= evento[10].split("=");
//        String[] descripcion= evento[11].split("=");
//        
//        EventoDTO dto = new EventoDTO(nombre[1], fecha[1], hora[1], lugar[1], continente[1], pais[1], ciudad[1], participantes[1], tipo_evento[1], url[1], imagen[1], descripcion[1]);
//        EventoDAO dao = new EventoDAO();
//        Evento_EntidadDAO eveEnt = new Evento_EntidadDAO();
//        Evento_logroDAO eveLog = new Evento_logroDAO();
//        Evento_paisDAO evePais = new Evento_paisDAO();
//        Evento_sectorDAO eveSec = new Evento_sectorDAO();
//        
//
//        boolean resp = dao.registrarEvento(dto);
//
//        if (resp) {
//            int id = dao.consultarId();
//            
//            String[] ent = evento[12].split("=");
//            String[] entidades_adscritas= ent[1].split(",");
//            
//            Entidad_adscritaDAO entiDAO = new Entidad_adscritaDAO();
//            for (int i = 0; i < entidades_adscritas.length; i++) {
//                
//                    String nit_entidad = entiDAO.consultarEntidadNombre(entidades_adscritas[i]);
//                    Evento_EntidadDTO eveDTO = new Evento_EntidadDTO(nit_entidad, id);
//                    eveEnt.registrarEve_Entidad(eveDTO);
//            }
//            
//            String[] logros= evento[13].split("=");
//            String[] logross = logros[1].split(",");
//
//            LogroDAO logDao = new LogroDAO();
//            for (int i = 0; i < logross.length; i++) {
//                
//                    String id_logro = logDao.buscarLogroNombre(logross[i]);
//                    Evento_logroDTO eveDTO = new Evento_logroDTO(id, Integer.parseInt(id_logro));
//                    eveLog.registrarEve_Logro(eveDTO);
//                
//
//            }
//            
//            
//            
//            PaisesDAO paises = new PaisesDAO();
//            String id_pais = paises.buscarPais(pais[1]);
//            Evento_paisDTO evePaisDTO = new Evento_paisDTO(id, Integer.parseInt(id_pais));
//            evePais.registrarEve_Pais(evePaisDTO);
//            
//            
//            
//            
//            String[] sect = evento[14].split("=");
//            String[] sectores= sect[1].split(",");
//
//            Sector_economicoDAO secDao = new Sector_economicoDAO();
//            for (int i = 0; i < sectores.length; i++) {
//                
//                    String id_sector = secDao.buscarSectorNombre(sectores[i]);
//                    Evento_sectorDTO eveDTO = new Evento_sectorDTO(id, Integer.parseInt(id_sector));
//                    eveSec.registrarEve_Sec(eveDTO);
//                
//            }
//            res = "S";
//        }    
//        return res;
        return "";
    }

    public String registrarEvento(String nombre, String fecha, String hora, String lugar, String entidad_adscrita, String continen, String pais, String ciudad, String participantes, String tipo_evento, String sector_economico, String url, String imagen, String logros, String descripcion) throws Exception {

        //Por cada evento que se registra se registra:
        //1. Datos de este evento 
        //2. Por cada entidad adscrita un registro en la tabla Evento_entidad 
        //3. Por cada logro un registro en la tabla Evento_logro
        //4. Un registro en Evento_pais
        //5. Por cada sector economico un registro en la tabla Evento_sector
        
        EventoDTO dto = new EventoDTO(nombre, fecha, hora, lugar, ciudad, participantes, tipo_evento, url, imagen, descripcion);
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
            Evento_paisDTO evePaisDTO = new Evento_paisDTO(id, Integer.parseInt(pais), continen);
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

    public ArrayList<EventoDTO> consultarEventos(String fechaI, String fechaF, String entidad, String pais, String ciudad, String continente, String sector, String logro) throws Exception {
        System.out.print(fechaI + "---fechaI---" + fechaF + "---fechaF---" + entidad + "---entidad---" + pais + "---pais---" + ciudad + "---ciudad---" + continente + "---continente---" + sector + "---sector---" + logro);
// administrador hace consultas de todos los tipos de eventos, 0 1  2 PERO NO LOS DE 3 AND NOT estado like 3 Y TAMPOCO ESTADO 2, PARA ESO HAY OTRA VISTA
        //todos llenos -------------------------------------------------------------------------------------------------------------------------------------------------------
        if (!fechaI.isEmpty() && !fechaF.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && !logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar11(fechaI, fechaF, entidad, pais, ciudad, continente, sector, logro);
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------
        if (!fechaI.isEmpty() && !fechaF.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar22(fechaI, fechaF);
        }
        if (!fechaI.isEmpty() && !fechaF.isEmpty() && !entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar33(fechaI, fechaF, entidad);
        }
        if (!fechaI.isEmpty() && !fechaF.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar44(fechaI, fechaF, entidad, pais);
        }
        if (!fechaI.isEmpty() && !fechaF.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar55(fechaI, fechaF, entidad, pais, ciudad);
        }
        if (!fechaI.isEmpty() && !fechaF.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar66(fechaI, fechaF, entidad, pais, ciudad, continente);
        }
        if (!fechaI.isEmpty() && !fechaF.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar77(fechaI, fechaF, entidad, pais, ciudad, continente, sector);
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------
        if (fechaI.isEmpty() && fechaF.isEmpty() && !entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar88(entidad);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar99(entidad, pais);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar100(entidad, pais, ciudad);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar111(entidad, pais, ciudad, continente);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar122(entidad, pais, ciudad, continente, sector);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && !entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && !logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar133(entidad, pais, ciudad, continente, sector, logro);
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && !pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            System.out.println("entro");
            return dao.consultar144(pais);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar155(pais, ciudad);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar166(pais, ciudad, continente);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar177(pais, ciudad, continente, sector);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && !pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && !logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar188(pais, ciudad, continente, sector, logro);
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && !ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar199(ciudad);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar200(ciudad, continente);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar211(ciudad, continente, sector);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && !ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && !logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar222(ciudad, continente, sector, logro);
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && !continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar233(continente);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar244(continente, sector);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && !continente.equals("ninguno") && !sector.equals("ninguno") && !logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar255(continente, sector, logro);
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && !sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar266(sector);
        }
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && !sector.equals("ninguno") && !logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar277(sector, logro);
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------------
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && pais.equals("ninguno") && ciudad.isEmpty() && continente.equals("ninguno") && sector.equals("ninguno") && !logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar288(logro);

        }
        //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
        if (fechaI.isEmpty() && fechaF.isEmpty() && entidad.equals("ninguno") && !pais.equals("ninguno") && ciudad.isEmpty() && !continente.equals("ninguno") && sector.equals("ninguno") && logro.equals("ninguno")) {
            EventoDAO dao = new EventoDAO();
            return dao.consultar299(pais, continente);
        }
//        ArrayList<EventoDTO> M =new ArrayList<>();
//        EventoDTO o = new EventoDTO();
//        o.setNombre("laskdjfalksjdal");
//        M.add(o);
        return null;
    }
    
       public String consultarEmprendedor(String cedula) throws Exception {

        UsuarioDAO a = new UsuarioDAO();
        String emprendedor = a.consultarEmprendedor(cedula);
        return emprendedor;

    }

    public int contarAlto()throws Exception{
        CuestionarioDAO c = new CuestionarioDAO();
        return c.contarAlto();
    }

    public int contarMedio()throws Exception{
        CuestionarioDAO c = new CuestionarioDAO();
        return c.contarMedio();
    }

    public int contarBajo() throws Exception{
        CuestionarioDAO c = new CuestionarioDAO();
        return c.contarBajo();
    }

    public EventoDTO consultarId(String id) throws Exception {

        EventoDAO dao = new EventoDAO();
        EventoDTO dto = dao.consultarPorId(id);
        Evento_EntidadDAO eveEnt = new Evento_EntidadDAO();
        Evento_logroDAO eveLog = new Evento_logroDAO();
        Evento_sectorDAO eveSec = new Evento_sectorDAO();

        String id_entidades_adscritas = eveEnt.consultarPorId(id);
        String logros = eveLog.consultarPorId(id);
        String sectores_economicos = eveSec.consultarPorId(id);

        dto.setEntidades_adscritas(id_entidades_adscritas);
        dto.setLogros(logros);
        dto.setSectores_economicos(sectores_economicos);
        return dto;

    }

    public String actualizarDatos(String idi, String nombre, String fecha, String hora, String lugar, String entidad_adscrita, String continente, String pais, String ciudad, String participantes, String tipo_evento, String sector_economico, String url, String imagen, String logros, String descripcion) throws Exception {

//        EventoDAO dao = new EventoDAO();
//        boolean evento= dao.actualizarDatos(idi, nombre, fecha, hora, lugar, continente, pais, ciudad, participantes, tipo_evento, url, descripcion);
//        int id = Integer.parseInt(idi);
//        Evento_EntidadDAO eveEnt = new Evento_EntidadDAO();
//        Evento_logroDAO eveLog = new Evento_logroDAO();
//        Evento_paisDAO evePais = new Evento_paisDAO();
//        Evento_sectorDAO eveSec = new Evento_sectorDAO();
//        
//        
//        
//        if (evento) {
//            
//            eveEnt.borrarEve_Entidad(id);
//            eveLog.borrarEve_Logros(id);
//            evePais.borrarEve_Pais(id);
//            eveSec.borrarEve_Sectores(id);
//            
//            String[] entidades = entidad_adscrita.split(",");
//
//            Entidad_adscritaDAO entiDAO = new Entidad_adscritaDAO();
//            for (int i = 0; i < entidades.length; i++) {
//                if (!entidades[i].isEmpty()) {
//                    String nit_entidad = entiDAO.consultarEntidad(entidades[i]);
//                    Evento_EntidadDTO eveDTO = new Evento_EntidadDTO(nit_entidad, id);
//                    eveEnt.registrarEve_Entidad(eveDTO);
//                }
//
//            }
//
//            String[] logross = logros.split(",");
//
//            for (int i = 0; i < logross.length; i++) {
//                if (!logross[i].isEmpty()) {
//                    Evento_logroDTO eveDTO = new Evento_logroDTO(id, Integer.parseInt(logross[i]));
//                    eveLog.registrarEve_Logro(eveDTO);
//                }
//
//            }
//
//            PaisesDAO paises = new PaisesDAO();
//            String id_pais = paises.buscarPais(pais);
//            Evento_paisDTO evePaisDTO = new Evento_paisDTO(id, Integer.parseInt(id_pais));
//            evePais.registrarEve_Pais(evePaisDTO);
//
//            String[] sectores = sector_economico.split(",");
//
//            for (int i = 0; i < sectores.length; i++) {
//                if (!sectores[i].isEmpty()) {
//                    Evento_sectorDTO eveDTO = new Evento_sectorDTO(id, Integer.parseInt(sectores[i]));
//                    eveSec.registrarEve_Sec(eveDTO);
//                }
//            }
//
//            return "S";
//        }
        return "N";

    }

    public ArrayList<String> consultarPreguntas() throws Exception {

        PreguntaDAO dao = new PreguntaDAO();
        return dao.consultarPreguntas();

    }

    public String registrarResultadoEmprendedor(String valor, String nombre, String cedula, String email) throws Exception {

        UsuarioDTO dto = new UsuarioDTO(nombre, email, cedula, 3, "123");
        UsuarioDAO dao = new UsuarioDAO();

        dao.registrarUsuario(dto);

        int resultado = 0;

        for (int i = 0; i < 31; i++) {
            resultado += Integer.parseInt(valor.charAt(i) + "");
        }

        String retornar = "Su resultado de la encuesta es=  " + resultado + "   ";

        RespuestaDAO respDao = new RespuestaDAO();

        ArrayList<String> respuestas = respDao.consultarRespuestas();

        for (String linea : respuestas) {

            String[] divi1 = linea.split("=");

            for (int i = 0; i < divi1.length; i++) {
                if (i == 1) {
                    String[] divi2 = divi1[i].split("-");
                    if (resultado >= Integer.parseInt(divi2[0]) && resultado <= Integer.parseInt(divi2[1])) {
                        retornar += divi1[2];
                        break;
                    }
                }

            }

        }
        return retornar;
    }

    public String modificarAlerta(String numero, String alerta) throws Exception {

        AlertaGeneralDTO dto = new AlertaGeneralDTO(numero, alerta);
        AlertaGeneralDAO dao = new AlertaGeneralDAO();

        if (dao.modificarAlerta(dto)) {
            return "S";
        }

        return "N";
    }

    public ArrayList<String> consultarAlertas() throws Exception {

        AlertaGeneralDAO dao = new AlertaGeneralDAO();

        return dao.consultarAlertas();
    }
    
    public ArrayList<AlertaDTO> consultarAlertasEspe(String id) throws Exception {

        AlertaDAO dao = new AlertaDAO();

        return dao.consultarAlertasEspe(id);
    }
    
    public boolean eliminarAlertaEspe(String id_alerta)throws Exception{
        
        AlertaDAO dao = new AlertaDAO();

        return dao.eliminarAlertaEspe(id_alerta);
        
    }
    
    public boolean registrarAlertaEspe(String id_evento,String fecha, String descripcion)throws Exception{
        
        AlertaDTO dto = new AlertaDTO(Integer.parseInt(id_evento), fecha, fecha);
        AlertaDAO dao = new AlertaDAO();
        
        return dao.registrarAlertaEspe(dto);
        
    }
    
    public String registrarEventoVisitante(String nombre_visitante, String email, String cedula,String nombre, String fecha, String hora, String lugar, String entidad_adscrita, String continen, String pais, String ciudad, String participantes, String tipo_evento, String sector_economico, String url, String imagen, String logros, String descripcion) throws Exception {

        
        UsuarioDAO usuDao = new UsuarioDAO();
        UsuarioDTO usuDTO = new UsuarioDTO(nombre_visitante, email, cedula, 4, "123");
        usuDao.registrarUsuario(usuDTO);
        
        EventoDTO dto = new EventoDTO(nombre, fecha, hora, lugar, ciudad, participantes, tipo_evento, url, imagen, descripcion);
        dto.setEstado("2");
        EventoDAO dao = new EventoDAO();
        Evento_EntidadDAO eveEnt = new Evento_EntidadDAO();
        Evento_logroDAO eveLog = new Evento_logroDAO();
        Evento_paisDAO evePais = new Evento_paisDAO();
        Evento_sectorDAO eveSec = new Evento_sectorDAO();

        Evento_VisitanteDAO eveVisi = new Evento_VisitanteDAO();
        
        boolean resp = dao.registrarEvento(dto);

        if (resp) {
            int id = dao.consultarId();
            
            eveVisi.registrarEvento_Visitante(cedula,id);
            
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
            Evento_paisDTO evePaisDTO = new Evento_paisDTO(id, Integer.parseInt(pais), continen);
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
        public ArrayList<CuestionarioDTO> mostrarCuestionario() throws Exception {
        CuestionarioDAO dao = new CuestionarioDAO();
        ArrayList<CuestionarioDTO> dto = dao.mostrarCuestionario();
        return dto;
    }
        public ArrayList<EventoDTO> consultarEventoVisitante() throws Exception {

        EventoDAO dao = new EventoDAO();
        return dao.consultarEventoVisitante();
    }

    public UsuarioDTO consultarVisitante(String id) throws Exception {

        UsuarioDAO d = new UsuarioDAO();
        return d.consultarVisitante(id);
    }
    public boolean publicarEventoVisitante (String id)throws Exception{
        EventoDAO d = new EventoDAO();
        return d.publicarEventosVisitante(id);
    }
    
    
}
