<%-- 
    Document   : contactar
    Created on : 9/09/2016, 02:58:02 PM
    Author     : user
--%>

<%@page import="ufps.mincit.negocio.visitante.Visitante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    
    String nombre_empresa = request.getParameter("nombre_empresa");
    String nombre_empleado = request.getParameter("nombre_empleado");
    String email = request.getParameter("email");
    String asunto = request.getParameter("asunto");
    String mensaje = request.getParameter("mensaje");

    Visitante visi = new Visitante();
    boolean sesion = visi.recibirMensaje(nombre_empresa,nombre_empleado, email, asunto, mensaje);

    String rta = "";
    if (sesion) {
        rta = "S";
    } else {
        rta = "N";
    }
%>

<%= rta%>
