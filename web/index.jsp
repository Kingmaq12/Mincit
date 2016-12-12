<%@page import="ufps.mincit.datos.dto.EventoDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ufps.mincit.negocio.Negocio"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <%
            Negocio n = new Negocio();
        %>
        <meta charset="utf-8">
        <meta name="robots" content="all,follow">
        <meta name="googlebot" content="index,follow,snippet,archive">
        <meta name="viewport" content="width=device-width, initial-scale=1">

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
        <!--[if lt IE 9]> #1abc9c
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
                                <p class="hidden-sm hidden-xs">Contactenos +0000000 or eventomincit@gmail.com.</p>
                                <p class="hidden-md hidden-lg"><a href="#" data-animate-hover="pulse"><i class="fa fa-phone"></i></a>  <a href="#" data-animate-hover="pulse"><i class="fa fa-envelope"></i></a>
                                </p>
                            </div>
                            <div class="col-xs-7">
                                <div class="social">
                                    <a href="https://www.facebook.com/MincomercioCo/" class="external facebook" data-animate-hover="pulse"><i class="fa fa-facebook"></i></a>
                                    <a href="https://www.instagram.com/mincomercioco/" class="external instagram" data-animate-hover="pulse"><i class="fa fa-user" ></i></a>
                                    <a href="https://twitter.com/MincomercioCo" class="external twitter" data-animate-hover="pulse"><i class="fa fa-twitter"></i></a>
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
                                    <img src="img/1.png" class="hidden-xs hidden-sm">
                                    <img src="img/logo-small.png" class="visible-xs visible-sm"><span class="sr-only">Mincit Eventos - Inicio</span>
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
                                    <li class="dropdown active">
                                        <a href="index.jsp">Inicio </a>
                                    </li>
                                    <li class="dropdown use-yamm yamm-fw">
                                        <a href="2.busqueda.jsp" >Eventos</a>
                                    </li>
                                    <li class="dropdown use-yamm yamm-fw">
                                        <a href="3.calendario.jsp" >Calendario</a>
                                    </li>
                                    <li class="dropdown">
                                        <a href="4.contacto.jsp" >Registre Evento</a>
                                    </li>
                                </ul>

                            </div>

                        </div>

                    </div>
                    <!-- /#navbar -->

                </div>

                <!-- *** NAVBAR END *** -->

            </header>

            <!-- *** HOMEPAGE CAROUSEL ***
 _________________________________________________________ -->

            <div class="home-carousel">

                <div class="dark-mask"></div>

                <div class="container">
                    <div class="homepage owl-carousel">
                        <%
                            ArrayList<EventoDTO> p = n.consultarCarrusel();

                            if (p != null) {
                                for (EventoDTO e : p) {
                        %>
                        <div class="item">
                            <div class="row">

                                <div class="col-sm-7 text-center">
                                    <img class="img-responsive" src="img/eve2.jpg" alt="">
                                </div>

                                <div class="col-sm-5">
                                    <h2><%=e.getNombre()%></h2>
                                    <ul class="list-style-none">
                                        <li>Fecha: <%=e.getFecha()%>, <%=e.getHora()%>, Lugar:<%=e.getLugar()%></li>
                                        <li><a href="ver_evento.jsp?id=<%=e.getId()%>" target="_blank" class="btn btn-template-transparent-primary">Ver Detalles </a></li>
                                    </ul>
                                </div>

                            </div>
                        </div>
                        <%
                                }
                            }
                        %>



                    </div>
                    <!-- /.project owl-slider -->
                </div>
            </div>

            <!-- *** HOMEPAGE CAROUSEL END *** -->
        </section>


        <section class="bar background-white no-mb">
            <div class="container" data-animate="fadeInUp">
                <div class="row">
                    <div class="col-md-12">

                        <div class="heading text-center">
                            <h2>Mincit Eventos</h2>
                        </div>

                        <div class="row">
                            <div class="portfolio-showcase clearfix">
                                <div class="col-sm-6">
                                    <div class="image">
                                        <img src="img/portfolio-4.jpg" alt="" class="img-responsive">
                                    </div>
                                </div>

                                <div class="col-sm-6">
                                    <h3><a href="portfolio-detail.html">Evento X</a></h3>
                                    <p class="lead">This is the lead paragraph of the article. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget.</p>
                                    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper.
                                        Aenean ultricies mi vitae est. Mauris placerat eleifend leo.</p>
                                    <p class="buttons">
                                        <a href="portfolio-detail.html" class="btn btn-template-main">Mas informacion</a>
                                        <a href="#" class="btn btn-template-main">Visita su sitio web</a>
                                    </p>
                                </div>
                            </div>
                        </div>

                        <div class="heading text-center">
                            <h3>Ultimos Eventos</h3>
                        </div>

                        <div class="row portfolio no-space">
                            <div class="col-sm-4">
                                <div class="box-image">
                                    <div class="image">
                                        <img src="img/portfolio-1.jpg" alt="" class="img-responsive">
                                    </div>
                                    <div class="bg"></div>
                                    <div class="name">
                                        <h3><a href="portfolio-detail.html">Portfolio box-image</a></h3> 
                                    </div>
                                    <div class="text">
                                        <p class="hidden-sm">Pellentesque habitant morbi tristique senectus et netus et malesuada</p>
                                        <p class="buttons">
                                            <a href="portfolio-detail.html" class="btn btn-template-transparent-primary">View</a>
                                            <a href="#" class="btn btn-template-transparent-primary">Website</a>
                                        </p>
                                    </div>
                                </div>
                                <!-- /.box-image -->

                            </div>

                            <div class="col-sm-4">
                                <div class="box-image">
                                    <div class="image">
                                        <img src="img/portfolio-2.jpg" alt="" class="img-responsive">
                                    </div>
                                    <div class="bg"></div>
                                    <div class="name">
                                        <h3><a href="portfolio-detail.html">Portfolio box-image</a></h3> 
                                    </div>
                                    <div class="text">
                                        <p class="hidden-sm">Pellentesque habitant morbi tristique senectus et netus et malesuada</p>
                                        <p class="buttons">
                                            <a href="portfolio-detail.html" class="btn btn-template-transparent-primary">View</a>
                                            <a href="#" class="btn btn-template-transparent-primary">Website</a>
                                        </p>
                                    </div>
                                </div>
                                <!-- /.box-image -->

                            </div>

                            <div class="col-sm-4">
                                <div class="box-image">
                                    <div class="image">
                                        <img src="img/portfolio-3.jpg" alt="" class="img-responsive">
                                    </div>
                                    <div class="bg"></div>
                                    <div class="name">
                                        <h3><a href="portfolio-detail.html">Portfolio box-image</a></h3> 
                                    </div>
                                    <div class="text">
                                        <p class="hidden-sm">Pellentesque habitant morbi tristique senectus et netus et malesuada</p>
                                        <p class="buttons">
                                            <a href="portfolio-detail.html" class="btn btn-template-transparent-primary">View</a>
                                            <a href="#" class="btn btn-template-transparent-primary">Website</a>
                                        </p>
                                    </div>
                                </div>
                                <!-- /.box-image -->

                            </div>

                            <div class="col-sm-4">
                                <div class="box-image">
                                    <div class="image">
                                        <img src="img/portfolio-4.jpg" alt="" class="img-responsive">
                                    </div>
                                    <div class="bg"></div>
                                    <div class="name">
                                        <h3><a href="portfolio-detail.html">Portfolio box-image</a></h3> 
                                    </div>
                                    <div class="text">
                                        <p class="hidden-sm">Pellentesque habitant morbi tristique senectus et netus et malesuada</p>
                                        <p class="buttons">
                                            <a href="portfolio-detail.html" class="btn btn-template-transparent-primary">View</a>
                                            <a href="#" class="btn btn-template-transparent-primary">Website</a>
                                        </p>
                                    </div>
                                </div>
                                <!-- /.box-image -->
                            </div>

                            <div class="col-sm-4">
                                <div class="box-image">
                                    <div class="image">
                                        <img src="img/portfolio-5.jpg" alt="" class="img-responsive">
                                    </div>
                                    <div class="bg"></div>
                                    <div class="name">
                                        <h3><a href="portfolio-detail.html">Portfolio box-image</a></h3> 
                                    </div>
                                    <div class="text">
                                        <p class="hidden-sm">Pellentesque habitant morbi tristique senectus et netus et malesuada</p>
                                        <p class="buttons">
                                            <a href="portfolio-detail.html" class="btn btn-template-transparent-primary">View</a>
                                            <a href="#" class="btn btn-template-transparent-primary">Website</a>
                                        </p>
                                    </div>
                                </div>
                                <!-- /.box-image -->
                            </div>

                            <div class="col-sm-4">
                                <div class="box-image">
                                    <div class="image">
                                        <img src="img/portfolio-6.jpg" alt="" class="img-responsive">
                                    </div>
                                    <div class="bg"></div>
                                    <div class="name">
                                        <h3><a href="portfolio-detail.html">Portfolio box-image</a></h3> 
                                    </div>
                                    <div class="text">
                                        <p class="hidden-sm">Pellentesque habitant morbi tristique senectus et netus et malesuada</p>
                                        <p class="buttons">
                                            <a href="portfolio-detail.html" class="btn btn-template-transparent-primary">View</a>
                                            <a href="#" class="btn btn-template-transparent-primary">Website</a>
                                        </p>
                                    </div>
                                </div>
                                <!-- /.box-image -->
                            </div>

                            <div class="col-sm-4">
                                <div class="box-image">
                                    <div class="image">
                                        <img src="img/portfolio-7.jpg" alt="" class="img-responsive">
                                    </div>
                                    <div class="bg"></div>
                                    <div class="name">
                                        <h3><a href="portfolio-detail.html">Portfolio box-image</a></h3> 
                                    </div>
                                    <div class="text">
                                        <p class="hidden-sm">Pellentesque habitant morbi tristique senectus et netus et malesuada</p>
                                        <p class="buttons">
                                            <a href="portfolio-detail.html" class="btn btn-template-transparent-primary">View</a>
                                            <a href="#" class="btn btn-template-transparent-primary">Website</a>
                                        </p>
                                    </div>
                                </div>
                                <!-- /.box-image -->
                            </div>
                            <div class="col-sm-4">
                                <div class="box-image">
                                    <div class="image">
                                        <img src="img/portfolio-9.jpg" alt="" class="img-responsive">
                                    </div>
                                    <div class="bg"></div>
                                    <div class="name">
                                        <h3><a href="portfolio-detail.html">Portfolio box-image</a></h3> 
                                    </div>
                                    <div class="text">
                                        <p class="hidden-sm">Pellentesque habitant morbi tristique senectus et netus et malesuada</p>
                                        <p class="buttons">
                                            <a href="portfolio-detail.html" class="btn btn-template-transparent-primary">View</a>
                                            <a href="#" class="btn btn-template-transparent-primary">Website</a>
                                        </p>
                                    </div>
                                </div>
                                <!-- /.box-image -->
                            </div>
                            <div class="col-sm-4">
                                <div class="box-image">
                                    <div class="image">
                                        <img src="img/portfolio-8.jpg" alt="" class="img-responsive">
                                    </div>
                                    <div class="bg"></div>
                                    <div class="name">
                                        <h3><a href="portfolio-detail.html">Portfolio box-image</a></h3> 
                                    </div>
                                    <div class="text">
                                        <p class="hidden-sm">Pellentesque habitant morbi tristique senectus et netus et malesuada</p>
                                        <p class="buttons">
                                            <a href="portfolio-detail.html" class="btn btn-template-transparent-primary">View</a>
                                            <a href="#" class="btn btn-template-transparent-primary">Website</a>
                                        </p>
                                    </div>
                                </div>
                                <!-- /.box-image -->
                            </div>
                        </div>

                        <div class="see-more">
                            <a href="2.busqueda.jsp" class="btn btn-template-main">Busca mas Eventos</a>
                        </div>

                    </div>

                </div>
            </div>
        </section>


        <!-- /.bar -->

        <section class="bar background-white no-mb">
            <div class="container">

                <div class="col-md-12">
                    <div class="heading text-center">
                        <h2>Eventos Pasados</h2>
                    </div>

                    <p class="lead">Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies
                        mi vitae est. Mauris placerat eleifend leo. <span class="accent">Check our blog!</span>
                    </p>

                    <!-- *** BLOG HOMEPAGE ***
