<%@page import="ufps.mincit.datos.dto.CuestionarioDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ufps.mincit.negocio.administrador.Administrador"%>
<!DOCTYPE html>
<html lang="en" class="app">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>MINCIT Eventos</title>

        <meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" /> 
        <link rel="stylesheet" href="css/bootstrap.css" type="text/css" />
        <link rel="stylesheet" href="css/animate.css" type="text/css" />
        <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css" />
        <link rel="stylesheet" href="css/font.css" type="text/css" />

        <link rel="stylesheet" href="css/app.css" type="text/css" />  

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
                            <a href="7.perfil.jsp" class="dropdown-toggle btn btn-xs btn-primary" title="Inicio"><i class="fa fa-long-arrow-up"></i></a>
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
                                <a href="index.jsp">Cerrar Sesión</a>
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
                                            Publicar Cuestionario
                                            <span class="caret"></span>
                                        </button>
                                        <ul class="dropdown-menu text-left">
                                            <li><a href="11.cuestionario.jsp">Agregar Cuestionario</a></li>
                                            <li><a href="12.ver_estadisticas.jsp">Ver Resultados</a></li>
                                        </ul>
                                    </div>
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
                                            <li class="active">
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
                                            <li >
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
                                <p>Aquí puede ver las Estadisticas de los Cuestionarios registrados.</p>
                            </header>
                            <section class="scrollable">
                                <section class="hbox stretch">
                                    <section class="vbox">
                                        <div class="col-sm-6 col-md-offset-3 ">  
                                            <div class="text-center">
                                                <h5>Estadisticas Encontradas hasta el momento:</h5>
                                            </div>
                                            <section class="panel panel-default">
                                                <%
                                                    Administrador a = new Administrador();
                                                    int alto = a.contarAlto();
                                                    int medio = a.contarMedio();
                                                    int bajo = a.contarBajo();
                                                %>
                                                <div class="text-center wrapper bg-light lt" style="background-color: white;">
                                                    <div class="sparkline inline" data-type="pie" data-height="165" data-slice-colors="['#77c587','#41586e','#f2f2f2']"><%=alto%>,<%=medio%>,<%=bajo%></div>
                                                </div>
                                                <ul class="list-group no-radius">
                                                    <li class="list-group-item">
                                                        <span class="pull-right"><%=alto%></span>
                                                        <span class="label bg-primary">72-100</span>
                                                        Comience su negocio y programa una cita con un asesor.
                                                    </li>
                                                    <li class="list-group-item">
                                                        <span class="pull-right"><%=medio%></span>
                                                        <span class="label bg-dark">58-71</span>
                                                        Usted tiene potencial pero necesita mayor esfuerzo. 
                                                    </li>
                                                    <li class="list-group-item">
                                                        <span class="pull-right"><%=bajo%></span>
                                                        <span class="label bg-light">0-57</span>
                                                        Se recomienda que usted busque un socio.
                                                    </li>
                                                </ul>
                                            </section>
                                        </div>
                                        <div >
                                            <div class="col-md-6 col-md-offset-3">
                                                <div class="text-center">
                                                    <h2>Estadisticas Ordenadas por Fecha</h2>
                                                </div>
                                                <hr>
                                            </div>
                                            <div class="col-sm-12 ">
                                                <%                                                    ArrayList<CuestionarioDTO> c = a.mostrarCuestionario();
                                                    if (c != null) {
                                                %>
                                                <div class="col-md-12">
                                                    <table class="table table-hover">
                                                        <thead>
                                                            <tr>
                                                                <th>Fecha</th>
                                                                <th>Emprendedor</th>
                                                                <th>Respuesta</th>
                                                                <th>Valor</th>
                                                            </tr>
                                                        </thead>
                                                        <tbody>
                                                            <%     for (CuestionarioDTO e : c) {

                                                            %>     
                                                            <tr>
                                                                <td><%=e.getFecha()%></td>
                                                                <td><%=a.consultarEmprendedor(e.getCedula_usuario())%></td>
                                                                <td><%=e.getRespuesta()%></td>
                                                                <td><%=e.getValor()%></td>
                                                            </tr>
                                                            <%
                                                                }
                                                            %>  
                                                        </tbody>
                                                    </table>
                                                </div>   

                                                <%
                                                    }
                                                %>  
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
        <script src="js/charts/easypiechart/jquery.easy-pie-chart.js"></script>
        <script src="js/charts/sparkline/jquery.sparkline.min.js"></script>

    </body>
</html>
