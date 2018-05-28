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
<!-- Javascripts -->
<!-- Load pace first -->
<script src="/resources/assets/plugins/core/pace/pace.min.js"></script>
<!-- Important javascript libs(put in all pages) -->
<script src="/resources/assets/js/jquery-1.8.3.min.js"></script>
<script>
	window.jQuery
			|| document
					.write('<script src="/resources/assets/js/libs/jquery-2.1.1.min.js">\x3C/script>')
</script>
<script src="/resources/assets/js/jquery-ui.js"></script>
<script>
	window.jQuery
			|| document
					.write('<script src="/resources/assets/js/libs/jquery-ui-1.10.4.min.js">\x3C/script>')
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
<script src="/resources/assets/plugins/charts/flot/jquery.flot.stack.js"></script>
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
<script src="/resources/assets/plugins/misc/highlight/highlight.pack.js"></script>
<script src="/resources/assets/plugins/misc/countTo/jquery.countTo.js"></script>
<script src="/resources/assets/plugins/ui/weather/skyicons.js"></script>
<script src="/resources/assets/plugins/ui/notify/jquery.gritter.js"></script>
<script src="/resources/assets/plugins/ui/calendar/fullcalendar.js"></script>
<script src="/resources/assets/js/jquery.sprFlat.js"></script>
<script src="/resources/assets/js/app.js"></script>
<script src="/resources/assets/js/pages/dashboard.js"></script>
<style type="text/css">
.align-center {
	margin: 0 auto; /* 居中 这个是必须的，，其它的属性非必须 */
	width: 300px; /* 给个宽度 顶到浏览器的两边就看不出居中效果了 */
	height: 50px; /* 给个宽度 顶到浏览器的两边就看不出居中效果了 */
	background: #f3f5f6; /* 背景色 */
	text-align: center; /* 文字等内容居中 */
	position: fixed;
	left: 50%;
	top: 50%;
	margin-left: width/2;
	margin-top: height/2;
}
</style>
<script type="text/javascript">
	$(document).ready(function() {
		/* 	    		$(document).ajaxStart(
		 function() { 
		 $.blockUI({ 
		 message: $('#displayBox'), 
		 css: { 
		 top:  ($(window).height() - 400) /2 + 'px', 
		 left: ($(window).width() - 400) /2 + 'px', 
		 width: '400px' 
		 } 
		 }); 
		 }).ajaxStop($.unblockUI);  */
		initTable("{}");
		console.log("$(document).ready:" + $("#buffer_span").text());
		//初始化页数
		/* var d = new Date();
		$(".form_date").datetimepicker({
		initialDate : d,
		language : 'zh-CN',
		format : 'yyyy-mm-dd',
		todayHighlight : 1,
		weekStart : 1,
		todayBtn : 1,
		autoclose : 1,
		startView : 2,
		minView : 2
		});  */
		//提示成功信息      
	});

	function initTable(filter) {
		var data = null;
		if (filter != "{}") {
			data = "filter=" + filter;
		}

		$.ajax({
			type : "GET",
			data : data,
			url : "/factory/factoryList",
			dataType : "JSON",
			success : function(json) {
				refreshList(json);
				initPage(json);
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				//  alert(textStatus+errorThrown.getMessage());
			}
		});
	}

	function refreshList(json) {
		var ja = json.list;
		var string = JSON.stringify(json);
		console.log("json.list:" + json.list.length);
		console.log("json.msg:" + json.msg);
		if (json.msg != null) {
			document.getElementById('tip_message').style.display = 'block';
			$("#tip_message").html(json.msg);
			console.log("document.getElementById:"
					+ document.getElementById("tip_message"));
			setTimeout(
					"document.getElementById('tip_message').style.display='none'",
					2000);
		}
		//刷新修改属性值
		//刷新列表
		$("#table_propslist").empty();
		$("#table_propslist")
				.append(
						'<tr><th>工厂编号</th><th>工厂名称</th><th>联系人</th><th>联系电话</th><th>座机</th><th>工厂地址</th><th>工厂规模</th><th>工厂备注</th><th>工厂状态</th><th>操作</th></tr>');
		for (var i = 0; i < ja.length; i++) {
			var factoryId = ja[i].factoryId;
			var factoryName = ja[i].factoryName;
			var factoryContacts = ja[i].factoryContacts;
			var factoryPhone = ja[i].factoryPhone;
			var factoryTelephone = ja[i].factoryTelephone;
			var factoryAddress = ja[i].factoryAddress;
			var factoryScale = ja[i].factoryScale;
			var factoryRemarks = ja[i].factoryRemarks;
			var factoryStatus = ja[i].factoryStatus;
			$("#table_propslist").append(
					'<tr onclick="getDataToModify(this)" id="tr_' + i
							+ '"></tr>');
			$("#tr_" + i).append('<td>' + factoryId + '</td>');
			$("#tr_" + i).append("<td>" + factoryName + "</td>");
			$("#tr_" + i).append("<td>" + factoryContacts + "</td>");
			$("#tr_" + i).append("<td>" + factoryPhone + "</td>");
			$("#tr_" + i).append('<td>' + factoryTelephone + '</td>');
			$("#tr_" + i).append("<td>" + factoryAddress + "</td>");
			$("#tr_" + i).append("<td>" + factoryScale + "</td>");
			$("#tr_" + i).append("<td>" + factoryRemarks + "</td>");
			if(factoryStatus==1){
				$("#tr_" + i).append("<td>有效</td>");
			}else{
				$("#tr_" + i).append("<td>废弃</td>");
			}
			$("#tr_" + i)
					.append(
							'<td><button class="btn btn-primary" onclick="doFilterDelete('+factoryId+');">删除</button></td>');
		}
		$("#record_sum").text(ja.length).css("color", "rgba(255, 0, 0, 0.71)");
	}

	function initPage(json) {
		var curPage = 1;
		var totalPage = json.page;
		if (curPage == '1') {
			$("#btn_lastPage").attr({
				"disabled" : "disabled"
			});
		} else {
			$("#btn_lastPage").removeAttr("disabled");
		}
		if (parseInt(curPage) == parseInt(totalPage)) {
			$("#btn_nextPage").attr({
				"disabled" : "disabled"
			});
		} else {
			$("#btn_nextPage").removeAttr("disabled");
		}

		$("#cur_page").text(curPage);
		$("#tot_page").text(totalPage);
	}
	function jumpPage() {
		var jpage = $("#pageNum").val();
		var tpage = $("#tot_page").text();
		var num = parseInt(jpage);
		var page = '{"cur_page":"' + (num - 2) + '","totalPage":"' + tpage
				+ '"}';
		var filter = $("#buffer_span").text();
		if (num<=0 || num>parseInt(tpage) || jpage.length == 0) {
			alert("请输入合适的页数！");
		} else {
			$.ajax({
				url : "/factory/factoryList",
				type : "GET",
				dataType : "JSON",
				data : "page=" + page + "&filter=" + filter,
				success : function(json) {
					refreshList(json);
					$("#cur_page").text(jpage);
					turnButtonStatue(jpage, tpage);
				}

			});
		}
	}

	function nextPage() {
		var curpage = $("#cur_page").text();
		var tpage = $("#tot_page").text();
		var num = parseInt(curpage);
		var page = '{"cur_page":"' + (num - 1) + '","totalPage":"' + tpage
				+ '"}';
		var filter = $("#buffer_span").text();
		if (num >= parseInt(tpage)) {
			alert("请输入合适的页数！");
		} else {
			$.ajax({
				url : "/factory/factoryList",
				type : "GET",
				dataType : "JSON",
				data : "page=" + page + "&filter=" + filter,
				success : function(json) {
					refreshList(json);
					$("#cur_page").text(num + 1);
					turnButtonStatue(num + 1, tpage);
				}
			});
		}
	}

	function lastPage() {
		var curpage = $("#cur_page").text();
		var tpage = $("#tot_page").text();
		var num = parseInt(curpage);
		var page = '{"cur_page":"' + (num - 3) + '","totalPage":"' + tpage
				+ '"}';
		var filter = $("#buffer_span").text();
		if (num <= 1) {
			alert("请输入合适的页数！");
		} else {
			$.ajax({
				url : "/factory/factoryList",
				type : "GET",
				dataType : "JSON",
				data : "page=" + page + "&filter=" + filter,
				success : function(json) {
					refreshList(json);
					$("#cur_page").text(num - 1);
					turnButtonStatue(num - 1, tpage);
				}

			});
		}
	}

	function turnButtonStatue(curPage, totalPage) {
		if (curPage == '1') {
			$("#btn_lastPage").attr({
				"disabled" : "disabled"
			});
		} else {
			$("#btn_lastPage").removeAttr("disabled");
		}
		if (parseInt(curPage) == parseInt(totalPage)) {
			$("#btn_nextPage").attr({
				"disabled" : "disabled"
			});
		} else {
			$("#btn_nextPage").removeAttr("disabled");
		}
	}

	function clearText(id) {
		$(id).val("");
	}

	function reFixText(id, text) {
		if ($(id).val() == "" || $(id).val() == " ") {
			$(id).val(text);
		}
	}

	function doFilterQuery() {
		var filterJs = {};
		filterJs["method"] = "query";
		if ($("#factoryQueryId").val() != "") {
			filterJs["factoryId"] = $("#factoryQueryId").val();
		}
		if ($("#factoryName").val() != "") {
			filterJs["factoryName"] = $("#factoryName").val();
		}
		if ($("#factoryContacts").val() != "") {
			filterJs["factoryContacts"] = $("#factoryContacts").val();
		}
		if ($("#factoryPhone").val() != "") {
			filterJs["factoryPhone"] = $("#factoryPhone").val();
		}
		if ($("#factoryTelephone").val() != "") {
			filterJs["factoryTelephone"] = $("#factoryTelephone").val();
		}
		if ($("#factoryAddress").val() != "") {
			filterJs["factoryAddress"] = $("#factoryAddress").val();
		}
		if ($("#factoryScale").val() != "") {
			filterJs["factoryScale"] = $("#factoryScale").val();
		}
		if ($("#factoryRemarks").val() != "") {
			filterJs["factoryRemarks"] = $("#factoryRemarks").val();
		}
		if ($("#factoryStatus").val() != "") {
			filterJs["factoryStatus"] = $("#factoryStatus").val();
		}
		if ($("input[name='factoryStatus']:checked").val() != "") {
			filterJs["factoryStatus"] = $("input[name='factoryStatus']:checked").val();
		}

		$("#buffer_span").text(JSON.stringify(filterJs));
		console.log("doFilterQuery:" + $("#buffer_span").text());
		initTable(JSON.stringify(filterJs));
	}
	function doFilterModify() {
		var filterJs = {};
		filterJs["method"] = "modify";
		if ($("#factoryId").val() != "") {
			filterJs["factoryId"] = $("#factoryId").val();
		}
		if ($("#factoryName").val() != "") {
			filterJs["factoryName"] = $("#factoryName").val();
		}
		if ($("#factoryContacts").val() != "") {
			filterJs["factoryContacts"] = $("#factoryContacts").val();
		}
		if ($("#factoryPhone").val() != "") {
			filterJs["factoryPhone"] = $("#factoryPhone").val();
		}
		if ($("#factoryTelephone").val() != "") {
			filterJs["factoryTelephone"] = $("#factoryTelephone").val();
		}
		if ($("#factoryAddress").val() != "") {
			filterJs["factoryAddress"] = $("#factoryAddress").val();
		}
		if ($("#factoryScale").val() != "") {
			filterJs["factoryScale"] = $("#factoryScale").val();
		}
		if ($("#factoryRemarks").val() != "") {
			filterJs["factoryRemarks"] = $("#factoryRemarks").val();
		}
		if ($("#factoryStatus").val() != "") {
			filterJs["factoryStatus"] = $("#factoryStatus").val();
		}
		if ($("input[name='factoryStatus']:checked").val() != "") {
			filterJs["factoryStatus"] = $("input[name='factoryStatus']:checked").val();
		}
		console.log(filterJs);
		$("#buffer_span").text(JSON.stringify(filterJs));
		initTable(JSON.stringify(filterJs));
	}
	function doFilterAdd() {
		var filterJs = {};
		filterJs["method"] = "add";
		if ($("#factoryName").val() != "") {
			filterJs["factoryName"] = $("#factoryName").val();
		}
		if ($("#factoryContacts").val() != "") {
			filterJs["factoryContacts"] = $("#factoryContacts").val();
		}
		if ($("#factoryPhone").val() != "") {
			filterJs["factoryPhone"] = $("#factoryPhone").val();
		}
		if ($("#factoryTelephone").val() != "") {
			filterJs["factoryTelephone"] = $("#factoryTelephone").val();
		}
		if ($("#factoryAddress").val() != "") {
			filterJs["factoryAddress"] = $("#factoryAddress").val();
		}
		if ($("#factoryScale").val() != "") {
			filterJs["factoryScale"] = $("#factoryScale").val();
		}
		if ($("#factoryRemarks").val() != "") {
			filterJs["factoryRemarks"] = $("#factoryRemarks").val();
		}
		if ($("#factoryStatus").val() != "") {
			filterJs["factoryStatus"] = $("#factoryStatus").val();
		}
		if ($("input[name='factoryStatus']:checked").val() != "") {
			filterJs["factoryStatus"] = $("input[name='factoryStatus']:checked").val();
		}
		console.log(filterJs);
		$("#buffer_span").text(JSON.stringify(filterJs));
		initTable(JSON.stringify(filterJs));
	}
	function doFilterDelete(tmpFactoryId) {
		var filterJs = {};
		filterJs["method"] = "delete";
		filterJs["factoryId"]=tmpFactoryId;
		console.log(filterJs);
		$("#buffer_span").text(JSON.stringify(filterJs));
		initTable(JSON.stringify(filterJs));
	}
	
	/*
	给修改赋值~
	 */
	function getDataToModify(row) {

		$("#factoryId")
				.attr(
						"value",
						window.table_propslist.rows.item(row.rowIndex).childNodes[0].innerText);
		$("#factoryName")
				.attr(
						"value",
						window.table_propslist.rows.item(row.rowIndex).childNodes[1].innerText);
		$("#factoryContacts")
				.attr(
						"value",
						window.table_propslist.rows.item(row.rowIndex).childNodes[2].innerText);
		$("#factoryPhone")
				.attr(
						"value",
						window.table_propslist.rows.item(row.rowIndex).childNodes[3].innerText);
		$("#factoryTelephone")
		.attr(
				"value",
				window.table_propslist.rows.item(row.rowIndex).childNodes[4].innerText);
		$("#factoryAddress")
		.attr(
				"value",
				window.table_propslist.rows.item(row.rowIndex).childNodes[5].innerText);
		$("#factoryScale")
		.attr(
				"value",
				window.table_propslist.rows.item(row.rowIndex).childNodes[6].innerText);
		$("#factoryRemarks")
		.attr(
				"value",
				window.table_propslist.rows.item(row.rowIndex).childNodes[7].innerText);

		/* var TAB = document.getElementById("table_propslist") ;  
		
		console.log(TAB.rows[row.rowIndex].cells[0].innerText);
		console.log(TAB.rows[row.rowIndex].cells[1].innerText);
		console.log(TAB.rows[row.rowIndex].cells[2].innerText);
		console.log(TAB.rows[row.rowIndex].cells[3].innerText);
		document.getElementById("modifyPropsId").value = TAB.rows[row.rowIndex].cells[0].innerText; */

	}
