<!DOCTYPE html>
<html lang="en">
<head>

    <!-- start: Meta -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>hey</title>
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
                            <i class="halflings-icon white user"></i> Kamil
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

        <!-- start: Content -->
        <div id="content" class="span10">
            <ul class="breadcrumb">
                <li>
                    <i class="icon-home"></i>
                    <a href="/staff">Home</a>
                    <i class="icon-angle-right"></i>
                </li>
                <li><a href="#">Calendar</a></li>
            </ul>
        <div class="span10" align="center">
            <div class=""></div>
        <div class="span3">
            <div class="span6">
                <#--table-->
                    <#--<table class="table table-bordered">-->
                        <#--<thead>-->
                        <#--<tr>-->
                            <#--<th>День\Время</th>-->
                            <#--<th>9:00 - 10:00</th>-->
                            <#--<th>10:00 - 11:00</th>-->
                            <#--<th>11:00 - 12:00</th>-->
                        <#--</tr>-->
                        <#--</thead>-->
                        <#--<tbody>-->
                        <#--<tr>-->
                            <#--<td>Понедельник</td>-->
                            <#--<td>-->
                            <#--<#if schedule??>-->
                                <#--<#list 0..21 as i>-->
                                    <#--<#if schedule[i]?? && (schedule[i][0] == "MONDAY") && (schedule[i][1] == "AM9_AM10")>-->
                                        <#--<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>-->
                                    <#--</#if>-->
                                <#--</#list>-->
                            <#--</#if>-->
                            <#--</td>-->
                            <#--<td>-->
                            <#--<#if schedule??>-->
                                <#--<#list 0..21 as i>-->
                                    <#--<#if schedule[i]?? && (schedule[i][0] == "MONDAY") && (schedule[i][1] == "AM10_AM11")>-->
                                        <#--<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>-->
                                    <#--</#if>-->
                                <#--</#list>-->
                            <#--</#if>-->
                            <#--</td>-->
                            <#--<td>-->
                            <#--<#if schedule??>-->
                                <#--<#list 0..21 as i>-->
                                    <#--<#if schedule[i]?? && (schedule[i][0] == "MONDAY") && (schedule[i][1] == "AM11_PM12")>-->
                                        <#--<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>-->
                                    <#--</#if>-->
                                <#--</#list>-->
                            <#--</#if>-->
                            <#--</td>-->
                        <#--</tr>-->
                        <#--<tr>-->
                            <#--<td>Вторник</td>-->
                            <#--<td>-->
                            <#--<#if schedule??>-->
                                <#--<#list 0..21 as i>-->
                                    <#--<#if schedule[i]?? && (schedule[i][0] == "TUESDAY") && (schedule[i][1] == "AM9_AM10")>-->
                                        <#--<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>-->
                                    <#--</#if>-->
                                <#--</#list>-->
                            <#--</#if>-->
                            <#--</td>-->
                            <#--<td>-->
                            <#--<#if schedule??>-->
                                <#--<#list 0..21 as i>-->
                                    <#--<#if schedule[i]?? && (schedule[i][0] == "TUESDAY") && (schedule[i][1] == "AM10_AM11")>-->
                                        <#--<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>-->
                                    <#--</#if>-->
                                <#--</#list>-->
                            <#--</#if>-->
                            <#--</td>-->
                            <#--<td>-->
                            <#--<#if schedule??>-->
                                <#--<#list 0..21 as i>-->
                                    <#--<#if schedule[i]?? && (schedule[i][0] == "TUESDAY") && (schedule[i][1] == "AM11_PM12")>-->
                                        <#--<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>-->
                                    <#--</#if>-->
                                <#--</#list>-->
                            <#--</#if>-->
                            <#--</td>-->
                        <#--</tr>-->
                        <#--<tr>-->
                            <#--<td>Среда</td>-->
                            <#--<td>-->
                            <#--<#if schedule??>-->
                                <#--<#list 0..21 as i>-->
                                    <#--<#if schedule[i]?? && (schedule[i][0] == "WEDNESDAY") && (schedule[i][1] == "AM9_AM10")>-->
                                        <#--<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>-->
                                    <#--</#if>-->
                                <#--</#list>-->
                            <#--</#if>-->
                            <#--</td>-->
                            <#--<td>-->
                            <#--<#if schedule??>-->
                                <#--<#list 0..21 as i>-->
                                    <#--<#if schedule[i]?? && (schedule[i][0] == "WEDNESDAY") && (schedule[i][1] == "AM10_AM11")>-->
                                        <#--<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>-->
                                    <#--</#if>-->
                                <#--</#list>-->
                            <#--</#if>-->
                            <#--</td>-->
                            <#--<td>-->
                            <#--<#if schedule??>-->
                                <#--<#list 0..21 as i>-->
                                    <#--<#if schedule[i]?? && (schedule[i][0] == "WEDNESDAY") && (schedule[i][1] == "AM11_PM12")>-->
                                        <#--<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>-->
                                    <#--</#if>-->
                                <#--</#list>-->
                            <#--</#if>-->
                            <#--</td>-->
                        <#--</tr>-->
                        <#--<tr>-->
                            <#--<td>Четверг</td>-->
                            <#--<td>-->
                            <#--<#if schedule??>-->
                                <#--<#list 0..21 as i>-->
                                    <#--<#if schedule[i]?? && (schedule[i][0] == "THURSDAY") && (schedule[i][1] == "AM9_AM10")>-->
                                        <#--<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>-->
                                    <#--</#if>-->
                                <#--</#list>-->
                            <#--</#if>-->
                            <#--</td>-->
                            <#--<td>-->
                            <#--<#if schedule??>-->
                                <#--<#list 0..21 as i>-->
                                    <#--<#if schedule[i]?? && (schedule[i][0] == "THURSDAY") && (schedule[i][1] == "AM10_AM11")>-->
                                        <#--<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>-->
                                    <#--</#if>-->
                                <#--</#list>-->
                            <#--</#if>-->
                            <#--</td>-->
                            <#--<td>-->
                            <#--<#if schedule??>-->
                                <#--<#list 0..21 as i>-->
                                    <#--<#if schedule[i]?? && (schedule[i][0] == "THURSDAY") && (schedule[i][1] == "AM11_PM12")>-->
                                        <#--<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>-->
                                    <#--</#if>-->
                                <#--</#list>-->
                            <#--</#if>-->
                            <#--</td>-->
                        <#--</tr>-->
                        <#--<tr>-->
                            <#--<td>Пятница</td>-->
                            <#--<td>-->
                            <#--<#if schedule??>-->
                                <#--<#list 0..21 as i>-->
                                    <#--<#if schedule[i]?? && (schedule[i][0] == "FRIDAY") && (schedule[i][1] == "AM9_AM10")>-->
                                        <#--<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>-->
                                    <#--</#if>-->
                                <#--</#list>-->
                            <#--</#if>-->
                            <#--</td>-->
                            <#--<td>-->
                            <#--<#if schedule??>-->
                                <#--<#list 0..21 as i>-->
                                    <#--<#if schedule[i]?? && (schedule[i][0] == "FRIDAY") && (schedule[i][1] == "AM10_AM11")>-->
                                        <#--<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>-->
                                    <#--</#if>-->
                                <#--</#list>-->
                            <#--</#if>-->
                            <#--</td>-->
                            <#--<td>-->
                            <#--<#if schedule??>-->
                                <#--<#list 0..21 as i>-->
                                    <#--<#if schedule[i]?? && (schedule[i][0] == "FRIDAY") && (schedule[i][1] == "AM11_PM12")>-->
                                        <#--<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>-->
                                    <#--</#if>-->
                                <#--</#list>-->
                            <#--</#if>-->
                            <#--</td>-->
                        <#--</tr>-->
                        <#--<tr>-->
                            <#--<td>Суббота</td>-->
                            <#--<td>-->
                            <#--<#if schedule??>-->
                                <#--<#list 0..21 as i>-->
                                    <#--<#if schedule[i]?? && (schedule[i][0] == "SATURDAY") && (schedule[i][1] == "AM9_AM10")>-->
                                        <#--<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>-->
                                    <#--</#if>-->
                                <#--</#list>-->
                            <#--</#if>-->
                            <#--</td>-->
                            <#--<td>-->
                            <#--<#if schedule??>-->
                                <#--<#list 0..21 as i>-->
                                    <#--<#if schedule[i]?? && (schedule[i][0] == "SATURDAY") && (schedule[i][1] == "AM10_AM11")>-->
                                        <#--<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>-->
                                    <#--</#if>-->
                                <#--</#list>-->
                            <#--</#if>-->
                            <#--</td>-->
                            <#--<td>-->
                            <#--<#if schedule??>-->
                                <#--<#list 0..21 as i>-->
                                    <#--<#if schedule[i]?? && (schedule[i][0] == "SATURDAY") && (schedule[i][1] == "AM11_PM12")>-->
                                        <#--<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>-->
                                    <#--</#if>-->
                                <#--</#list>-->
                            <#--</#if>-->
                            <#--</td>-->
                        <#--</tr>-->
                        <#--<tr>-->
                            <#--<td>Воскресенье</td>-->
                            <#--<td>-->
                            <#--<#if schedule??>-->
                                <#--<#list 0..21 as i>-->
                                    <#--<#if schedule[i]?? && (schedule[i][0] == "SUNDAY") && (schedule[i][1] == "AM9_AM10")>-->
                                        <#--<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>-->
                                    <#--</#if>-->
                                <#--</#list>-->
                            <#--</#if>-->
                            <#--</td>-->
                            <#--<td>-->
                            <#--<#if schedule??>-->
                                <#--<#list 0..21 as i>-->
                                    <#--<#if schedule[i]?? && (schedule[i][0] == "SUNDAY") && (schedule[i][1] == "AM10_AM11")>-->
                                        <#--<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>-->
                                    <#--</#if>-->
                                <#--</#list>-->
                            <#--</#if>-->
                            <#--</td>-->
                            <#--<td>-->
                            <#--<#if schedule??>-->
                                <#--<#list 0..21 as i>-->
                                    <#--<#if schedule[i]?? && (schedule[i][0] == "SUNDAY") && (schedule[i][1] == "AM11_PM12")>-->
                                        <#--<span class="glyphicon glyphicon-ok" aria-hidden="true"></span>-->
                                    <#--</#if>-->
                                <#--</#list>-->
                            <#--</#if>-->
                            <#--</td>-->
                        <#--</tr>-->
                        <#--</tbody>-->
                    <#--</table>-->


                <#--table-->
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
