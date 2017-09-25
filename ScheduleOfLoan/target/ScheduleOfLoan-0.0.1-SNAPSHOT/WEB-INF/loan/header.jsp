<%@page import="com.java.loan.utils.SessionUtils"%>
<%@page import="com.java.loan.model.User"%>
 <%
	String checkLogin = "";
 	User user = new User();
	try{
		user = SessionUtils.getSessionLoanView(request);	
		if (user == null){
			user = new User();
			user.setTxt("9999");
			checkLogin = "<script language='javascript' charset='utf-8'>";
			checkLogin += "window.onload=function(){";
			checkLogin += "alert('សិទ្ធិរបស់អ្នកត្រូវបានផ្ដាច់សូមធ្វើការចូលប្រព័ន្ធម្ដងទៀត!');";
			checkLogin += "window.parent.location.href = './login';";
			checkLogin += "}";
			checkLogin += "</script>";
		}
	}catch(Exception e){
			checkLogin = "<script language='javascript' charset='utf-8'>";
			checkLogin += "window.onload=function(){";
			checkLogin += "alert('សិទ្ធិរបស់អ្នកត្រូវបានផ្ដាច់សូមធ្វើការចូលប្រព័ន្ធម្ដងទៀត!');";
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