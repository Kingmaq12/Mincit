<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>eNno Bootstrap Template</title>


        <link rel="stylesheet" type="text/css" href="http://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css"> 
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
        <script src="http://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>

        <script>
            $(document).ready(function () {
                $('#example').DataTable();
            });
        </script>


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


    </head>

    <body>

        <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <a  href="perfil.jsp"><img class="bajar-img" src="img/lg.png"></a>
                </div>
                <div class="navbar-collapse collapse">							
                    <div class="menu dropdown">
                        <li role="presentation" data-toggle="dropdown" class="nav nav-tabs active"><h1>Administrador <span class="caret"></span></h1></li>
                        <ul class="dropdown-menu nav nav-tabs" role="tablist">
                            <li><a href="registrar_evento.jsp">Registrar Evento</a></li>
                            <li><a href="busqueda.jsp">Buscar Eventos</a></li>
                            <li><a href="ver_comentario.jsp">Ver Comentarios</a></li>
                            <li><a href="ver_alertas.jsp">Ver Alertas</a></li>
                            <li><a href="ver_estadisticas.jsp">Ver Estadisitcas</a></li>
                            <li><a href="configuracion.jsp">Configuración</a></li>
                        </ul>
                    </div>
                </div>			
            </div>
        </nav>

        <div class="container">
            <div class="row">
                <div class="slider">
                    <div class="img-responsive text-center">
                        <ul class="bxslider">            
                            <li>
                                <h4>Comentario 1</h4>

                                <p>Lorem ipsum dolor sit amet consectetur adipiscing elit Cras suscipit arcu libero</p><br>
                                <button type="button"class="btn btn-primary btn-lg" required="required" id="myBtn"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                            </li>

                            <li>
                                <h4>Comentario 2</h4>      

                                <p>Lorem ipsum dolor sit amet consectetur adipiscing elit Cras suscipit arcu libero</p><br>
                                <button type="button"class="btn btn-primary btn-lg" required="required" id="my"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button> 
                            </li> 

                            <li>
                                <h4>Comentario 3</h4>      

                                <p>Lorem ipsum dolor sit amet consectetur adipiscing elit Cras suscipit arcu libero</p><br>
                                <button type="button"class="btn btn-primary btn-lg" required="required" id="my"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                            </li>       
                        </ul>
                    </div>   
                </div>
            </div>
        </div>

        <div class="col-md-12 text-center">
            <h2>Comentarios</h2><br>
        </div>


        <table id="example" >

            <thead>
                <tr>
                    <th></th>
                    <th></th>


                </tr>
            </thead>
            <tbody>
                <tr>
            <div class="col-md-4 text-center">
                <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
                    <div class="media-body">
                        <th><h4 class="media-heading  text-center">Comentario 1</h4>

                            <div class="ficon  text-center">
                                <button type="button"class="btn btn-primary btn-lg" required="required" id="myBtn1"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                            </div>
                        </th>
                    </div>
                </div>
            </div>


            <div class="col-md-4  text-center">
                <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
                    <div class="media-body">
                        <th><h4 class="media-heading  text-center">Comentario 44</h4>

                            <div class="ficon  text-center">
                                <button type="button"class="btn btn-primary btn-lg" required="required" id="my"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                            </div>
                        </th>
                    </div>
                </div>
            </div>

        </tr>

        <tr>
        <div class="col-md-4 text-center">
            <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
                <div class="media-body">
                    <th><h4 class="media-heading  text-center">Comentario 1</h4>

                        <div class="ficon  text-center">
                            <button type="button"class="btn btn-primary btn-lg" required="required" id="myBtn1"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                        </div>
                    </th>
                </div>
            </div>
        </div>


        <div class="col-md-4  text-center">
            <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
                <div class="media-body">
                    <th><h4 class="media-heading  text-center">Comentario 1</h4>

                        <div class="ficon  text-center">
                            <button type="button"class="btn btn-primary btn-lg" required="required" id="my"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                        </div>
                    </th>
                </div>
            </div>
        </div>

    </tr>
    <tr>
    <div class="col-md-4 text-center">
        <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
            <div class="media-body">
                <th><h4 class="media-heading  text-center">Comentario 1</h4>

                    <div class="ficon  text-center">
                        <button type="button"class="btn btn-primary btn-lg" required="required" id="myBtn1"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                    </div>
                </th>
            </div>
        </div>
    </div>


    <div class="col-md-4  text-center">
        <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
            <div class="media-body">
                <th><h4 class="media-heading  text-center">Comentario 1</h4>

                    <div class="ficon  text-center">
                        <button type="button"class="btn btn-primary btn-lg" required="required" id="my"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                    </div>
                </th>
            </div>
        </div>
    </div>

