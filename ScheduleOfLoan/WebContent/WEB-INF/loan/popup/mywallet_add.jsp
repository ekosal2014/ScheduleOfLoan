<%@ page language="java" contentType="text/html; charset=UTF-8"%>
	<%@include file="../header.jsp" %>
	<body>
		<form method="post" action="${pageContext.request.contextPath }/mywalletAdd" id="frm-mywallet">
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
					<input type="text" class="form-control input-wallet" id="amount" name="amount" placeholder=""> 
				</div>
			   <div class="modal-wallet">
					<label>Type Balance :</label>
						<select name="amout_type" id="amout_type" class="form-control input-rows">
							<option value="">ជ្រើសរើស</option>
							<option value="0">ចំណាយ</option>
							<option value="1">ចំណូល</option>
						</select>
				 
				</div>
				<div class="modal-wallet">
				   <label>Description :  </label>
				   <textarea rows="3" style="width:300px;" id="description" name="description"></textarea>				 
				</div>
			</div>
			<div class="modal-footer">
			  <button id="btnSave" class="modal-botton"> Save </button>
			  <div style="clear:both;"></div>
			</div>
		  </div>
		</div>
		</form>
	</body>
	<script src="${pageContext.request.contextPath }/static/js/lib/jquery-2.2.4.min.js"></script>
	<script src="${pageContext.request.contextPath }/static/js/lib/autoNumeric.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			 $('#amount').autoNumeric('init',{ pSign: "s", pNeg: "r",aSep: ',',dGroup: '3',aSign: '',aPad: false,vMax: '9999999999',vMin: '0'});  
			$('#btnClose').click(function(){
				top.loan.popup.closePopup('mywalletadd');
			});
			$('#frm-mywallet').submit(function(e) {
		    	var frm = $('#frm-mywallet');
				e.preventDefault();
				var data = {};
				
				if ($('#amout_type').val() == ''){
					alert("Please choose type amount")
					return;
				}
				data['amount']      = $('#amount').val().replace(/\,/g, '');
				data['amout_type']  = $('#amout_type').val();
				data['description'] = $('#description').val();
								
		        $.ajax({
		            type: frm.attr('method'),
		            url: frm.attr('action'),
		            data : data,
		            success : function(json){
		            	console.log(json);
		            	if (typeof json.code == 'undefined' || json.code == '0001'){
		            		alert(json.message);
		            		window.parent.location.href = './login'
		            	}else{
		            		if (json.code == '0000'){
		            			alert(json.message);
		            			top.loan.popup.closePopup('mywalletadd');
		            		}else{
		            			alert(json.message);
		            			return;
		            		}
		            		
		            	}
		            	
		            },
		            error : function(){
		               console.log('error');
		            }
		        });
		    });
			
	       
		});
	</script>
</html>