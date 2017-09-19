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
					<input type="text" class="form-control input-wallet" id="txt_amount" name="amount" placeholder=""> 
				</div>
			   <div class="modal-wallet">
					<label>Type Balance :</label>
						<select name="amout_type" class="form-control input-rows">
							<option value="">ជ្រើសរើស</option>
							<option value="0">ចំណាយ</option>
							<option value="1">ចំណូល</option>
						</select>
				 
				</div>
				<div class="modal-wallet">
				   <label>Description :  </label>
				   <textarea rows="3" style="width:300px;" id="txt_description" name="description"></textarea>				 
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
			 $('#txt_amount').autoNumeric('init',{ pSign: "s", pNeg: "r",aSep: ',',dGroup: '3',aSign: '',aPad: false,vMax: '9999999999',vMin: '0'});  
			$('#btnClose').click(function(){
				top.loan.popup.closePopup('mywalletadd');
			});
			$('#frm-mywallet').submit(function(e) {
		    	var frm = $('#frm-mywallet');
				e.preventDefault();
				var data = {};

				$.each(this,function(i,v){
					var input = $(v);
					
					if (input.attr('name') == 'amount'){
						console.log(input.attr('name'));
						data[input.attr("name")] = input.val().replace(/\,/g, '');
					}else{
						data[input.attr("name")] = input.val();
					}
					
					delete(data["undefined"])
				});
				
				console.log(data);
		        $.ajax({
		            type: frm.attr('method'),
		            url: frm.attr('action'),
		            data : data,
		            success : function(json){
		            	console.log(json);
		            	if (json.code != '0000'){
		            		alert(json.msg);
		            		return;
		            	}else{
		            		alert(json.msg);
		            		return;
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