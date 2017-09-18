<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
	<%@include file="../header.jsp" %>
	<body>
		<!-- The Modal -->
		<div id="myModal" class="modal">
		  <!-- Modal content -->
		  <div class="modal-content">
			<div class="modal-header">
			  <span class="close" id="btnClose">&times;</span>
			  <h2><i class="fa fa-money" aria-hidden="true"></i>  Your Balance</h2>
			  <div style="clear:both;"></div>
			</div>
			<div class="modal-body">
				<div class="modal-wallet">
					<label>Balance : </label>
					<input type="search" class="form-control input-wallet" placeholder=""> 
				</div>
			   <div class="modal-wallet">
					<label>Type Balance : </label>
					<input type="search" class="form-control input-wallet" placeholder=""> 
				</div>
				<div class="modal-wallet">
				   <label>Description :  </label>
				   <textarea rows="3" style="width:300px;"></textarea>
				 
				</div>
			</div>
			<div class="modal-footer">
			  <button type="submit" class="modal-botton"> Save </button>
			  <div style="clear:both;"></div>
			</div>
		  </div>
		</div>
	</body>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			$('#btnClose').click(function(){
				top.loan.popup.closePopup('mywalletadd');
			});
		});
	</script>
</html>