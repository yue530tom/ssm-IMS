<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Dashboard</title>
        <!-- Mobile specific metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <!-- Force IE9 to render in normal mode -->
        <!--[if IE]><meta http-equiv="x-ua-compatible" content="IE=9" /><![endif]-->
        <meta name="author" content="SuggeElson" />
        <meta name="description" content=""
        />
        <meta name="keywords" content=""
        />
        <meta name="application-name" content="sprFlat admin template" />
        <!-- Import google fonts - Heading first/ text second -->
        <link rel='stylesheet' type='text/css'/> 
        <!--[if lt IE 9]>

<![endif]-->
        <!-- Css files -->
        <!-- Icons -->
        <link href="/resources/assets/css/icons.css" rel="stylesheet" />
        <!-- jQueryUI -->
        <link href="/resources/assets/css/sprflat-theme/jquery.ui.all.css" rel="stylesheet" />
        <!-- Bootstrap stylesheets (included template modifications) -->
        <link href="/resources/assets/css/bootstrap.css" rel="stylesheet" />
        <!-- Plugins stylesheets (all plugin custom css) -->
        <link href="/resources/assets/css/plugins.css" rel="stylesheet" />
        <!-- Main stylesheets (template main css file) -->
        <link href="/resources/assets/css/main.css" rel="stylesheet" />
        <!-- Custom stylesheets ( Put your own changes here ) -->
        <link href="/resources/assets/css/custom.css" rel="stylesheet" />
        <!-- Fav and touch icons -->
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="/resources/assets/img/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="/resources/assets/img/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="/resources/assets/img/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="/resources/assets/img/ico/apple-touch-icon-57-precomposed.png">
        <link rel="icon" href="/resources/assets/img/ico/favicon.ico" type="image/png">
        <!-- Windows8 touch icon ( http://www.buildmypinnedsite.com/ )-->
        <meta name="msapplication-TileColor" content="#3399cc" />
    </head>
    <body>
        <!-- Start #header -->
        	<div id="header">
		<div class="container-fluid">
			<div class="navbar">
				<div class="navbar-header">
					<a class="navbar-brand" href="/userTest"> <i
						class="im-google-drive text-logo-element animated bounceIn"></i><span
						class="text-logo">DEER</span><span class="text-slogan">SAGA</span>
					</a>
				</div>

				<nav class="top-nav" role="navigation">
					<ul class="nav navbar-nav pull-left" style="verticle-align:middle;">
						<li id="toggle-sidebar-li"><a href="#" id="toggle-sidebar" ><i
								class="en-arrow-left2" style="height:50px;padding-top:15px"></i> </a></li>
					</ul>
					<ul class="nav navbar-nav pull-right">
						
						<li class="dropdown" ><a href="#" data-toggle="dropdown" ><i
								class="br-alarm" style="height:50px;padding-top:15px"></i> <span class="notification" style="margin-top:20px">5</span></a>
							<ul class="dropdown-menu notification-menu right" role="menu">
								<li class="clearfix"><i class="ec-chat"></i> <a href="#"
									class="notification-user"> Ric Jones </a> <span
									class="notification-action"> replied to your </span> <a
									href="#" class="notification-link"> comment</a></li>
							</ul></li>
						<li class="dropdown" ><a href="#" data-toggle="dropdown" ><i
								class="ec-users" style="height:50px;padding-top:15px"></i> <span class="notification" style="margin-top:20px">5</span></a>
							<ul class="dropdown-menu notification-menu right" role="menu">
								<li class="clearfix"><i class="ec-users"></i> <a href="#"
									class="notification-user"> Ric Jones </a> <span
									class="notification-action"> replied to your </span> <a
									href="#" class="notification-link"> comment</a></li>
							</ul></li>
						
					</ul>
				</nav>
			</div>
		</div>
		<!-- Start .header-inner -->
	</div>
	<!-- End #header -->
	<!-- Start #sidebar -->
	<div id="sidebar">
		<!-- Start .sidebar-inner -->
		<div class="sidebar-inner">
			<!-- Start #sideNav -->
			<ul id="sideNav" class="nav nav-pills nav-stacked">
				<li class="top-search">
					<form>
						<input type="text" name="search" placeholder="Search ...">
						<button type="submit">
							<i class="ec-search s20"></i>
						</button>
					</form>
				</li>
				<li><a href="/userTest">控制面板 <i class="im-stats"></i></a></li>
				<li><a href="#">购买<i class="im-cart3 color-red"></i></a>
					<ul class="nav sub">
						<li><a href="/view/toViewPage">产品浏览<i class="fa-search"></i></a></li>
						<li><a href="/buy/toCartPage">维护购物车<i class="im-cart3 "></i></a></li>
					</ul>
				</li>
				<li><a href="#">订单<i class="im-coin color-orange"></i></a>
					<ul class="nav sub">
						<li><a href="/order/toOrderPage">维护订单<i class="st-archive"></i></a></li>
					</ul>
				</li>
				<li><a href="#">产品<i class="fa-barcode color-green"></i></a>
					<ul class="nav sub">
						<li><a href="/product/toProductPage">维护产品<i
								class="en-archive color-blue"></i></a></li>
					</ul>
				</li>
				<li><a href="#">工厂<i class="im-office color-dark"></i></a>
					<ul class="nav sub">
						<li><a href="/factory/toFactoryPage">维护工厂<i class="br-home"></i></a></li>
					</ul></li>
				<li><a href="#">属性<i class="im-cogs color-teal"></i></a>
					<ul class="nav sub">
						<li><a href="/props/toPropsPage">维护属性<i class="st-settings"></i></a></li>
						<li><a href="/props/toPropsDetailsPage">维护属性详情<i class="fa-info"></i></a></li>
					</ul>
				</li>
			</ul>
			<!-- End #sideNav -->
		
		</div>
		<!-- End .sidebar-inner -->
	</div>
	<!-- End #sidebar -->
	<!-- Start #right-sidebar -->
	
	<!-- End #right-sidebar -->
	<!-- Start #content -->
	<div id="content">
		<!-- Start .content-wrapper -->
		<div class="content-wrapper">
			<div class="row">
				<!-- Start .row -->
				<!-- Start .page-header -->
				<div class="col-lg-12 heading">
					<h1 class="page-header">
						<i class="im-bookmarks"></i> 快速向导
					</h1>
					<!-- Start .bredcrumb -->
					<ul id="crumb" class="breadcrumb">
					</ul>
					<!-- End .breadcrumb -->
					<!-- Start .option-buttons -->
					<div class="option-buttons">
						<div class="btn-toolbar" role="toolbar">
							<div class="btn-group">
								<a id="clear-localstorage" class="btn tip"
									title="Reset panels position"> <i
									class="ec-refresh color-red s24"></i>
								</a>
							</div>
							<div class="btn-group dropdown">
								<a class="btn dropdown-toggle" data-toggle="dropdown"
									id="dropdownMenu1"><i class="br-grid s24"></i></a>
								<div class="dropdown-menu pull-right" role="menu"
									aria-labelledby="dropdownMenu1">
									<div class="option-dropdown">
										<div class="shortcut-button">
											<a href="/view/toViewPage"> <i class="fa-search"></i> <span>产品浏览</span>
											</a>
										</div>
										<div class="shortcut-button">
											<a href="/buy/toCartPage"> <i class="im-cart3 color-dark"></i> <span>购物车</span>
											</a>
										</div>
										<div class="shortcut-button">
											<a href="/order/toOrderPage"> <i class="im-coin color-orange"></i> <span>订单</span>
											</a>
										</div>
										<div class="shortcut-button">
											<a href="/product/toProductPage"> <i class="fa-barcode color-blue"></i> <span>维护产品</span>
											</a>
										</div>
										<div class="shortcut-button">
											<a href="/factory/toFactoryPage"> <i class="im-office color-red"></i> <span>工厂</span>
											</a>
										</div>
										<div class="shortcut-button">
											<a href="/props/toPropsPage"> <i class="st-settings color-teal"></i> <span>属性</span>
											</a>
										</div>
										<div class="shortcut-button">
											<a href="/props/toPropsDetailsPage"> <i class="fa-info color-green"></i> <span>属性明细</span>
											</a>
										</div>
									</div>
								</div>
							</div>
							<div class="btn-group">
								<a href="/help" class="btn tip" title="help"> <i class="ec-help color-red s24"></i>
								</a>
							</div>
							
						</div>
					</div>
					<!-- End .option-buttons -->
				</div>
				<!-- End .page-header -->
			</div>
                <!-- End .row -->
                <!-- Page start here ( usual with .row ) -->
                <div class="outlet">
                    <!-- Start .outlet -->
                    <div class="row">
                        <!-- Start .row -->
                        <div class="col-lg-12">
                            <!-- Start col-lg-12 -->
                            <div class="panel panel-default toggle">
                                <!-- Start .panel -->
                                <div class="panel-heading">
                                    <h3 class="panel-title">订单信息</h3>
                                </div>
                                <div class="panel-body">
                                    <form class="form-horizontal group-border hover-stripped" role="form" id="validate">
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">Required field</label>
                                            <div class="col-lg-10">
                                                <input type="text" class="form-control required">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">Email field</label>
                                            <div class="col-lg-10">
                                                <input id="email" name="email" type="email" class="form-control" placeholder="Type your email">
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">Required with min value 13</label>
                                            <div class="col-lg-10">
                                                <input type="text" class="form-control" name="minval" placeholder="">
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">Required with max value 13</label>
                                            <div class="col-lg-10">
                                                <input type="text" class="form-control" name="maxval" placeholder="">
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">Password field</label>
                                            <div class="col-lg-10">
                                                <input type="password" class="form-control" id="password" name="password" placeholder="Enter your password">
                                                <input type="password" class="form-control mt15" id="confirm_password" name="confirm_passowrd" placeholder="Repeat password">
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">Required with max lenght of 10</label>
                                            <div class="col-lg-10">
                                                <input type="text" class="form-control" id="maxLenght" name="maxLenght" placeholder="">
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">Required range between 10-20 chars</label>
                                            <div class="col-lg-10">
                                                <input type="text" class="form-control" id="rangelenght" name="rangelenght" placeholder="">
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">Required with url validaiton</label>
                                            <div class="col-lg-10">
                                                <input type="text" class="form-control" id="url" name="url" placeholder="">
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">Required date</label>
                                            <div class="col-lg-10">
                                                <input type="text" class="form-control" id="date" name="date" placeholder="">
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">Required number</label>
                                            <div class="col-lg-10">
                                                <input type="text" class="form-control" id="number" name="number" placeholder="">
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">Required textarea</label>
                                            <div class="col-lg-10">
                                                <textarea class="form-control" name="textarea" id="textarea" rows="4"></textarea>
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">Required and accept credit card number</label>
                                            <div class="col-lg-10">
                                                <input type="text" class="form-control" id="ccard" name="ccard" placeholder="">
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">Required checkbox</label>
                                            <div class="col-lg-10">
                                                <label class="checkbox">
                                                    <input type="checkbox" name="agree" id="agree" value="option">agree terms ?
                                                </label>
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">Required file upload</label>
                                            <div class="col-lg-10">
                                                <input type="file" name="file" id="file" class="form-control">
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label">Required select with filter</label>
                                            <div class="col-lg-10">
                                                <select class="form-control select2" name="select2" id="select2">
                                                    <option value="">Choose</option>
                                                    <optgroup label="Alaskan/Hawaiian Time Zone">
                                                        <option value="AK">Alaska</option>
                                                        <option value="HI">Hawaii</option>
                                                    </optgroup>
                                                    <optgroup label="Pacific Time Zone">
                                                        <option value="CA">California</option>
                                                        <option value="NV">Nevada</option>
                                                        <option value="OR">Oregon</option>
                                                        <option value="WA">Washington</option>
                                                    </optgroup>
                                                    <optgroup label="Mountain Time Zone">
                                                        <option value="AZ">Arizona</option>
                                                        <option value="CO">Colorado</option>
                                                        <option value="ID">Idaho</option>
                                                        <option value="MT">Montana</option>
                                                        <option value="NE">Nebraska</option>
                                                        <option value="NM">New Mexico</option>
                                                        <option value="ND">North Dakota</option>
                                                        <option value="UT">Utah</option>
                                                        <option value="WY">Wyoming</option>
                                                    </optgroup>
                                                    <optgroup label="Central Time Zone">
                                                        <option value="AL">Alabama</option>
                                                        <option value="AR">Arkansas</option>
                                                        <option value="IL">Illinois</option>
                                                        <option value="IA">Iowa</option>
                                                        <option value="KS">Kansas</option>
                                                        <option value="KY">Kentucky</option>
                                                        <option value="LA">Louisiana</option>
                                                        <option value="MN">Minnesota</option>
                                                        <option value="MS">Mississippi</option>
                                                        <option value="MO">Missouri</option>
                                                        <option value="OK">Oklahoma</option>
                                                        <option value="SD">South Dakota</option>
                                                        <option value="TX">Texas</option>
                                                        <option value="TN">Tennessee</option>
                                                        <option value="WI">Wisconsin</option>
                                                    </optgroup>
                                                    <optgroup label="Eastern Time Zone">
                                                        <option value="CT">Connecticut</option>
                                                        <option value="DE">Delaware</option>
                                                        <option value="FL">Florida</option>
                                                        <option value="GA">Georgia</option>
                                                        <option value="IN">Indiana</option>
                                                        <option value="ME">Maine</option>
                                                        <option value="MD">Maryland</option>
                                                        <option value="MA">Massachusetts</option>
                                                        <option value="MI">Michigan</option>
                                                        <option value="NH">New Hampshire</option>
                                                        <option value="NJ">New Jersey</option>
                                                        <option value="NY">New York</option>
                                                        <option value="NC">North Carolina</option>
                                                        <option value="OH">Ohio</option>
                                                        <option value="PA">Pennsylvania</option>
                                                        <option value="RI">Rhode Island</option>
                                                        <option value="SC">South Carolina</option>
                                                        <option value="VT">Vermont</option>
                                                        <option value="VA">Virginia</option>
                                                        <option value="WV">West Virginia</option>
                                                    </optgroup>
                                                </select>
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                        <div class="form-group">
                                            <div class="col-lg-offset-2">
                                                <button class="btn btn-default ml15" type="submit">Test validation</button>
                                            </div>
                                        </div>
                                        <!-- End .form-group  -->
                                    </form>
                                </div>
                            </div>
                            <!-- End .panel -->
                        </div>
                        <!-- End col-lg-12 -->
                    </div>
                    <!-- End .row -->
                    <!-- Page End here -->
                </div>
                <!-- End .outlet -->
            </div>
            <!-- End .content-wrapper -->
            <div class="clearfix"></div>
        </div>
        <!-- End #content -->
        <!-- Javascripts -->
        <!-- Load pace first -->
        <script src="/resources/assets/plugins/core/pace/pace.min.js"></script>
        <!-- Important javascript libs(put in all pages) -->
        <script src="/resources/assets/js/jquery-1.8.3.min.js"></script>
        <script>
        window.jQuery || document.write('<script src="/resources/assets/js/libs/jquery-2.1.1.min.js">\x3C/script>')
        </script>
        <script src="/resources/assets/js/jquery-ui.js"></script>
        <script>
        window.jQuery || document.write('<script src="/resources/assets/js/libs/jquery-ui-1.10.4.min.js">\x3C/script>')
        </script>
        <!--[if lt IE 9]>
  <script type="text/javascript" src="/resources/assets/js/libs/excanvas.min.js"></script>
  <script type="text/javascript" src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
  <script type="text/javascript" src="/resources/assets/js/libs/respond.min.js"></script>
<![endif]-->
        <!-- Bootstrap plugins -->
        <script src="/resources/assets/js/bootstrap/bootstrap.js"></script>
        <!-- Core plugins ( not remove ever) -->
        <!-- Handle responsive view functions -->
        <script src="/resources/assets/js/jRespond.min.js"></script>
        <!-- Custom scroll for sidebars,tables and etc. -->
        <script src="/resources/assets/plugins/core/slimscroll/jquery.slimscroll.min.js"></script>
        <script src="/resources/assets/plugins/core/slimscroll/jquery.slimscroll.horizontal.min.js"></script>
        <!-- Resize text area in most pages -->
        <script src="/resources/assets/plugins/forms/autosize/jquery.autosize.js"></script>
        <!-- Proivde quick search for many widgets -->
        <script src="/resources/assets/plugins/core/quicksearch/jquery.quicksearch.js"></script>
        <!-- Bootbox confirm dialog for reset postion on panels -->
        <script src="/resources/assets/plugins/ui/bootbox/bootbox.js"></script>
        <!-- Other plugins ( load only nessesary plugins for every page) -->
        <script src="/resources/assets/plugins/charts/flot/jquery.flot.js"></script>
        <script src="/resources/assets/plugins/charts/flot/jquery.flot.pie.js"></script>
        <script src="/resources/assets/plugins/charts/flot/jquery.flot.resize.js"></script>
        <script src="/resources/assets/plugins/charts/flot/jquery.flot.time.js"></script>
        <script src="/resources/assets/plugins/charts/flot/jquery.flot.growraf.js"></script>
        <script src="/resources/assets/plugins/charts/flot/jquery.flot.categories.js"></script>
        <script src="/resources/assets/plugins/charts/flot/jquery.flot.stack.js"></script>
        <script src="/resources/assets/plugins/charts/flot/jquery.flot.tooltip.min.js"></script>
        <script src="/resources/assets/plugins/charts/flot/date.js"></script>
        <script src="/resources/assets/plugins/charts/sparklines/jquery.sparkline.js"></script>
        <script src="/resources/assets/plugins/charts/pie-chart/jquery.easy-pie-chart.js"></script>
        <script src="/resources/assets/plugins/forms/icheck/jquery.icheck.js"></script>
        <script src="/resources/assets/plugins/forms/tags/jquery.tagsinput.min.js"></script>
        <script src="/resources/assets/plugins/forms/tinymce/tinymce.min.js"></script>
        <script src="/resources/assets/plugins/misc/highlight/highlight.pack.js"></script>
        <script src="/resources/assets/plugins/misc/countTo/jquery.countTo.js"></script>
        <script src="/resources/assets/plugins/ui/weather/skyicons.js"></script>
        <script src="/resources/assets/plugins/ui/notify/jquery.gritter.js"></script>
        <script src="/resources/assets/plugins/ui/calendar/fullcalendar.js"></script>
        <script src="/resources/assets/js/jquery.sprFlat.js"></script>
        <script src="/resources/assets/js/app.js"></script>
        <script src="/resources/assets/js/pages/dashboard.js"></script>
    </body>
</html>