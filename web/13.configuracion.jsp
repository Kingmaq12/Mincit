<%@page import="ufps.mincit.datos.dto.Usuario"%>
<%@page import="ufps.mincit.negocio.Negocio"%>
<!DOCTYPE html>
<html lang="en" class="app">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>MINCIT Eventos</title>
        <meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" /> 
        <link rel="stylesheet" href="css/bootstrap.css" type="text/css" />
        <link rel="stylesheet" href="css/animate.css" type="text/css" />
        <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css" />
        <link rel="stylesheet" href="css/font.css" type="text/css" />

        <link rel="stylesheet" href="css/app.css" type="text/css" />
        <link rel="stylesheet" href="css/jquery.bxslider.css">  

    </head>
    <body>
        <section class="vbox">
            <header class="bg-dark dk header navbar navbar-fixed-top-xs">
                <div class="navbar-header aside-md">
                    <img src="img/lg.png">
                </div>
                <ul class="nav navbar-nav hidden-xs">
                    <li>
                        <div class="m-t m-l">
                            <a href="6.perfil.jsp" class="dropdown-toggle btn btn-xs btn-primary" title="Inicio"><i class="fa fa-long-arrow-up"></i></a>
                        </div>
                    </li>
                </ul>      
                <ul class="nav navbar-nav navbar-right m-n hidden-xs nav-user">
                    <li class="dropdown hidden-xs">
                        <a href="#" class="dropdown-toggle dker" data-toggle="dropdown"><i class="fa fa-fw fa-search"></i></a>
                        <section class="dropdown-menu aside-xl animated fadeInUp">
                            <section class="panel bg-white">
                                <form role="search">
                                    <div class="form-group wrapper m-b-none">
                                        <div class="input-group">
                                            <input type="text" class="form-control" placeholder="Search">
                                            <span class="input-group-btn">
                                                <button type="submit" class="btn btn-info btn-icon"><i class="fa fa-search"></i></button>
                                            </span>
                                        </div>
                                    </div>
                                </form>
                            </section>
                        </section>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <span class="thumb-sm avatar pull-left">
                                <img src="img/user.jpg">
                            </span>
                            Administrador <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu animated fadeInRight">
                            <span class="arrow top"></span>
                            <li>
                                <a href="13.configuracion.jsp">Configuración</a>
                            </li>
                            <li>
                                <a href="6.perfil.jsp">Perfil</a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="index.jsp" data-toggle="ajaxModal" >Cerrar Sesión</a>
                            </li>
                        </ul>
                    </li>
                </ul>      
            </header>
            <section>
                <section class="hbox stretch">
                    <!-- .aside -->
                    <aside class="bg-dark lter b-r aside-md hidden-print" id="nav">          
                        <section class="vbox">
                            <header class="header bg-primary lter text-center clearfix">
                                <div class="btn-group">
                                    <button type="button" class="btn btn-sm btn-dark btn-icon" title="New event"><i class="fa fa-plus"></i></button>
                                    <div class="btn-group hidden-nav-xs">
                                        <button type="button" class="btn btn-sm btn-primary dropdown-toggle" data-toggle="dropdown">
                                            Publicar un Evento
                                            <span class="caret"></span>
                                        </button>
                                        <ul class="dropdown-menu text-left">
                                            <li><a href="7.registrar_evento.jsp">Evento Nuevo</a></li>
                                            <li><a href="8.busquedaAd.jsp">Consultar Eventos</a></li>
                                        </ul>
                                    </div>
                                </div>
                            </header>
                            <section class="w-f scrollable">
                                <div class="slim-scroll" data-height="auto" data-disable-fade-out="true" data-distance="0" data-size="5px" data-color="#333333">
                                    <!-- nav -->
                                    <nav class="nav-primary hidden-xs">
                                        <ul class="nav">
                                            <li>
                                                <a href="7.registrar_evento.jsp"  >
                                                    <i class="fa fa-pencil icon">
                                                        <b class="bg-danger"></b>
                                                    </i>
                                                    <span>Nuevo Evento</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="8.busquedaAd.jsp"  >
                                                    <i class="fa fa-search icon">
                                                        <b class="bg-info"></b>
                                                    </i>
                                                    <span>Consultar Evento</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="9.ver_comentario.jsp"  >
                                                    <i class="fa fa-book icon">
                                                        <b class="bg-primary"></b>
                                                    </i>
                                                    <span>Comentarios</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="10.ver_alertas.jsp"  >
                                                    <i class="fa fa-ticket icon">
                                                        <b class="bg-warning"></b>
                                                    </i>
                                                    <span>Alertas</span>
                                                </a>
                                            </li>

                                            <li class="active">
                                                <a href="13.configuracion.jsp"  >
                                                    <i class="fa fa-wrench icon">
                                                        <b class="bg-dark"></b>
                                                    </i>
                                                    <span>Configuración</span>
                                                </a>
                                            </li>
                                        </ul>
                                    </nav>
                                    <!-- / nav -->
                                </div>
                            </section>

                            <footer class="footer lt hidden-xs b-t b-light">
                                <a href="#nav" data-toggle="class:nav-xs" class="pull-right btn btn-sm btn-default btn-icon">
                                    <i class="fa fa-angle-left text"></i>
                                    <i class="fa fa-angle-right text-active"></i>
                                </a>

                            </footer>
                        </section>
                    </aside>
                    <!-- /.aside -->
                    <section id="content">
                        <section class="vbox">
                            <header class="header bg-white b-b b-light">
                                <p>Perfil del Administrador. Bienvenido.</p>
                            </header>
                            <section class="scrollable">
                                <section class="hbox stretch">

                                    <section>
                                        <div class="container contacto delinear">
                                            <div class="service">
                                                <div class="col-md-6 col-md-offset-3">
                                                    <div class="text-center3">
                                                        <h2>Configuración</h2>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="services">
                                                <div class="container">
                                                    <div class="col-md-5">
                                                        <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
                                                            <h4>Cambiar Contraseña:</h4>					
                                                            <div class="icon">
                                                                <i class="fa fa-desktop fa-3x"></i>
                                                            </div>						
                                                            <div class="ficon">
                                                                <button type="button" class="btn btn-primary btn-s-sm" id="myBtn" ><span class="glyphicon glyphicon-ok-circle"></span> Abrir</button>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="1.0s">
                                                            <h4>Cambiar Datos:</h4>
                                                            <div class="icon">
                                                                <i class="fa fa-desktop fa-3x"></i>
                                                            </div>
                                                            <div class="ficon">
                                                                <button type="button" class="btn btn-primary btn-s-sm" id="myBtn2" ><span class="glyphicon glyphicon-ok-circle"></span> Abrir</button>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>

                                                <%

                                                    Negocio neg = new Negocio();

                                                    Usuario usu = neg.consultarUsuarioTipo(1);
                                                    session.setAttribute("cedula", usu.getCedula());
                                                    session.setAttribute("tipo", usu.getTipo_usuario());
                                                %>

                                                <div class="col-sm-12">
                                                    <hr>
                                                    <h3>Información Personal</h3><br>
                                                </div>
                                                <div class="col-sm-4">
                                                    <h4>Nombre de Usuario:</h4>

                                                    <p><%=usu.getNombre()%></p>
                                                </div>
                                                <div class="col-sm-4">
                                                    <h4>Email:</h4>

                                                    <p><%=usu.getEmail()%></p>
                                                </div>
                                                <div class="col-sm-4">
                                                    <h4>Cedula:</h4>

                                                    <p><%=usu.getCedula()%></p>
                                                </div>

                                            </div>

                                            <!-- Modal -->
                                            <div class="modal fade" id="myModal" role="dialog">
                                                <div class="modal-dialog">

                                                    <!-- Modal content-->
                                                    <div class="modal-content">
                                                        <div class="modal-header" ALIGN=center>
                                                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                            <h4 class="modal-title">Cambiar Contraseña</h4>
                                                        </div>
                                                        <div class="modal-body">
                                                            <form name="cambiarContrasenia" id="cambiarContrasenia" method="POST" action="javascript:cambiarContrasenia()">
                                                                <label>Contraseña antigua: </label>
                                                                <input type="text" name="antigua" id="antigua" class="form-control" required="required" >
                                                                <br>
                                                                <label>Contraseña nueva: </label>
                                                                <input type="text" name="nueva" id="nueva" class="form-control" required="required" >
                                                                <br>
                                                                <label>Confirme contraseña nueva: </label>
                                                                <input type="text" name="nueva2" id="nueva2" class="form-control" required="required" >
                                                                <br>
                                                                <br>
                                                                <div ALIGN=center>
                                                                    <button type="submit" name="submit" class="btn btn-primary btn-lg" required="required"><span class="glyphicon glyphicon-ok-circle"></span> Cambiar Contraseña</button>
                                                                </div>
                                                                <br>
                                                                <label id="campo" name="campo"></label>
                                                            </form>
                                                        </div>
                                                        <div class="modal-footer">

                                                        </div>
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="modal fade" id="myModal2" role="dialog">
                                                <div class="modal-dialog">

                                                    <!-- Modal content-->
                                                    <div class="modal-content">
                                                        <div class="modal-header">
                                                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                            <h4 class="modal-title">Cambiar Datos</h4>
                                                        </div>
                                                        <div class="modal-body">
                                                            <p>The <strong>show.bs.modal</strong> event occurs when the modal is about to be shown.</p>
                                                        </div>
                                                        <div class="modal-footer">
                                                            <button type="button" class="btn btn-primary btn-lg" data-dismiss="modal">Close</button>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </section>


                                </section>
                            </section>
                        </section>
                    </section>
                </section>
            </section>
        </section>
        <script src="js/jquery.min.js"></script>
        <!-- Bootstrap -->
        <script src="js/bootstrap.js"></script>
        <!-- App -->
        <script src="js/app.js"></script>
        <script src="js/app.plugin.js"></script>
        <script src="js/slimscroll/jquery.slimscroll.min.js"></script>
         <script src="procesar/ajax/procesos.js"></script>



        <script>
            $(document).ready(function() {
                $("#myBtn").click(function() {
                    $("#myModal").modal("show");
                });
                $("#myModal").on('show.bs.modal', function() {
                    //alert('The modal is about to be shown.');
                });
            });
        </script>

        <script>
            $(document).ready(function() {
                $("#myBtn2").click(function() {
                    $("#myModal2").modal("show");
                });
                $("#myModal").on('show.bs.modal', function() {
                    //alert('The modal is about to be shown.');
                });
            });
        </script>

       
    </body>
</html>
