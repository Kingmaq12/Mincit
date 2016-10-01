<%-- 
    Document   : calendario
    Created on : 6/09/2016, 08:12:43 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>MINCIT Eventos</title>

        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="css/animate.css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/font-awesome.css">
        <link rel="stylesheet" href="css/jquery.bxslider.css">
        <link href="css/overwrite.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/normalize.css" />
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/set1.css" />
        <link href="css/style.css" rel="stylesheet">

    </head>
    <body>
        <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header2 ">							
                    <div class="menu dropdown drop nav-tabss">
                        <li role="presentation" data-toggle="dropdown" class="nav nav-tabs active"><h1>Administrador   <span class="glyphicon glyphicon-align-justify"></span></h1></li>
                        <ul class="dropdown-menu nav nav-tabs" role="tablist">
                            <li><a href="6.perfil.jsp">Perfil</a></li>
                            <li><a href="7.registrar_evento.jsp">Registrar Evento</a></li>
                            <li><a href="8.busquedaAd.jsp">Buscar Eventos</a></li>
                            <li><a href="9.ver_comentario.jsp">Ver Comentarios</a></li>
                            <li><a href="10.ver_alertas.jsp">Ver Alertas</a></li>
                            <li><a href="11.cuestionario.jsp">Registrar Cuestionario</a></li>
                            <li><a href="12.ver_estadisticas.jsp">Ver Estadisticas</a></li>
                            <li><a href="13.configuracion.jsp">Configuración</a></li>
                            <li><a href="1.index.jsp">Cerrar Sesión</a></li>
                        </ul>
                    </div>
                </div>	
                 <div class="navbar-perfil">
                    <a  href="6.perfil.jsp"><img class="bajar-img" src="img/lg.png"></a>
                </div>
            </div>
        </nav>

        <footer>
            <div class="last-div">
                <div class="container">
                    <div class="row">
                        <div class="copyright">
                            © 2016 MINCIT| <a target="_blank" href=""> MINCIT Eventos</a>
                        </div>		
                    </div>
                </div>
                <div class="container">
                    <div class="row">
                        <ul class="social-network">
                            <li><a href="#" data-placement="top" title="Facebook"><i class="fa fa-facebook fa-1x"></i></a></li>
                            <li><a href="#" data-placement="top" title="Twitter"><i class="fa fa-twitter fa-1x"></i></a></li>
                            <li><a href="#" data-placement="top" title="Linkedin"><i class="fa fa-linkedin fa-1x"></i></a></li>
                            <li><a href="#" data-placement="top" title="Pinterest"><i class="fa fa-pinterest fa-1x"></i></a></li>
                            <li><a href="#" data-placement="top" title="Google plus"><i class="fa fa-google-plus fa-1x"></i></a></li>
                        </ul>
                    </div>
                </div>

                <a href="" class="scrollup"><i class="fa fa-chevron-up"></i></a>	


            </div>	
        </footer>

        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery-2.1.1.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>
        <script src="js/wow.min.js"></script>
        <script src="js/jquery.easing.1.3.js"></script>
        <script src="js/jquery.isotope.min.js"></script>
        <script src="js/jquery.bxslider.min.js"></script>
        <script type="text/javascript" src="js/fliplightbox.min.js"></script>
        <script src="js/functions.js"></script>
        <script type="text/javascript">$('.portfolio').flipLightBox()</script>
    </body>
</html>
