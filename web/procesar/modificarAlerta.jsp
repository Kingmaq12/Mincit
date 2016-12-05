<%-- 
    Document   : modificarAlerta1
    Created on : 4/12/2016, 06:08:26 PM
    Author     : CESAR
--%>

<%@page import="ufps.mincit.negocio.administrador.Administrador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    
    String numero = request.getParameter("numero");
    String alerta = request.getParameter("alerta");

    Administrador admin = new Administrador();
    String rta = admin.modificarAlerta(numero, alerta);
    
%>

<%= rta%>

