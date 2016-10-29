<%-- 
    Document   : iniciar
    Created on : 6/09/2016, 09:06:20 PM
    Author     : CESAR
--%>

<%@page import="ufps.mincit.negocio.Negocio"%>
<%@page import="ufps.mincit.negocio.administrador.Administrador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    
    String antigua = request.getParameter("antigua");
    String nueva = request.getParameter("nueva");
    String nueva2 = request.getParameter("nueva2");
    int tipo = (Integer)session.getAttribute("tipo");
    String cedula = (String) session.getAttribute("cedula");
    String rta="N";
    
    Negocio neg = new Negocio();
    boolean validaAnt = neg.consultarContraseña(cedula,antigua);
    
    if(validaAnt){
        
        if(nueva.equalsIgnoreCase(nueva2)){
        
           if(neg.cambiarContraseña(cedula,String.valueOf(tipo),nueva)){
        
               rta="S";
           }
        }
    }
    
%>

<%= rta%>