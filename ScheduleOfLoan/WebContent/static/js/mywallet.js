$(document).ready(function(){
	
	loadingList();
	
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
	
	$('#txt_dtEnd').datepicker({
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

function loadingList(){
	$.ajax({
        type: 'GET',
        url: '/ScheduleOfLoan/mywalletlist',
        success : function(json){
        	  $('#tblMywallet>tbody').empty();
        	  var tbl = '';
        	  console.log(json)
        	  for(var i=0;i<json.length;i++){
        		  tbl +=  '<tr>'
								+'<td class="t-center"><input type="checkbox"/></td>'
								+'<td class="t-center">'+(i+1)+'</td>'
								+'<td class="t-right">'+json[i].balance_old+' $</td>'											
								+'<td class="t-right">'+json[i].amount+' $</td>'
								+'<td class="t-right">'+json[i].balance_new+' $</td>'
								+'<td class="t-center">'+json[i].amout_type+'</td>'
								+'<td class="t-center">view</td>'
							+'</tr>';
        	  }
        	  $('#tblMywallet>tbody').append(tbl);
        	  $('#ifr-layout', window.parent.document).height($('#body-mywallet').height());
        },
        error : function(){
           console.log('error');
        }
    });
}