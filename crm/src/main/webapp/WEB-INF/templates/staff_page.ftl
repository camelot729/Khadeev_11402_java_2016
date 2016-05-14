<!DOCTYPE html>
<html lang="en">
<head>

    <!-- start: Meta -->
    <meta charset="utf-8">
    <title>demo</title>
    <meta name="description" content="Bootstrap Metro Dashboard">
    <meta name="author" content="Dennis Ji">
    <meta name="keyword"
          content="Metro, Metro UI, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
    <!-- end: Meta -->

    <!-- start: Mobile Specific -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- end: Mobile Specific -->

    <!-- start: CSS -->
    <link id="bootstrap-style" href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="/resources/css/bootstrap-responsive.min.css" rel="stylesheet">
    <link id="base-style" href="/resources/css/style.css" rel="stylesheet">
    <link id="base-style-responsive" href="/resources/css/style-responsive.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext'
          rel='stylesheet' type='text/css'>
    <!-- end: CSS -->


    <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <link id="ie-style" href="/resources/css/ie.css" rel="stylesheet">
    <![endif]-->

    <!--[if IE 9]>
    <link id="ie9style" href="/resources/css/ie9.css" rel="stylesheet">
    <![endif]-->

    <!-- start: Favicon -->
    <link rel="shortcut icon" href="/resources/img/favicon.ico">
    <!-- end: Favicon -->


</head>

<body>
<!-- start: Header -->
<div class="navbar">
    <div class="navbar-inner">
        <div class="container-fluid">
            <a class="btn btn-navbar" data-toggle="collapse"
               data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>
            <a class="brand" href="/staff"><span>camelot</span></a>

            <!-- start: Header Menu -->
            <div class="nav-no-collapse header-nav">
                <ul class="nav pull-right">


                    <li>

                        <a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="halflings-icon white user"></i> ${staff.firstname}
                            <span class="caret"></span>
                        </a>
                        <ul class="dropdown-menu">
                            <li class="dropdown-menu-title">
                                <span>Account Settings</span>
                            </li>
                            <li><a href="/staff"><i class="halflings-icon user"></i> Profile</a></li>
                            <li><a href="/logout"><i class="halflings-icon off"></i> Logout</a></li>
                        </ul>
                    </li>


                </ul>
                <!-- end: User Dropdown -->
            </div>
            <!-- end: Header Menu -->
        </div>
    </div>
</div>


<!-- start: Header -->

<div class="container-fluid-full">
    <div class="row-fluid">

        <!-- start: Main Menu -->
        <div id="sidebar-left" class="span2">
            <div class="nav-collapse sidebar-nav">
                <ul class="nav nav-tabs nav-stacked main-menu">
                    <li><a href="/staff"><i class="icon-bar-chart"></i><span class="hidden-tablet"> Profile</span></a>
                    </li>
                    <li><a href="/staff/calendar"><i class="icon-calendar"></i><span
                            class="hidden-tablet"> Calendar</span></a></li>
                    <li><a href="/logout"><i class="icon-off"></i><span
                            class="hidden-tablet"> Logout</span></a></li>
                </ul>
            </div>
        </div>
        <!-- end: Main Menu -->

        <noscript>
            <div class="alert alert-block span10">
                <h4 class="alert-heading">Warning!</h4>

                <p>You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a>
                    enabled to use this site.</p>
            </div>
        </noscript>

        <!-- start: Content -->
        <div id="content" class="span10">
            <ul class="breadcrumb">
                <li>
                    <i class="icon-home"></i>
                    <a href="/staff">Home</a>
                    <i class="icon-angle-right"></i>
                </li>
                <li><a href="#">Profile</a></li>
            </ul>
        <div class="span10" align="center">
            <div class=""></div>
        <div class="span3">
        <#if staff.sex == 'MALE'>
            <img src="resources/img/gallery/photo12.jpg" class="img-circle" style="height: 200px">
        </div>
        <#else >
            <img src="resources/img/gallery/photo13.jpg" class="img-circle" style="height: 200px">
        </div>
        </#if>
            <div class="span6">
                <table class="table table-responsive">
                    <tr>
                        <th>
                            Name :
                        </th>
                        <td>
                        ${staff.firstname}
                        </td>
                    </tr>
                    <tr>
                        <th>
                            Surname :
                        </th>
                        <td>
                        ${staff.surname}
                        </td>
                    </tr>
                    <tr>
                        <th>
                            Email :
                        </th>
                        <td>
                        ${staff.email}
                        </td>
                    </tr>
                    <tr>
                        <th>
                            Login :
                        </th>
                        <td>
                        ${staff.login}
                        </td>
                    </tr>
                    <tr>
                        <th>
                            Sex :
                        </th>
                        <td>
                        ${staff.sex}
                        </td>
                    </tr>

                </table>
            </div>


        </div>

    </div>
    <!--/.fluid-container-->
    <!-- end: Content -->
</div>
<!--/#content.span10-->
</div>
<!--/fluid-row-->


<footer>

    <p>
        <span style="text-align:left;float:left">&copy; 2013 <a href="http://vk.com/camelot729"
                                                                alt="Bootstrap_Metro_Dashboard">Kamil Khadeev</a></span>

    </p>

</footer>

<!-- start: JavaScript-->
<script src="/resources/js/jquery-1.9.1.min.js"></script>
<script src="/resources/js/jquery-migrate-1.0.0.min.js"></script>

<script src="/resources/js/jquery-ui-1.10.0.custom.min.js"></script>

<script src="/resources/js/jquery.ui.touch-punch.js"></script>

<script src="/resources/js/modernizr.js"></script>

<script src="/resources/js/bootstrap.min.js"></script>

<script src="/resources/js/jquery.cookie.js"></script>

<script src='/resources/js/fullcalendar.min.js'></script>

<script src='/resources/js/jquery.dataTables.min.js'></script>

<script src="/resources/js/excanvas.js"></script>
<script src="/resources/js/jquery.flot.js"></script>
<script src="/resources/js/jquery.flot.pie.js"></script>
<script src="/resources/js/jquery.flot.stack.js"></script>
<script src="/resources/js/jquery.flot.resize.min.js"></script>

<script src="/resources/js/jquery.chosen.min.js"></script>

<script src="/resources/js/jquery.uniform.min.js"></script>

<script src="/resources/js/jquery.cleditor.min.js"></script>

<script src="/resources/js/jquery.noty.js"></script>

<script src="/resources/js/jquery.elfinder.min.js"></script>

<script src="/resources/js/jquery.raty.min.js"></script>

<script src="/resources/js/jquery.iphone.toggle.js"></script>

<script src="/resources/js/jquery.uploadify-3.1.min.js"></script>

<script src="/resources/js/jquery.gritter.min.js"></script>

<script src="/resources/js/jquery.imagesloaded.js"></script>

<script src="/resources/js/jquery.masonry.min.js"></script>

<script src="/resources/js/jquery.knob.modified.js"></script>

<script src="/resources/js/jquery.sparkline.min.js"></script>

<script src="/resources/js/counter.js"></script>

<script src="/resources/js/retina.js"></script>

<script src="/resources/js/custom.js"></script>
<!-- end: JavaScript-->

</body>
</html>
