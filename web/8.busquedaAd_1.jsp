<%@page import="ufps.mincit.datos.dto.UsuarioDTO"%>
<%@page import="ufps.mincit.datos.dto.EventoDTO"%>
<%@page import="ufps.mincit.negocio.administrador.Administrador"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ufps.mincit.negocio.Negocio"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" class="app">
    <%
        Administrador n = new Administrador();
        Negocio neg = new Negocio();
        String id = request.getParameter("id");
        String estado = request.getParameter("estado");
        if (id != null) {
            if (estado.equals("3")) {

                UsuarioDTO v = n.consultarVisitante(id);
                boolean x = neg.enviarCorreoRechazado(id, v.getEmail());

                if (x) {
    %>
    <script>
        alert("Se ha Rechazado el Evento y se ha Enviado Correo al solicitante.");
    </script>
    <%
                }
        } if(estado.equals("1")) {
            //publicar
            //cambiar estado a 1 
            if (n.publicarEventoVisitante(id)) {

    %>
    <script>
        alert("Se ha Publicado el Evento.");
    </script>
    <%                }
            }
        }
    %>
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
        <script src="procesar/ajax/procesos.js"></script>

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
                                <a href="index.jsp" >Cerrar Sesión</a>
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
                                            <li class="">
                                                <a href="8.busquedaAd.jsp"  >
                                                    <i class="fa fa-search icon">
                                                        <b class="bg-info"></b>
                                                    </i>
                                                    <span>Consultar Evento</span>
                                                </a>
                                            </li>
                                            <li class="active">
                                                <a href="8.busquedaAd_1.jsp"  >
                                                    <i class="fa fa-certificate icon">
                                                        <b class="bg-dark"></b>
                                                    </i>
                                                    <span>Evento de Visitante</span>
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
                                <p>En el siguiente apartado puede encontrar los Eventos que los visitantes solicitan publicar.</p>
                            </header>
                            <section class="scrollable">
                                <section class="hbox stretch">


                                    <section>
                                        <div class="container  bajar contacto">
                                            <div class="col-md-6 col-md-offset-3 text-center">
                                                <h2>Eventos de Visitantes</h2>
                                                <hr>
                                            </div>

                                        </div>
                                        <%
                                            ArrayList<EventoDTO> p = n.consultarEventoVisitante();
                                            if (p != null) {
                                        %>
                                        <div class="container col-md-12">
                                            <div class="col-md-10 ">
                                            </div>
                                            <table class="table table-hover">
                                                <thead>
                                                    <tr>
                                                        <th>NOMBRE</th>
                                                        <th>FECHA Y HORA</th>
                                                        <th>LUGAR Y CIUDAD</th>
                                                        <th>Visitante</th>
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
                                                        <%
                                                            UsuarioDTO r = n.consultarVisitante(e.getId());
                                                        %>
                                                        <td><%=r.getNombre()%>,<%=r.getEmail()%></td>
                                                        <td>
                                                            <div class="btn-group">
                                                                <button type="button" class="btn btn-primary dropdown-toggle"
                                                                        data-toggle="dropdown">
                                                                    Opciones <span class="glyphicon caret"></span>
                                                                </button>

                                                                <ul class="dropdown-menu" role="menu">
                                                                    <li><a href="8.busquedaAd_1.jsp?id=<%=e.getId()%>&estado=3">Rechazar</a></li>
                                                                    <li><a href="8.busquedaAd_1.jsp?id=<%=e.getId()%>&estado=1">Publicar</a></li>
                                                                    <li class="divider"></li>
                                                                    <li><a href="ver_evento.jsp?id=<%=e.getId()%>"  target="_blank">Vista previa</a></li>
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
                                            <strong>¡Advertencia!</strong> No se han encontrado Nuevos Eventos.
                                        </div>    
                                        <%          }
                                        %>
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

        <script type='text/javascript'>
        function playVideo(a) {

            b = document.getElementById("paises");

            ajax = nuevoAjax();
            parametros = "continente=" + document.getElementById("continente").value;
            url = "procesar/mostrarPaises_1.jsp";
            ajax.open("POST", url, true);
            ajax.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
            ajax.send(parametros);
            ajax.onreadystatechange = function() {

                if (ajax.readyState == 4)
                {
                    if (ajax.status == 200)
                    {
                        b.innerHTML = ajax.responseText;
                    }
                    b.innerHTML = ajax.responseText;

                } else
                {
                    b.innerHTML = "Cargando ";
                }
            }

        }
        </script>

    </body>
</html>