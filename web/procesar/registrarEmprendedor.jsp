<%-- 
    Document   : registrarEmprendedor
    Created on : 30-nov-2016, 14:31:51
    Author     : ALEJANDRA
--%>
<%@page import="ufps.mincit.negocio.administrador.Administrador"%>
<%

String valor = request.getParameter("valor");
String nombre= request.getParameter("nombre");
String cedula= request.getParameter("cedula");
String email = request.getParameter("email");

Administrador neg = new Administrador();

String resultado = neg.registrarResultadoEmprendedor(valor,nombre,cedula,email);

session.setAttribute("resultado_emprendedor", resultado);

String rta="S";
%>

<%= rta%>