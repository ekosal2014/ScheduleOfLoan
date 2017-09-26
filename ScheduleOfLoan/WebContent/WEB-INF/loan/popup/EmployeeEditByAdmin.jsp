<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.jsp" %>
<body>
	<!-- The Modal -->
		<div id="myModal" class="modal" style="display:none;">
		  <input type="hidden" name="userId" id="userId"/>		
		  <!-- Modal content -->
		  <div class="modal-content">
			<div class="modal-header">
			  <span class="close">&times;</span>
			  <h2><i class="fa fa-money" aria-hidden="true"></i>  Your Balance</h2>
			  <div style="clear:both;"></div>
			</div>
			<div class="modal-body">
				<div>
				    <div class="modal-body-title">Basic Information</div>
					<div class="modal-column-2">
						<div class="modal-wallet">
							<label>Employee Code : </label>
							<span id="employeeCode">000001</span>
						</div>
						<div class="modal-wallet">
							<label>Full Name : </label>
							<span id="fullName"></span>
						</div>
					    <div class="modal-wallet">
							<label>Gender : </label>
							<span id="gender">Male</span>
						</div>
						
					</div>	
					<div class="modal-column-2">
						 <div class="modal-wallet">
							<label>Phone Name : </label>
							<span id="phone">Male</span>
						</div>
						<div class="modal-wallet">
							<label>Email : </label>
							<span id="email">longkosal7@gmail.com</span>
						</div>
					   
						<div class="modal-wallet">
							<label>Address : </label>
							<span id="address">PP</span>
						</div>
					</div>	
					<div style="clear:both;"></div>
				</div>		
				<div>
					<div class="modal-body-title">Permission Information</div>
					<div class="modal-column-3">
						<div class="modal-wallet">
							<label style="width: 130px !important;">Permission Login : </label>
							<select class="form-control input-rows" name="sts">
								<option value="2">Disable</option>
								<option value="1">Enable</option>
							</select> 
						</div>
					    <div class="modal-wallet">
							<label style="width: 130px !important;">Permission Use : </label>
							<span>
								<select class="form-control input-rows" name="txt">
									<option value="1">User</option>
									<option value="2">Admin</option>
								</select> 
							</span>
						</div>
					</div>	
					<div style="clear:both;"></div>
				</div>
			</div>
			<div class="modal-footer">
			  <button type="submit" class="modal-botton"> Save </button>
			  <div style="clear:both;"></div>
			</div>
		  </div>
		</div>
</body>
</html>