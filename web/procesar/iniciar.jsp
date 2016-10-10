<%-- 
    Document   : iniciar
    Created on : 6/09/2016, 09:06:20 PM
    Author     : CESAR
--%>

<!--@page import="ufps.mincit.dto.AdministradorDTO" -->
<%@page import="ufps.mincit.negocio.Negocio"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    
    String cedula = request.getParameter("cedula");
    String contraseña = request.getParameter("contrasenia");

    Negocio nego = new Negocio();
    boolean sesion = nego.iniciarSesion(cedula, contraseña);

    String rta = "";
    if (sesion) {
        rta = "S";
    } else {
        rta = "N";
    }
%>

<%= rta%>





