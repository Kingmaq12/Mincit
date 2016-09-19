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

        <section>
            <div class="container  bajar contacto delinear">
                <div class="col-md-6 col-md-offset-3 text-center">
                    <h2>Registrar Eventos</h2>
                    <p>Realiza el registro por medio de las siguientes opciones.</p>
                </div>
            </div>
            <div class="container delinear">
                <ul class="nav nav-tabs">
                    <li class="active"><a data-toggle="tab" href="#menu1">Manualmente</a></li>
                    <li><a data-toggle="tab" href="#menu2">Microsoft Excel</a></li>
                </ul>
                <section id="contact-page delinear">
                    <div class="tab-content delinear">	
                        <br>
                        <div id="menu1" class="tab-pane fade in active">
                            <div class="col-sm-5 col-sm-offset-1">
                                <div class="form-group">
                                    <label>Nombre </label>
                                    <input type="text" name="name" class="form-control" required="required" placeholder="...">
                                </div>
                                <div class="form-group">
                                    <label>Fecha </label>
                                    <input type="date" name="name" class="form-control" required="required">
                                </div>
                                <div class="form-group">
                                    <label>Hora </label>
                                    <input type="text" name="name" class="form-control" required="required">
                                </div>
                                <div class="form-group">
                                    <label>Lugar </label>
                                    <input type="text" name="name" class="form-control" required="required">
                                </div>
                                <div class="form-group">
                                    <label>Patrocinadores </label>
                                    <input type="text" name="name" class="form-control" required="required">
                                </div>	
                                <div class="form-group">
                                    <label>Pa�s</label>
                                    <input type="text" name="name" class="form-control" required="required">
                                </div>
                                <div class="form-group">
                                    <label>Ciudad </label>
                                    <input type="text" name="name" class="form-control" required="required">
                                </div>				
                            </div>
                            <div class="col-sm-5 col-sm-offset-1 delinear">
                                <div class="form-group">
                                    <label>Participantes </label>
                                    <input type="text" name="name" class="form-control" required="required">
                                </div>
                                <div class="form-group">
                                    <label>Tipo de Evento </label><br>
                                    <select class="form-control">
                                        <option value="volvo">-No seleccionado-</option>
                                        <option value="volvo">Capacitaci�n</option>
                                        <option value="saab">Evento</option>
                                        <option value="mercedes">Simposio</option>
                                        <option value="audi">Foro</option>
                                        <option value="audi">Rueda</option>
                                        <option value="audi">Seminario</option>
                                        <option value="audi">Entrevista</option>
                                        <option value="audi">Concurso</option>
                                        <option value="audi">Feria</option>
                                        <option value="audi">Aniversario</option>
                                        <option value="audi">Congreso</option>
                                        <option value="audi">Cumbre</option>
                                        <option value="audi">Conferencia</option>
                                        <option value="audi">Exposici�n</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label>Sector Econ�mico </label><br>
                                    <select class="form-control">
                                        <option value="volvo">-No seleccionado-</option>
                                        <option value="volvo">Sector Primario</option>
                                        <option value="saab">Sector Secundario</option>
                                        <option value="mercedes">Sector Terciario</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label>URL </label>
                                    <input type="text" name="name" class="form-control" required="required">
                                </div>
                                <div class="form-group">
                                    <label>Imagen </label> <br>
                                    <input type="file" class="filestyle" data-icon="false" >
                                </div>
                                <div class="form-group">
                                    <label>Logros </label>
                                    <select class="form-control">
                                        <option value="volvo">-No seleccionado-</option>
                                        <option value="volvo">Formalizaci�n</option>
                                        <option value="saab">Certificaci�n Nacional</option>
                                        <option value="mercedes">Certificaci�n Internacional</option>
                                        <option value="audi">Exportar</option>
                                        <option value="audi">Acceso a Lineas de Cr�dito</option>
                                    </select>
                                </div>				
                            </div>
                            <div class="col-sm-12">
                                <div class="form-group">
                                    <label>Descripci�n</label>
                                    <textarea name="message" id="message" required="required" class="form-control" rows="8"></textarea>
                                </div>
                            </div>	
                            <br>
                            <div class="col-sm-12">
                                <br>
                                <button type="submit" name="submit" class="btn btn-primary btn-lg" required="required"><span class="glyphicon glyphicon-ok-circle"></span> Registrar Evento</button>
                                <br>
                                <label id="campo" name="campo"></label>
                            </div>
                        </div>	
                        <div id="menu2" class="tab-pane fade delinear">
                            <div class="col-sm-4 col-sm-offset-1">
                                <div class="form-group">
                                    <label>Archivo Microsoft Excel </label> <br>
                                    <input type="file" class="filestyle" data-icon="false" >
                                </div>
                            </div>
                            <div class="col-sm-4 col-sm-offset-1">
                                <div class="form-group">
                                    <label>Imagen </label> <br>
                                    <input type="file" class="filestyle" data-icon="false" >
                                </div>
                            </div>
                            <br>
                            <div class="col-sm-12">
                                <br>
                                <button type="submit" name="submit" class="btn btn-primary btn-lg" required="required"><span class="glyphicon glyphicon-ok-circle"></span> Registrar Evento</button>
                                <br>
                                <label id="campo" name="campo"></label>
                            </div>
                        </div>
                    </div>
                </section>
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
