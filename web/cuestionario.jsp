<%-- 
    Document   : calendario
    Created on : 6/09/2016, 08:12:43 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>MINCIT Eventos</title>
        <link rel="stylesheet" type="text/css" href="http://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css"> 
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
        <script src="http://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>

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

        <script>
            $(document).ready(function () {
                $('#example').DataTable();
            });
        </script>

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
                            <li role="presentation"  ><a href="calendario.jsp">Calendario</a></li>
                            <li role="presentation" class="active"><a href="cuestionario.jsp">Evaluate</a></li>
                            <li role="presentation"><a href="contacto.jsp">Contactenos</a></li>
                            <li role="presentation" ><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>	                           

                        </ul>
                    </div>
                </div>			
            </div>
        </nav>

        <section>
            <div class="container contacto delinear">

                <div class="container">
                    <div class="row">
                        <div class="col-md-6 col-md-offset-3">
                            <div class="text-center">
                                <h2>Encuesta ¡Evaluate!</h2>
                                <p>Resuelve el cuestionario.</p>
                            </div>
                            <hr>
                        </div>
                    </div>
                </div>

                <table id="example" >
                    <thead>
                        <tr>
                            <th>-Pregunta-</th>
                            <th>Si</th>
                            <th>No</th>
                            <th>Quizas</th>
                        </tr>
                    </thead>
                    <div class="col-md-4 text-center2">
                        <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
                            <tr>
                                <td><h4 class="media-heading  text-center2 ">Percibo los problemas como desafíos y oportunidades.</h4></td>
                                <td>
                                    <div class="radio">
                                      <label><input type="radio" name="optradio"></label>
                                    </div>
                                </td>
                                <td>
                                    <div class="radio">
                                      <label><input type="radio" name="optradio"></label>
                                    </div>
                                </td>
                                <td>
                                    <div class="radio">
                                      <label><input type="radio" name="optradio"></label>
                                    </div>
                                </td>
                            </tr>
                        </div>
                    </div>

                    <div class="col-md-4 text-center2">
                        <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
                            <tr>
                                <td><h4 class="media-heading  text-center2 ">Tengo capital o activos para invertir y estoy dispuesto a perder gran parte de mis ahorros.</h4></td>
                                <td>
                                    <div class="radio">
                                      <label><input type="radio" name="optradio1"></label>
                                    </div>
                                </td>
                                <td>
                                    <div class="radio">
                                      <label><input type="radio" name="optradio1"></label>
                                    </div>
                                </td>
                                <td>
                                    <div class="radio">
                                      <label><input type="radio" name="optradio1"></label>
                                    </div>
                                </td>
                            </tr>
                        </div>
                    </div>
                    
                    <div class="col-md-4 text-center2">
                        <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
                            <tr>
                                <td><h4 class="media-heading  text-center2 ">Tengo buen juicio y seré capaz de emplear a la gente indicada para mi negocio.</h4></td>
                                <td>
                                    <div class="radio">
                                      <label><input type="radio" name="optradio2"></label>
                                    </div>
                                </td>
                                <td>
                                    <div class="radio">
                                      <label><input type="radio" name="optradio2"></label>
                                    </div>
                                </td>
                                <td>
                                    <div class="radio">
                                      <label><input type="radio" name="optradio2"></label>
                                    </div>
                                </td>
                            </tr>
                        </div>
                    </div>
                    
                </table>
            </div>
        </section>

        <footer>
            <div class="inner-footer">
                <div class="container">
                    <div class="row">
                        <div class="col-md-4 f-about">
                            <a href="index.html"><h1><span></span>Eventos</h1></a>
                            <p>Envento X</p>
                        </div>
                        <div class="col-md-4 l-posts">
                            <h3 class="widgetheading">Ultimas Noticias</h3>
                            <ul>
                                <li><a href="#">"Se culmino evento X"</a></li>
                                <li><a href="#">"Inicia 16avo Evento W"</a></li>
                                <li><a href="#">"Se espera Evento Y con muchas ancias"</a></li>
                                <li><a href="#">"Se cancela Evento A por problemas de seguridad"</a></li>
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
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>
        <script src="js/wow.min.js"></script>
        <script src="js/jquery.easing.1.3.js"></script>
        <script src="js/jquery.isotope.min.js"></script>
        <script src="js/jquery.bxslider.min.js"></script>
        <script type="text/javascript" src="js/fliplightbox.min.js"></script>
        <script src="js/functions.js"></script>
        <script type="text/javascript">$('.portfolio').flipLightBox()</script>

        <script>
            $(document).ready(function () {
                $("#myBtn").click(function () {
                    $("#myModal").modal("show");
                });
                $("#myModal").on('show.bs.modal', function () {
                    //alert('The modal is about to be shown.');
                });
            });
        </script>

        <script>
            $(document).ready(function () {
                $("#myBtn1").click(function () {
                    $("#myModal1").modal("show");
                });
                $("#myModal1").on('show.bs.modal', function () {
                    //alert('The modal is about to be shown.');
                });
            });
        </script>

    </body>
</html>

