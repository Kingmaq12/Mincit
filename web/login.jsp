<%-- 
    Document   : login
    Created on : 6/09/2016, 08:23:20 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <link rel="stylesheet" href="css/font-awesome.css">
        <link rel="stylesheet" href="css/jquery.bxslider.css">
        <link href="css/overwrite.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/normalize.css" />
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/set1.css" />
        <link href="css/style.css" rel="stylesheet">

    </head>
    <body>
        <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse.collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a  href="index.jsp"><img class="bajar-img" src="img/lg.png"></a>
                </div>
                <div class="navbar-collapse collapse">							
                    <div class="menu">
                        <ul class="nav nav-tabs" role="tablist">
                            <li role="presentation" ><a href="index.jsp">Inicio</a></li>
                            <li role="presentation"><a href="busqueda.jsp">Eventos</a></li>
                            <li role="presentation"><a href="calendario.jsp">Calendario</a></li>
                            <li role="presentation"><a href="cuestionario.jsp">Evaluate</a></li>
                            <li role="presentation"><a href="contacto.jsp">Contactenos</a></li>
                            <li role="presentation"class="active" ><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>	                           

                        </ul>
                    </div>
                </div>			
            </div>
        </nav>


        <section>
            <div class="login delinear">
                <form name="iniciarSesion" id="iniciarSesion" method="POST" action="javascript:iniciarSesion()"> 
                    <h1>LOGIN</h1>
                    <label for="email">Cedula </label>
                    <p><input class="form-control" type="text" name="cedula" id="cedula" ></p>
                    <label for="pwd">Contraseña </label>
                    <p><input class="form-control" type="password" name="contrasenia" id="contrasenia" ></p>
                    <button type="submit" name="submit" class="btn btn-primary btn-lg btn-block" required="required"><span class="glyphicon glyphicon-ok-circle"></span> Ingresar</button>
                    <br>
                    <label class="label-danger" name="campo" id="campo" ></label>
                </form>    
            </div>  
        </section>

        <footer>
            <div class="last-div">
                <div class="container">
                    <div class="row">
                        <div class="copyright">
                            © 2016 MINCIT| <a target="_blank" href="http://mincit.gov.co">MINCIT Eventos.</a>
                        </div>
                        <div class="copyright">
                            <a target="_blank" href="http://www.ufps.edu.co/ufps/index.php"><span class="glyphicon glyphicon-arrow-right"></span>Universidad Francisco de Paula Santander.</a>
                        </div>
                        <div class="copyright">
                            <a target="_blank" href="http://ingsistemas.ufps.edu.co/index.php"><span class="glyphicon glyphicon-book"></span>Ingenieria de Sistemas.</a>
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

    <script src="procesar/ajax/procesos.js"></script>
</html>
