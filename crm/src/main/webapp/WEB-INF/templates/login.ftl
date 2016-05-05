<!DOCTYPE html>
<html lang="en">
<head>

    <!-- start: Meta -->
    <meta charset="utf-8">
    <title>Login to site</title>
    <meta name="description" content="Bootstrap Metro Dashboard">
    <meta name="author" content="Dennis Ji">
    <meta name="keyword"
          content="Metro, Metro UI, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link id="bootstrap-style" href="/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="/resources/css/bootstrap-responsive.min.css" rel="stylesheet">
    <link id="base-style" href="/resources/css/style.css" rel="stylesheet">
    <link id="base-style-responsive" href="/resources/css/style-responsive.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext'
          rel='stylesheet' type='text/css'>


    <script src="/resources/js/html5shiv.js"></script>
    <script src="/resources/js/respond.min.js"></script>


    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <link id="ie-style" href="/resources/css/ie.css" rel="stylesheet">

    <link id="ie9style" href="/resources/css/ie9.css" rel="stylesheet">

    <style type="text/css">
        body {
            background: url(/resources/img/bg-login.jpg) !important;
        }
    </style>


</head>


<body>
<div class="container-fluid-full">
    <div class="row-fluid">

        <div class="row-fluid">
            <div class="login-box">
            <#--<div class="icons">-->
            <#--<a href="index.html"><i class="halflings-icon home"></i></a>-->
            <#--<a href="#"><i class="halflings-icon cog"></i></a>-->
            <#--</div>-->
                <center>
                    <h2>Login</h2>
                </center>

            <#--<@sf.form class="form-horizontal" action="/reg/client" method="post" modelAttribute="userform" id="reg_form">-->
                <form class="form-horizontal" action="/login/process" method="post" id="reg_form">
                    <div class="input-prepend" title="Username">
                        <span class="add-on"><i class="halflings-icon user"></i></span>
                        <input class="input-large span10" name="login" id="login" type="text"
                               placeholder="type username"/>
                    </div>
                    <div class="clearfix"></div>


                    <div class="input-prepend" title="Username">
                        <span class="add-on"><i class="halflings-icon lock"></i></span>
                        <input class="input-large span10" name="password" id="password" type="password"
                               placeholder="type password"/>
                    </div>
                    <div class="clearfix"></div>

                <#if error??>
                    <p class="alert alert-danger"> Неверный логин или пароль! </p>
                </#if>


                    <button class="btn btn-lg btn-primary btn-block" type="submit">Войти</button>
                    <a href="/reg/staff" class="btn btn-lg btn-success btn-block">Регистрация</a>


                </form>
            </div>
            <!--/span-->
        </div>
        <!--/row-->


    </div>
    <!--/.fluid-container-->

</div>
<!--/fluid-row-->
<div class="common-modal modal fade" id="common-Modal1" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-content">
        <ul class="list-inline item-details">
            <li><a href="http://themifycloud.com">Admin templates</a></li>
            <li><a href="http://themescloud.org">Bootstrap themes</a></li>
        </ul>
    </div>
</div>
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