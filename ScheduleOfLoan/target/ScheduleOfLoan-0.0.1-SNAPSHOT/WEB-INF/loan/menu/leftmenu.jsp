<!--<div class="main-header"> asdflf </div> -->
<%@page import="com.java.loan.enums.UserTxt"%>
<%
	String txt = (user.getTxt() == null ? "3" : user.getTxt()); 
%>
<div class="main-sidebar">
	<div class="main-header"> asdflf </div>
	<div class="user-infor">
		<div class="user-infor-image">
			<img src="${pageContext.request.contextPath }/static/img/${user.photo }" alt="User Infor" width="50" height="50" class="image-user"/>
		</div>
		<div class="user-infor-caption">
			<p class="name">${user.full_name }</p>
			<p>${user.phone }</p>
			<p>Team Leader</p>
		</div>
	</div>
	<div>
		<ul class="sidebar-menu">
		  <% if (txt.equals(UserTxt.ADMIN.getValue())){ %> 
				<li class="menu-active">
					<a href="javascript:" data="${pageContext.request.contextPath }/index">HOME</a>
				</li>
				<li>
					<a href="javascript:" data="${pageContext.request.contextPath }/mywallet">MY WALLET</a>
				</li>
			<% } %> 
			
				<li>
					<a href="javascript:" data="${pageContext.request.contextPath }/borrower">BORROWERS</a>
				</li>
				<li>
					<a href="javascript:" data="${pageContext.request.contextPath }/loans">LOANS</a>
				</li>
				<li>
					<a href="javascript:" data="${pageContext.request.contextPath }/missed-payment">MISSED PAYMENTS</a>
				</li>
				<li>
					<a href="javascript:" data="${pageContext.request.contextPath }/payments">PAYMENTS</a>
				</li>
			<%  if (txt.equals(UserTxt.ADMIN.getValue())){    %> 
				<li>
					<a href="javascript:" data="${pageContext.request.contextPath }/employee">EMPLOYEE</a>
				</li>
				<li>
					<a href="javascript:" data="${pageContext.request.contextPath }/company">COMPANY ROLES</a>
				</li>
			<% } %> 
		</ul>
	</div>
</div>