</tr>
<tr>
<div class="col-md-4 text-center">
    <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
        <div class="media-body">
            <th><h4 class="media-heading  text-center">Comentario 1</h4>

                <div class="ficon  text-center">
                    <button type="button"class="btn btn-primary btn-lg" required="required" id="myBtn1"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                </div>
            </th>
        </div>
    </div>
</div>


<div class="col-md-4  text-center">
    <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
        <div class="media-body">
            <th><h4 class="media-heading  text-center">Comentario 1</h4>

                <div class="ficon  text-center">
                    <button type="button"class="btn btn-primary btn-lg" required="required" id="my"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                </div>
            </th>
        </div>
    </div>
</div>

</tr>
<tr>
<div class="col-md-4 text-center">
    <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
        <div class="media-body">
            <th><h4 class="media-heading  text-center">Comentario 1</h4>

                <div class="ficon  text-center">
                    <button type="button"class="btn btn-primary btn-lg" required="required" id="myBtn1"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                </div>
            </th>
        </div>
    </div>
</div>


<div class="col-md-4  text-center">
    <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
        <div class="media-body">
            <th><h4 class="media-heading  text-center">Comentario 1</h4>

                <div class="ficon  text-center">
                    <button type="button"class="btn btn-primary btn-lg" required="required" id="my"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                </div>
            </th>
        </div>
    </div>
</div>

</tr>
<tr>
<div class="col-md-4 text-center">
    <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
        <div class="media-body">
            <th><h4 class="media-heading  text-center">Comentario 1</h4>

                <div class="ficon  text-center">
                    <button type="button"class="btn btn-primary btn-lg" required="required" id="myBtn1"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                </div>
            </th>
        </div>
    </div>
</div>


<div class="col-md-4  text-center">
    <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
        <div class="media-body">
            <th><h4 class="media-heading  text-center">Comentario 1</h4>

                <div class="ficon  text-center">
                    <button type="button"class="btn btn-primary btn-lg" required="required" id="my"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                </div>
            </th>
        </div>
    </div>
</div>

</tr>
<tr>
<div class="col-md-4 text-center">
    <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
        <div class="media-body">
            <th><h4 class="media-heading  text-center">Comentario 1</h4>

                <div class="ficon  text-center">
                    <button type="button"class="btn btn-primary btn-lg" required="required" id="myBtn1"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                </div>
            </th>
        </div>
    </div>
</div>


<div class="col-md-4  text-center">
    <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
        <div class="media-body">
            <th><h4 class="media-heading  text-center">Comentario 1</h4>

                <div class="ficon  text-center">
                    <button type="button"class="btn btn-primary btn-lg" required="required" id="my"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                </div>
            </th>
        </div>
    </div>
</div>

</tr>
<tr>
<div class="col-md-4 text-center">
    <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
        <div class="media-body">
            <th><h4 class="media-heading  text-center">Comentario 1</h4>

                <div class="ficon  text-center">
                    <button type="button"class="btn btn-primary btn-lg" required="required" id="myBtn1"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                </div>
            </th>
        </div>
    </div>
</div>


<div class="col-md-4  text-center">
    <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
        <div class="media-body">
            <th><h4 class="media-heading  text-center">Comentario 1</h4>

                <div class="ficon  text-center">
                    <button type="button"class="btn btn-primary btn-lg" required="required" id="my"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                </div>
            </th>
        </div>
    </div>
</div>

</tr>
<tr>
<div class="col-md-4 text-center">
    <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
        <div class="media-body">
            <th><h4 class="media-heading  text-center">Comentario 1</h4>

                <div class="ficon  text-center">
                    <button type="button"class="btn btn-primary btn-lg" required="required" id="myBtn1"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                </div>
            </th>
        </div>
    </div>
</div>


<div class="col-md-4  text-center">
    <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
        <div class="media-body">
            <th><h4 class="media-heading  text-center">Comentario 1</h4>

                <div class="ficon  text-center">
                    <button type="button"class="btn btn-primary btn-lg" required="required" id="my"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                </div>
            </th>
        </div>
    </div>
</div>

</tr>
<tr>
<div class="col-md-4 text-center">
    <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
        <div class="media-body">
            <th><h4 class="media-heading  text-center">Comentario 1</h4>

                <div class="ficon  text-center">
                    <button type="button"class="btn btn-primary btn-lg" required="required" id="myBtn1"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                </div>
            </th>
        </div>
    </div>
</div>


<div class="col-md-4  text-center">
    <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
        <div class="media-body">
            <th><h4 class="media-heading  text-center">Comentario 1</h4>

                <div class="ficon  text-center">
                    <button type="button"class="btn btn-primary btn-lg" required="required" id="my"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                </div>
            </th>
        </div>
    </div>
</div>

