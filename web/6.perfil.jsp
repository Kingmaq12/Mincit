<%-- 
    Document   : index
    Created on : 6/09/2016, 08:23:30 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <link rel="stylesheet" href="css/jquery.bxslider.css">
        <link rel="stylesheet" type="text/css" href="css/normalize.css" />
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/set1.css" />
        <link href="css/overwrite.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">

        <!-- Font Awesome -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
        <!-- Ionicons -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="css/AdminLTE.min.css">
        <!-- AdminLTE Skins. Choose a skin from the css/skins
             folder instead of downloading all of them to reduce the load. -->
        <link rel="stylesheet" href="css/skins/_all-skins.min.css">
        <!-- iCheck -->
        <link rel="stylesheet" href="plugins/iCheck/flat/blue.css">
        <!-- Morris chart -->
        <link rel="stylesheet" href="plugins/morris/morris.css">
        <!-- jvectormap -->
        <link rel="stylesheet" href="plugins/jvectormap/jquery-jvectormap-1.2.2.css">
        <!-- Date Picker -->
        <link rel="stylesheet" href="plugins/datepicker/datepicker3.css">
        <!-- Daterange picker -->
        <link rel="stylesheet" href="plugins/daterangepicker/daterangepicker.css">
        <!-- bootstrap wysihtml5 - text editor -->
        <link rel="stylesheet" href="plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">

    </head>
    <body>
        <nav class="navbar navbar-default navbar-static-top ">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">
                        Administrador MINCIT
                    </a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">			
                    <form class="navbar-form navbar-left" method="GET" role="search">
                        <div class="form-group">
                            <input type="text" name="q" class="form-control" placeholder="Buscar">
                        </div>
                        <button type="submit" class="btn btn-default"><i class="glyphicon glyphicon-search"></i></button>
                    </form>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown ">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
                                Opciones
                                <span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li class="dropdown-header">Configuracion</li>
                                <li class="divider"></li>
                                <li><a href="#">Cerrar Sesión</a></li>
                            </ul>
                        </li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>
        <div class="container-fluid dar-color3">
            <div class="col-md-2 sidebar dar-color2">
                <ul class="nav nav-pills nav-stacked">
                    <li class="header">Menú Principal</li>
                    <!-- Opcionalmente, se puede añadir iconos a los enlaces -->
                    <li class="active"><a href="6.perfil.jsp"><i class="fa fa-book"></i>Perfil</a></li>
                    <li><a href="7.registrar_evento.jsp"><i class="fa fa-book"></i>Registrar Evento</a></li>
                    <li><a href="8.busquedaAd.jsp"><i class="fa fa-search"></i> <span>Buscar Eventos</span></a></li>
                    <li><a href="9.ver_comentario.jsp"><i class="fa fa-eye"></i> <span>Ver comentarios</span></a></li>
                    <li><a href="10.ver_alertas.jsp"><i class="fa fa-eye"></i> <span>Ver Alertas</span></a></li>
                    <li class="treeview">
                        <a href="#"><i class="fa fa-question-circle"></i> <span>Emprendedor</span>
                            <span class="pull-right-container">
                                <i class="fa fa-angle-left pull-right"></i>
                            </span>
                        </a>
                        <ul class="treeview-menu">
                            <li><a href="11.cuestionario.jsp">Realizar Cuestionario</a></li>
                            <li><a href="12.ver_estadistica.jsp">Ver Estadisticas</a></li>
                        </ul>
                    </li>
                    <li><a href="13.configuracion.jsp"><i class="fa fa-edit"></i> <span>Configuración</span></a></li>
                </ul>
            </div>
            <div class="col-md-10 content">
                <div class="panel-body">
                    <div class="row">
                        <div class="services ">
                             <div class="col-md-4 ">
                                <div class=" dar-color wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
                                    <hr>
                                    <h4>NOMBRE EVENTO</h4>					
                                    <div class="icon">
                                        <img  src="img/03.png" alt="evento">
                                    </div>						
                                    <p>fecha, lugar, tipo evento, tipo sector</p>
                                    <div class="icon">
                                        <button type="submit" name="submit" class="btn btn-primary" required="required"><span class="glyphicon glyphicon-ok-circle"></span>  Leer más</button>
                                        <hr>
                                    </div>
                                </div>					
                            </div>
                            
                        </div>
                    </div>
                </div>
            </div>

        </div>
        <footer>
            <div class="last-div">
                <div class="container">
                    <div class="row">
                        <div class="copyright">
                            © 2016 MINCIT| <a target="_blank" href="http://mincit.gov.co">MINCIT Eventos.</a>
                        </div>
                        <div class="copyright">
                            <a target="_blank" href="http://www.ufps.edu.co/ufps/index.php"><span class="glyphicon glyphicon-arrow-right"></span>Universidad Francisco de Paula Santander.</a>
                        </div>
                        <div class="copyright">
                            <a target="_blank" href="http://ingsistemas.ufps.edu.co/index.php"><span class="glyphicon glyphicon-book"></span>Ingenieria de Sistemas.</a>
                        </div>
                    </div>
                </div>
                <div class="container">
                    <div class="row">
                        <div class="pull-right hidden-xs">
                            <ul class="social-network">
                                <li><a href="https://www.facebook.com/MincomercioCo/" data-placement="top" title="Facebook"><i class="fa fa-facebook fa-1x"></i></a></li>
                                <li><a href="https://twitter.com/MincomercioCo" data-placement="top" title="Twitter"><i class="fa fa-twitter fa-1x"></i></a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>	
        </footer>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>
        <script src="js/wow.min.js"></script>
        <script src="js/jquery.easing.1.3.js"></script>
        <script src="js/jquery.isotope.min.js"></script>
        <script src="js/jquery.bxslider.min.js"></script>
        <script type="text/javascript" src="js/fliplightbox.min.js"></script>
        <script src="js/functions.js"></script>	
        <script type="text/javascript">$('.portfolio').flipLightBox()</script>
        <!-- jQuery 2.2.3 -->
        <script src="plugins/jQuery/jquery-2.2.3.min.js"></script>
        <!-- jQuery UI 1.11.4 -->
        <script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
        <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
        <script>
            $.widget.bridge('uibutton', $.ui.button);
        </script>
        <!-- Bootstrap 3.3.6 -->
        <script src="js/bootstrap.min.js"></script>
        <!-- Morris.js charts -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
        <script src="plugins/morris/morris.min.js"></script>
        <!-- Sparkline -->
        <script src="plugins/sparkline/jquery.sparkline.min.js"></script>
        <!-- jvectormap -->
        <script src="plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
        <script src="plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
        <!-- jQuery Knob Chart -->
        <script src="plugins/knob/jquery.knob.js"></script>
        <!-- daterangepicker -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js"></script>
        <script src="plugins/daterangepicker/daterangepicker.js"></script>
        <!-- datepicker -->
        <script src="plugins/datepicker/bootstrap-datepicker.js"></script>
        <!-- Bootstrap WYSIHTML5 -->
        <script src="plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
        <!-- Slimscroll -->
        <script src="plugins/slimScroll/jquery.slimscroll.min.js"></script>
        <!-- FastClick -->
        <script src="plugins/fastclick/fastclick.js"></script>
        <!-- AdminLTE App -->
        <!-- jQuery 2.2.3 -->
        <script src="plugins/jQuery/jquery-2.2.3.min.js"></script>
        <!-- AdminLTE App -->
        <script src="js/app.min.js"></script>
    </body>
</html>
