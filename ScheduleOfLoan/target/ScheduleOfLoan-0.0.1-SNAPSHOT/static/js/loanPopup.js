var loan;

if (!loan) loan = {};

if (!loan.popup){
	loan.popup = {};
	
	loan.popup.modalOptions = {
			modalClose : false,
			follow :[true,true],
			opacity:0.5,
			escClose:false
	};
	
	loan.popup.messageOption = {
			modal : false,
			opacity : 0.5
	};
}

loan.popup.openPopup = function (id, input,callbackFn,topHeight){
	var iframe = document.getElementById(id+'_iframe');
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
	$(iframe).attr('src','./'+id+param);
}
loan.popup.closePopup = function(id){
	var iframe = id+'_iframe';
	$('#'+iframe).bPopup().close();
};





