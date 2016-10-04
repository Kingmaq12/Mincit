<%-- 
    Document   : index
    Created on : 6/09/2016, 08:23:30 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" class="app">
    <head>
        <meta charset="utf-8" />
        <title>MINCIT EVENTOS</title>
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
                    <aside class="bg-light lter b-r aside-md hidden-print" id="nav">          
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
                                                <a href="9.ver_comentario.jsp"  >
                                                    <i class="fa fa-dashboard icon">
                                                        <b class="bg-danger"></b>
                                                    </i>
                                                    <span>Comentarios</span>
                                                </a>
                                            </li>
                                            <li class="active">
                                                <a href="10.ver_alertas.jsp"  >
                                                    <i class="fa fa-archive icon">
                                                        <b class="bg-warning"></b>
                                                    </i>
                                                    <span>Alertas</span>
                                                </a>
                                            </li>
                                            <li >
                                                <a href="11.cuestionario.jsp"  >
                                                    <i class="fa fa-envelope-o icon">
                                                        <b class="bg-primary dker"></b>
                                                    </i>
                                                    <span>Emprendedor</span>
                                                </a>
                                            </li>
                                            <li >
                                                <a href="12.ver_estadisticas.jsp"  >
                                                    <i class="fa fa-pencil icon">
                                                        <b class="bg-info"></b>
                                                    </i>
                                                    <span>Estadisticas</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="13.configuracion.jsp"  >
                                                    <i class="fa fa-edit icon">
                                                        <b class="bg-success"></b>
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
                                <div id="chat" class="dropup">
                                    <section class="dropdown-menu on aside-md m-l-n">
                                        <section class="panel bg-white">
                                            <header class="panel-heading b-b b-light">Active chats</header>
                                            <div class="panel-body animated fadeInRight">
                                                <p class="text-sm">No active chats.</p>
                                                <p><a href="#" class="btn btn-sm btn-default">Start a chat</a></p>
                                            </div>
                                        </section>
                                    </section>
                                </div>
                                <div id="invite" class="dropup">                
                                    <section class="dropdown-menu on aside-md m-l-n">
                                        <section class="panel bg-white">
                                            <header class="panel-heading b-b b-light">
                                                John <i class="fa fa-circle text-success"></i>
                                            </header>
                                            <div class="panel-body animated fadeInRight">
                                                <p class="text-sm">No contacts in your lists.</p>
                                                <p><a href="#" class="btn btn-sm btn-facebook"><i class="fa fa-fw fa-facebook"></i> Invite from Facebook</a></p>
                                            </div>
                                        </section>
                                    </section>
                                </div>
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
                                <p>Lugar donde puede ver y modificar las alertas de los eventos.</p>
                            </header>
                            <section class="scrollable">
                                <section class="hbox stretch">


                                    <section>
                                        <div class="container contacto delinear">
                                            <div class="col-sm-5 col-sm-offset-1">
                                                <ul class="nav nav-tabs">
                                                    <li class="active"><a data-toggle="tab" href="#menu1">Registrar Alerta</a></li>
                                                    <li><a data-toggle="tab" href="#menu2">Modificar Alerta</a></li>
                                                </ul>
                                            </div>
                                            <div class="tab-content">	
                                                <div id="menu1" class="tab-pane fade in active">
                                                    <div class="container">
                                                        <div class="row">
                                                            <div class="col-md-6 col-md-offset-3">
                                                                <div class="text-center">
                                                                    <h2>Registrar Alerta</h2>

                                                                </div>
                                                                <hr>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div>
                                                        <div class="col-sm-5 ">

                                                            <div class="form-group">
                                                                <label>Fecha *</label>
                                                                <input type="date" name="name" class="form-control" required="required">
                                                            </div>
                                                            <div class="form-group">
                                                                <label>Evento *</label>
                                                                <input type="text" name="name" class="form-control" required="required">
                                                            </div>
                                                            <div class="col-sm-12">
                                                                <button type="submit" name="submit" class="btn btn-primary btn-lg" required="required">Registrar</button>
                                                            </div>			
                                                        </div>
                                                    </div>
                                                    <div class="col-sm-5">
                                                        <table class="table table-hover col-sm-6">
                                                            <thead>
                                                                <tr>
                                                                    <th>#</th>
                                                                    <th>Nombre Evento</th>
                                                                    <th>DescripciÃ³n</th>
                                                                    <th>Opcion</th>
                                                                </tr>
                                                            </thead>
                                                            <tbody>
                                                                <tr>
                                                                    <td>1</td>
                                                                    <td>Alerta 1 </td>
                                                                    <td>alguna descripciÃ³n</td>
                                                                    <td><button type="button" class="btn btn-info btn-lg" id="myBtn">Consultar y/o Modificar</button></td>
                                                                </tr>
                                                                <tr>
                                                                    <td>2</td>
                                                                    <td>Alerta 2</td>
                                                                    <td>alguna descripciÃ³n</td>
                                                                    <td><button type="button" class="btn btn-info btn-lg" id="myBtn2">Consultar y/o Modificar</button></td>
                                                                </tr>
                                                                <tr>
                                                                    <td>3</td>
                                                                    <td>Alerta 3</td>
                                                                    <td>alguna descripciÃ³n</td>
                                                                    <td><button type="button" class="btn btn-info btn-lg" id="myBtn3">Consultar y/o Modificar</button></td>
                                                                </tr>
                                                            </tbody>
                                                        </table>
                                                    </div>
                                                </div>
                                                <div id="menu2" class="tab-pane fade">
                                                    <div class="container">
                                                        <div class="row">
                                                            <div class="col-md-5 col-md-offset-3">
                                                                <div class="text-center">
                                                                    <h2>Modificar Alerta</h2>
                                                                    <p>Lorem ipsum dolor sit amet consectetur adipiscing elit Cras suscipit arcu<br>
                                                                        vestibulum volutpat libero sollicitudin vitae Curabitur ac aliquam <br>
                                                                    </p>
                                                                </div>
                                                                <hr>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="col-sm-5 ">
                                                        <div class="form-group">
                                                            <label>Fecha *</label>
                                                            <input type="date" name="name" class="form-control" required="required">
                                                        </div>
                                                        <div class="form-group">
                                                            <label>Evento *</label>
                                                            <input type="text" name="name" class="form-control" required="required">
                                                        </div>
                                                        <div class="col-sm-12">
                                                            <button type="submit" name="submit" class="btn btn-primary btn-lg" required="required">Modificar</button>

                                                        </div><br><br>		<br>	
                                                    </div>
                                                    <div class="col-sm-5">
                                                        <div class="text-center">
                                                            <h4>Alerta del sistema: Descripcion</h4>
                                                            <p>Lorem ipsum dolor sit amet consectetur adipiscing elit Cras suscipit arcu<br>
                                                                vestibulum volutpat libero sollicitudin vitae Curabitur ac aliquam <br>
                                                            </p>
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

    </body>
</html>
