<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : index
    Created on : 04/04/2019, 06:59:07 PM
    Author     : Alumno
--%>


<!DOCTYPE html>
<html>
    <head>

        <meta charset=UTF-8>
        <%@include file="../WEB-INF/jspf/cmeta.jspf" %>
        <%@include file="../WEB-INF/jspf/cstyles.jspf" %>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <link rel="icon" type="image/jpg" href="../recursos/img/logoKL.png" />
        <title>Kurt Lewin - Los Olivos</title>

        <!-- Google font -->
        <link href="https://fonts.googleapis.com/css?family=Hind:400,700" rel="stylesheet">
        <!-- Bootstrap -->
        <link type="text/css" rel="stylesheet" href=".../recursos/css/bootstrap.min.css" />

        <!-- Slick -->
        <link type="text/css" rel="stylesheet" href=".../recursos/css/slick.css" />
        <link type="text/css" rel="stylesheet" href=".../recursos/css/slick-theme.css" />

        <!-- nouislider -->
        <link type="text/css" rel="stylesheet" href=".../recursos/css/nouislider.min.css" />

        <!-- Font Awesome Icon -->
        <link rel="stylesheet" href=".../recursos/css/font-awesome.min.css">

        <!-- Custom stlylesheet -->
        <link type="text/css" rel="stylesheet" href="../recursos/css/style.css" />

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
                  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
                  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
                <![endif]-->

        <script src="../recursos/js/buscar.js" type="text/javascript"></script>

        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" href="../recursos/css/Footer-with-map.css"> 

    </head>
    <body>
        <div class="container-fluid">


            tienes que llamar a todo el footer todoooo!
            <section>

                <body>
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
                                        <img src="../recursos/img/listaP.png" alt="">

                                    </a>
                                </div>
                                <!-- /Logo -->

                                <!-- Search -->
                                <div class="header-search">
                                    <form>
                                        <input class="input search-input" type="text" placeholder="�Qu� est�s buscando?">
                                        <select class="input search-categories">
                                            <option value="0">Ingresar</option>
                                            <a href="login.jsp"><option  value="1">Soy un Profesor</option> </a>
                                            <option value="1">Soy un Padre</option>
                                        </select>
                                        <button class="search-btn"><i class="fa fa-search"></i></button>
                                    </form>
                                </div>
                                <!-- /Search -->
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
                                    <span class="category-header">Listado de preguntas <i class="fas fa-stream"></i></span>

                                </div>
                                <!-- /category nav -->

                                <!-- menu nav -->
                                <div class="menu-nav">
                                    <span class="menu-header">Menu <i class="fa fa-bars"></i></span>
                                    <ul class="menu-list">
                                        <li><a href="../index.jsp">Inicio</a></li>
                                        <li><a href="<%=request.getContextPath()%>/preguntacontroller.do?txtAccionp=newp">Agregar otra pregunta</a></li>
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
                    <div class="container-fluid">



                        <br>
                        <br> 
                        <center><input class="form-control" style="width: 50%; " id="searchTerm" type="text" placeholder="Buscar..." onkeyup="doSearch()" /> <p><i class="fas fa-search"></i></p></center>
                        <br>     

                        <div class="row cardmodulos">
                            <div class="col-12 col-lg-1"></div>
                            <div class="col-12 col-lg-10">



                                <div class="card">
                                    <div class="card-header">
                                        <i class="fab fa-product-hunt"></i>&nbsp;&nbsp; Preguntas
                                    </div>
                                    <div class="card-body">
                                        <table class="table table-bordered table-hover" id="datos">
                                            <thead>
                                                <tr>
                                                    <th>Id</th>
                                                    <th>Pregunta</th>
                                                    <th>Dificultad</th>
                                                    <th>Curso</th>
                                                    <th>Bimestre</th>
                                                    <th>A�o</th>

                                                </tr>
                                            </thead>
                                            <tfoot>
                                                <tr>
                                                    <th>Id</th>
                                                    <th>Pregunta</th>
                                                    <th>Dificultad</th>
                                                    <th>Curso</th>
                                                    <th>Bimestre</th>
                                                    <th>A�o</th>

                                                </tr>
                                            </tfoot> 
                                            <tbody>
                                                <c:forEach var="preguntas" items="${sessionScope.preguntas}">

                                                    <tr>

                                                        <td>${preguntas.id}</td>
                                                        <td>${preguntas.pregunta}</td>
                                                        <td>${preguntas.dificultad}</td>
                                                        <td>${preguntas.curso}</td>
                                                        <td>${preguntas.bimestre}</td>
                                                        <td>${preguntas.anio}</td>



                                                    </tr>

                                                </c:forEach>


                                            </tbody>
                                        </table>

                                    </div>
                                </div>

                            </div>

                        </div>   

                    </div>
            </section>
                                        <br><br><br>
                     <!-- FOOTER -->
                     <center><footer id="myFooter" style="background: #182c39">
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
                                <li><a>Somos una institucion  educativa con mas 20 a�os de experiencia, formando personas con un alto nivel educativo y listos 
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




                    <div class="social-networks" >

                        <a href="https://es-la.facebook.com/ColegioKurtLewin/" class="facebook"><i class="fa fa-facebook"></i></a>
                        <a href="http://colegiokurtlewin.blogspot.com/" class="google"><i class="fa fa-google-plus"></i></a>


                        <p class="footer-copyright">� 2019 Copyright Colegio Kurt Lewin</p>
                    </div>
                </div>
            </footer></center>
            <!-- /FOOTER -->

            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
            <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
           
          
            
    </body>
    
    <%@include file="../WEB-INF/jspf/cscripts.jspf" %>
</html>