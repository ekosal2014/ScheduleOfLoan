<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<style>
			body{
				padding:0;
				margin:0;
				font-family:'Titillium Web',sans-serif;
			}
			.register-container{
				position:absolute;
				top:20%;
				right:5%;
				width:300px;
				height:300px;
				
			}
			.register-container-2{
				position:absolute;
				top:40%;
				right:5%;
				height:300px;
				width:300px;
				-webkit-animation: animatezoom 3s;
				animation: animatezoom 3s;
			}
			input[type=text],input[type=password],textarea{
				width:100%;
				padding:8px 15px;
				margin:2px 0 8px 0;
				display:inline-block;
				border:1px solid #ccc;
				box-sizing:border-box;
			}
			.btn-login{
				color:white;
				padding:14px 20px;
				margin:8px 0;
				font-weight:bold;
				border:none;
				width:100%;
				cursor:pointer;
				background-color:#4CAF50;
			}
			
		</style>
	</head>
	<body>
		<form action="/register" method="post">
		<!-- <div class="register-container" id="register-container">
			<label><b>Full Name</b></label>
			<input type="text" name="fullname" id="fullname" required/>
			<label><b>Gender</b></label>
			<div style="margin:2px 0 8px 0">
				<input type="radio" name="gender" id="male" checked="checked"/><label for="male">Male</label>
				<input type="radio" name="gender" id="female"/><label for="female">Female</label>
			</div>
			<label><b>Phone Number</b></label>
			<input type="text" name="phonenumber" id="phonenumber" required/>
			<label><b>Email</b></label>
			<input type="text" name="email" id="email" required/>
			<label><b>Date Of Birth</b></label>
			<input type="text" name="dob" id="dob" required/>
			<label><b>Address</b></label>
			<textarea id="address"></textarea>
			<button class="btn-login" id="btn-register">Next</button>
		</div> -->
		<div class="register-container-2" id="register-container-2">
			<label><b>User Name</b></label>
			<input type="text" name="username" required/>
			<label><b>Password</b></label>
			<input type="text" name="password" required/>
			<label><b>Comfirm Password</b></label>
			<input type="text" name="fullname" required/>
			<label><b>Password</b></label>
			<button class="btn-login" type="submit" >Save</submit>
		</div>
		</form>
	</body>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script>
		$(document).ready(function(){
			$("#btn-register").click(function(){
				/* if($('#username').val() == "" || $('#username').val() == null){
					alert("Please enter your username.")
					return;
				} */
				/* if ($('input[name=gender]:checked').length < 1){
					alert("Please choose your Gender.")
					return;
				}
				var regEx = new RegExp("/[0-9]/");
				if ($('#phonenumber').val() == ''){
					alert("Please enter your phone number!");
					return;
				} 
				if ($('#phonenumber').val().length > 11 || $('#phonenumber').val().length < 9 || regEx.test($('#phonenumber').val())){
					alert('Please your phone number is something wrong!');
					return;
				}
				if ($('#email').val() == ""){
					alert("Please enter your email");
					return;
				}
				if (isValidEmailAddress($('#email').val()) == false){
					alert("Please your email has something wrong!");
					return;
				} */
				/* $("#register-container-2").show();
				$("#register-container").hide(); */
			});
			/* function isValidEmailAddress(emailAddress) {
			    var pattern = new RegExp(/\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,4}\b/i);
			    return pattern.test(emailAddress);
			} */
		});
	</script>
</html>