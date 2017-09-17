<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<link href="${pageContext.request.contextPath }/static/css/font-awesome/css/font-awesome.min.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath }/static/css/contents.css" rel="stylesheet">		
	</head>	
	<body class="body-wrapper">
		<div class="wrapper">
			<%@include file="leftmenu.jsp" %>
			<div class="content-wrapper">
				<%@include file="topmenu.jsp" %>		
				
				<iframe src="${pageContext.request.contextPath }/index" onload="resizeIframe(this);" id="ifr-layout" style="width: 100%;border:none;height: auto;"></iframe>			
								
			</div>
			<div class="main-footer"> Footer </div>
		</div>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath }/static/js/main.js"></script>
	</body>
</html>
