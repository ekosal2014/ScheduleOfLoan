<%@page import="com.java.loan.utils.SessionUtils"%>
<%@page import="com.java.loan.model.User"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String checkLogin = "";
	try{
		User user = SessionUtils.getSessionLoan(request, response);		
	}catch(Exception e){
			checkLogin = "<script language='javascript'>";
			checkLogin += "window.onload=function(){";
			checkLogin += "alert('Session Removed!');";
			checkLogin += "window.location.href = './login';";
			checkLogin += "}";
			checkLogin += "</script>";
	}
%> 
<%-- <%=checkLogin %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<link href="${pageContext.request.contextPath }/static/css/font-awesome/css/font-awesome.min.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath }/static/css/contents.css" rel="stylesheet">
		
	</head>
	
	<body>
		<div class="wrapper">
			<!--<div class="main-header"> asdflf </div> -->
			<div class="main-sidebar">
				<div class="main-header"> asdflf </div>
				<div class="user-infor">
					<div class="user-infor-image">
						<img src="Koala.jpg" alt="User Infor" width="50" height="50" class="image-user"/>
					</div>
					<div class="user-infor-caption">
						<p class="name">E KOSAL</p>
						<p>010 245 789</p>
						<p>Team Leader</p>
					</div>
				</div>
				<div>
					<ul class="sidebar-menu">
						<li class="menu-active">
							<a href="javascript:">HOME</a>
						</li>
						<li>
							<a href="javascript:">MY WALLET</a>
						</li>
						<li>
							<a href="javascript:">BORROWERS</a>
						</li>
						<li>
							<a href="javascript:">LOANS</a>
						</li>
						<li>
							<a href="javascript:">MISSED PAYMENTS</a>
						</li>
						<li>
							<a href="javascript:">PAYMENTS</a>
						</li>
						<li>
							<a href="javascript:">EMPLOYEE</a>
						</li>
						<li>
							<a href="javascript:">COMPANY ROLES</a>
						</li>
					</ul>
				</div>
			</div>
			<div class="content-wrapper">
				<div class="main-header"> 
					<ul class="navbar-right">
						<li>
							<a href="javascript:" class="info-number">
								<i class="fa fa-envelope-o"></i>
								<span class="badge bg-green">6</span>
							</a>
							<ul class="dropdown-menu msg-list" style="display:none;">
								<li>
									<a>
										<span class="image">
											<img src="Koala.jpg"/>
										</span>
										<span>
											<span>E kosal</span>
											<span class="time"> 3 minutes</span>
										</span>
										<span class="message">Film festivals used to be do-or-die moments for movie makers. They were where...</span>
									</a>
								</li>
								<li>
									<a>
										<span class="image">
											<img src="Koala.jpg"/>
										</span>
										<span>
											<span>E kosal</span>
											<span class="time"> 3 minutes</span>
										</span>
										<span class="message">Film festivals used to be do-or-die moments for movie makers. They were where...</span>
									</a>
								</li>
								<li>
									<a>
										<span class="image">
											<img src="Koala.jpg"/>
										</span>
										<span>
											<span>E kosal</span>
											<span class="time"> 3 minutes</span>
										</span>
										<span class="message">Film festivals used to be do-or-die moments for movie makers. They were where...</span>
									</a>
								</li>
								<li>
									<a>
										<span class="image">
											<img src="Koala.jpg"/>
										</span>
										<span>
											<span>E kosal</span>
											<span class="time"> 3 minutes</span>
										</span>
										<span class="message">Film festivals used to be do-or-die moments for movie makers. They were where...</span>
									</a>
								</li>
								<li></li>
							</ul>
						</li>
						<li>
							<a href="javascript:" class="info-number">
								<i class="fa fa-bell-o"></i>
								<span class="badge bg-yellow">10</span>
							</a>
							<ul class="dropdown-menu msg-list" style="display:none;">
								<li>
									<a>
										<span class="image">
											<img src="Koala.jpg"/>
										</span>
										<span>
											<span>E kosal</span>
											<span class="time"> 3 minutes</span>
										</span>
										<span class="message">Film festivals used to be do-or-die moments for movie makers. They were where...</span>
									</a>
								</li>
								<li>
									<a>
										<span class="image">
											<img src="Koala.jpg"/>
										</span>
										<span>
											<span>E kosal</span>
											<span class="time"> 3 minutes</span>
										</span>
										<span class="message">Film festivals used to be do-or-die moments for movie makers. They were where...</span>
									</a>
								</li>
								<li>
									<a>
										<span class="image">
											<img src="Koala.jpg"/>
										</span>
										<span>
											<span>E kosal</span>
											<span class="time"> 3 minutes</span>
										</span>
										<span class="message">Film festivals used to be do-or-die moments for movie makers. They were where...</span>
									</a>
								</li>
								<li>
									<a>
										<span class="image">
											<img src="Koala.jpg"/>
										</span>
										<span>
											<span>E kosal</span>
											<span class="time"> 3 minutes</span>
										</span>
										<span class="message">Film festivals used to be do-or-die moments for movie makers. They were where...</span>
									</a>
								</li>
								<li></li>
							</ul>
						</li>
						<li>
							<a href="javascript:">
								<img src="Koala.jpg" width="25" height="25" class="profile"  alt="image"/>
								E KOSAL
								<span class=" fa fa-angle-down"></span>
							</a>
							<ul class="dropdown-menu dropdown-profile" style="display:none;">
								<li>
									<a>
										Profile
									</a>
								</li>
								<li>
									<a>

										Setting
									</a>
								</li>
								<li>
									<a>
										Help
									</a>
								</li>
								<li>
									<a>
										Log Out
										<i class="fa fa-sign-out pull-right"></i>
									</a>
								</li>
								<li></li>
							</ul>
						</li>
					</ul>
				</div>				
				<div class="content">
					<div class="row">
						<div class="col-sm-4">
							<div class="infor-box">
								<span class="count-top">
										<i class="fa fa-briefcase" aria-hidden="true"></i>
										My Wallet
								</span>
								<span class="count">$ 10,000,000</span>
								<span class="count-title">Total My Wallet</span>
								<span class="count-bottom">
									<i class="green"><i class="fa fa-sort-asc"></i>3% </i>
									from last month
								</span>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="infor-box">
								<span class="count-top">
										<i class="fa fa-briefcase" aria-hidden="true"></i>
										My Wallet
								</span>
								<span class="count">$ 10,000,000</span>
								<span class="count-title">Total My Wallet</span>
								<span class="count-bottom">
									<i class="red"><i class="fa fa-sort-desc"></i>3% </i>
									from last month
								</span>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="infor-box">
								<span class="count-top">
										<i class="fa fa-briefcase" aria-hidden="true"></i>
										My Wallet
								</span>
								<span class="count">$ 10,000,000</span>
								<span class="count-title">Total My Wallet</span>
								<span class="count-bottom">
									<i class="red"><i class="fa fa-sort-desc"></i>3% </i>
									from last month
								</span>
							</div>
						</div>
					</div>
				<div style="clear:both;"></div>
				<div class="content-daigram">
					lkasfjlkasdf
				</div>
				</div>
			</div>
			<div class="main-footer"> Footer </div>
		</div>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script>
			$(document).ready(function(){
				$(".sidebar-menu>li").click(function(){
					$(this).parent(".sidebar-menu").find("li").removeClass("menu-active");
					$(this).addClass("menu-active");
				});
			});
		</script>
	</body>
</html>
