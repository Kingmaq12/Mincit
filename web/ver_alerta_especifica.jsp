<%@page import="ufps.mincit.datos.dto.AlertaDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ufps.mincit.negocio.administrador.Administrador"%>
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
                                <a href="index.jsp"  >Cerrar Sesión</a>
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
                                            <li class="active">
                                                <a href="10.ver_alertas.jsp"  >
                                                    <i class="fa fa-ticket icon">
                                                        <b class="bg-warning"></b>
                                                    </i>
                                                    <span>Alertas</span>
                                                </a>
                                            </li>

                                            <li>
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
                                <p>Lugar donde puede ver y modificar las alertas de los eventos.</p>
                            </header>
                            <section class="scrollable">
                                <section class="hbox stretch">
                                    <%

                                        String id = (String) session.getAttribute("id");

                                        Administrador n = new Administrador();
                                        ArrayList<AlertaDTO> alertas = n.consultarAlertasEspe(id);
                                        if (alertas != null) {
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
                                                    <th>Id del Evento</th>
                                                    <th>FECHA</th>
                                                    <th>Descripción</th>
                                                    <th>Opción</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%     for (AlertaDTO alerta : alertas) {

                                                %>     
                                                <tr>
                                                    <td><%=alerta.getId_evento()%></td>
                                                    <td><%=alerta.getFecha()%></td>
                                                    <td><%=alerta.getDescripcion()%></td>
                                                    <td>
                                                        <div class="btn-group">
                                                            <button type="button" class="btn btn-primary dropdown-toggle"
                                                                    data-toggle="dropdown">
                                                                Opciones <span class="glyphicon caret"></span>
                                                            </button>

                                                            <ul class="dropdown-menu" role="menu">
                                                                <li><a href="procesar/eliminar_alerta_especifica.jsp?id=<%=alerta.getId()%>">Eliminar Alerta</a></li>
                                                            </ul>
                                                        </div> 

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
                                        <strong>¡Advertencia!</strong> Este evento no tiene alertas especificas.
                                    </div>    
                                    <%          }
                                    %>

                                    <section>
                                        <div class="container contacto">
                                            <div class="row">
                                                <div class="col-md-5 col-md-offset-3">
                                                    <div class="text-center">
                                                        <h2>Modificar Alerta</h2>
                                                        <p>En esta opción se pueden modificar las alertas especificas de este evento.<br>
                                                        </p>
                                                    </div>
                                                    <hr>
                                                </div>
                                            </div>
                                            <form name="alertaNueva" id="alertaNueva" method="post" action="procesar/registrarAlertaEspecifica.jsp">
                                                <div class="col-sm-5 ">
                                                    <div class="form-group">
                                                        <label>Alerta Nueva:</label>
                                                    </div>
                                                    <div class="form-group">
                                                        <label>Dias antes:</label>
                                                        <input type="date" name="alertaNueva" id="alertaNueva" class="form-control" required="required">
                                                    </div>
                                                    <div class="col-sm-8">
                                                        <label>Descripción</label>
                                                        <textarea name="descripcion" id="descripcion" required="required" class="form-control" rows="8"></textarea>
                                                    </div>
                                                    <div class="col-sm-12">
                                                        <button type="submit" name="submit" class="btn btn-primary btn-lg" required="required">Modificar</button>

                                                    </div>
                                                    
                                                </div>
                                            </form>
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

    </body>


</html>
