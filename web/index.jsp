<%-- 
    Document   : index
    Created on : 04/04/2019, 06:59:07 PM
    Author     : Alumno
--%>
<%--@page import="com.miempresa.dtos.UsuarioDTO"%>
<% UsuarioDTO preguntaoDto = (UsuarioDTO) request.getSession().getAttribute("preguntas");--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/jspf/cmeta.jspf" %>
        <%@include file="WEB-INF/jspf/cstyles.jspf" %>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <link rel="icon" type="image/jpg" href="recursos/img/logoKL.png" />
        <title>Kurt Lewin - Los Olivos</title>

        <!-- Google font -->
        <link href="https://fonts.googleapis.com/css?family=Hind:400,700" rel="stylesheet">
        <!-- Bootstrap -->
        <link type="text/css" rel="stylesheet" href="recursos/css/bootstrap.min.css" />

        <!-- Slick -->
        <link type="text/css" rel="stylesheet" href="recursos/css/slick.css" />
        <link type="text/css" rel="stylesheet" href="recursos/css/slick-theme.css" />

        <!-- nouislider -->
        <link type="text/css" rel="stylesheet" href="recursos/css/nouislider.min.css" />

        <!-- Font Awesome Icon -->
        <link rel="stylesheet" href="recursos/css/font-awesome.min.css">

        <!-- Custom stlylesheet -->
        <link type="text/css" rel="stylesheet" href="recursos/css/style.css" />

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
                  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
                  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
                <![endif]-->
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" href="recursos/css/Footer-with-map.css">



    </head>
    <body >
        <div class="container-fluid">



            <section>


                <!-- HEADER -->

                <!-- /top Header -->

                <!-- header -->
                <div id="header">
                    <div class="container">
                        <div class="pull-left">
                            <!-- Logo -->
                            <center><h1>Sistema de Gestion de Examenes</h1></center>
                            <div class="header-logo">
                                <a class="logo" href="#">
                                    <img src="recursos/img/logoKL.png" alt="">

                                </a>
                            </div>
                            <!-- /Logo -->
                            <%--
                            <!-- Search -->
                            <div class="header-search">
                                <form>
                                    <input class="input search-input" type="text" placeholder="¿Qué estás buscando?">
                                    <select class="input search-categories">
                                        <option value="0">Ingresar</option>
                                        <a href="login.jsp"><option  value="1">Soy un Profesor</option> </a>
                                        <option value="1">Soy un Padre</option>
                                    </select>
                                    <button class="search-btn"><i class="fa fa-search"></i></button>
                                </form>
                            </div>
                            <!-- /Search -->--%>
                        </div>
                        <div class="pull-right">
                            <ul class="header-btns">
                                <!-- Account -->
                                <li class="header-account dropdown default-dropdown">
                                    <div class="dropdown-toggle" role="button" data-toggle="dropdown" aria-expanded="true">
                                        <div class="header-btns-icon">
                                            <i class="fa fa-user-o"></i>
                                        </div>
                                        <strong class="text-uppercase">Mi cuenta <i class="far fa-file-spreadsheet"></i></strong>
                                    </div>

                                    <a href="login.jsp" class="text-uppercase">Salir</a>
                                </li>
                                <!-- /Account -->

                                <!-- Mobile nav toggle-->
                                <li class="nav-toggle">
                                    <button class="nav-toggle-btn main-btn icon-btn"><i class="fa fa-bars"></i></button>
                                </li>
                                <!-- / Mobile nav toggle -->
                            </ul>
                        </div>
                    </div>
                    <!-- header -->
                </div>
                <!-- container -->
                </header>
                <!-- /HEADER -->

                <!-- NAVIGATION -->
                <div id="navigation">
                    <!-- container -->
                    <div class="container">
                        <div id="responsive-nav">
                            <!-- category nav -->
                            <div class="category-nav">
                                <span class="category-header">Categorias <i class="fa fa-list"></i></span>
                                <ul class="category-list">
                                    <li><a href="#myFooter">Sobre nosotros</a></li>
                                    <li><a href="">Contáctanos</a></li>
                                    <li><a href="<%=request.getContextPath()%>/examencontroller.do?action=listarE">Lista de Examenes</a></li>
                                </ul>
                            </div>
                            <!-- /category nav -->

                            <!-- menu nav -->
                            <div class="menu-nav">
                                <span class="menu-header">Menu <i class="fa fa-bars"></i></span>
                                <ul class="menu-list">
                                    <li><a href="#">Bienvenido</a></li>
                                    <li><a href="#"><%--=preguntaoDto.getPin()+" " + preguntaoDto.getRespuesta()--%></a></li>
                                    <li><a href="#"></a></li>
                                    <li><a href="#"></a></li>
                                    <li><a href="#"></a></li>
                                    <li><a href="#"></a></li>
                                    <ul class="custom-menu">
                                    </ul>
                                    </li>
                                </ul>
                            </div>
                            <!-- menu nav -->
                        </div>
                    </div>
                    <!-- /container -->
                </div>
                <!-- /NAVIGATION -->

                <!-- HOME -->
                <div id="home">
                    <!-- container -->
                    <div class="container">
                        <!-- home wrap -->
                        <div class="home-wrap">
                            <!-- home slick -->
                            <div id="home-slick">
                                <!-- banner -->
                                <div class="banner banner-1">
                                    <img src="recursos/img/imagen2.jpg" alt="">
                                    <div class="banner-caption text-center">
                                        <h1>EXAMEN</h1>
                                        <h3 class="white-color font-weak" style="color:  #2f3238"> Aquí podrás seleccionar las preguntas que requiera tu examen</h3>
                                        <a href="<%=request.getContextPath()%>/preguntacontroller.do?txtAccionp=listp"<button class="primary-btn"> ¡Gestionar Examen! </button></a>
                                    </div>
                                </div>
                                <!-- /banner -->

                                <!-- banner -->

                                <!-- /banner -->

                                <!-- banner -->

                                <!-- /banner -->
                            </div>
                            <!-- /home slick -->
                        </div>
                        <!-- /home wrap -->
                    </div>
                    <!-- /container -->
                </div>
                <!-- /HOME -->

                <!-- section -->
                <div class="section">
                    <!-- container -->
                    <div class="container">
                        <!-- row -->
                        <div class="row">
                            <!-- banner -->
                            <div class="col-md-4 col-sm-6">
                                <a class="banner banner-1" href="#">
                                    <img src="recursos/img/banner11.jpg" alt="">
                                    <div class="banner-caption text-center">
                                        <a href="<%=request.getContextPath()%>/preguntacontroller.do?txtAccionp=newp"<button class="primary-btn"> ¡Agregar Preguntas! </button></a>
                                    </div>
                                </a>
                            </div>
                            <!-- /banner -->

                            <!-- banner -->
                            <div class="col-md-4 col-sm-6">
                                <a class="banner banner-1" href="#">
                                    <img src="recursos/img/banner10.jpg" alt="">
                                    <div class="banner-caption text-center">
                                        <a href="<%=request.getContextPath()%>/preguntacontroller.do?txtAccionp=editar"<button class="primary-btn"> ¡Modificar Preguntas! </button></a>
                                    </div>
                                </a>
                            </div>
                            <!-- /banner -->

                            <!-- banner -->
                            <div class="col-md-4 col-md-offset-0 col-sm-6 col-sm-offset-3">
                                <a class="banner banner-1" href="#">
                                    <img src="recursos/img/banner12.jpg" alt="">
                                    <div class="banner-caption text-center">
                                        <a href="<%=request.getContextPath()%>/preguntacontroller.do?txtAccionp=eliminar"<button class="primary-btn"> ¡Eliminar Preguntas! </button></a>
                                    </div>
                                </a>
                            </div>
                            <!-- /banner -->

                        </div>
                        <!-- /row -->
                    </div>
                    <!-- /container -->
                </div>
                <!-- /section -->



                <!-- FOOTER -->

                <footer id="myFooter" style="background: #182c39">
                    <div class="container1">
                        <div class="row">
                            <div class="col-sm-4">
                                <h5>Explora con gusto</h5>
                                <ul>
                                    <li><a href="#">Inicio</a></li>
                                    <li><a href="#"></a></li>
                                    <li><a href="#"></a></li>
                                </ul>
                            </div>
                            <div class="col-sm-4">
                                <h5>Acerca de Nosotros</h5>
                                <ul>
                                    <li><a>Somos una institucion  educativa con mas 20 años de experiencia, formando personas con un alto nivel educativo y listos 
                                            para afrontar cualquier obstaculo.</a></li>
                                    <li><a href="#"></a></li>
                                    <li><a href="#"></a></li>
                                </ul>
                            </div>
                            <div class="col-sm-4">
                                <h5>Support</h5>
                                <ul>
                                    <li><a>Grupo de estudiantes del VI ciclo de la Universidad de Ciencias y Humanidades | JJTTV.</a></li>
                                    <li><a href="#"></a></li>
                                    <li><a href="#"></a></li>
                                </ul>
                            </div>

                        </div>

                        <iframe id="map-container" frameborder="0" style="border:0; color:#182c39" src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3902.9388976974606!2d-77.08024168525489!3d-11.978729891512677!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9105ce41caa1fe17%3A0xcf46b35f1478ca07!2sColegio+De+Ciencias+Kurt+Lewin!5e0!3m2!1ses!2spe!4v1561326743284!5m2!1ses!2spe" frameborder="0"
                                ></iframe>

                    </div>
                    <div class="social-networks" >

                        <a href="https://es-la.facebook.com/ColegioKurtLewin/" class="facebook"><i class="fa fa-facebook"></i></a>
                        <a href="http://colegiokurtlewin.blogspot.com/" class="google"><i class="fa fa-google-plus"></i></a>
                    </div>
                    <div class="footer-copyright">
                        <p>© 2019 Copyright Kurt Lewin</p>
                    </div>
                </footer>
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
                <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

                </html>
