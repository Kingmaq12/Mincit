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
                <div class="navbar-header2 ">							
                    <div class="menu dropdown drop nav-tabss">
                        <li role="presentation" data-toggle="dropdown" class="nav nav-tabs active"><h1>Administrador   <span class="glyphicon glyphicon-align-justify"></span></h1></li>
                        <ul class="dropdown-menu nav nav-tabs" role="tablist">
                            <li><a href="6.perfil.jsp">Perfil</a></li>
                            <li><a href="7.registrar_evento.jsp">Registrar Evento</a></li>
                            <li><a href="8.busquedaAd.jsp">Buscar Eventos</a></li>
                            <li><a href="9.ver_comentario.jsp">Ver Comentarios</a></li>
                            <li><a href="10.ver_alertas.jsp">Ver Alertas</a></li>
                            <li><a href="11.cuestionario.jsp">Registrar Cuestionario</a></li>
                            <li><a href="12.ver_estadisticas.jsp">Ver Estadisticas</a></li>
                            <li><a href="13.configuracion.jsp">Configuraci�n</a></li>
                            <li><a href="1.index.jsp">Cerrar Sesi�n</a></li>
                        </ul>
                    </div>
                </div>	
                 <div class="navbar-perfil">
                    <a  href="6.perfil.jsp"><img class="bajar-img" src="img/lg.png"></a>
                </div>
            </div>
        </nav>

        <section>
            <div class="container contacto delinear">
                <div class="col-md-6 col-md-offset-3">
                    <div class="text-center">
                        <h2>Buscar Eventos</h2>
                    </div>
                    <hr>
                </div>
                <div class="col-sm-4 col-sm-offset-1">
                    <div class="form-group">
                        <label>Fecha </label>
                        <input type="date" name="name" class="form-control" required="required">
                    </div>
                    <div class="form-group">
                        <label>Entidad </label>
                        <input type="text" name="name" class="form-control" required="required">
                    </div>	
                    <div class="form-group">
                        <label>Pa�s </label>
                        <input type="text" name="name" class="form-control" required="required">
                    </div>				
                </div>
                <div class="col-sm-4 col-sm-offset-1">
                    <div class="form-group">
                        <label>Ciudad </label>
                        <input type="text" name="name" class="form-control" required="required">
                    </div>
                    <div class="form-group">
                        <label>Sector Econ�mico </label><br>
                        <select class="form-control">
                            <option value="volvo">Sector Primario</option>
                            <option value="volvo">Sector Secundario</option>
                            <option value="saab">Sector Terciario</option>
                        </select>
                    </div>
                    <div class="form-group text-center">
                        <button type="submit" name="submit" class="btn btn-primary btn-lg" required="required"><span class="glyphicon glyphicon-ok-circle"></span> Buscar</button>
                    </div>
                </div>
            </div>

            <div class="container  delinear">
                <div class="col-md-6 col-md-offset-3">
                    <div class="text-center">
                        <h2>Eventos Encontrados</h2>
                    </div>
                    <hr>
                </div>
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Nombre Evento</th>
                            <th>Opci�n</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>1</td>
                            <td>Evento 1 </td>
                            <td><button type="submit" name="submit" class="btn btn-primary btn-lg" required="required" id="myBtn"><span class="glyphicon glyphicon-ok-circle"></span> Descripci�n</button></td>
                        </tr>
                        <tr>
                            <td>2</td>
                            <td>Evento 2</td>
                            <td><button type="submit" name="submit" class="btn btn-primary btn-lg" required="required" id="myBtn2"><span class="glyphicon glyphicon-ok-circle"></span> Descripci�n</button></td>
                        </tr>
                        <tr>
                            <td>3</td>
                            <td>Evento 3</td>
                            <td><button type="submit" name="submit" class="btn btn-primary btn-lg" required="required" id="myBtn3"><span class="glyphicon glyphicon-ok-circle"></span> Descripci�n</button></td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </section>

        <!-- Modal -->
        <div class="modal fade" id="myModal" role="dialog">
            <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="submit" name="submit" class="btn btn-primary btn-lg" required="required" data-dismiss="modal">X</button>
                        <h4 class="modal-title">Modal Header 1</h4>
                    </div>
                    <div class="modal-body">
                        <p>The <strong>show.bs.modal</strong> event occurs when the modal is about to be shown.</p>
                    </div>
                    <div class="modal-footer">
                        <button type="submit" name="submit" class="btn btn-primary btn-lg" required="required" data-dismiss="modal">Cerrar</button>
                    </div>
                </div>
            </div>
        </div>
    </div>

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
</body>
</html>