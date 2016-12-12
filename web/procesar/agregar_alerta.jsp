<%-- 
    Document   : agregar_alerta
    Created on : 9/12/2016, 05:26:21 PM
    Author     : CESAR
--%>
<%@page import="ufps.mincit.datos.dto.EventoDTO"%>
<%@page import="ufps.mincit.negocio.Negocio"%>
<%

    String id = request.getParameter("id");
    
    Negocio nego = new Negocio();
    EventoDTO evento = nego.consultarId(id);
    
    session.setAttribute("id", id);
    session.setAttribute("nombre", evento.getNombre());
    
    response.sendRedirect("../ver_alerta_especifica.jsp");  
    

%>