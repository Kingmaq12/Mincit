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
        <link rel="stylesheet" href="js/calendar/bootstrap_calendar.css" type="text/css" />
        <link rel="stylesheet" href="css/app.css" type="text/css" />
        <link rel="stylesheet" href="css/jquery.bxslider.css">      

    </head>
    <body>
        <%
            session.removeAttribute("nombre");
            session.removeAttribute("fecha");
            session.removeAttribute("hora");
            session.removeAttribute("lugar");
            session.removeAttribute("entidad_adscrita");
            session.removeAttribute("continente");
            session.removeAttribute("pais");
            session.removeAttribute("ciudad");
            session.removeAttribute("participantes");
            session.removeAttribute("tipo_evento");
            session.removeAttribute("sector_economico");
            session.removeAttribute("url");
            session.removeAttribute("logros");
            session.removeAttribute("descripcion");

            String evento_registrado = (String) session.getAttribute("evento_registrado");

            if (evento_registrado != null) {
                if (evento_registrado.equalsIgnoreCase("S")) {

        %>

        <script>


            alert("Evento Registrado Existosamente");

        </script>


        <%        } else {


        %>


        <script>


            alert("Hubo un error en el registro");

        </script>



        <%                }
                session.removeAttribute("evento_registrado");
            }


        %>

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
                                            <li class="active">
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
                                <p>Realiza el registro por medio de las siguientes opciones.</p>
                            </header>


                            <section class="scrollable">
                                <section class="hbox stretch">

                                    <section>
                                        <div class="container  bajar contacto">
                                            <div class="col-md-6 col-md-offset-3 text-center">
                                                <h2>Registrar Eventos</h2>
                                                <hr>
                                            </div>
                                        </div>
                                        <div class="container">
                                            <ul class="nav nav-tabs">
                                                <li class="active"><a data-toggle="tab" href="#menu1">Manualmente</a></li>
                                                <li><a data-toggle="tab" href="#menu2">Microsoft Excel</a></li>
                                            </ul>
                                            <section id="contact-page">
                                                <div class="tab-content">	
                                                    <br>

                                                    <div id="menu1" class="tab-pane fade in active">

                                                        <ul class="nav nav-tabs">
                                                            <li class="active"><a data-toggle="tab" href="#menu3">Primer Paso</a></li>
                                                            <li><a data-toggle="tab" href="#menu4">Segundo Paso</a></li>
                                                        </ul>
                                                        <div class="tab-content">
                                                            <div id="menu3" class="tab-pane fade in active">
                                                                <form name="registrarManual" id="registrarManual" method="POST" action="javascript:guardarDatos()">
                                                                    <div class="col-sm-4 col-sm-offset-1">
                                                                        <div class="form-group">
                                                                            <label>Nombre </label>
                                                                            <input type="text" name="nombre" id="nombre" class="form-control" required="required" >
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label>Fecha </label>
                                                                            <input type="date" name="fecha" id="fecha" class="form-control" required="required">
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label>Hora </label>
                                                                            <input type="text" name="hora" id="hora" class="form-control" required="required">
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label>Lugar </label>
                                                                            <input type="text" name="lugar" id="lugar" class="form-control" required="required">
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label>Entidad Adscrita</label>
                                                                            <div class="checkbox">
                                                                                <%                                                                                    Negocio n1 = new Negocio();
                                                                                    ArrayList<String> entidades = n1.mostrarEntidades();
                                                                                    for (String e : entidades) {
                                                                                        String[] a = e.split(",");
                                                                                %>
                                                                                <label>
                                                                                    <input type="checkbox"  name="entidad_adscrita" id ="<%=a[0]%>.1" values="<%=a[0]%>.1"> <%=a[1]%> 
                                                                                </label>
                                                                                <br>
                                                                                <%
                                                                                    }
                                                                                %>
                                                                            </div>
                                                                        </div>

                                                                        <div class="form-group">    
                                                                            <label>Continente </label><br>
                                                                            <select id="continente" name="continente" onChange="playVideo(this)">
                                                                                <option value ="ninguno">-No seleccionado-</option>
                                                                                <option value="NA">Norte America</option>
                                                                                <option value="SA">Sur America</option>
                                                                                <option value="EU">Europa</option>
                                                                                <option value="AS">Asia</option>
                                                                                <option value="OC">Oceania</option>
                                                                                <option value="AF">Africa</option>
                                                                                <option value="AN">Antardita</option>
                                                                            </select>
                                                                        </div>
                                                                        <div class="form-group">

                                                                            <div id="paises" name="paises">
                                                                                <label>Paises</label>
                                                                                <select name="pais" id="pais" class="form-control">
                                                                                    <option value="ninguno">-No seleccionado-</option>
                                                                                    <%
                                                                                        ArrayList<String> p = n1.mostrarPaises();
                                                                                        for (String e : p) {
                                                                                            String[] x = e.split("-");
                                                                                            String a = x[0];
                                                                                            String b = x[1];
                                                                                    %>

                                                                                    <option value="<%=b%>"><%=b%></option>

                                                                                    <%
                                                                                        }
                                                                                    %>
                                                                                </select>

                                                                            </div>
                                                                        </div> 
                                                                        </br>

                                                                        <div class="form-group">
                                                                            <label>Ciudad </label>
                                                                            <input type="text" name="ciudad" id="ciudad" class="form-control" required="required">
                                                                        </div>				
                                                                    </div>

                                                                    <div class="col-sm-4 col-sm-offset-1 delinear">
                                                                        <div class="form-group">
                                                                            <label>Participantes(Estudiantes, empresarios) </label>
                                                                            <input type="text" name="participantes" id="participantes" class="form-control" required="required">
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label>Tipo de Evento </label><br>
                                                                            <select class="form-control" name="tipo_evento" id="tipo_evento">
                                                                                <option value="Ninguno">-No seleccionado-</option>
                                                                                <option value="Capacitacion">Capacitación</option>
                                                                                <option value="Evento">Evento</option>
                                                                                <option value="Simposio">Simposio</option>
                                                                                <option value="Foro">Foro</option>
                                                                                <option value="Rueda">Rueda</option>
                                                                                <option value="Seminario">Seminario</option>
                                                                                <option value="Entrevista">Entrevista</option>
                                                                                <option value="Concurso">Concurso</option>
                                                                                <option value="Feria">Feria</option>
                                                                                <option value="Aniversario">Aniversario</option>
                                                                                <option value="Congreso">Congreso</option>
                                                                                <option value="Cumbre">Cumbre</option>
                                                                                <option value="Conferencia">Conferencia</option>
                                                                                <option value="Exposicion">Exposición</option>
                                                                            </select>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label>Sector Economico</label>
                                                                            <div class="checkbox">
                                                                                <%
                                                                                    Negocio n22 = new Negocio();
                                                                                    ArrayList<String> sectores = n22.mostrarSectores();
                                                                                    for (String e : sectores) {
                                                                                        String[] a = e.split(",");
                                                                                %>
                                                                                <label>
                                                                                    <input type="checkbox"name="sector_economico" id="<%=a[0]%>.2" values="<%=a[0]%>.2"> <%=a[1]%> 
                                                                                </label>
                                                                                <br>
                                                                                <%
                                                                                    }
                                                                                %>
                                                                            </div>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label>URL </label>
                                                                            <input type="text" name="url" id="url" class="form-control" required="required">
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label>Logros</label>
                                                                            <div class="checkbox">
                                                                                <%
                                                                                    Negocio n33 = new Negocio();
                                                                                    ArrayList<String> logros = n33.mostrarLogros();
                                                                                    for (String e : logros) {
                                                                                        String[] a = e.split(",");
                                                                                %>
                                                                                <label>
                                                                                    <input type="checkbox" name="logros" id="<%=a[0]%>.3" values="<%=a[0]%>.3"> <%=a[1]%> 
                                                                                </label>
                                                                                <br>
                                                                                <%
                                                                                    }
                                                                                %>
                                                                            </div>
                                                                        </div>			
                                                                    </div>
                                                                    <div class="container">
                                                                        <div class="col-sm-8">
                                                                            <label>Descripción</label>
                                                                            <textarea name="descripcion" id="descripcion" required="required" class="form-control" rows="8"></textarea>
                                                                        </div>
                                                                        <br>
                                                                        <div class="col-sm-3">
                                                                            <br><br><br><br><br>    
                                                                            <button type="submit" name="submit" class="btn btn-primary btn-lg" required="required"><span class="glyphicon glyphicon-ok-circle"></span> Guardar</button>
                                                                            <br>
                                                                            <label id="campo" name="campo"></label>
                                                                        </div>
                                                                    </div>
                                                                    <br><br>
                                                                </form> 
                                                            </div>

                                                            <div id="menu4" class="tab-pane fade delinear">
                                                                <br>
                                                                <br>
                                                                <form name="registrarManualImagen" id="registrarManualImagen" method="post" action="procesar/registrarEventoManual.jsp"enctype="multipart/form-data">
                                                                    <div id="resetear">

                                                                        <h3>Primero termine el paso 1</h3>

                                                                    </div>
                                                                </form>
                                                            </div> 
                                                        </div>
                                                    </div>

                                                    <div id="menu2" class="tab-pane fade ">
                                                        <form name="registrarExcel" id="registrarExcel" method="post" action="procesar/registrarEventoExcel.jsp"enctype="multipart/form-data">
                                                            <div class="col-sm-4 col-sm-offset-1">
                                                                <div class="form-group">
                                                                    <label>Archivo Microsoft Excel </label> <br>
                                                                    <input type="file" id="archivo_excel" name="archivo_excel" class="filestyle" data-icon="false" >
                                                                </div>
                                                            </div>
                                                            <br>
                                                            <div class="col-sm-12">
                                                                <br>
                                                                <button type="submit" name="submit" class="btn btn-primary btn-lg" required="required"><span class="glyphicon glyphicon-ok-circle"></span> Registrar Evento</button>
                                                                <br>
                                                                <label id="campo" name="campo"></label>
                                                            </div>
                                                        </form>
                                                    </div>
                                                </div>
                                            </section>
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
        <script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>

        <script type='text/javascript'>
                                                                                function playVideo(a) {

                                                                                    b = document.getElementById("paises");

                                                                                    ajax = nuevoAjax();
                                                                                    parametros = "continente=" + document.getElementById("continente").value;
                                                                                    url = "procesar/mostrarPaises_1.jsp";
                                                                                    ajax.open("POST", url, true);
                                                                                    ajax.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
                                                                                    ajax.send(parametros);
                                                                                    ajax.onreadystatechange = function () {

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
