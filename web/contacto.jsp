<%-- 
    Document   : contacto
    Created on : 6/09/2016, 08:23:00 PM
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
        <link rel="stylesheet" type="text/css" href="css/normalize.css" />
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/set1.css" />
        <link href="css/overwrite.css" rel="stylesheet">
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
                            <li role="presentation"><a href="busqueda.jsp">Evento</a></li>
                            <li role="presentation"><a href="calendario.jsp">Calendario</a></li>
                            <li role="presentation"><a href="cuestionario.jsp">Evaluate</a></li>
                            <li role="presentation"><a href="login.jsp">Login</a></li>
                            <li role="presentation" class="active"><a href="contacto.jsp">Contactenos</a></li>
                        </ul>
                    </div>
                </div>			
            </div>
        </nav>


        <section>
            <div class="container contacto delinear">
                <div class="center">   
                    <h1>¡Dejanos tu Mensaje!</h1>
                    <p>Escribenos tus dudas o preguntas  y el MINCIT te contactará.</p>
                </div> 
                <div class="row contact-wrap"> 
                    <div class="status alert alert-success" style="display: none"></div>
                    <form  class="contact-form" name="contactar" id="contactar" method="POST" action="javascript:contactar()">
                        <div class="col-sm-5 col-sm-offset-1">
                            <div class="form-group">
                                <label>Nombre de la Empresa </label>
                                <input type="text" id="nombre_empresa" name="nombre_empresa"class="form-control" required="required">
                            </div>
                            <div class="form-group">
                                <label>Correo Electronico </label>
                                <input type="email" id="email" name="email" class="form-control" required="required">
                            </div>
                            <div class="form-group">
                                <label>Asunto</label>
                                <input type="text" id="asunto" name="asunto"class="form-control">
                            </div>
                        </div>
                        <div class="col-sm-5">
                            <div class="form-group">
                                <label>Mensaje </label>
                                <textarea id="mensaje" name="mensaje" required="required" class="form-control" rows="8"></textarea>
                            </div>                                                  
                        </div>
                        <div class="col-sm-12">
                            <br>
                            <button type="submit" name="submit" class="btn btn-primary btn-lg" required="required"><span class="glyphicon glyphicon-ok-circle"></span> Enviar Mensaje</button>
                            <br>
                            <label id="campo" name="campo"></label>
                        </div>
                    </form> 
                </div><!--/.row-->
            </div><!--/.container-->
        </section><!--/#contact-page-->

        <div class="map">
            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d4699.7052608608265!2d-72.48919292226732!3d7.898693478920445!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8e6645102f9b7269%3A0xab4b03ed6c85830e!2sUniversidad+Francisco+de+Paula+Santander!5e0!3m2!1ses!2sco!4v1474236570137" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
        </div>

        <footer>
            <div class="inner-footer">
                <div class="container">
                    <div class="row">
                        <div class="col-md-4 f-about">
                            <a href="index.html"><h1><span></span>Eventos</h1></a>
                            <p>blablablabalbala</p>
                        </div>
                        <div class="col-md-4 l-posts">
                            <h3 class="widgetheading">Ultimas Noticias</h3>
                            <ul>
                                <li><a href="#">adslaksjdlkajsldkajsl</a></li>
                                <li><a href="#">adslaksjdlkajsldkajsl</a></li>
                                <li><a href="#">adslaksjdlkajsldkajsle</a></li>
                                <li><a href="#">adslaksjdlkajsldkajsl</a></li>
                            </ul>
                        </div>
                        <div class="col-md-4 f-contact">
                            <h3 class="widgetheading">Contacto</h3>
                            <a href="#"><p><i class="fa fa-envelope"></i> example@gmail.com</p></a>
                            <p><i class="fa fa-phone"></i>  00000</p>
                        </div>
                    </div>
                </div>
            </div>

            <div class="last-div">
                <div class="container">
                    <div class="row">
                        <div class="copyright">
                            © 2016 MINCIT| <a target="_blank" href="http://mincit.gov.co"> MINCIT Eventos</a>
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

        <script src="procesar/ajax/procesos.js"></script>
    </body>
</html>
