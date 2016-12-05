<%@page import="java.util.ArrayList"%>
<%@page import="ufps.mincit.negocio.Negocio"%>
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
                           Asesor <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu animated fadeInRight">
                            <span class="arrow top"></span>
                            <li>
                                <a href="14.configuracion.jsp">Configuración</a>
                            </li>
                            <li>
                                <a href="7.perfil.jsp">Perfil</a>
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
                                </div>
                            </header>
                            <section class="w-f scrollable">
                                <div class="slim-scroll" data-height="auto" data-disable-fade-out="true" data-distance="0" data-size="5px" data-color="#333333">
                                    <!-- nav -->
                                    <nav class="nav-primary hidden-xs">
                                        <ul class="nav">
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
                                            <li >
                                                <a href="14.configuracion.jsp"  >
                                                    <i class="fa fa-edit icon">
                                                        <b class="bg-success"></b>
                                                    </i>
                                                    <span>Configuración</span>
                                                </a>
                                            </li>
                                            <li class="active" >
                                                <a href="8.busquedaAs.jsp"  >
                                                    <i class="fa fa-envelope-o icon">
                                                        <b class="bg-primary dker"></b>
                                                    </i>
                                                    <span>Consultar Eventos</span>
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
                                <p>Buscar eventos que esten registrados por medio de los siguientes filtros.</p>
                            </header>
                            <section class="scrollable">
                                <section class="hbox stretch">


                                    <section>
                                        <div class="container  bajar contacto">
                                            <div class="col-md-6 col-md-offset-3 text-center">
                                                <h2>Consultar Evento</h2>
                                                <hr>
                                            </div>

                                        </div>
                                        <div class="container">
                                            <form  id="consultar" action="javascript:consultar()" method="post">
                                                <div class="row">
                                                    <div class="col-sm-5">
                                                        <div class="form-group">
                                                            <label for="firstname">Fecha</label>
                                                            <input type="date" class="form-control" id="fecha">
                                                        </div>
                                                    </div>
                                                    <div class="col-sm-5">
                                                        <div class="form-group">
                                                            <label>Entidad Adscrita</label>
                                                            <select class="form-control" id="entidad">
                                                                <option value="ninguno">-No seleccionado-</option>
                                                                <%
                                                                    Negocio n1 = new Negocio();
                                                                    ArrayList<String> entidades = n1.mostrarEntidades();
                                                                    for (String e : entidades) {
                                                                        String[] x =e.split(",");
                                                                %>

                                                                <option value="<%=x[0]%>"><%=x[1]%></option>

                                                                <%
                                                                    }
                                                                %>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="col-sm-5">
                                                        <div class="form-group">
                                                            <label>País</label>
                                                            <select class="form-control" name="pais" id="pais">
                                                                <option value="ninguno">-No seleccionado-</option>
                                                                <%
                                                                    Negocio n = new Negocio();
                                                                    ArrayList<String> paises = n.mostrarPaisesC();
                                                                    for (String e : paises) {
                                                                        String[] x =e.split(",");
                                                                %>

                                                                <option value="<%=x[0]%>"><%=x[1]%></option>


                                                                <%
                                                                    }
                                                                %>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="col-sm-5">
                                                        <div class="form-group">
                                                            <label for="subject">Ciudad</label>
                                                            <input type="text" class="form-control" id="ciudad">
                                                        </div>
                                                    </div>
                                                    <div class="col-sm-5">
                                                        <div class="form-group">
                                                            <label>Continente </label><br>
                                                            <select class="form-control" id="continente">
                                                                <option value="ninguno">-No seleccionado-</option>
                                                                <option value="america">America</option>
                                                                <option value="europa">Europa</option>
                                                                <option value="asia">Asia</option>
                                                                <option value="oceania">Oceania</option>
                                                                <option value="africa">Africa</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="col-sm-5">
                                                        <div class="form-group">
                                                            <label>Sector Economico</label>
                                                            <select class="form-control"  id="sector">
                                                                <option value="ninguno">-No seleccionado-</option>
                                                                <%
                                                                    Negocio n2 = new Negocio();
                                                                    ArrayList<String> sectores = n2.mostrarSectores();
                                                                    for (String e : sectores) {
                                                                        String[] x =e.split(",");
                                                                %>
                                                                <option value="<%=x[0]%>"><%=x[1]%></option>

                                                                <%
                                                                    }
                                                                %>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="col-sm-5">
                                                        <div class="form-group">
                                                            <label>Logro</label>
                                                            <select class="form-control" name="logros" id="logro">
                                                                <option value="ninguno">-No seleccionado-</option>
                                                                <%
                                                                    Negocio n3 = new Negocio();
                                                                    ArrayList<String> logros = n3.mostrarLogros();
                                                                    for (String e : logros) {
                                                                        String[] x =e.split(",");
                                                                %>

                                                                <option value="<%=x[0]%>"><%=x[1]%></option>

                                                                <%
                                                                    }
                                                                %>
                                                            </select>
                                                        </div>
                                                    </div>

                                                    <div class="col-sm-12 text-center">
                                                        <button type="submit" name="submit" class="btn btn-primary btn-lg" required="required"><span class="glyphicon glyphicon-ok-circle"></span> Buscar Eventos</button>                                            <br><br>
                                                    </div>
                                                    <br><br>
                                                </div>
                                                <!-- /.row -->
                                            </form>
                                        </div>

                                        <div id="tabla" class="container">
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