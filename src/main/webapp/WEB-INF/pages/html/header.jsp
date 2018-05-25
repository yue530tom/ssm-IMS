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
				<li><a href="#">产品<i class="im-library"></i></a>
					<ul class="nav sub">
						<li><a href="/product/toProductAddPage">新增产品<i
								class="im-quill"></i>
						</a></li>
						<li><a href="/product/toProductListPage">维护产品<i
								class="im-numbered-list"></i></a></li>
					</ul></li>
				<li><a href="#">订单<i class="im-coin"></i></a>
					<ul class="nav sub">
						<li><a href="/order/toOrderAddPage">新增订单<i
								class="im-quill"></i>
						</a></li>
						<li><a href="/order/toOrderListPage">维护订单<i
								class="im-numbered-list"></i></a></li>
					</ul></li>
				<li><a href="#">工厂<i class="im-office"></i></a>
					<ul class="nav sub">
						<li><a href="/factory/toFactoryAddPage">新增工厂<i
								class="im-quill"></i>
						</a></li>
						<li><a href="/factory/toFactoryListPage">维护工厂<i
								class="im-numbered-list"></i></a></li>
					</ul></li>
				<li><a href="#">属性<i class="im-cogs"></i></a>
					<ul class="nav sub">
						<li><a href="/props/toPropsAddPage">新增属性<i class="im-quill"></i>
						</a></li>
						<li><a href="/props/toPropsListPage">维护属性<i
								class="im-numbered-list"></i></a></li>
					</ul></li>
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
