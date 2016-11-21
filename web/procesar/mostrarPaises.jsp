<%-- 
    Document   : mostrarPaises
    Created on : 20/11/2016, 04:44:57 PM
    Author     : CESAR
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ufps.mincit.negocio.Negocio"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

    String continente = request.getParameter("continente");
    System.out.println("continente:"+continente);
    Negocio neg = new Negocio();
    ArrayList<String> paises = neg.mostrarPaises(continente);

%>

<label>País</label>    
<select class="form-control" name="pais" id="pais">
    <option value="ninguno">-No seleccionado-</option>
    <%        for (String e : paises) {
    %>
    <option value="<%=e%>"><%=e%></option>
    <%
        }
    %>
</select>