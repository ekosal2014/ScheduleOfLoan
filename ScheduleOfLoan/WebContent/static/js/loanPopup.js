var loan;
if (!loan) loan = {};

if (!loan.popup){
	loan.popup = {};
	
	load.popup.modalOptions = {
			modalClose : false,
			follow :[true,true],
			opacity:0.3,
			escClose:false
	};
	
	loan.popup.messageOption = {
			modal : false,
			opacity : 0.3
	};
}

loan.popup.openPopup = function (id, input,callbackFn,topHeight){
	loan.popup.callbackFn[id] = callbackFn;
	var ifram = document.getElementById(id+'_iframe');
	if (topHeight != '' && topHeight != null){
		loan.popup.modalOptions.position = ['auto',topHeight];		
	}else{
		loan.popup.modalOptions.position = ['auto',90];
	}
	$(iframe).bPopup(loan.popup.modalOptions);
	var param = '';
	if (typeof input != 'undefined'){
		param = '?input='+param;
	}
	$(iframe).attr('src','${pageContext.request.contextPath }/'+id+param);
}





