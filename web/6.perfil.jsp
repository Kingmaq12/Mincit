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
    <body class="hold-transition skin-green-light sidebar-mini">
        <div class="wrapper">
            <header class="main-header">
                <a href="6.perfil.jsp" class="logo">
                    <span class="logo-mini"><b>MINCIT</b></span>
                    <!-- logo for regular state and mobile devices -->
                    <span class="logo-lg"><b>Admin</b>MINCIT</span>
                </a>
                <!-- barra de cabecera -->
                <nav class="navbar navbar-static-top" role="navigation">
                    <!-- botón de la barra lateral de palanca-->
                    <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
                        <span class="sr-only">Toggle navigation</span>
                    </a>
                    <!-- Menú derecho barra de navegación -->
                    <div class="navbar-custom-menu">
                        <ul class="nav navbar-nav">
                            <!-- Menú de cuentas de usuario -->
                            <li class="dropdown user user-menu">
                                <!-- Menu Toggle Button -->
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                    <!-- imagen usuario-->
                                    <img src="img/user.jpg" class="user-image" alt="User Image">
                                    <!-- hidden-xs hides the username on small devices so only the image appears. -->
                                    <span class="hidden-xs">Administrador</span>
                                </a>
                                <ul class="dropdown-menu">
                                    <!-- la imagen del usuario en el menú -->
                                    <li class="user-header">
                                        <img src="img/user.jpg" class="img-circle" alt="User Image">
                                        <p>
                                            Eventos MINCIT
                                        </p>
                                    </li>
                                    <!-- Menu Footer-->
                                    <li class="user-footer">
                                        <div class="pull-left">
                                            <a href="6.perfil.jsp" class="btn btn-default btn-flat">Perfil</a>
                                        </div>
                                        <div class="pull-right">
                                            <a href="index.jsp" class="btn btn-default btn-flat">Cerrar Ssesión</a>
                                        </div>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </nav>
            </header>
            <!-- la columna del lado izquierdo. contiene el logotipo y la barra lateral -->
            <aside class="main-sidebar">

                <!-- recuadro-->
                <section class="sidebar">

                    <!-- de usuario del panel de la barra lateral (opcional) -->
                    <div class="user-panel">
                        <div class="pull-left image">
                            <img src="img/user.jpg" class="img-circle" alt="User Image">
                        </div>
                        <div class="pull-left info">
                            <p>ADMINISTRADOR</p>
                        </div>
                    </div>
                    <!-- Menú barra lateral -->
                    <ul class="sidebar-menu">
                        <li class="header">Menú Principal</li>
                        <!-- Opcionalmente, se puede añadir iconos a los enlaces -->
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
                    <!-- /.sidebar-menu -->
                </section>
                <!-- /.sidebar -->
            </aside>

            <!-- Envoltura contenido. Contiene contenido de la página -->
            <div class="content-wrapper">
                <!-- Encabezado de contenido (Encabezado de página) -->
                <section class="content-header">
                    <h1>
                        Perfil Principal
                        <small>Bienvenido</small>
                    </h1>
                </section>

                <!-- Contenido principal -->
                <section class="content">

                    <!-- Su contenido de la página Aquí -->

                </section>
                <!-- /.content -->
            </div>
            <!-- /.content-wrapper -->

            <!-- pie de página principal -->
            <footer class="main-footer">
                <!-- Por defecto, a la izquierda-->
                <div class="copyright">
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
            </footer>
            <div class="control-sidebar-bg"></div>
        </div>

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
