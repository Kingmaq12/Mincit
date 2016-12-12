<%-- 
    Document   : editar
    Created on : 31/10/2016, 03:03:11 PM
    Author     : CESAR
--%>

<%@page import="ufps.mincit.negocio.Negocio"%>
<%@page import="ufps.mincit.datos.dto.EventoDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

    String id = request.getParameter("id");
    
    Negocio nego = new Negocio();
    EventoDTO evento = nego.consultarId(id);
    
    session.setAttribute("id", id);
    session.setAttribute("nombre", evento.getNombre());
    session.setAttribute("fecha", evento.getFecha());
    session.setAttribute("hora", evento.getHora());
    session.setAttribute("lugar", evento.getLugar());
    session.setAttribute("ciudad", evento.getCiudad());
    session.setAttribute("participantes", evento.getParticipantes());
    session.setAttribute("tipo_evento", evento.getTipo_evento());
    session.setAttribute("url", evento.getUrl());
    session.setAttribute("ruta_imagen", evento.getImagen());
    session.setAttribute("descripcion", evento.getDescripcion());
    session.setAttribute("entidades_adscritas", evento.getEntidades_adscritas());
    session.setAttribute("logros", evento.getLogros());
    session.setAttribute("sectores_economicos", evento.getSectores_economicos());
    
    response.sendRedirect("../8.1.editarEvento.jsp");  
    

%>