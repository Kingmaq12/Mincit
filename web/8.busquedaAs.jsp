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
                                            <li class="active">
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
                                        <div class="container ">
                                            <div class="col-md-6 col-md-offset-3 text-center">
                                                <h2>Consultar Evento</h2>
                                                <hr>
                                            </div>

                                        </div>
                                        <div class="container">
                                            <form accept-charset="UTF-8" id="consultar" action="javascript:consultar()" method="post">
                                                <div class="row">
                                                    <div class="col-sm-2">
                                                        <div class="form-group">
                                                            <label for="firstname">Fecha Inicio </label>
                                                            <input type="date" class="form-control" id="fechaI">
                                                        </div>
                                                    </div>
                                                    <div class="col-sm-3">
                                                        <div class="form-group">
                                                            <label for="firstname">Fecha Fin </label>
                                                            <input type="date" class="form-control" id="fechaF">
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
                                                                        String[] x = e.split(",");
                                                                        String a = x[0];
                                                                        String b = x[1];
                                                                %>

                                                                <option value="<%=a%>"><%=b%></option>

                                                                <%
                                                                    }
                                                                %>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="col-sm-5">       
                                                        <div class="form-group">
                                                            <label>Continente </label><br>
                                                            <select class="form-control" name="continente" id="continente" onChange="playVideo(this)">
                                                                <option value="ninguno">-No seleccionado-</option>
                                                                <option value="NA">Norte America</option>
                                                                <option value="SA">Sur America</option>
                                                                <option value="EU">Europa</option>
                                                                <option value="AS">Asia</option>
                                                                <option value="OC">Oceania</option>
                                                                <option value="AF">Africa</option>
                                                                <option value="AN">Antartida</option>
                                                            </select>
                                                        </div>
                                                    </div>
                                                    <div class="col-sm-5">
                                                        <div class="form-group">

                                                            <div id="paises" value ="ninguno" name="paises" >
                                                                <label>País</label>  
                                                                <select class="form-control" name="pais" id="pais">
                                                                    <option value="ninguno">-No seleccionado-</option>
                                                                    <%
                                                                        Negocio n = new Negocio();
                                                                        ArrayList<String> pa = n.mostrarPaises();
                                                                        for (String e : pa) {
                                                                            String[] x = e.split("-");
                                                                            String a = x[0];
                                                                            String b = x[1];
                                                                    %>

                                                                    <option value="<%=a%>"><%=b%></option>


                                                                    <%
                                                                        }
                                                                    %>
                                                                </select>
                                                            </div>
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
                                                            <label>Sector Economico</label>
                                                            <select class="form-control"  id="sector">
                                                                <option value="ninguno">-No seleccionado-</option>
                                                                <%
                                                                    ArrayList<String> sectores = n1.mostrarSectores();
                                                                    for (String e : sectores) {
                                                                        String[] x = e.split(",");
                                                                        String a = x[0];
                                                                        String b = x[1];
                                                                %>

                                                                <option value="<%=a%>"><%=b%></option>

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
                                                                    ArrayList<String> logros = n1.mostrarLogros();
                                                                    for (String e : logros) {
                                                                        String[] x = e.split(",");
                                                                        String a = x[0];
                                                                        String b = x[1];
                                                                %>

                                                                <option value="<%=a%>"><%=b%></option>

                                                                <%
                                                                    }
                                                                %>
                                                            </select>
                                                        </div>
                                                    </div>

                                                    <div class="col-sm-12 text-center">
                                                        <button type="submit" class="btn btn-template-main"><i class="fa fa-send"></i> Consultar</button>
                                                    </div>
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