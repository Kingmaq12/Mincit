<%-- 
    Document   : registrar
    Created on : 17/10/2016, 05:27:36 PM
    Author     : CESAR
--%>

<%@page import="ufps.mincit.negocio.administrador.Administrador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    
    String nombre = request.getParameter("nombre");
    String fecha = request.getParameter("fecha");
    String hora = request.getParameter("hora");
    String lugar = request.getParameter("lugar");
    String patrocinadores = request.getParameter("patrocinadores");
    String continente = request.getParameter("continente");
    String pais = request.getParameter("pais");
    String ciudad = request.getParameter("ciudad");
    String participantes = request.getParameter("participantes");
    String tipo_evento = request.getParameter("tipo_evento");
    String sector_economico = request.getParameter("sector_economico");
    String url= request.getParameter("url");
    String imagen = request.getParameter("imagen");
    String logros = request.getParameter("logros");
    String descripcion = request.getParameter("descripcion");
    
    System.out.println("Entro a registrar.jsp");
    Administrador admin = new Administrador();
    String rta = admin.registrarEvento(nombre, fecha,hora,lugar,patrocinadores,continente,pais,ciudad,participantes,tipo_evento,sector_economico,url,imagen,logros,descripcion);
    
    
    %>