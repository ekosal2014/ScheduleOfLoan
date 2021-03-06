var StringUtils;
if (!StringUtils) StringUtils = {};
if (!StringUtils.optionDatePicker){
	StringUtils.optionDatePicker = {
		changeMonth : true,
		changeYear  : true,
		monthNames  : ['ខែ01','ខែ02','ខែ03','ខែ04','ខែ05','ខែ06','ខែ07','ខែ08','ខែ09','ខែ10','ខែ11','ខែ12'],
		monthNamesShort : ['ខែ01','ខែ02','ខែ03','ខែ04','ខែ05','ខែ06','ខែ07','ខែ08','ខែ09','ខែ10','ខែ11','ខែ12'],
		dayNames : ['ច័ន្ទ', 'អង្គារ៍', 'ពុធ', 'ព្រហស្បិ៍ត', 'សុក្រ', 'សៅរិ៍', 'អាទិត្យ'],
		dayNamesShort : ['អា','ច', 'អ', 'ព', 'ហ', 'សុ', 'ស'],
		dayNamesMin : ['អា','ច', 'អ', 'ព', 'ហ', 'សុ', 'ស'],
		yearRange: '2009:9999',
		dateFormat : 'dd-mm-yy',
		maxDate : 'getDate'
	}
}
StringUtils.formatStringToDate = function(dt){
	if (typeof dt != null && dt != '' && dt.length == 8){
		return dt.replace(/(\d{4})(\d{2})(\d{2})/g, '$3-$2-$1');
	}
	return '';
}
StringUtils.formatDateToString = function(str){
	if (typeof str != null && str != '' && str.length == 10){
		return str.replace(/(\d{2})\-(\d{2})\-(\d{4})/g, '$3$2$1');
	}
	return '';
}
StringUtils.numberWithComma = function (number,str){
	if (typeof str == null) str = ',';
	return number.toString().replace(/\B(?=(\d{3})+(?!\d))/g, str);
}

StringUtils.datePickerRang = function(dpStart,dpEnd){
	$('#'+dpEnd).datepicker(StringUtils.optionDatePicker).datepicker("setDate", new Date());	
	var dt = new Date();
	var ndt= new Date(dt.getFullYear(),dt.getMonth() -1,dt.getDate());
	$('#'+dpStart).datepicker(StringUtils.optionDatePicker).datepicker("setDate", ndt);
}