_________________________________________________________ -->

                    <div class="row">
                        <div class="col-md-3 col-sm-6">
                            <div class="box-image-text blog">
                                <div class="top">
                                    <div class="image">
                                        <img src="img/portfolio-4.jpg" alt="" class="img-responsive">
                                    </div>
                                    <div class="bg"></div>
                                    <div class="text">
                                        <p class="buttons">
                                            <a href="blog-post.html" class="btn btn-template-transparent-primary"><i class="fa fa-link"></i>  Descripcion</a>
                                        </p>
                                    </div>
                                </div>
                                <div class="content">
                                    <h4><a href="blog-post.html">Evento A</a></h4>
                                    <p class="author-category">By <a href="#">John Snow</a> in <a href="blog.html">Webdesign</a>
                                    </p>
                                    <p class="intro">Fifth abundantly made Give sixth hath. Cattle creature i be don't them behold green moved fowl Moved life us beast good yielding. Have bring.</p>
                                    <p class="read-more"><a href="blog-post.html" class="btn btn-template-main"> Descripcion</a>
                                    </p>
                                </div>
                            </div>
                            <!-- /.box-image-text -->

                        </div>

                        <div class="col-md-3 col-sm-6">
                            <div class="box-image-text blog">
                                <div class="top">
                                    <div class="image">
                                        <img src="img/portfolio-3.jpg" alt="" class="img-responsive">
                                    </div>
                                    <div class="bg"></div>
                                    <div class="text">
                                        <p class="buttons">
                                            <a href="blog-post.html" class="btn btn-template-transparent-primary"><i class="fa fa-link"></i>  Descripcion</a>
                                        </p>
                                    </div>
                                </div>
                                <div class="content">
                                    <h4><a href="blog-post.html">Evento Y</a></h4>
                                    <p class="author-category">By <a href="#">John Snow</a> in <a href="blog.html">Webdesign</a>
                                    </p>
                                    <p class="intro">Fifth abundantly made Give sixth hath. Cattle creature i be don't them behold green moved fowl Moved life us beast good yielding. Have bring.</p>
                                    <p class="read-more"><a href="blog-post.html" class="btn btn-template-main"> Descripcion</a>
                                    </p>
                                </div>
                            </div>
                            <!-- /.box-image-text -->

                        </div>

                        <div class="col-md-3 col-sm-6">
                            <div class="box-image-text blog">
                                <div class="top">
                                    <div class="image">
                                        <img src="img/portfolio-5.jpg" alt="" class="img-responsive">
                                    </div>
                                    <div class="bg"></div>
                                    <div class="text">
                                        <p class="buttons">
                                            <a href="blog-post.html" class="btn btn-template-transparent-primary"><i class="fa fa-link"></i> Descripcion</a>
                                        </p>
                                    </div>
                                </div>
                                <div class="content">
                                    <h4><a href="blog-post.html">Evento Z</a></h4>
                                    <p class="author-category">By <a href="#">John Snow</a> in <a href="blog.html">Webdesign</a>
                                    </p>
                                    <p class="intro">Fifth abundantly made Give sixth hath. Cattle creature i be don't them behold green moved fowl Moved life us beast good yielding. Have bring.</p>
                                    <p class="read-more"><a href="blog-post.html" class="btn btn-template-main"> Descripcion</a>
                                    </p>
                                </div>
                            </div>
                            <!-- /.box-image-text -->

                        </div>

                        <div class="col-md-3 col-sm-6">
                            <div class="box-image-text blog">
                                <div class="top">
                                    <div class="image">
                                        <img src="img/portfolio-6.jpg" alt="" class="img-responsive">
                                    </div>
                                    <div class="bg"></div>
                                    <div class="text">
                                        <p class="buttons">
                                            <a href="blog-post.html" class="btn btn-template-transparent-primary"><i class="fa fa-link"></i>  Descripcion</a>
                                        </p>
                                    </div>
                                </div>
                                <div class="content">
                                    <h4><a href="blog-post.html">Evento E</a></h4>
                                    <p class="author-category">By <a href="#">John Snow</a> in <a href="blog.html">Webdesign</a>
                                    </p>
                                    <p class="intro">Am terminated it excellence invitation projection as. She graceful shy believed distance use nay. Lively is people.</p>
                                    <p class="read-more"><a href="blog-post.html" class="btn btn-template-main"> Descripcion</a>
                                    </p>
                                </div>
                            </div>
                            <!-- /.box-image-text -->

                        </div>

                    </div>
                    <!-- /.row -->

                    <!-- *** BLOG HOMEPAGE END *** -->

                </div>

            </div>
            <!-- /.container -->
        </section>
        <!-- /.bar -->



        <!-- *** FOOTER ***
_________________________________________________________ -->

        <footer id="footer">
            <div class="container">
                <div class="col-md-5 col-sm-6">
                    <h4>Acerca de nosotros</h4>

                    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>


                    <hr class="hidden-md hidden-lg hidden-sm">

                </div>
                <!-- /.col-md-3 -->


                <!-- /.col-md-3 -->

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


                <!-- /.col-md-3 -->
            </div>
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



    <!-- owl carousel -->
    <script src="js/owl.carousel.min.js"></script>



</body>

</html>