<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Dashboard</title>

<!-- Mobile specific metas -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<!-- Force IE9 to render in normal mode -->
<!--[if IE]><meta http-equiv="x-ua-compatible" content="IE=9" /><![endif]-->
<meta name="author" content="SuggeElson" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<meta name="application-name" content="sprFlat admin template" />
<!-- Import google fonts - Heading first/ text second -->
<link rel='stylesheet' type='text/css' />
<!--[if lt IE 9]>

<![endif]-->
<!-- Css files -->
<!-- Icons -->
<link href="/resources/assets/css/icons.css" rel="stylesheet" />
<!-- jQueryUI -->
<link href="/resources/assets/css/sprflat-theme/jquery.ui.all.css"
	rel="stylesheet" />
<!-- Bootstrap stylesheets (included template modifications) -->
<link href="/resources/assets/css/bootstrap.css" rel="stylesheet" />
<!-- Plugins stylesheets (all plugin custom css) -->
<link href="/resources/assets/css/plugins.css" rel="stylesheet" />
<!-- Main stylesheets (template main css file) -->
<link href="/resources/assets/css/main.css" rel="stylesheet" />
<!-- Custom stylesheets ( Put your own changes here ) -->
<link href="/resources/assets/css/custom.css" rel="stylesheet" />
<!-- Fav and touch icons -->
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="/resources/assets/img/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="/resources/assets/img/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="/resources/assets/img/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="/resources/assets/img/ico/apple-touch-icon-57-precomposed.png">
<link rel="icon" href="/resources/assets/img/ico/favicon.ico"
	type="image/png">
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
						
						<li id="toggle-right-sidebar-li"><a href="#"
							id="toggle-right-sidebar"><i class="ec-users" style="height:50px;padding-top:15px"></i> <span
								class="notification" style="margin-top:20px">3</span></a></li>
					</ul>
				</nav>
			</div>
			<!-- Start #header-area -->
			<div id="header-area" class="fadeInDown">
				<div class="header-area-inner">
					<ul class="list-unstyled list-inline">
						<li>
							<div class="shortcut-button">
								<a href="#"> <i class="im-pie"></i> <span>Earning
										Stats</span>
								</a>
							</div>
						</li>
						<li>
							<div class="shortcut-button">
								<a href="#"> <i class="ec-images color-dark"></i> <span>Gallery</span>
								</a>
							</div>
						</li>
						<li>
							<div class="shortcut-button">
								<a href="#"> <i class="en-light-bulb color-orange"></i> <span>Fresh
										ideas</span>
								</a>
							</div>
						</li>
						<li>
							<div class="shortcut-button">
								<a href="#"> <i class="ec-link color-blue"></i> <span>Links</span>
								</a>
							</div>
						</li>
						<li>
							<div class="shortcut-button">
								<a href="#"> <i class="ec-support color-red"></i> <span>Support</span>
								</a>
							</div>
						</li>
						<li>
							<div class="shortcut-button">
								<a href="#"> <i class="st-lock color-teal"></i> <span>Lock
										area</span>
								</a>
							</div>
						</li>
					</ul>
				</div>
			</div>
			<!-- End #header-area -->
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
			<!-- Start .sidebar-panel -->
			<div class="sidebar-panel">
				<h4 class="sidebar-panel-title">
					<i class="im-fire"></i> Server usage
				</h4>
				<div class="sidebar-panel-content">
					<ul class="server-stats">
						<li><span class="txt">Disk space</span> <span class="percent">78</span>
							<div id="usage-sparkline" class="sparkline">Loading...</div>
							<div class="pie-chart" data-percent="78"></div></li>
					</ul>
					<ul class="server-stats">
						<li><span class="txt">CPU</span> <span class="percent">56</span>
							<div id="cpu-sparkline" class="sparkline">Loading...</div>
							<div class="pie-chart" data-percent="56"></div></li>
					</ul>
					<ul class="server-stats">
						<li><span class="txt">Memory</span> <span class="percent">14</span>
							<div id="ram-sparkline" class="sparkline">Loading...</div>
							<div class="pie-chart" data-percent="14"></div></li>
					</ul>
				</div>
			</div>
			<!-- End .sidebar-panel -->
		</div>
		<!-- End .sidebar-inner -->
	</div>
	<!-- End #sidebar -->
	<!-- Start #right-sidebar -->
	<div id="right-sidebar" class="hide-sidebar">
		<!-- Start .sidebar-inner -->
		<div class="sidebar-inner">
			<div class="sidebar-panel mt0">
				<div class="sidebar-panel-content fullwidth pt0">
					<div class="chat-user-list">
						<form class="form-horizontal chat-search" role="form">
							<div class="form-group">
								<input type="text" class="form-control"
									placeholder="Search for user...">
								<button type="submit">
									<i class="ec-search s16"></i>
								</button>
							</div>
							<!-- End .form-group  -->
						</form>
						<ul class="chat-ui bsAccordion">
							<li><a href="#">Favorites <span
									class="notification teal">4</span><i class="en-arrow-down5"></i></a>
								<ul class="in">
									<li><a href="#" class="chat-name"> <img
											class="chat-avatar"
											src="/resources/assets/img/avatars/49.jpg" alt="@chadengle">Chad
											Engle <span class="has-message"><i class="im-pencil"></i></span>
									</a> <span class="status online"><i class="en-dot"></i></span></li>
									<li><a href="#" class="chat-name"> <img
											class="chat-avatar"
											src="/resources/assets/img/avatars/54.jpg" alt="@alagoon">Anthony
											Lagoon
									</a> <span class="status offline"><i class="en-dot"></i></span></li>
									<li><a href="#" class="chat-name"> <img
											class="chat-avatar"
											src="/resources/assets/img/avatars/52.jpg" alt="@koridhandy">Kory
											Handy
									</a> <span class="status"><i class="en-dot"></i></span></li>
									<li><a href="#" class="chat-name"> <img
											class="chat-avatar"
											src="/resources/assets/img/avatars/50.jpg" alt="@divya">Divia
											Manyan
									</a> <span class="status"><i class="en-dot"></i></span></li>
								</ul></li>
							<li><a href="#">Online <span class="notification green">3</span><i
									class="en-arrow-down5"></i></a>
								<ul class="in">
									<li><a href="#" class="chat-name"> <img
											class="chat-avatar"
											src="/resources/assets/img/avatars/51.jpg" alt="@kolage">Eric
											Hofman
									</a> <span class="status online"><i class="en-dot"></i></span></li>
									<li><a href="#" class="chat-name"> <img
											class="chat-avatar"
											src="/resources/assets/img/avatars/55.jpg" alt="@mikebeecham">Mike
											Beecham
									</a> <span class="status online"><i class="en-dot"></i></span></li>
									<li><a href="#" class="chat-name"> <img
											class="chat-avatar"
											src="/resources/assets/img/avatars/53.jpg"
											alt="@derekebradley">Darek Bradly
									</a> <span class="status online"><i class="en-dot"></i></span></li>
								</ul></li>
							<li><a href="#">Offline <span class="notification red">5</span><i
									class="en-arrow-down5"></i></a>
								<ul>
									<li><a href="#" class="chat-name"> <img
											class="chat-avatar"
											src="/resources/assets/img/avatars/56.jpg" alt="@laurengray">Lauren
											Grey
									</a> <span class="status offline"><i class="en-dot"></i></span></li>
									<li><a href="#" class="chat-name"> <img
											class="chat-avatar"
											src="/resources/assets/img/avatars/49.jpg" alt="@chadengle">Chad
											Engle
									</a> <span class="status offline"><i class="en-dot"></i></span></li>
									<li><a href="#" class="chat-name"> <img
											class="chat-avatar"
											src="/resources/assets/img/avatars/58.jpg"
											alt="@frankiefreesbie">Frankie Freesibie
									</a> <span class="status offline"><i class="en-dot"></i></span></li>
									<li><a href="#" class="chat-name"> <img
											class="chat-avatar"
											src="/resources/assets/img/avatars/57.jpg"
											alt="@joannefournier">Joane Fornier
									</a> <span class="status offline"><i class="en-dot"></i></span></li>
									<li><a href="#" class="chat-name"> <img
											class="chat-avatar"
											src="/resources/assets/img/avatars/59.jpg" alt="@aiiaiiaii">Alia
											Alien
									</a> <span class="status offline"><i class="en-dot"></i></span></li>
								</ul></li>
						</ul>
					</div>
					<div class="chat-box">
						<h5>Chad Engle</h5>
						<a id="close-user-chat" href="#" class="btn btn-xs btn-primary"><i
							class="en-arrow-left4"></i></a>
						<ul class="chat-ui chat-messages">
							<li class="chat-user">
								<p class="avatar">
									<img src="/resources/assets/img/avatars/49.jpg"
										alt="@chadengle">
								</p>
								<p class="chat-name">
									Chad Engle <span class="chat-time">15 seconds ago</span>
								</p> <span class="status online"><i class="en-dot"></i></span>
								<p class="chat-txt">Hello Sugge check out the last order.</p>
							</li>
							<li class="chat-me">
								<p class="avatar">
									<img src="/resources/assets/img/avatars/48.jpg"
										alt="SuggeElson">
								</p>
								<p class="chat-name">
									SuggeElson <span class="chat-time">10 seconds ago</span>
								</p> <span class="status online"><i class="en-dot"></i></span>
								<p class="chat-txt">Ok i will check it out.</p>
							</li>
							<li class="chat-user">
								<p class="avatar">
									<img src="/resources/assets/img/avatars/49.jpg"
										alt="@chadengle">
								</p>
								<p class="chat-name">
									Chad Engle <span class="chat-time">now</span>
								</p> <span class="status online"><i class="en-dot"></i></span>
								<p class="chat-txt">Thank you, have a nice day</p>
							</li>
						</ul>
						<div class="chat-write">
							<form action="#" class="form-horizontal" role="form">
								<div class="form-group">
									<textarea name="sendmsg" id="sendMsg"
										class="form-control elastic" rows="1"></textarea>
									<a role="button" class="btn" id="attach_photo_btn"> <i
										class="fa-picture s20"></i>
									</a> <input type="file" name="attach_photo" id="attach_photo">
								</div>
								<!-- End .form-group  -->
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- End .sidebar-inner -->
	</div>
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
			<div class="outlet">
				<!-- Start .outlet -->
				<!-- Page start here ( usual with .row ) -->
				<!-- 使用控件时 carousel-inner height的属性没有生效，需要手工调整~-->
				<div class="row" style="height: 106px;">
					<!-- Start .row -->
					<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
						<div class="carousel-tile carousel vertical slide">
							<div class="carousel-inner">
								<div class="item active">
									<div class="tile red">
										<div class="tile-icon">
											<i class="br-cart s64"></i>
										</div>
										<div class="tile-content">
											<div id="tiles_order" class="number">107</div>
											<h3>订单总数</h3>
										</div>
									</div>
								</div>
								<div class="item">
									<div class="tile orange">
										<!-- tile start here -->
										<div class="tile-icon">
											<i class="ec-cog s64"></i>
										</div>
										<div class="tile-content">
											<div class="number">5</div>
											<h3>当日订单</h3>
										</div>
									</div>
								</div>
								<div class="item">
									<div class="tile green">
										<!-- tile start here -->
										<div class="tile-icon">
											<i class="ec-cog s64"></i>
										</div>
										<div class="tile-content">
											<div class="number">5</div>
											<h3>当月订单</h3>
										</div>
									</div>
								</div>
							</div>
						</div>
						<!-- End Carousel -->
					</div>
					<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
						<div class="carousel-tile carousel slide">
							<div class="carousel-inner">
								<div class="item active">
									<div class="tile blue">
										<div class="tile-icon">
											<i class="st-chat s64"></i>
										</div>
										<div class="tile-content">
											<div class="number">24</div>
											<h3>热销冠军</h3>
										</div>
									</div>
								</div>
								<div class="item">
									<div class="tile brown">
										<!-- tile start here -->
										<div class="tile-icon">
											<i class="ec-mail s64"></i>
										</div>
										<div class="tile-content">
											<div class="number">17</div>
											<h3>热销亚军</h3>
										</div>
									</div>
								</div>
								<div class="item">
									<div class="tile yellow">
										<!-- tile start here -->
										<div class="tile-icon">
											<i class="ec-mail s64"></i>
										</div>
										<div class="tile-content">
											<div class="number">11</div>
											<h3>热销季军</h3>
										</div>
									</div>
								</div>
							</div>
						</div>
						<!-- End Carousel -->
					</div>
					<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
						<div class="carousel-tile carousel vertical slide">
							<div class="carousel-inner">
								<div class="item active">
									<div class="tile green">
										<div class="tile-icon">
											<i class="ec-users s64"></i>
										</div>
										<div class="tile-content">
											<div class="number">325</div>
											<h3>New users</h3>
										</div>
									</div>
								</div>
								<div class="item">
									<div class="tile purple">
										<!-- tile start here -->
										<div class="tile-icon">
											<i class="ec-search s64"></i>
										</div>
										<div class="tile-content">
											<div class="number">2540</div>
											<h3>Searches</h3>
										</div>
									</div>
								</div>
							</div>
						</div>
						<!-- End Carousel -->
					</div>
					<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
						<div class="carousel-tile carousel slide">
							<div class="carousel-inner">
								<div class="item active">
									<div class="tile teal">
										<!-- tile start here -->
										<div class="tile-icon">
											<i class="ec-images s64"></i>
										</div>
										<div class="tile-content">
											<div class="number">45</div>
											<h3>New images</h3>
										</div>
									</div>
								</div>
								<div class="item">
									<div class="tile magenta">
										<!-- tile start here -->
										<div class="tile-icon">
											<i class="ec-share s64"></i>
										</div>
										<div class="tile-content">
											<div class="number">3548</div>
											<h3>Posts shared</h3>
										</div>
									</div>
								</div>
							</div>
						</div>
						<!-- End Carousel -->
					</div>
				</div>
				<!-- End .row -->
				<div class="row"  style="height: 106px;">
					<!-- Start .row -->
					<div class="col-lg-6 col-md-6 sortable-layout">
						<!-- Start col-lg-6 -->
						<div
							class="panel panel-teal toggle panelMove panelClose panelRefresh">
							<!-- Start .panel -->
							<div class="panel-heading">
								<h4 class="panel-title">
									<i class="im-bars"></i> Page views
								</h4>
							</div>
							<div class="panel-body">
								<div id="stats-pageviews" style="width: 100%; height: 250px;"></div>
							</div>
							<div class="panel-footer teal-bg">
								<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
									<div class="tile teal m0">
										<div class="tile-content text-center pl0 pr0">
											<div id="countToday" class="number">75</div>
											<h3>Today</h3>
										</div>
									</div>
								</div>
								<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
									<div class="tile teal m0">
										<div class="tile-content text-center pl0 pr0">
											<div id="countYesterday" class="number">69</div>
											<h3>Yesterday</h3>
										</div>
									</div>
								</div>
								<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
									<div class="tile teal m0">
										<div class="tile-content text-center pl0 pr0">
											<div id="countWeek" class="number">380</div>
											<h3>This Week</h3>
										</div>
									</div>
								</div>
								<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
									<div class="tile teal m0">
										<div class="tile-content text-center pl0 pr0">
											<div id="countTotal" class="number">1254</div>
											<h3>Total</h3>
										</div>
									</div>
								</div>
							</div>
						</div>
						<!-- End .panel -->
						<div class="panel panel-brown panelMove">
							<!-- Start .panel -->
							<div class="panel-heading">
								<h4 class="panel-title">
									<i class="st-camera"></i> Instagram activity
								</h4>
								<div class="pull-right mt10">
									<a href="#" class="color-grayspr">@SuggeElson</a>
								</div>
							</div>
							<div class="panel-body p0">
								<div class="instagram-widget">
									<div class="instagram-widget-header gray-bg">
										<div class="col-lg-4 col-md-4 col-xs-4 text-center">
											<!-- col-lg-4 start here -->
											<a href="#">
												<p class="instagram-widget-text">Followers</p> <strong
												class="instagram-widget-number">1256</strong>
											</a>
										</div>
										<!-- col-lg-4 end here -->
										<div class="col-lg-4 col-md-4 col-xs-4 text-center">
											<!-- col-lg-4 start here -->
											<a href="#">
												<p class="instagram-widget-text">Following</p> <strong
												class="instagram-widget-number">345</strong>
											</a>
										</div>
										<!-- col-lg-4 end here -->
										<div class="col-lg-4 col-md-4 col-xs-4 text-center">
											<!-- col-lg-4 start here -->
											<a href="#">
												<p class="instagram-widget-text">Shots</p> <strong
												class="instagram-widget-number">176</strong>
											</a>
										</div>
										<!-- col-lg-4 end here -->
									</div>
									<div class="instagram-widget-image">
										<div id="instagram-widget" class="carousel slide">
											<!-- Indicators -->
											<ol class="carousel-indicators dotstyle">
												<li data-target="#instagram-widget" data-slide-to="0"
													class="active"><a href="#">Image 1</a></li>
												<li data-target="#instagram-widget" data-slide-to="1"><a
													href="#">Image 2</a></li>
												<li data-target="#instagram-widget" data-slide-to="2"><a
													href="#">Image 3</a></li>
											</ol>
											<div class="carousel-inner">
												<figure class="item active">
													<img class="img-responsive"
														src="/resources/assets/img/instagram/instagram.jpg"
														alt="image">
												</figure>
												<figure class="item">
													<img class="img-responsive"
														src="/resources/assets/img/instagram/instagram2.jpg"
														alt="image">
												</figure>
												<figure class="item">
													<img class="img-responsive"
														src="/resources/assets/img/instagram/instagram3.jpg"
														alt="image">
												</figure>
											</div>
										</div>
										<!-- End Carousel -->
									</div>
									<div class="instagram-widget-footer">
										<div class="col-lg-6 col-md-6 col-xs-6 text-center">
											<!-- col-lg-6 start here -->
											<p>
												<a href="#"> <i class="ec-chat mr5"></i> <strong
													class="instagram-widget-number">17</strong>
												</a>
											</p>
										</div>
										<!-- col-lg-6 end here -->
										<div class="col-lg-6 col-md-6 col-xs-6 text-center">
											<!-- col-lg-6 start here -->
											<p>
												<a href="#"> <i class="ec-heart mr5"></i> <strong
													class="instagram-widget-number">27</strong>
												</a>
											</p>
										</div>
										<!-- col-lg-6 end here -->
									</div>
								</div>
							</div>
						</div>
						<!-- End .panel -->
						<div class="panel panel-default panelMove plain">
							<!-- Start .panel -->
							<div class="panel-heading white-bg"></div>
							<div class="panel-body p0">
								<div id="calendar"></div>
							</div>
						</div>
						<!-- End .panel -->
					</div>
					<!-- End col-lg-6 -->
					<div class="col-lg-6 col-md-6 sortable-layout">
						<!-- Start col-lg-6 -->
						<div
							class="panel panel-primary plain toggle panelMove panelClose panelRefresh">
							<!-- Start .panel -->
							<div class="panel-heading">
								<h4 class="panel-title">
									<i class="im-bars"></i> Week Earnings
								</h4>
							</div>
							<div class="panel-body blue-bg">
								<div id="stats-earnings" style="width: 100%; height: 250px;"></div>
							</div>
							<div class="panel-footer white-bg">
								<div id="stats-category-earnings" class="col-lg-6 col-md-12"
									style="height: 150px;"></div>
								<div id="stats-earnings-bars" class="col-lg-6 col-md-12"
									style="height: 150px;"></div>
							</div>
						</div>
						<!-- End .panel -->
						<div
							class="weather-widget panel panel-primary plain toggle panelMove panelClose panelRefresh">
							<!-- Start .panel -->
							<div class="panel-heading">
								<h4 class="panel-title">Weather now</h4>
							</div>
							<div class="panel-body blue-bg text-center">
								<canvas id="weather-now" width="128" height="128"></canvas>
								<p class="weather-location">
									<strong>23&deg;C</strong> Madrid
								</p>
							</div>
							<div class="panel-footer white-bg text-center">
								<div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
									<!-- col-lg-3 start here -->
									<p class="weather-day">MON</p>
									<canvas id="forecast-now" width="64" height="64"></canvas>
									<p class="weather-degree">23&deg;C</p>
								</div>
								<!-- col-lg-3 end here -->
								<div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
									<!-- col-lg-3 start here -->
									<p class="weather-day">TUE</p>
									<canvas id="forecast-day1" width="64" height="64"></canvas>
									<p class="weather-degree">17&deg;C</p>
								</div>
								<!-- col-lg-3 end here -->
								<div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
									<!-- col-lg-3 start here -->
									<p class="weather-day">WED</p>
									<canvas id="forecast-day2" width="64" height="64"></canvas>
									<p class="weather-degree">15&deg;C</p>
								</div>
								<!-- col-lg-3 end here -->
								<div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
									<!-- col-lg-3 start here -->
									<p class="weather-day">THU</p>
									<canvas id="forecast-day3" width="64" height="64"></canvas>
									<p class="weather-degree">18&deg;C</p>
								</div>
								<!-- col-lg-3 end here -->
							</div>
						</div>
						<!-- End .panel -->
						<div
							class="panel panel-default toggle panelMove panelClose panelRefresh">
							<!-- Start .panel -->
							<div class="panel-heading">
								<h4 class="panel-title">
									<i class="fa-list"></i> ToDo
								</h4>
							</div>
							<div class="panel-body">
								<div class="todo-widget">
									<div class="todo-header">
										<div class="todo-search">
											<form>
												<input type="text" class="form-control" name="search"
													placeholder="Search for todo ...">
											</form>
										</div>
										<div class="todo-add">
											<a href="#" class="btn btn-primary tip" title="Add new todo"><i
												class="im-plus"></i></a>
										</div>
									</div>
									<h4 class="todo-period">Today</h4>
									<ul class="todo-list" id="today">
										<li class="todo-task-item"><label class="checkbox">
												<input type="checkbox">
										</label>
											<div class="todo-priority normal tip" title="Normal priority">
												<i class="im-radio-checked"></i>
											</div> <span class="todo-category label label-primary">
												javascript </span>
											<div class="todo-task-text">Add scroll function to
												template</div>
											<button type="button" class="close todo-close">&times;</button>
										</li>
										<li class="todo-task-item"><label class="checkbox">
												<input type="checkbox">
										</label>
											<div class="todo-priority high tip" title="High priority">
												<i class="im-radio-checked"></i>
											</div> <span class="todo-category label label-brown"> less </span>
											<div class="todo-task-text">Fix main less file</div>
											<button type="button" class="close todo-close">&times;</button>
										</li>
										<li class="todo-task-item task-done"><label
											class="checkbox"> <input type="checkbox" checked>
										</label>
											<div class="todo-priority high tip" title="High priority">
												<i class="im-radio-checked"></i>
											</div> <span class="todo-category label label-info"> html </span>
											<div class="todo-task-text">Change navigation structure</div>
											<button type="button" class="close todo-close">&times;</button>
										</li>
									</ul>
									<h4 class="todo-period">Tomorrow</h4>
									<ul class="todo-list" id="tomorrow">
										<li class="todo-task-item"><label class="checkbox">
												<input type="checkbox">
										</label>
											<div class="todo-priority tip" title="Low priority">
												<i class="im-radio-checked"></i>
											</div> <span class="todo-category label label-dark"> css </span>
											<div class="todo-task-text">Create slide panel widget</div>
											<button type="button" class="close todo-close">&times;</button>
										</li>
										<li class="todo-task-item"><label class="checkbox">
												<input type="checkbox">
										</label>
											<div class="todo-priority medium tip" title="Medium priority">
												<i class="im-radio-checked"></i>
											</div> <span class="todo-category label label-danger"> php </span>
											<div class="todo-task-text">Edit the main controller</div>
											<button type="button" class="close todo-close">&times;</button>
										</li>
									</ul>
								</div>
							</div>
						</div>
						<!-- End .panel -->
					</div>
					<!-- End col-lg-6 -->
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
	<script
		src="/resources/assets/plugins/core/slimscroll/jquery.slimscroll.min.js"></script>
	<script
		src="/resources/assets/plugins/core/slimscroll/jquery.slimscroll.horizontal.min.js"></script>
	<!-- Resize text area in most pages -->
	<script
		src="/resources/assets/plugins/forms/autosize/jquery.autosize.js"></script>
	<!-- Proivde quick search for many widgets -->
	<script
		src="/resources/assets/plugins/core/quicksearch/jquery.quicksearch.js"></script>
	<!-- Bootbox confirm dialog for reset postion on panels -->
	<script src="/resources/assets/plugins/ui/bootbox/bootbox.js"></script>
	<!-- Other plugins ( load only nessesary plugins for every page) -->
	<script src="/resources/assets/plugins/charts/flot/jquery.flot.js"></script>
	<script src="/resources/assets/plugins/charts/flot/jquery.flot.pie.js"></script>
	<script
		src="/resources/assets/plugins/charts/flot/jquery.flot.resize.js"></script>
	<script src="/resources/assets/plugins/charts/flot/jquery.flot.time.js"></script>
	<script
		src="/resources/assets/plugins/charts/flot/jquery.flot.growraf.js"></script>
	<script
		src="/resources/assets/plugins/charts/flot/jquery.flot.categories.js"></script>
	<script
		src="/resources/assets/plugins/charts/flot/jquery.flot.stack.js"></script>
	<script
		src="/resources/assets/plugins/charts/flot/jquery.flot.tooltip.min.js"></script>
	<script src="/resources/assets/plugins/charts/flot/date.js"></script>
	<script
		src="/resources/assets/plugins/charts/sparklines/jquery.sparkline.js"></script>
	<script
		src="/resources/assets/plugins/charts/pie-chart/jquery.easy-pie-chart.js"></script>
	<script src="/resources/assets/plugins/forms/icheck/jquery.icheck.js"></script>
	<script
		src="/resources/assets/plugins/forms/tags/jquery.tagsinput.min.js"></script>
	<script src="/resources/assets/plugins/forms/tinymce/tinymce.min.js"></script>
	<script
		src="/resources/assets/plugins/misc/highlight/highlight.pack.js"></script>
	<script src="/resources/assets/plugins/misc/countTo/jquery.countTo.js"></script>
	<script src="/resources/assets/plugins/ui/weather/skyicons.js"></script>
	<script src="/resources/assets/plugins/ui/notify/jquery.gritter.js"></script>
	<script src="/resources/assets/plugins/ui/calendar/fullcalendar.js"></script>
	<script src="/resources/assets/js/jquery.sprFlat.js"></script>
	<script src="/resources/assets/js/app.js"></script>
	<script src="/resources/assets/js/pages/dashboard.js"></script>

</body>
</html>