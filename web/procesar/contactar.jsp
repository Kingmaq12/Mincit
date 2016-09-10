<%-- 
    Document   : contactar
    Created on : 9/09/2016, 02:58:02 PM
    Author     : user
--%>

<%@page import="ufps.mincit.negocio.Negocio"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    
    String nombre_empresa = request.getParameter("nombre_empresa");
    String email = request.getParameter("email");
    String asunto = request.getParameter("asunto");
    String mensaje = request.getParameter("mensaje");

    Negocio nego = new Negocio();
    boolean sesion = nego.recibirMensaje(nombre_empresa, email, asunto, mensaje);

    String rta = "";
    if (sesion) {
        rta = "S";
    } else {
        rta = "N";
    }
%>

<%= rta%>