</tr>
<tr>
<div class="col-md-4 text-center">
    <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
        <div class="media-body">
            <th><h4 class="media-heading  text-center">Comentario 1</h4>

                <div class="ficon  text-center">
                    <button type="button"class="btn btn-primary btn-lg" required="required" id="myBtn1"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                </div>
            </th>
        </div>
    </div>
</div>


<div class="col-md-4  text-center">
    <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
        <div class="media-body">
            <th><h4 class="media-heading  text-center">Comentario 1</h4>

                <div class="ficon  text-center">
                    <button type="button"class="btn btn-primary btn-lg" required="required" id="my"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                </div>
            </th>
        </div>
    </div>
</div>

</tr>
<tr>
<div class="col-md-4 text-center">
    <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
        <div class="media-body">
            <th><h4 class="media-heading  text-center">Comentario 1</h4>

                <div class="ficon  text-center">
                    <button type="button"class="btn btn-primary btn-lg" required="required" id="myBtn1"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                </div>
            </th>
        </div>
    </div>
</div>


<div class="col-md-4  text-center">
    <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
        <div class="media-body">
            <th><h4 class="media-heading  text-center">Comentario 1</h4>

                <div class="ficon  text-center">
                    <button type="button"class="btn btn-primary btn-lg" required="required" id="my"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                </div>
            </th>
        </div>
    </div>
</div>

</tr>

</tbody>
</table>


<!-- Modal -->
<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Modal Header 1</h4>
            </div>
            <div class="modal-body">
                <p>The <strong>show.bs.modal</strong> event occurs when the modal is about to be shown.</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
        </div>

    </div>
</div>

<!-- Modal -->
<div class="modal fade" id="myModal1" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Modal Header 1</h4>
            </div>
            <div class="modal-body">
                <p>The <strong>show.bs.modal</strong> event occurs when the modal is about to be shown.</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
        </div>

    </div>
</div>


<footer>
    <div class="inner-footer">
        <div class="container">
            <div class="row">
                <div class="col-md-4 f-about">
                    <a href="index.html"><h1><span>e</span>Nno</h1></a>
                    <p>Lorem ipsum dolor sit amet consectetur adipiscing elit Cras suscipit arcu libero
                        vestibulum volutpat libero sollicitudin vitae Curabitur ac aliquam  consectetur adipiscing elit Cras suscipit arcu libero
                    </p>
                </div>
                <div class="col-md-4 l-posts">
                    <h3 class="widgetheading">Latest Posts</h3>
                    <ul>
                        <li><a href="#">This is awesome post title</a></li>
                        <li><a href="#">Awesome features are awesome</a></li>
                        <li><a href="#">Create your own awesome website</a></li>
                        <li><a href="#">Wow, this is fourth post title</a></li>
                    </ul>
                </div>
                <div class="col-md-4 f-contact">
                    <h3 class="widgetheading">Stay in touch</h3>
                    <a href="#"><p><i class="fa fa-envelope"></i> example@gmail.com</p></a>
                    <p><i class="fa fa-phone"></i>  +345 578 59 45 416</p>
                    <p><i class="fa fa-home"></i> Enno inc  |  PO Box 23456 
                        Little Lonsdale St, New York <br>
                        Victoria 8011 USA</p>
                </div>
            </div>
        </div>
    </div>


    <div class="last-div">
        <div class="container">
            <div class="row">
                <div class="copyright">
                    Â© 2014 eNno Multi-purpose theme | <a target="_blank" href="http://bootstraptaste.com">Bootstraptaste</a>
                </div>	
                <!-- 
                    All links in the footer should remain intact. 
                    Licenseing information is available at: http://bootstraptaste.com/license/
                    You can buy this theme without footer links online at: http://bootstraptaste.com/buy/?theme=eNno
                -->				
            </div>
        </div>
        <div class="container">
            <div class="row">
                <ul class="social-network">
                    <li><a href="#" data-placement="top" title="Facebook"><i class="fa fa-facebook fa-1x"></i></a></li>
                    <li><a href="#" data-placement="top" title="Twitter"><i class="fa fa-twitter fa-1x"></i></a></li>
                    <li><a href="#" data-placement="top" title="Linkedin"><i class="fa fa-linkedin fa-1x"></i></a></li>
                    <li><a href="#" data-placement="top" title="Pinterest"><i class="fa fa-pinterest fa-1x"></i></a></li>
                    <li><a href="#" data-placement="top" title="Google plus"><i class="fa fa-google-plus fa-1x"></i></a></li>
                </ul>
            </div>
        </div>

        <a href="" class="scrollup"><i class="fa fa-chevron-up"></i></a>	


    </div>	
</footer>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<!--<script src="js/jquery-2.1.1.min.js"></script> por esta mierda no me servia el datatable-->
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
