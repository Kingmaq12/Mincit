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
                            <li role="presentation" class="active" ><a href="calendario.jsp">Calendario</a></li>
                            <li role="presentation"><a href="cuestionario.jsp">Evaluate</a></li>
                            <li role="presentation"><a href="login.jsp">Login</a></li>
                            <li role="presentation"><a href="contacto.jsp">Contactenos</a></li>
                        </ul>
                    </div>
                </div>			
            </div>
        </nav>
        <div class="container calendario delinear">
            <br> <br>
            <div class="col-md-6">
                <div class="month"> 
                    <ul>
                        <li class="prev">&#10094;</li>
                        <li class="next">&#10095;</li>
                        <li> August<br><span>2016</span></li>
                    </ul>
                </div>

                <ul class="weekdays">
                    <li>Mo</li>
                    <li>Tu</li>
                    <li>We</li>
                    <li>Th</li>
                    <li>Fr</li>
                    <li>Sa</li>
                    <li>Su</li>
                </ul>

                <ul class="days"> 
                    <li>1</li> <li>2</li> <li>3</li> <li>4</li> <li>5</li>
                    <li>6</li> <li>7</li> <li>8</li> <li>9</li> <li><span class="active">10</span></li>
                    <li>11</li><li>12</li><li>13</li><li>14</li><li>15</li><li>16</li><li>17</li>
                    <li>18</li> <li>19</li><li>20</li><li>21</li><li>22</li><li>23</li><li>24</li>
                    <li>25</li><li>26</li><li>27</li><li>28</li> <li>29</li> <li>30</li>
                </ul>
                <br> <br>
            </div>

            <div class="col-sm-6">
                <table class="table">
                    <thead>
                        <tr>
                            <th>NOMBRE</th>
                            <th>FECHA</th>
                            <th>LUGAR</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>Evento1</td>
                            <td>Evento1</td>
                            <td>Evento1</td>
                        </tr>
                        <tr c>
                            <td>Evento2</td>
                            <td>Evento2</td>
                            <td>Evento2</td>
                        </tr>
                        <tr >
                            <td>Evento3</td>
                            <td>Evento3</td>
                            <td>Evento3</td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <br> <br><br> <br>
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
    </body>
</html>
