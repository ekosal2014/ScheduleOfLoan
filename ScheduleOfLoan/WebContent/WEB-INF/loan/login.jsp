<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<style>
			body{
				padding:0;
				margin:0;
				font-family:'Titillium Web',sans-serif;
			}
			.login-container{
				position:absolute;
				top:40%;
				left:40%;
				width:300px;
				height:300px;
			}
			input[type=text],input[type=password]{
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
			a{
				margin-left:100px;
				text-align:right;
			}
		</style>
	</head>
	<body>
		<form method="post" action="${pageContext.request.contextPath }/login" id="frm-login">
			<div class="login-container">
				<label><b>Username</b></label>
				<input type="text" name="username" required/>
				<label><b>Password</b></label>
				<input type="password" name="password" required/>
				<button class="btn-login" id="btn-login">Login</button>
				<input type="checkbox" name="remember" id="remember"/><label for="remember">Remember Me</label>
				<a href="${pageContext.request.contextPath }/register" > Register</a>
			</div>
		</form>
	</body>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script>
		$(document).ready(function(){
			$('#frm-login').submit(function(e) {
				var frm = $('#frm-login');
				e.preventDefault();
				var data = {};

				$.each(this,function(i,v){
					var input = $(v);
					data[input.attr("name")] = input.val();
					delete(data["undefined"])
				});
				

		        $.ajax({
		            type: frm.attr('method'),
		            url: frm.attr('action'),
		            data : data,
		            success : function(json){
		            	console.log(json)
		            },
		            error : function(){
		               console.log('error');
		            }
		        });
		        
			});
		});
	</script>
</html>