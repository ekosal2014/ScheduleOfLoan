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
			@-webkit-keyframes animatezoom{
				from { -webkit-transform : scale(0);}
				to { -webkit-transform : scale(1);}
			}
			@-keyframes animatezoom{
				from { -webkit-transform : scale(0);}
				to { -webkit-transform : scale(1);}
			}
		</style>
	</head>
	<body>
		<div class="register-container" id="register-container">
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
			<textarea></textarea>
			<button class="btn-login" id="btn-register">Next</button>
		</div>
		<div class="register-container-2" style="display:none;" id="register-container-2">
			<label><b>User Name</b></label>
			<input type="text" name="username" required/>
			<label><b>Password</b></label>
			<input type="text" name="password" required/>
			<label><b>Comfirm Password</b></label>
			<input type="text" name="fullname" required/>
			<label><b>Password</b></label>
			<button class="btn-login" type="submit" >Save</submit>
		</div>
	</body>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script>
		$(document).ready(function(){
			$("#btn-register").click(function(){
				$("#register-container-2").show();
				$("#register-container").hide();
			});
		});
	</script>
</html>