<%@page import="com.java.loan.utils.SessionUtils"%>
<%@page import="com.java.loan.model.User"%>
 <%
	String checkLogin = "";
 	User user = new User();
	try{
		user = SessionUtils.getSessionLoan(request, response);		
	}catch(Exception e){
			checkLogin = "<script language='javascript'>";
			checkLogin += "window.onload=function(){";
			checkLogin += "alert('Session Removed!');";
			checkLogin += "window.parent.location.href = './login';";
			checkLogin += "}";
			checkLogin += "</script>";
	}
%> 
<%=checkLogin %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<link href="${pageContext.request.contextPath }/static/css/font-awesome/css/font-awesome.min.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath }/static/css/contents.css" rel="stylesheet">		
		<link href="${pageContext.request.contextPath }/static/css/ui-lightness/jquery-ui-1.9.2.custom.min.css" rel="stylesheet">		
	</head>	