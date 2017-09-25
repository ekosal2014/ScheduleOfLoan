$(document).ready(function(){
	$('.tbl-content tbody tr td .btnViewBorrower').click(function(){
		top.loan.popup.openPopup('borrowerpopup',null,null,200);
	});
});