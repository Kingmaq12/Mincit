<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>MINCIT Eventos</title>

        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="css/animate.css">
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/jquery.bxslider.css">
        <link rel="stylesheet" type="text/css" href="css/normalize.css" />
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/set1.css" />
        <link href="css/overwrite.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header2 ">							
                    <div class="menu dropdown drop nav-tabss">
                        <li role="presentation" data-toggle="dropdown" class="nav nav-tabs active"><h1>Administrador   <span class="glyphicon glyphicon-align-justify"></span></h1></li>
                        <ul class="dropdown-menu nav nav-tabs" role="tablist">
                            <li><a href="perfil.jsp">Pagina Inicial</a></li>
                            <li><a href="registrar_evento.jsp">Registrar Evento</a></li>
                            <li><a href="busquedaAd.jsp">Buscar Eventos</a></li>
                            <li><a href="ver_comentario.jsp">Ver Comentarios</a></li>
                            <li><a href="ver_alertas.jsp">Ver Alertas</a></li>
                            <li><a href="ver_estadisticas.jsp">Ver Estadisticas</a></li>
                            <li><a href="configuracion.jsp">Configuraci�n</a></li>
                        </ul>
                    </div>
                </div>	
                <div class="navbar-perfil">
                    <a  href="perfil.jsp"><img class="bajar-img" src="img/lg.png"></a>
                </div>
            </div>
        </nav>

        <section id="contact-page">
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
                                        <p>Lorem ipsum dolor sit amet consectetur adipiscing elit Cras suscipit arcu<br>
                                            vestibulum volutpat libero sollicitudin vitae Curabitur ac aliquam <br>
                                        </p>
                                    </div>
                                    <hr>
                                </div>
                            </div>
                        </div>
                        <div>
                            <div class="col-sm-6 ">

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
                        <div class="col-sm-6">
                            <table class="table table-hover col-sm-6">
                                <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>Nombre Evento</th>
                                        <th>Descripción</th>
                                        <th>Opcion</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>Alerta 1 </td>
                                        <td>alguna descripción</td>
                                        <td><button type="button" class="btn btn-info btn-lg" id="myBtn">Consultar y/o Modificar</button></td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>Alerta 2</td>
                                        <td>alguna descripción</td>
                                        <td><button type="button" class="btn btn-info btn-lg" id="myBtn2">Consultar y/o Modificar</button></td>
                                    </tr>
                                    <tr>
                                        <td>3</td>
                                        <td>Alerta 3</td>
                                        <td>alguna descripción</td>
                                        <td><button type="button" class="btn btn-info btn-lg" id="myBtn3">Consultar y/o Modificar</button></td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <div id="menu2" class="tab-pane fade">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-6 col-md-offset-3">
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
                        <div class="col-sm-6 ">
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
                            </div>			
                        </div>

                        <div class="col-sm-6">

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

        <footer>
            <div class="last-div">
                <div class="container">
                    <div class="row">
                        <div class="copyright">
                            � 2016 MINCIT| <a target="_blank" href="http://mincit.gov.co"> MINCIT Eventos</a>
                        </div>		
                    </div>
                </div>
                <div class="container">
                    <div class="row">
                        <ul class="social-network">
                            <li><a href="https://www.facebook.com/MincomercioCo/" data-placement="top" title="Facebook"><i class="fa fa-facebook fa-1x"></i></a></li>
                            <li><a href="https://twitter.com/MincomercioCo" data-placement="top" title="Twitter"><i class="fa fa-twitter fa-1x"></i></a></li>
                            <li><a href="https://www.youtube.com/c/mincomerciocolombia" data-placement ="top" title="Youtube"><i class="fa fa-youtube fa ix"></i></a></li>
                        </ul>
                    </div>
                </div>


                <a href="" class="scrollup"><i class="fa fa-chevron-up"></i></a>	


            </div>	
        </footer>

        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery-2.1.1.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>
        <script src="js/wow.min.js"></script>
        <script src="js/jquery.easing.1.3.js"></script>
        <script src="js/jquery.isotope.min.js"></script>
        <script src="js/jquery.bxslider.min.js"></script>
        <script type="text/javascript" src="js/fliplightbox.min.js"></script>
        <script src="js/functions.js"></script>	
        <script type="text/javascript">$('.portfolio').flipLightBox()</script>
    </body>
</html>
