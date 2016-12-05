<%@page import="java.util.ArrayList"%>
<%@page import="ufps.mincit.negocio.Negocio"%>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="robots" content="all,follow">
        <meta name="googlebot" content="index,follow,snippet,archive">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="tipo_contenido"  content="text/html;" http-equiv="content-type" charset="utf-8">
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
        <script src="procesar/ajax/procesos.js"></script>
    </head>

    <body>

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
                                    <img src="img/logo-small.png" alt="Universal logo" class="visible-xs visible-sm"><span class="sr-only">Mincit Eventos - Busqueda</span>
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
                                    <li class="dropdown use-yamm yamm-fw ">
                                        <a href="index.jsp">Inicio </b></a>
                                    </li>
                                    <li class="dropdown active">
                                        <a href="2.busqueda.jsp" >Eventos</a>
                                    </li>
                                    <li class="dropdown use-yamm yamm-fw">
                                        <a href="3.calendario.jsp" >Calendario</b></a>
                                    </li>
                                    <li class="dropdown">
                                        <a href="" >Registre Evento</b></a>
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
                            <h1>Consulta de Eventos</h1>
                        </div>
                        <div class="col-md-5">
                            <ul class="breadcrumb">
                                <li><a href="index.jsp">Inicio</a>
                                </li>
                                <li>Consulta de Eventos</li>
                            </ul>

                        </div>
                    </div>
                </div>
            </div>

            <div id="content">
                <div class="container">

                    <section>

                        <div class="row">
                            <div class="col-md-12">
                                <div class="heading">
                                    <h2>Consulta</h2>
                                </div>
                                <form accept-charset="UTF-8" id="consultar" action="javascript:consultar2()" method="post">
                                    <div class="row">
                                        <p>Eventos que esten en este Rango.</p>

                                        <div class="col-sm-3">
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
                                        <div class="col-sm-6">
                                            <div class="form-group">
                                                <label>Entidad Adscrita</label>
                                                <select class="form-control" id="entidad">
                                                    <option value="ninguno">-No seleccionado-</option>
                                                    <%
                                                        Negocio n1 = new Negocio();
                                                        ArrayList<String> entidades = n1.mostrarEntidades2();
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
                                        <div class="col-sm-6">       
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
                                        <div class="col-sm-6">
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

                                                        <option value="<%=a%>"><%=b%></option>

                                                        <%
                                                            }
                                                        %>
                                                    </select>

                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-sm-6">
                                            <div class="form-group">
                                                <label for="subject">Ciudad</label>
                                                <input type="text" class="form-control" id="ciudad">
                                            </div>
                                        </div>

                                        <div class="col-sm-6">
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
                                        <div class="col-sm-6">
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
                        </div>
                        <div class="container">
                            <div class="center">
                                <h2>Resultados</h2>
                            </div>
                            <div id="tabla">
                                <hr>    
                            </div>
                        </div>
                    </section>

                </div>
                <!-- /.container -->

                <section class="bar background-pentagon no-mb">
                    <div class="container">
                        <div class="row showcase">
                            <div class="col-md-3 col-sm-6">
                                <div class="item">
                                    <div class="icon"><i class="fa fa-align-justify"></i>
                                    </div>
                                    <h4><span class="counter">580</span><br>

                                        Eventos</h4>
                                </div>
                            </div>
                            <div class="col-md-3 col-sm-6">
                                <div class="item">
                                    <div class="icon"><i class="fa fa-users"></i>
                                    </div>
                                    <h4><span class="counter">100</span><br>

                                        Empresas</h4>
                                </div>
                            </div>
                            <div class="col-md-3 col-sm-6">
                                <div class="item">
                                    <div class="icon"><i class="fa fa-copy"></i>
                                    </div>
                                    <h4><span class="counter">320</span><br>

                                        Projects</h4>
                                </div>
                            </div>
                            <div class="col-md-3 col-sm-6">
                                <div class="item">
                                    <div class="icon"><i class="fa fa-font"></i>
                                    </div>
                                    <h4><span class="counter">923</span><br> 

                                        Magazines and Brochures</h4>
                                </div>
                            </div>
                        </div>
                        <!-- /.row -->
                    </div>
                    <!-- /.container -->
                </section>
                <!-- /.bar -->




            </div>
            <!-- /#content -->



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

                        <hr class="hidden-md hidden-lg hidden-sm">

                    </div>
                    <!-- /.col-md-3 -->


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
        <!-- /#all -->

        <!-- #### JAVASCRIPT FILES ### -->

        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
        <script>
                                                    window.jQuery || document.write('<script src="js/jquery-1.11.0.min.js"><\/script>')
        </script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

        <script src="js/jquery.cookie.js"></script>
        <script src="js/waypoints.min.js"></script>
        <script src="js/jquery.counterup.min.js"></script>
        <script src="js/jquery.parallax-1.1.3.js"></script>
        <script src="js/front.js"></script>
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


        <!-- owl carousel -->
        <script src="js/owl.carousel.min.js"></script>

    </body>

</html>