<%@page import="java.util.ArrayList"%>
<%@page import="ufps.mincit.negocio.Negocio"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="robots" content="all,follow">
        <meta name="googlebot" content="index,follow,snippet,archive">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>Mincit Eventos</title>

        <meta name="keywords" content="">

        <link href='http://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,500,700,800' rel='stylesheet' type='text/css'>

        <!-- Bootstrap and Font Awesome css -->
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

        <!-- Css animations  -->
        <link href="css/animate.css" rel="stylesheet">

        <!-- Theme stylesheet, if possible do not edit this stylesheet -->
        <link href="css/style.green.css" rel="stylesheet" id="theme-stylesheet">

        <!-- Custom stylesheet - for your changes -->
        <link href="css/custom.css" rel="stylesheet">

        <!-- Responsivity for older IE -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
            <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

        <!-- Favicon and apple touch icons-->
        <link rel="shortcut icon" href="img/logoMincit.png" type="image/x-icon" />
        <link rel="apple-touch-icon" href="img/apple-touch-icon.png" />
        <link rel="apple-touch-icon" sizes="57x57" href="img/apple-touch-icon-57x57.png" />
        <link rel="apple-touch-icon" sizes="72x72" href="img/apple-touch-icon-72x72.png" />
        <link rel="apple-touch-icon" sizes="76x76" href="img/apple-touch-icon-76x76.png" />
        <link rel="apple-touch-icon" sizes="114x114" href="img/apple-touch-icon-114x114.png" />
        <link rel="apple-touch-icon" sizes="120x120" href="img/apple-touch-icon-120x120.png" />
        <link rel="apple-touch-icon" sizes="144x144" href="img/apple-touch-icon-144x144.png" />
        <link rel="apple-touch-icon" sizes="152x152" href="img/apple-touch-icon-152x152.png" />
        <!-- owl carousel css -->

        <link href="css/owl.carousel.css" rel="stylesheet">
        <link href="css/owl.theme.css" rel="stylesheet">
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


        <div id="all">

            <header>

                <!-- *** TOP ***
    _________________________________________________________ -->
                <div id="top">
                    <div class="container">
                        <div class="row">
                            <div class="col-xs-5 contact">
                                <p class="hidden-sm hidden-xs">Contactenos +057555555 or mincitEventos@gmail.com.</p>
                                <p class="hidden-md hidden-lg"><a href="#" data-animate-hover="pulse"><i class="fa fa-phone"></i></a>  <a href="#" data-animate-hover="pulse"><i class="fa fa-envelope"></i></a>
                                </p>
                            </div>
                            <div class="col-xs-7">
                                <div class="social">
                                    <a href="#" class="external facebook" data-animate-hover="pulse"><i class="fa fa-facebook"></i></a>
                                    <a href="#" class="external gplus" data-animate-hover="pulse"><i class="fa fa-google-plus"></i></a>
                                    <a href="#" class="external twitter" data-animate-hover="pulse"><i class="fa fa-twitter"></i></a>
                                    <a href="#" class="email" data-animate-hover="pulse"><i class="fa fa-envelope"></i></a>
                                </div>

                                <div class="login">
                                    <a href="inicio_sesion.jsp"><i class="fa fa-user"></i> <span class="hidden-xs text-uppercase">Inicia Sesion</span></a>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>

                <!-- *** TOP END *** -->

                <!-- *** NAVBAR ***
        _________________________________________________________ -->

                <div class="navbar-affixed-top" data-spy="affix" data-offset-top="200">

                    <div class="navbar navbar-default yamm" role="navigation" id="navbar">

                        <div class="container">
                            <div class="navbar-header">

                                <a class="navbar-brand home" href="index.jsp">
                                    <img src="img/1.png" alt="Universal logo" class="hidden-xs hidden-sm">
                                    <img src="img/logo-small.png" alt="Universal logo" class="visible-xs visible-sm"><span class="sr-only">Mincit Eventos - Inicio</span>
                                </a>
                                <div class="navbar-buttons">
                                    <button type="button" class="navbar-toggle btn-template-main" data-toggle="collapse" data-target="#navigation">
                                        <span class="sr-only">Toggle navigation</span>
                                        <i class="fa fa-align-justify"></i>
                                    </button>
                                </div>
                            </div>
                            <!--/.navbar-header -->

                            <div class="navbar-collapse collapse" id="navigation">

                                <ul class="nav navbar-nav navbar-right">
                                    <li class="dropdown use-yamm yamm-fw">
                                        <a href="index.jsp">Inicio </b></a>
                                    </li>
                                    <li class="dropdown use-yamm yamm-fw">
                                        <a href="2.busqueda.jsp" >Eventos</a>
                                    </li>
                                    <li class="dropdown use-yamm yamm-fw">
                                        <a href="3.calendario.jsp" >Calendario</b></a>
                                    </li>
                                    <li class="dropdown active">
                                        <a href="4.contacto.jsp" >Contactenos</b></a>
                                    </li>
                                </ul>

                            </div>


                        </div>


                    </div>
                    <!-- /#navbar -->

                </div>

                <!-- *** NAVBAR END *** -->

            </header>

            <div id="heading-breadcrumbs">
                <div class="container">
                    <div class="row">
                        <div class="col-md-7">
                            <h1>Contactenos</h1>
                        </div>
                        <div class="col-md-5">
                            <ul class="breadcrumb">
                                <li><a href="index.jsp">Inicio</a>
                                </li>
                                <li>Contactenos</li>
                            </ul>

                        </div>
                    </div>
                </div>
            </div>

            <div id="content">
                <div class="container" id="contact">

                    <div class="row">
                        <div class="col-md-8">

                            <section>

                                <div class="heading">
                                    <h2>Como te podemos ayudar</h2>
                                </div>

                                <p class="lead">Are you curious about something? Do you have some kind of problem with our products? As am hastily invited settled at limited civilly fortune me. Really spring in extent an by. Judge but built gay party world. Of so am he remember
                                    although required. Bachelor unpacked be advanced at. Confined in declared marianne is vicinity.</p>
                                <p>Please feel free to contact us, our customer service center is working for you 24/7.</p>

                                <div class="heading">
                                    <h3>Formulario</h3>
                                </div>

                                <section>
                                    <div class="container  bajar contacto">
                                        <div class="col-md-6 col-md-offset-3 text-center">
                                            <h2>Registrar Eventos</h2>
                                            <hr>
                                        </div>
                                    </div>
                                    <div class="container">

                                        <section id="contact-page">
                                            <ul class="nav nav-tabs">
                                                <li class="active"><a data-toggle="tab" href="#menu3">Primer Paso</a></li>
                                                <li><a data-toggle="tab" href="#menu4">Segundo Paso</a></li>
                                            </ul>
                                            <div class="tab-content">
                                                <div id="menu3" class="tab-pane fade in active">
                                                    <form name="registrarManual" id="registrarManual" method="POST" action="javascript:guardarDatos3()">
                                                        
                                                        <div class="col-sm-8 col-sm-offset-1">
                                                            <div class="form-group">
                                                                <label>Nombre Visitante: </label>
                                                                <input type="text" name="nombre_visitante" id="nombre_visitante" class="form-control" required="required" >
                                                            </div>
                                                            <div class="form-group">
                                                                <label>Email: </label>
                                                                <input type="email" name="email" id="email" class="form-control" required="required" >
                                                            </div>
                                                            
                                                            <div class="form-group">
                                                                <label>Cedula: </label>
                                                                <input type="number" name="cedula" id="cedula" class="form-control" required="required" >
                                                            </div>
                                                            
                                                        </div>
                                                        
                                                        <hr>
                                                        
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
                                                                    <%                                                                            Negocio n1 = new Negocio();
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
                                                                        Negocio n2 = new Negocio();
                                                                        ArrayList<String> sectores = n2.mostrarSectores();
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
                                                                        Negocio n3 = new Negocio();
                                                                        ArrayList<String> logros = n3.mostrarLogros();
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
                                                    <form name="registrarManualImagen" id="registrarManualImagen" method="POST" action="procesar/registrarEventoVisitante.jsp" enctype="multipart/form-data">
                                                        <div id="resetear">

                                                            <h3>Primero termine el paso 1</h3>

                                                        </div>
                                                    </form>
                                                </div> 
                                            </div>

                                        </section>
                                    </div>
                                </section>

                            </section>

                        </div>

                        <div class="col-md-4">

                            <section>

                                <h3 class="text-uppercase">Direccion</h3>

                                <p><strong>Mincit Eventos Ltd.</strong>
                                    <br>Avenida Gran Colombia # 12E - 96
                                    <br>Universidad Francisco de Paula Santander
                                    <br>Cucuta
                                    <br>Norte de Santander
                                    <br>
                                    <strong>Colombia</strong>
                                </p>

                                <h3 class="text-uppercase">Llamanos</h3>

                                <p class="text-muted">This number is toll free if calling from Great Britain otherwise we advise you to use the electronic form of communication.</p>
                                <p><strong>+33 555 444 333</strong>
                                </p>



                            </section>

                        </div>

                    </div>
                    <!-- /.row -->


                </div>
                <!-- /#contact.container -->
            </div>
            <!-- /#content -->

            <div id="map">
            </div>




            <!-- *** FOOTER ***
    _________________________________________________________ -->

            <footer id="footer">
                <div class="container">
                    <div class="col-md-5 col-sm-6">
                        <h4>Acerca de nosotros</h4>

                        <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>


                        <hr class="hidden-md hidden-lg hidden-sm">

                    </div>


                    <div class="col-md-5 col-sm-6">

                        <h4>Contactenos</h4>

                        <p><strong>Mincit Eventos Ltd.</strong>
                            <br>Avenida Gran Colombia # 12E - 96
                            <br>Universidad Francisco de Paula Santander
                            <br>Cucuta
                            <br>Norte de Santander
                            <br>
                            <strong>Colombia</strong>
                        </p>

                        <a href="4.contacto.jsp" class="btn btn-small btn-template-main">Ir a la pagina de Contactenos</a>

                        <hr class="hidden-md hidden-lg hidden-sm">

                    </div>
                    <!-- /.col-md-3 -->

                    <!-- /.col-md-3 -->
                </div>
                <!-- /.container -->
            </footer>
            <!-- /#footer -->

            <!-- *** FOOTER END *** -->

            <!-- *** COPYRIGHT ***
    _________________________________________________________ -->

            <div id="copyright">
                <div class="container">
                    <div class="col-md-12">
                        <p class="pull-left">&copy; 2015. Your company / name goes here</p>
                        <p class="pull-right">Template by <a href="http://bootstrapious.com/free-templates">Bootstrapious</a> 
                            <!-- Not removing these links is part of the licence conditions of the template. Thanks for understanding :) -->
                        </p>

                    </div>
                </div>
            </div>
            <!-- /#copyright -->

            <!-- *** COPYRIGHT END *** -->



        </div>
                                                                          
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