<!DOCTYPE html>
<html lang="en" class="app">
    <head>
        <meta charset="utf-8" />
        <title>MINCIT EVENTOS</title>
        <meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" /> 
        <link rel="stylesheet" href="css/bootstrap.css" type="text/css" />
        <link rel="stylesheet" href="css/animate.css" type="text/css" />
        <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css" />
        <link rel="stylesheet" href="css/font.css" type="text/css" />

        <link rel="stylesheet" href="css/app.css" type="text/css" />
        <link rel="stylesheet" href="css/jquery.bxslider.css"> 
        <link rel="stylesheet" type="text/css" href="http://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css"> 
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
        <script src="http://cdn.datatables.net/1.10.12/js/jquery.dataTables.min.js"></script>
        <script>
            $(document).ready(function () {
                $('#example').DataTable();
            });
        </script>
         
    </head>

    <body>
        <section class="vbox">
            <header class="bg-dark dk header navbar navbar-fixed-top-xs">
                <div class="navbar-header aside-md">
                    <img src="img/lg.png">
                </div>
                <ul class="nav navbar-nav hidden-xs">
                    <li>
                        <div class="m-t m-l">
                            <a href="6.perfil.jsp" class="dropdown-toggle btn btn-xs btn-primary" title="Inicio"><i class="fa fa-long-arrow-up"></i></a>
                        </div>
                    </li>
                </ul>      
                <ul class="nav navbar-nav navbar-right m-n hidden-xs nav-user">
                    <li class="dropdown hidden-xs">
                        <a href="#" class="dropdown-toggle dker" data-toggle="dropdown"><i class="fa fa-fw fa-search"></i></a>
                        <section class="dropdown-menu aside-xl animated fadeInUp">
                            <section class="panel bg-white">
                                <form role="search">
                                    <div class="form-group wrapper m-b-none">
                                        <div class="input-group">
                                            <input type="text" class="form-control" placeholder="Search">
                                            <span class="input-group-btn">
                                                <button type="submit" class="btn btn-info btn-icon"><i class="fa fa-search"></i></button>
                                            </span>
                                        </div>
                                    </div>
                                </form>
                            </section>
                        </section>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <span class="thumb-sm avatar pull-left">
                                <img src="img/user.jpg">
                            </span>
                            Administrador <b class="caret"></b>
                        </a>
                        <ul class="dropdown-menu animated fadeInRight">
                            <span class="arrow top"></span>
                            <li>
                                <a href="13.configuracion.jsp">Configuración</a>
                            </li>
                            <li>
                                <a href="6.perfil.jsp">Perfil</a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="index.jsp" data-toggle="ajaxModal" >Cerrar Sesión</a>
                            </li>
                        </ul>
                    </li>
                </ul>      
            </header>
            <section>
                <section class="hbox stretch">
                    <!-- .aside -->
                    <aside class="bg-dark lter b-r aside-md hidden-print" id="nav">          
                        <section class="vbox">
                            <header class="header bg-primary lter text-center clearfix">
                                <div class="btn-group">
                                    <button type="button" class="btn btn-sm btn-dark btn-icon" title="New event"><i class="fa fa-plus"></i></button>
                                    <div class="btn-group hidden-nav-xs">
                                        <button type="button" class="btn btn-sm btn-primary dropdown-toggle" data-toggle="dropdown">
                                            Publicar un Evento
                                            <span class="caret"></span>
                                        </button>
                                        <ul class="dropdown-menu text-left">
                                            <li><a href="7.registrar_evento.jsp">Evento Nuevo</a></li>
                                            <li><a href="8.busquedaAd.jsp">Consultar Eventos</a></li>
                                        </ul>
                                    </div>
                                </div>
                            </header>
                            <section class="w-f scrollable">
                                <div class="slim-scroll" data-height="auto" data-disable-fade-out="true" data-distance="0" data-size="5px" data-color="#333333">
                                    <!-- nav -->
                                    <nav class="nav-primary hidden-xs">
                                        <ul class="nav">
                                            <li>
                                                <a href="7.registrar_evento.jsp"  >
                                                    <i class="fa fa-pencil icon">
                                                        <b class="bg-danger"></b>
                                                    </i>
                                                    <span>Nuevo Evento</span>
                                                </a>
                                            </li>
                                            <li >
                                                <a href="8.busquedaAd.jsp"  >
                                                    <i class="fa fa-search icon">
                                                        <b class="bg-info"></b>
                                                    </i>
                                                    <span>Consultar Evento</span>
                                                </a>
                                            </li>
                                            <li class="active">
                                                <a href="9.ver_comentario.jsp"  >
                                                    <i class="fa fa-book icon">
                                                        <b class="bg-primary"></b>
                                                    </i>
                                                    <span>Comentarios</span>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="10.ver_alertas.jsp"  >
                                                    <i class="fa fa-ticket icon">
                                                        <b class="bg-warning"></b>
                                                    </i>
                                                    <span>Alertas</span>
                                                </a>
                                            </li>

                                            <li>
                                                <a href="13.configuracion.jsp"  >
                                                    <i class="fa fa-wrench icon">
                                                        <b class="bg-dark"></b>
                                                    </i>
                                                    <span>Configuración</span>
                                                </a>
                                            </li>
                                        </ul>
                                    </nav>
                                    <!-- / nav -->
                                </div>
                            </section>

                            <footer class="footer lt hidden-xs b-t b-light">
                                <a href="#nav" data-toggle="class:nav-xs" class="pull-right btn btn-sm btn-default btn-icon">
                                    <i class="fa fa-angle-left text"></i>
                                    <i class="fa fa-angle-right text-active"></i>
                                </a>

                            </footer>
                        </section>
                    </aside>
                    <!-- /.aside -->
                    <section id="content">
                        <section class="vbox">
                            <header class="header bg-white b-b b-light">
                                <p>Aquí puede observar los comentarios que los visitantes han dejado.</p>
                            </header>
                            <section class="scrollable">
                                <section class="hbox stretch">

                                    <section>
                                        <div class="container contacto delinear">
                                            <table id="example" >
                                                <thead>
                                                    <tr>
                                                        <th></th>
                                                        <th></th>
                                                        <th></th>
                                                        <th></th>
                                                    </tr>
                                                </thead>
                                                <div class="col-md-4 text-center2">
                                                    <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
                                                        <th><h4 class="media-heading  text-center2 ">Comentario 1</h4>
                                                        <div class="ficon  text-center2">
                                                            <button type="button"class="btn btn-primary btn-lg" required="required" id="myBtn1"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                                                        </div>
                                                        </th>
                                                    </div>
                                                </div>
                                                <div class="col-md-4  text-center2">
                                                    <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
                                                        <div class="media-body">
                                                            <th><h4 class="media-heading  text-center2">Comentario 1</h4>

                                                            <div class="ficon  text-center2">
                                                                <button type="button"class="btn btn-primary btn-lg" required="required" id="my"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                                                            </div>
                                                            </th>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-md-4 text-center2">
                                                    <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
                                                        <div class="media-body">
                                                            <th><h4 class="media-heading  text-center2">Comentario 1</h4>

                                                            <div class="ficon  text-center2">
                                                                <button type="button"class="btn btn-primary btn-lg" required="required" id="myBtn1"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                                                            </div>
                                                            </th>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-md-4  text-center2">
                                                    <div class="wow bounceIn" data-wow-offset="0" data-wow-delay="0.4s">
                                                        <div class="media-body">
                                                            <th><h4 class="media-heading  text-center2">Comentario 1</h4>

                                                            <div class="ficon  text-center2">
                                                                <button type="button"class="btn btn-primary btn-lg" required="required" id="my"><span class="glyphicon glyphicon-ok-circle"></span> Leer mas</button>
                                                            </div>
                                                            </th>
                                                        </div>
                                                    </div>
                                                </div>

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
                                        </div>
                                    </section>
                                </section>
                            </section>
                        </section>
                    </section>
                </section>
            </section>
        </section>

        <!-- Bootstrap -->
        <script src="js/bootstrap.js"></script>
        <!-- App -->
        <script src="js/app.js"></script>
        <script src="js/app.plugin.js"></script>
        <script src="js/slimscroll/jquery.slimscroll.min.js"></script>

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
