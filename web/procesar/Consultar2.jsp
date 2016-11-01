<%-- 
    Document   : Consultar
    Created on : 20-oct-2016, 11:02:01
    Author     : ALEJANDRA
--%>

<%@page import="ufps.mincit.datos.dto.EventoDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ufps.mincit.negocio.Negocio"%>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="robots" content="all,follow">
        <meta name="googlebot" content="index,follow,snippet,archive">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="tipo_contenido"  content="text/html;" http-equiv="content-type" charset="utf-8">
        <title>Mincit Eventos</title>

        <meta name="keywords" content="">

        <link href='http://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,500,700,800' rel='stylesheet' type='text/css'>

        <!-- Bootstrap and Font Awesome css -->
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

        <!-- Css animations  -->
        <link href="css/animate.css" rel="stylesheet">

        <!-- Theme stylesheet, if possible do not edit this stylesheet -->
        <link href="css/style.green.css" rel="stylesheet" id="theme-stylesheet">

        <!-- Custom stylesheet - for your changes -->
        <link href="css/custom.css" rel="stylesheet">

        <!-- Responsivity for older IE -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
            <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

        <!-- Favicon and apple touch icons-->
        <link rel="shortcut icon" href="img/logoMincit.png" type="image/x-icon" />
        <link rel="apple-touch-icon" href="img/apple-touch-icon.png" />
        <link rel="apple-touch-icon" sizes="57x57" href="img/apple-touch-icon-57x57.png" />
        <link rel="apple-touch-icon" sizes="72x72" href="img/apple-touch-icon-72x72.png" />
        <link rel="apple-touch-icon" sizes="76x76" href="img/apple-touch-icon-76x76.png" />
        <link rel="apple-touch-icon" sizes="114x114" href="img/apple-touch-icon-114x114.png" />
        <link rel="apple-touch-icon" sizes="120x120" href="img/apple-touch-icon-120x120.png" />
        <link rel="apple-touch-icon" sizes="144x144" href="img/apple-touch-icon-144x144.png" />
        <link rel="apple-touch-icon" sizes="152x152" href="img/apple-touch-icon-152x152.png" />
        <!-- owl carousel css -->

        <link href="css/owl.carousel.css" rel="stylesheet">
        <link href="css/owl.theme.css" rel="stylesheet">
        <script src="procesar/ajax/procesos.js"></script>
    </head>

    <body>
        <%
            response.setContentType("text/html;charset=UTF-8");
            request.setCharacterEncoding("UTF-8");
            String fecha = request.getParameter("fecha");
            String entidad = request.getParameter("entidad");
            String pais = request.getParameter("pais");
            String ciudad = request.getParameter("ciudad");
            String continente = request.getParameter("continente");
            String sector = request.getParameter("sector");
            String logro = request.getParameter("logro");
            Negocio n = new Negocio();
            ArrayList<EventoDTO> p = n.consultarEventos2(fecha, entidad, pais, ciudad, continente, sector, logro);
            if (p != null) {
        %>
        <div class="row portfolio">
            <%      for (EventoDTO e : p) {

            %> 
            <div class="col-sm-6 col-md-3">
                <div class="box-image">
                    <div class="image">
                        <img src="img/portfolio-2.jpg" alt="" class="img-responsive">
                    </div>
                    <div class="bg"></div>
                    <div class="name">
                        <h3><a href=""><%=e.getNombre()%></a></h3> 
                    </div>
                    <div class="text">
                        <p class="hidden-sm hidden-lg hidden-md">Fecha: <%=e.getFecha()%>, <%=e.getHora()%>, Ñugar:<%=e.getLugar()%></p>
                        <p class="buttons">
                            <a href="ver_evento.jsp?id=<%=e.getId()%>" class="btn btn-template-transparent-primary">Ver Detalles </a>
                            <label></label>
                            <a href="#" class="btn btn-template-transparent-primary">Página del Evento</a>
                        </p>
                    </div>
                </div>
                <!-- /.box-image -->

            </div>
            <%    }
            %>
        </div>
        <%
        } else {
        %>  
        <div class="container-fluid text-center">
            <br><br>
            <label class="label label-warning" id="campo" name="campo">No se hay Eventos.</label>
            <br><br>
        </div>
        <%          }
        %>


        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script>
            window.jQuery || document.write('<script src="js/jquery-1.11.0.min.js"><\/script>')
        </script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

        <script src="js/jquery.cookie.js"></script>
        <script src="js/waypoints.min.js"></script>
        <script src="js/jquery.counterup.min.js"></script>
        <script src="js/jquery.parallax-1.1.3.js"></script>
        <script src="js/front.js"></script>

        <!-- owl carousel -->
        <script src="js/owl.carousel.min.js"></script>

    </body>

</html>