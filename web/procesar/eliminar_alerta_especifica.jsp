<%-- 
    Document   : eliminar_alerta_especifica
    Created on : 10/12/2016, 11:20:19 AM
    Author     : CESAR
--%>

<%@page import="ufps.mincit.negocio.administrador.Administrador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%


    String id_alerta = request.getParameter("id");
    
    Administrador admin = new Administrador();
    
    admin.eliminarAlertaEspe(id_alerta);
    
    response.sendRedirect("../ver_alerta_especifica.jsp");  

%>
