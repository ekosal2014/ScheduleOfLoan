<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@include file="header.jsp" %>
	<body>
		<div class="wrapper">
			<%@include file="leftmenu.jsp" %>
			<div class="content-wrapper">
				<%@include file="topmenu.jsp" %>		
				
				<iframe src="${pageContext.request.contextPath }/index" id="ifr-layout" style="width: 100%;border:none;"></iframe>			
								
			</div>
			<div class="main-footer"> Footer </div>
		</div>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath }/static/js/main.js"></script>
	</body>
</html>
