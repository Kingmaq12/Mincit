<%-- 
    Document   : guardarDatos
    Created on : 18/10/2016, 04:43:30 PM
    Author     : CESAR
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<%
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
    String[] sector_economico = request.getParameterValues("sector_economico");
    String url = request.getParameter("url");
    String[] logros = request.getParameterValues("logros");
    String descripcion = request.getParameter("descripcion");
   
    session.setAttribute("nombre", nombre );
    session.setAttribute("fecha", fecha);
    session.setAttribute("hora", hora);
    session.setAttribute("lugar", lugar);
    session.setAttribute("entidad_adscrita", entidad_adscrita);
    session.setAttribute("continente", continente);
    session.setAttribute("pais", pais);
    session.setAttribute("ciudad", ciudad);
    session.setAttribute("participantes", participantes);
    session.setAttribute("tipo_evento", tipo_evento);
    session.setAttribute("sector_economico", sector_economico);
    session.setAttribute("url", url);
    session.setAttribute("logros", logros);
    session.setAttribute("descripcion", descripcion);
    
    session.setAttribute("nombre_imagen", nombre);
    
    
    
    String rta="S";
%>

<%= rta%>