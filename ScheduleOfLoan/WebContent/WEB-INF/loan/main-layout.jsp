<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@include file="header.jsp" %>
	<body class="body-wrapper">
		<div class="wrapper">
			<%@include file="menu/leftmenu.jsp" %>
			<div class="content-wrapper">
				<%@include file="menu/topmenu.jsp" %>		
				
				<iframe src="${pageContext.request.contextPath }/index" onload="resizeIframe(this);" id="ifr-layout" name="ifr-layout" style="width: 100%;border:none;height: auto;"></iframe>			
								
			</div>
			<div class="main-footer"> Footer </div>
		</div>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath }/static/js/lib/jquery.bpopup.min.js"></script>
		<script src="${pageContext.request.contextPath }/static/js/loanPopup.js"></script>
		<script src="${pageContext.request.contextPath }/static/js/main.js"></script>
		<%@include file="popup_iframe.jsp" %>
	</body>
</html>
