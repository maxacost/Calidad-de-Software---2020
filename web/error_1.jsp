<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<% String error = (String) request.getSession().getAttribute("error");%>
<!DOCTYPE html>
<html lang="zxx">

    <head>
        <title>Login - Colegio Kurt Lewin</title>
        <!-- Meta tag Keywords -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="keywords" content="Utilizer Login Form template Responsive, Login form web template, Flat Pricing tables, Flat Drop downs Sign up Web Templates, Flat Web Templates, Login sign up Responsive web template, SmartPhone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <link href="recursos/css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="icon" type="image/jpg" href="recursos/img/logoKL.png" />
        <script>
            addEventListener("load", function () {
                setTimeout(hideURLbar, 0);
            }, false);

            function hideURLbar() {
                window.scrollTo(0, 1);
            }

        </script>
        <!-- //Meta tag Keywords -->
        <!-- Custom-Files -->
        <!-- Bootstrap-Core-CSS -->
        <link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
        <!-- Style-CSS -->
        <!-- font-awesome-icons -->
        <link href="recursos/css/font-awesome.css" rel="stylesheet" type="text/css"/>

        <!-- //font-awesome-icons -->
        <!-- /Fonts -->
        <link href="//fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700" rel="stylesheet">
        <!-- //Fonts -->
    </head>

    <body>
        <!-- main -->
        <div class="main-top-intro">
            <div class="bg-layer">
                <!-- header -->
                <div class="wrapper">
                    <header>
                        <div class="header-w3layouts">
                            <h1>
                                <a class="navbar-brand logo" href="login.jsp">
                                    Colegio Kurt Lewin
                                </a>
                            </h1>
                        </div>
                        <div class="nav_w3pvt">
                            <nav>
                                <label for="drop" class="toggle mt-lg-0 mt-2"><span class="fa fa-bars" aria-hidden="true"></span></label>
                                <input type="checkbox" id="drop" />
                                <ul class="menu">
                                    <li class="active"><a href="#">Inicio</a></li>
                                    <li class=""><a href="#">Ayuda</a></li>
                                    <li class=""><a href="#">Servicios</a></li>
                                    <li class="p-0">
                                        <!-- First Tier Drop Down -->
                                        <label for="drop-2" class="toggle">Pages <span class="fa fa-angle-down" aria-hidden="true"></span> </label>
                                        <a href="#">Pages <span class="fa fa-angle-down" aria-hidden="true"></span></a>
                                        <input type="checkbox" id="drop-2" />
                                        <ul class="inner-dropdown">
                                            <li><a href="#">Error Page</a></li>
                                            <li><a href="#">About Us</a></li>
                                            <li><a href="#">Contact Us</a></li>
                                        </ul>
                                    </li>
                                   <li><a href="https://www.google.com/maps/place/Colegio+De+Ciencias+Kurt+Lewin/@-12.0245659,-77.0644864,12.75z/data=!4m19!1m13!4m12!1m4!2m2!1d-77.0220032!2d-12.1184256!4e1!1m6!1m2!1s0x9105ce41caa1fe17:0xcf46b35f1478ca07!2scolegio+kurt+lewin!2m2!1d-77.078053!2d-11.9787299!3m4!1s0x9105ce41caa1fe17:0xcf46b35f1478ca07!8m2!3d-11.9787299!4d-77.078053">Ubicación   </a></li> 
                                </ul>
                            </nav>
                        </div>

                        <div class="buttons mt-lg-0 mt-3 ml-auto">
                            <div class="form-w3layouts-grid">
                                <form action="#" method="post" class="newsletter">
                                    <input class="search" type="search" placeholder="" required="">
                                    <button class="form-control btn" value=""><span class="fa fa-search"></span></button>
                                    <div class="clear"></div>
                                </form>
                            </div>
                        </div>
                        <div class="clear"></div>

                    </header>
                    <!-- //header -->
                    <center><div class="content-inner-info">
                            <h2>Error al Iniciar Sesión</h2>
                            <div class="content-w3layouts-main">

                                <div class="form-w3ls-left-info">


                                    <div class="row">
                                        <div class="col-12 col-lg-4"></div>
                                        <div class="col-12 col-lg-4">
                                            <div class="alert alert-danger" role="alert" style="color: #ffffff">
                                                Ha ocurrido el siguiente error : <%=error%>
                                                <br>
                                                <br><br>
                                            </div>
                                            <center><a href="login.jsp"<button type="button" class="btn btn-secondary btn-lg btn-block">Volver a Intentarlo</button></center>
                                        </div>

                                        <div class="col-12 col-lg-4"></div>
                                    </div>


                                </div>


                            </div>

                        </div></center>
                    <br><br><br><br><br>
                    <!-- copyright -->
                    <div class="copy-w3layouts-inf">
                       <p>© 2019
                            Todos los derechos reservados para el Team Developer JJTTV | 
                            <a href="http://colegiokurtlewin.blogspot.com/"> Colegio Kurt Lewin.</a>
                        </p>    
                    </p>
                        <ul class="list-unstyled w3layouts-icons">
                            <li>
                                <a href="https://fr-fr.facebook.com/ColegioKurtLewin/" class="face-b">
                                    <span class="fa fa-facebook-f"></span>
                                </a>
                            </li>
                            <li>
                                <a href="#" class="twit">
                                    <span class="fa fa-twitter"></span>
                                </a>
                            </li>
                            <li>
                                <a href="#" class="dribble">
                                    <span class="fa fa-dribbble"></span>
                                </a>
                            </li>
                            <li>
                                <a href="#" class="vk">
                                    <span class="fa fa-vk"></span>
                                </a>
                            </li>
                        </ul>
                        <div class="clear"></div>
                    </div>
                    <!-- //copyright -->
                </div>
            </div>
        </div>
        <!-- //main -->

    </body>

</html>
