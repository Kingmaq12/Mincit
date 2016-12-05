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
import ufps.mincit.datos.dao.AlertaGeneralDAO;
import ufps.mincit.datos.dao.Entidad_adscritaDAO;
import ufps.mincit.datos.dao.EventoDAO;
import ufps.mincit.datos.dao.Evento_EntidadDAO;
import ufps.mincit.datos.dao.Evento_logroDAO;
import ufps.mincit.datos.dao.Evento_paisDAO;
import ufps.mincit.datos.dao.Evento_sectorDAO;
import ufps.mincit.datos.dao.LogroDAO;
import ufps.mincit.datos.dao.PaisesDAO;
import ufps.mincit.datos.dao.PreguntaDAO;
import ufps.mincit.datos.dao.RespuestaDAO;
import ufps.mincit.datos.dao.Sector_economicoDAO;
import ufps.mincit.datos.dao.UsuarioDAO;
import ufps.mincit.datos.dto.AlertaGeneralDTO;
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
        System.out.println("RUTA IMAGEN:"+imagen);
        char conti1= continen.charAt(0);
        char conti2= continen.charAt(1);
        char continente = (char) (conti1+conti2);
        EventoDTO dto = new EventoDTO(nombre, fecha, hora, lugar,ciudad, participantes, tipo_evento, url, imagen, descripcion);
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
            Evento_paisDTO evePaisDTO = new Evento_paisDTO(id, Integer.parseInt(id_pais),continente);
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

        return null;
    }

    public EventoDTO consultarId(String id)throws Exception{
        
        EventoDAO dao = new EventoDAO();
        EventoDTO dto = dao.consultarPorId(id);
        Evento_EntidadDAO eveEnt = new Evento_EntidadDAO();
        Evento_logroDAO eveLog = new Evento_logroDAO();
        Evento_sectorDAO eveSec = new Evento_sectorDAO();
        
        String id_entidades_adscritas=eveEnt.consultarPorId(id);
        String logros=eveLog.consultarPorId(id);
        String sectores_economicos=eveSec.consultarPorId(id);
        
        dto.setEntidades_adscritas(id_entidades_adscritas);
        dto.setLogros(logros);
        dto.setSectores_economicos(sectores_economicos);
        return dto;
        
    }
    
    public String actualizarDatos(String idi,String nombre, String fecha, String hora, String lugar, String entidad_adscrita, String continente, String pais, String ciudad, String participantes, String tipo_evento, String sector_economico, String url, String imagen, String logros, String descripcion) throws Exception {
        
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
    
    
    public ArrayList<String> consultarPreguntas()throws Exception{
        
        PreguntaDAO dao = new PreguntaDAO();
        return dao.consultarPreguntas();
        
    }
    
    
    public String registrarResultadoEmprendedor(String valor,String nombre, String cedula, String email)throws Exception{
         
        Usuario dto = new Usuario(nombre, email, cedula, 3, "123");
        UsuarioDAO dao = new UsuarioDAO(); 
        
        dao.registrarUsuario(dto);
        
        int resultado = 0;
        
        for (int i = 0; i < 31; i++) {
            resultado+= Integer.parseInt(valor.charAt(i)+"");
        }
        
        String retornar="Su resultado de la encuesta es=  "+resultado+"   ";
        
        RespuestaDAO respDao = new RespuestaDAO();
        
        ArrayList<String> respuestas = respDao.consultarRespuestas();
        
        for(String linea:respuestas){
            
            String[] divi1=linea.split("=");
            
            for (int i = 0; i < divi1.length; i++) {
                if(i==1){
                    String[] divi2=divi1[i].split("-");    
                    if(resultado>=Integer.parseInt(divi2[0])&&resultado<=Integer.parseInt(divi2[1])){
                        retornar+=divi1[2];
                        break;
                    }
                }
            
            }
             
        }
        return retornar;
     }
    
    public String modificarAlerta(String numero,String alerta)throws Exception{
        
        AlertaGeneralDTO dto = new AlertaGeneralDTO(numero, alerta);
        AlertaGeneralDAO dao = new AlertaGeneralDAO();
        
        if(dao.modificarAlerta(dto)){
            return "S";
        }
        
        return "N";
    }
    

   public ArrayList<String> consultarAlertas()throws Exception{
       
       AlertaGeneralDAO dao = new AlertaGeneralDAO();
       
       return dao.consultarAlertas();
   }
}
