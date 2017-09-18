$(document).ready(function(){
	$('#btn-addPopup').click(function(){
		top.loan.popup.openPopup('mywalletadd');
	});
	
	$('#txt_dtStart').datepicker({
		changeMonth : true,
		changeYear  : true,
		monthNames  : ['ខែ01','ខែ02','ខែ03','ខែ04','ខែ05','ខែ06','ខែ07','ខែ08','ខែ09','ខែ10','ខែ11','ខែ12'],
		monthNamesShort : ['ខែ01','ខែ02','ខែ03','ខែ04','ខែ05','ខែ06','ខែ07','ខែ08','ខែ09','ខែ10','ខែ11','ខែ12'],
		dayNames : ['ច័ន្ទ', 'អង្គារ៍', 'ពុធ', 'ព្រហស្បិ៍ត', 'សុក្រ', 'សៅរិ៍', 'អាទិត្យ'],
		dayNamesShort : ['អា','ច', 'អ', 'ព', 'ហ', 'សុ', 'ស'],
		dayNamesMin : ['អា','ច', 'អ', 'ព', 'ហ', 'សុ', 'ស'],
		yearRange: '2009:9999',
		dateFormat : 'dd-mm-yy',
		setDate : 'getDate',
		maxDate : 'getDate'
	});
});