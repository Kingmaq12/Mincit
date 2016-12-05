<%-- 
    Document   : mostrarPaises
    Created on : 20/11/2016, 04:44:57 PM
    Author     : CESAR
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ufps.mincit.negocio.Negocio"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
        <script src="procesar/ajax/procesos.js"></script>
<%

    String continente = request.getParameter("continente");
    
    Negocio neg = new Negocio();
    ArrayList<String> paises = neg.mostrarPaisesC(continente);

%>

    <label>Paises de este Continente</label>    
    <select class="form-control" name="pais" id="pais" >
        <option value="ninguno">-No seleccionado-</option>
        <%        for (String e : paises) {

                String[] x = e.split("-");

        %>
        <option value="<%=x[0]%>"><%=x[1]%></option>
        <%
            }
        %>
    </select>
