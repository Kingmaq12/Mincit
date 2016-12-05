<%-- 
    Document   : Consultar
    Created on : 20-oct-2016, 11:02:01
    Author     : ALEJANDRA
--%>

<%@page import="ufps.mincit.datos.dto.EventoDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ufps.mincit.negocio.administrador.Administrador"%>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<!DOCTYPE html>
<html lang="en" class="app">

    <head>
        <meta charset="utf-8">
        <meta name="robots" content="all,follow">
        <meta name="googlebot" content="index,follow,snippet,archive">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="tipo_contenido"  content="text/html;" http-equiv="content-type" charset="utf-8">
        <title>Mincit Eventos</title>

        <meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" /> 
        <link rel="stylesheet" href="css/bootstrap.css" type="text/css" />
        <link rel="stylesheet" href="css/animate.css" type="text/css" />
        <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css" />
        <link rel="stylesheet" href="css/font.css" type="text/css" />

        <link rel="stylesheet" href="css/app.css" type="text/css" />
        <link rel="stylesheet" href="css/jquery.bxslider.css">    
        <script src="procesar/ajax/procesos.js"></script>
    </head>

    <body>
        <%
            response.setContentType("text/html;charset=UTF-8");
            request.setCharacterEncoding("UTF-8");

            String fechaI = request.getParameter("fechaI");
            String fechaF = request.getParameter("fechaF");
            String entidad = request.getParameter("entidad");
            String pais = request.getParameter("pais");
            String ciudad = request.getParameter("ciudad");
            String continente = request.getParameter("continente");
            String sector = request.getParameter("sector");
            String logro = request.getParameter("logro");

            Administrador n = new Administrador();
            ArrayList<EventoDTO> p = n.consultarEventos(fechaI, fechaF, entidad, pais, ciudad, continente, sector, logro);
            if (p != null) {
        %>
        <div class="container col-md-10">
            <div class="col-md-12 ">
                <div class="text-center">
                    <h2>Eventos Encontrados</h2>
                </div>
                <hr>
            </div>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>NOMBRE</th>
                        <th>FECHA Y HORA</th>
                        <th>LUGAR Y CIUDAD</th>
                        <th>Opción</th>
                    </tr>
                </thead>
                <tbody>
                    <%     for (EventoDTO e : p) {

                    %>     
                    <tr>
                        <td><%=e.getNombre()%></td>
                        <td><%=e.getFecha()%> <%=e.getHora()%></td>
                        <td><%=e.getLugar()%> <%=e.getCiudad()%></td>
                        <td>
                            <div class="btn-group">
                                <button type="button" class="btn btn-primary dropdown-toggle"
                                        data-toggle="dropdown">
                                    Opciones <span class="glyphicon caret"></span>
                                </button>

                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="procesar/editar.jsp?id=<%=e.getId()%>">Editar</a></li>
                                    <li><a href="#">Agregar Alerta</a></li>
                                    <li><a href="#">Enviar Invitaciones</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#">Publicar Facebook y Twitter</a></li>
                                </ul>
                            </div> 
                            <!-- <button type="submit" name="submit" class="btn btn-primary btn-lg" required="required" id="myBtn"><span class="glyphicon glyphicon-ok-circle"></span> Descripción</button> -->
                        </td>
                    </tr>
                    <%
                        }
                    %>  
                </tbody>
            </table>
        </div>   

        <%
        } else {
        %>  
        <div class="alert alert-warning alert-dismissible fade in" role="alert">
            <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                <span aria-hidden="true">&times;</span>
            </button>
            <strong>¡Advertencia!</strong> No se han encontrado Eventos con esta descripción.
        </div>    
        <%          }
        %>

        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script>
            window.jQuery || document.write('<script src="js/jquery-1.11.0.min.js"><\/script>')
        </script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

        <script src="js/jquery.min.js"></script>
        <!-- Bootstrap -->
        <script src="js/bootstrap.js"></script>
        <!-- App -->
        <script src="js/app.js"></script>
        <script src="js/app.plugin.js"></script>
        <script src="js/slimscroll/jquery.slimscroll.min.js"></script>

    </body>

</html>