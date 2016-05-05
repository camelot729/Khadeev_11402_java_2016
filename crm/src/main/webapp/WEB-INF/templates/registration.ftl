<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>

<!DOCTYPE html>
<html lang="en">
<head>

    <!-- start: Meta -->
    <meta charset="utf-8">
    <title>Bootstrap Metro Dashboard by Dennis Ji for ARM demo</title>
    <meta name="description" content="Bootstrap Metro Dashboard">
    <meta name="author" content="Dennis Ji">
    <meta name="keyword"
          content="Metro, Metro UI, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link id="bootstrap-style" href="/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="/resources/css/bootstrap-responsive.min.css" rel="stylesheet">
    <link href="/resources/css/bootstrap-select.min.css" rel="stylesheet">
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
                <div class="icons">
                    <a href="index.html"><i class="halflings-icon home"></i></a>
                    <a href="#"><i class="halflings-icon cog"></i></a>
                </div>
                <h2>Reg to your account</h2>
            <@sf.form class="form-horizontal" action="/reg/staff" method="post" modelAttribute="userform" id="reg_form">

            <fieldset>

                <div class="input-prepend" title="Username">
                    <span class="add-on"><i class="halflings-icon user"></i></span>
                    <@sf.input path="surname" type="text" class="input-large span10" id="surname" placeholder="Введите фамилию"/>
                    <@sf.errors path="surname" class = "form-control alert alert-warning text-center"/>
                    <div>
                        <#if surnameError??>
                            ${surnameError}
                        </#if>
                    </div>
                </div>
                <div class="clearfix"></div>

                <div class="input-prepend" title="Name">
                    <span class="add-on"><i class="halflings-icon user"></i></span>
                    <@sf.input path="firstname" type="text" class="input-large span10" id="firstname" placeholder="Введите имя"/>
                    <@sf.errors path="firstname" class = "form-control alert alert-warning text-center"/>
                    <div>
                        <#if firstnameError??>
                        ${firstnameError}
                    </#if>
                    </div>
                </div>
                <div class="clearfix"></div>

                <div class="input-prepend" title="Login">
                    <span class="add-on"><i class="halflings-icon user"></i></span>
                    <@sf.input path="login" type="text" class="input-large span10" id="login" placeholder="Введите логин"/>
                    <@sf.errors path="login" class = "form-control alert alert-warning text-center"/>
                    <#if loginError??>
                    ${loginError}
                    </#if>
                </div>
                <div class="clearfix"></div>

                <div class="input-prepend" title="Password">
                    <span class="add-on"><i class="halflings-icon lock"></i></span>
                    <@sf.input path="password" type="password" class="input-large span10" id="password" placeholder="Введите пароль"/>
                </div>
                <div class="clearfix"></div>

                <div class="input-prepend" title="RePassword">
                    <span class="add-on"><i class="halflings-icon lock"></i></span>
                    <@sf.input path="repassword" type="password" class="input-large span10" id="repassword" placeholder="Введите пароль ещё раз"/>
                </div>
                <div class="clearfix"></div>

                <div class="input-prepend" title="email">
                    <span class="add-on"><i class="halflings-icon envelope"></i></span>
                    <@sf.input path="email" type="text" class="input-large span10" id="email" placeholder="Введите почту"/>
                    <@sf.errors path="email" class = "form-control alert alert-warning text-center"/>
                    <#if emailError??>
                    ${emailError}
                    </#if>
                </div>

                <div class="clearfix"></div>

                <div class="span10" title="sex">

                    <label>Пол: </label>

                    <@sf.checkbox path="sex" name="sex" value="MALE"/>Мужской
                    <@sf.checkbox path="sex" name="sex" value="FEMALE"/>Женский

                <#--<@sf.select path="sex" name="sex" cssClass="">-->
                <#--<@sf.option value="MALE">male</@sf.option>-->
                <#--<@sf.option value="FEMALE">female</@sf.option>-->
                <#--</@sf.select>-->
                    <div class="sex-error col-xs-2">
                        <#if sexError??>
                              ${sexError}
                        </#if>
                    </div>
                </div>
                <div>

                </div>
                <div class="clearfix"></div>


                <button class="btn btn-lg btn-success btn-block" type="submit">Зарегестрироваться</button>
                <button class="btn btn-lg btn-primary btn-block" type="reset">Сбросить</button>


                <div class="clearfix"></div>
            </@sf.form>
                <hr>
                <h3>Forgot Password?</h3>

                <p>
                    No problem, <a href="#">click here</a> to get a new password.
                </p>
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