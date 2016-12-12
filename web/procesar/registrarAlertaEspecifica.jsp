<%-- 
    Document   : registrarAlertaEspecifica
    Created on : 10/12/2016, 03:06:32 PM
    Author     : CESAR
--%>

<%@page import="ufps.mincit.negocio.administrador.Administrador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%

String id_evento = (String) session.getAttribute("id");
String fecha = request.getParameter("alertaNueva");
String descripcion = request.getParameter("descripcion");

Administrador admin = new Administrador();

admin.registrarAlertaEspe(id_evento, fecha, descripcion);

 response.sendRedirect("../ver_alerta_especifica.jsp");  

%>
