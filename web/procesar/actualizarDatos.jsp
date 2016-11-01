<%-- 
    Document   : actualizarDatos
    Created on : 1/11/2016, 03:23:26 PM
    Author     : CESAR
--%>

<%@page import="ufps.mincit.negocio.Negocio"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%

    response.setContentType("text/html;charset-UTF-8");
    request.setCharacterEncoding("UTF-8");

    String id =(String)session.getAttribute("id");
    String nombre = request.getParameter("nombre");
    String fecha = request.getParameter("fecha");
    String hora = request.getParameter("hora");
    String lugar = request.getParameter("lugar");
    String entidad_adscrita = request.getParameter("entidad_adscrita");
    String continente = request.getParameter("continente");
    String pais = request.getParameter("pais");
    String ciudad = request.getParameter("ciudad");
    String participantes = request.getParameter("participantes");
    String tipo_evento = request.getParameter("tipo_evento");
    String sector_economico = request.getParameter("sector_economico");
    String url = request.getParameter("url");
    String logros = request.getParameter("logros");
    String descripcion = request.getParameter("descripcion");

    Negocio neg = new Negocio();
    
    String rta = neg.actualizarDatos(id,nombre, fecha, hora, lugar, entidad_adscrita, continente, pais, ciudad, participantes, tipo_evento, sector_economico, url,"", logros, descripcion);


%>

<%= rta%>