</script>
</head>
<body>

	<!-- Start #header -->
	<div id="header">
		<div class="container-fluid">
			<div class="navbar">
				<div class="navbar-header">
					<a class="navbar-brand" href="/userTest"> <i
						class="im-windows8 text-logo-element animated bounceIn"></i><span
						class="text-logo">spr</span><span class="text-slogan">flat</span>
					</a>
				</div>
				<nav class="top-nav" role="navigation">
					<ul class="nav navbar-nav pull-left">
						<li id="toggle-sidebar-li"><a href="#" id="toggle-sidebar"><i
								class="en-arrow-left2"></i> </a></li>
						<li><a href="#" class="full-screen"><i
								class="fa-fullscreen"></i></a></li>
						<li class="dropdown"><a href="#" data-toggle="dropdown"><i
								class="ec-cog"></i><span class="notification">10</span></a>
							<ul class="dropdown-menu" role="menu">
								<li><a href="#"><i class="en-database"></i> Database <span
										class="notification">3</span></a></li>
								<li><a href="#"><i class="st-cube"></i> Packages <span
										class="notification blue">17</span></a></li>
								<li><a href="#"><i class="st-health"></i> Disconnects <span
										class="notification yellow">1</span></a></li>
								<li><a href="#"><i class="im-images"></i> Images <span
										class="notification teal">320</span></a></li>
								<li><a href="#"><i class="st-users"></i> Users <span
										class="notification orange">2k</span></a></li>
								<li><a href="#"><i class="st-meter"></i> Traffic <span
										class="notification magenta">2tb</span></a></li>
								<li><a href="#"><i class="im-coin"></i> Finances <span
										class="notification pink">+3k</span></a></li>
								<li><a href="#"><i class="st-folder"></i> Directories <span
										class="notification green">17</span></a></li>
								<li><a href="#"><i class="st-bag"></i> Orders <span
										class="notification purple">12</span></a></li>
								<li><a href="#"><i class="ec-contract"></i> Contracts <span
										class="notification dark">7</span></a></li>
							</ul></li>
						<li class="dropdown"><a href="#" data-toggle="dropdown"><i
								class="ec-mail"></i><span class="notification">4</span></a>
							<ul class="dropdown-menu email" role="menu">
								<li class="mail-head">
									<div class="clearfix">
										<div class="pull-left">
											<a href="email-inbox.html"><i class="ec-archive"></i></a>
										</div>
										<span>Inbox</span>
										<div class="pull-right">
											<a href="email-inbox.html"><i class="st-pencil"></i></a>
										</div>
									</div>
								</li>
								<li class="search-email">
									<form>
										<input type="text" name="search"
											placeholder="Search for emails">
										<button type="submit">
											<i class="ec-search"></i>
										</button>
									</form>
								</li>
								<li class="mail-list clearfix"><a href="#"> <img
										src="/resources/assets/img/avatars/128.jpg"
										class="mail-avatar pull-left" alt="avatar">
										<p class="name">
											<span class="status"><i class="en-dot"></i></span> Jason
											Rivera <span class="notification">2</span> <span class="time">12:30
												am</span>
										</p>
										<p class="msg">I contact you regarding my account please
											can you set up my pass ...</p>
								</a></li>
								<li class="mail-list clearfix"><a href="#"> <img
										src="/resources/assets/img/avatars/129.jpg"
										class="mail-avatar pull-left" alt="avatar">
										<p class="name">
											<span class="status off"><i class="en-dot"></i></span> Steeve
											Mclark <span class="notification">6</span> <span class="time">10:26
												am</span>
										</p>
										<p class="msg">Good job dude awesome work here, please add
											theese features ...</p>
								</a></li>
								<li class="mail-list clearfix"><a href="#"> <img
										src="/resources/assets/img/avatars/130.jpg"
										class="mail-avatar pull-left" alt="avatar">
										<p class="name">
											<span class="status off"><i class="en-dot"></i></span> Fellix
											Jones <span class="notification">1</span> <span class="time">7:15
												am</span>
										</p>
										<p class="msg">I have some issues when try to reach my
											product page can you ...</p>
								</a></li>
								<li class="mail-list clearfix"><a href="#"> <img
										src="/resources/assets/img/avatars/131.jpg"
										class="mail-avatar pull-left" alt="avatar">
										<p class="name">
											<span class="status"><i class="en-dot"></i></span> Tina
											Dowsen <span class="notification">5</span> <span class="time">03:46
												am</span>
										</p>
										<p class="msg">Hello Sugge, i want to apply for your
											referal program , please ...</p>
								</a></li>
								<li class="mail-more"><a href="email-inbox.html">View
										all <i class="en-arrow-right7"></i>
								</a></li>
							</ul></li>
					</ul>
					<ul class="nav navbar-nav pull-right">
						<li><a href="#" id="toggle-header-area"><i
								class="ec-download"></i></a></li>
						<li class="dropdown"><a href="#" data-toggle="dropdown"><i
								class="br-alarm"></i> <span class="notification">5</span></a>
							<ul class="dropdown-menu notification-menu right" role="menu">
								<li class="clearfix"><i class="ec-chat"></i> <a href="#"
									class="notification-user"> Ric Jones </a> <span
									class="notification-action"> replied to your </span> <a
									href="#" class="notification-link"> comment</a></li>
								<li class="clearfix"><i class="st-pencil"></i> <a href="#"
									class="notification-user"> SuggeElson </a> <span
									class="notification-action"> just write a </span> <a href="#"
									class="notification-link"> post</a></li>
								<li class="clearfix"><i class="ec-trashcan"></i> <a
									href="#" class="notification-user"> SuperAdmin </a> <span
									class="notification-action"> just remove </span> <a href="#"
									class="notification-link"> 12 files</a></li>
								<li class="clearfix"><i class="st-paperclip"></i> <a
									href="#" class="notification-user"> C. Wiilde </a> <span
									class="notification-action"> attach </span> <a href="#"
									class="notification-link"> 3 files</a></li>
								<li class="clearfix"><i class="st-support"></i> <a href="#"
									class="notification-user"> John Simpson </a> <span
									class="notification-action"> add support </span> <a href="#"
									class="notification-link"> ticket</a></li>
							</ul></li>
						<li class="dropdown"><a href="#" data-toggle="dropdown">
								<img class="user-avatar"
								src="/resources/assets/img/avatars/48.jpg" alt="SuggeElson">SuggeElson
						</a>
							<ul class="dropdown-menu right" role="menu">
								<li><a href="profile.html"><i class="st-user"></i>
										Profile</a></li>
								<li><a href="file.html"><i class="st-cloud"></i> Files</a>
								</li>
								<li><a href="#"><i class="st-settings"></i> Settings</a></li>
								<li><a href="login.html"><i class="im-exit"></i> Logout</a>
								</li>
							</ul></li>
						<li id="toggle-right-sidebar-li"><a href="#"
							id="toggle-right-sidebar"><i class="ec-users"></i> <span
								class="notification">3</span></a></li>
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
				<li><a href="#">产品<i class="im-library"></i></a>
					<ul class="nav sub">
						<li><a href="/product/toProductPage">维护产品<i
								class="im-numbered-list"></i></a></li>
					</ul></li>
				<li><a href="#">订单<i class="im-coin"></i></a>
					<ul class="nav sub">
						<li><a href="/order/toOrderPage">维护订单<i
								class="im-numbered-list"></i></a></li>
					</ul></li>
				<li><a href="#">工厂<i class="im-office"></i></a>
					<ul class="nav sub">
						<li><a href="/factory/toFactoryPage">维护工厂<i class="im-numbered-list"></i></a></li>
					</ul></li>
				<li><a href="#">属性<i class="im-cogs"></i></a>
					<ul class="nav sub">
						<li><a href="/props/toPropsPage">维护属性<i class="im-numbered-list"></i></a></li>
						<li><a href="/props/toPropsDetailsPage">维护属性详情<i class="im-quill"></i></a></li>
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
						<i class="im-screen"></i> Dashboard
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
											<a href="#"> <i class="im-pie"></i> <span>Earning
													Stats</span>
											</a>
										</div>
										<div class="shortcut-button">
											<a href="#"> <i class="ec-images color-dark"></i> <span>Gallery</span>
											</a>
										</div>
										<div class="shortcut-button">
											<a href="#"> <i class="en-light-bulb color-orange"></i> <span>Fresh
													ideas</span>
											</a>
										</div>
										<div class="shortcut-button">
											<a href="#"> <i class="ec-link color-blue"></i> <span>Links</span>
											</a>
										</div>
										<div class="shortcut-button">
											<a href="#"> <i class="ec-support color-red"></i> <span>Support</span>
											</a>
										</div>
										<div class="shortcut-button">
											<a href="#"> <i class="st-lock color-teal"></i> <span>Lock
													area</span>
											</a>
										</div>
									</div>
								</div>
							</div>
							<div class="btn-group dropdown">
								<a class="btn dropdown-toggle" data-toggle="dropdown"
									id="dropdownMenu2"><i class="ec-pencil s24"></i></a>
								<div class="dropdown-menu pull-right" role="menu"
									aria-labelledby="dropdownMenu2">
									<div class="option-dropdown">
										<div class="row">
											<p class="col-lg-12">Quick post</p>
											<form class="form-horizontal" role="form">
												<div class="form-group">
													<div class="col-lg-12">
														<input type="text" class="form-control"
															placeholder="Enter title">
													</div>
												</div>
												<!-- End .form-group  -->
												<div class="form-group">
													<div class="col-lg-12">
														<textarea class="form-control wysiwyg"
															placeholder="Enter text"></textarea>
													</div>
												</div>
												<!-- End .form-group  -->
												<div class="form-group">
													<div class="col-lg-12">
														<input type="text" class="form-control tags1"
															placeholder="Enter tags">
													</div>
												</div>
												<!-- End .form-group  -->
												<div class="form-group">
													<div class="col-lg-12">
														<button class="btn btn-default btn-xs">Save Draft</button>
														<button class="btn btn-success btn-xs pull-right">Publish</button>
													</div>
												</div>
												<!-- End .form-group  -->
											</form>
										</div>
									</div>
								</div>
							</div>
							<div class="btn-group">
								<a class="btn dropdown-toggle" data-toggle="dropdown"
									id="dropdownMenu3"><i class="ec-help s24"></i></a>
								<div class="dropdown-menu pull-right" role="menu"
									aria-labelledby="dropdownMenu3">
									<div class="option-dropdown">
										<p>
											First time visitor ? <a href="#" id="app-tour"
												class="btn btn-success ml15">Take app tour</a>
										</p>
										<hr>
										<p>
											Or check the <a href="#" class="btn btn-danger ml15">FAQ</a>
										</p>
									</div>
								</div>
							</div>
						</div>
					</div>
					<!-- End .option-buttons -->
				</div>
				<!-- End .page-header -->
			</div>
			<!-- End .row -->
			<!--  #f3f5f6 -->
			<div id="tip_message"
				style="background: #FF4500; text-align: center; color: #0000FF;"></div>
			<div class="outlet">
				<!-- Start .outlet -->
				<!-- Page start here ( usual with .row ) -->
				<div class="row">
					<div class="col-lg-11 col-md-11 col-sm-11 col-xs-11">
						<!-- col-lg-4 start here -->
						<div class="panel panel-default plain">
							<!-- Start .panel -->
							<div class="panel-heading white-bg">
								<h4 class="panel-title">
									<i class="im-quill"></i>工厂属性
								</h4>
							</div>
							<div class="panel-body">
								<div class="form-horizontal hover-stripped">
									<div class="form-group col-lg-3 col-md-3 col-sm-3 col-xs-3" style="margin-top:0;">
										<label class="col-lg-4 control-label">工厂编号</label>
										<div class="col-lg-8">
											<input id="factoryId" name="factoryId" type="text" class="col-lg-4 form-control" disabled>
										</div>
									</div>
									<div class="form-group col-lg-3 col-md-3 col-sm-3 col-xs-3" style="margin-top:0;">
										<label class="col-lg-4 control-label">工厂编号</label>
										<div class="col-lg-8">
											<input id="factoryQueryId" name="factoryQueryId" type="text" class="col-lg-4 form-control" placeholder="仅当查询时起作用，增加和修改不起作用">
										</div>
									</div>
									<div class="form-group col-lg-3 col-md-3 col-sm-3 col-xs-3">
										<label class="col-lg-4 control-label">工厂名称</label>
										<div class="col-lg-8">
											<input id="factoryName" name="factoryName" type="text" class="col-lg-4 form-control" placeholder="请输入属性名称，格式为小于50位的字符">
										</div>
									</div>
									<div class="form-group col-lg-3 col-md-3 col-sm-3 col-xs-3">
										<label class="col-lg-4 control-label">联系人</label>
										<div class="col-lg-8">
											<input id="factoryContacts" name="factoryContacts" type="text"
												class="col-lg-4 form-control"
												placeholder="请输入属性描述，格式为小于50位的字符">
										</div>
									</div>
									<div class="form-group col-lg-3 col-md-3 col-sm-3 col-xs-3">
										<label class="col-lg-4 control-label">联系手机</label>
										<div class="col-lg-8">
											<input id="factoryPhone" name="factoryPhone"
												type="text" class="col-lg-4 form-control"
												placeholder="请输入属性备注，格式为小于50位的字符">
										</div>
									</div>
									<div class="form-group col-lg-3 col-md-3 col-sm-3 col-xs-3">
										<label class="col-lg-4 control-label">座机电话</label>
										<div class="col-lg-8">
											<input id="factoryTelephone" name="factoryTelephone"
												type="text" class="col-lg-4 form-control"
												placeholder="请输入属性备注，格式为小于50位的字符">
										</div>
									</div>
									<div class="form-group col-lg-3 col-md-3 col-sm-3 col-xs-3">
										<label class="col-lg-4 control-label">工厂地址</label>
										<div class="col-lg-8">
											<input id="factoryAddress" name="factoryAddress"
												type="text" class="col-lg-4 form-control"
												placeholder="请输入属性备注，格式为小于50位的字符">
										</div>
									</div>
									<div class="form-group col-lg-3 col-md-3 col-sm-3 col-xs-3">
										<label class="col-lg-4 control-label">工厂规模</label>
										<div class="col-lg-8">
											<input id="factoryScale" name="factoryScale"
												type="text" class="col-lg-4 form-control"
												placeholder="请输入属性备注，格式为小于50位的字符">
										</div>
									</div>
									<div class="form-group col-lg-3 col-md-3 col-sm-3 col-xs-3">
										<label class="col-lg-4 control-label">工厂备注</label>
										<div class="col-lg-8">
											<input id="factoryRemarks" name="factoryRemarks"
												type="text" class="col-lg-4 form-control"
												placeholder="请输入属性备注，格式为小于50位的字符">
										</div>
									</div>
									<div class="form-group col-lg-3 col-md-3 col-sm-3 col-xs-3">
										<label class="col-lg-4 control-label">工厂状态</label>
										<div class="col-lg-8" style="height: 34px">
											<label class="radio col-lg-9"> <input
												id="factoryStatus" type="radio" name="factoryStatus"
												class="col-lg-4 form-control" value="1" checked="checked">有效
												<input id="factoryStatuscp" type="radio"
												name="factoryStatus" class="col-lg-4 form-control"
												value="0">无效
											</label>
										</div>
									</div>
								
									<!-- End .form-group  -->
								</div>
							</div>
						</div>
						<!-- End .panel -->
					</div>
					<!-- col-lg-4 end here -->
					<div class="col-lg-1 col-md-1 col-sm-1 col-xs-1">
						<!-- col-lg-4 start here -->
						<div class="panel panel-default plain">
							<!-- Start .panel -->
							<div class="panel-heading white-bg">
								<h4 class="panel-title">
									<i class="im-quill"></i>操作盘
								</h4>
							</div>
							<div class="panel-body">
								<div class="form-horizontal hover-stripped">
									
									<!-- End .form-group  -->
									<div class="form-group">
										<label class="col-lg-3 control-label"></label>
										<div class="col-lg-9">
											<button id="doAdd" class="btn btn-primary"
												onclick="doFilterAdd();">新增</button>
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-3 control-label"></label>
										<div class="col-lg-9">
											<button id="doModify" class="btn btn-primary"
												onclick="doFilterModify();">修改</button>
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-3 control-label"></label>
										<div class="col-lg-9">
											<button id="doQuery" class="btn btn-primary"
												onclick="doFilterQuery();">查询</button>
										</div>
									</div>
									<!-- End .form-group  -->
								</div>
							</div>
						</div>
						<!-- End .panel -->
					</div>
				</div>

				<div class="row">
					<!-- col-lg-4 end here -->
					<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
						<!-- col-lg-4 start here -->
						<div class="panel panel-default plain">
							<!-- Start .panel -->
							<div class="panel-heading white-bg">
								<h4 class="panel-title">
									<i class="im-quill"></i>工厂列表
								</h4>
							</div>
							<div class="panel-body">
								<table class="table display" id="table_propslist">
									<thead>
										<tr>
											<th>工厂编号</th>
											<th>工厂名称</th>
											<th>联系人</th>
											<th>联系电话</th>
											<th>座机</th>
											<th>工厂地址</th>
											<th>工厂规模</th>
											<th>工厂备注</th>
											<th>工厂状态</th>
										</tr>
									</thead>
								</table>
							</div>
							<div style="margin-top: 3px;">

								<span style="font-weight: lighter;">本页共<span
									id="record_sum"></span>条记录
								</span>
							</div>

							<div id="pt_div">
								<input type="button" id="btn_lastPage"
									class="btn btn-default btn-xs" value="上一页"
									onclick="lastPage();" />&nbsp;<span id="cur_page">0</span>&nbsp;
								<input type="button" id="btn_nextPage"
									class="btn btn-default btn-xs" value="下一页" onclick="nextPage()" />
								共<span id="tot_page"></span>页&nbsp;&nbsp;&nbsp;&nbsp; 去<input
									type="text" width="5px" id="pageNum" />页 &nbsp; <input
									type="button" value="确定" class="btn btn-default btn-xs"
									onclick="jumpPage();" />
							</div>
							<span id="buffer_span" style="display: none">{}</span>
						</div>
						<!-- End .panel -->
					</div>
					<!-- col-lg-4 end here -->
				</div>
				<!-- Page End here -->
			</div>
			<!-- End .outlet -->
		</div>
		<!-- End .content-wrapper -->
		<div class="clearfix"></div>
	</div>
	<!-- End #content -->

</body>
</html>