$(document).ready(function(){
	
	goPageList(1)
	
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

function goPageList(page){
	var data = {
		'perPage':$('#perPage').val(),
		'currentPage':page,
		'dtStart':$('#txt_dtStart').val().replace(/\-/g, ''),
		'dtEnd':$('#txt_dtEnd').val().replace(/\-/g, '')
	};
	$.ajax({
        type: 'GET',
        url: '/ScheduleOfLoan/mywalletlist',
        data: data,
        success : function(json){
        	  console.log(json);
        	  $('#tblMywallet>tbody').empty();
        	  var tbl = '';
        	  var index = ($('#perPage').val() * page) - $('#perPage').val();
        	  if (index == 0 ) { index = index + 1;}else { index++;}
        	  for(var i=0;i<json.list.length;i++){
        		  tbl +=  '<tr>'
								+'<td class="t-center"><input type="checkbox"/></td>'
								+'<td class="t-center">'+index+'</td>'
								+'<td class="t-right">'+json.list[i].balance_old+' $</td>'											
								+'<td class="t-right">'+json.list[i].amount+' $</td>'
								+'<td class="t-right">'+json.list[i].balance_new+' $</td>'
								+'<td class="t-center">'+json.list[i].amout_type+'</td>'
								+'<td class="t-center">view</td>'
							+'</tr>';
        		  index++;
        	  }
        	  $('#tblMywallet>tbody').append(tbl);
        	  $('#ifr-layout', window.parent.document).height($('#body-mywallet').height());
        	  $('#indexPage').text(page);
        	  $('#ttPage').text(json.totalPage);
        	  $('#total').text(json.total);
        	  var option = {
        			total : json.total,
    				maxVisible : 5,
    				perPage : $('#perPage').val(),
    				currentPage : page,
    				numPage : 1,
    				wrapClass:'pagination',
    				eventLink:'goPageList'
        	  }
        	  pagination.showPage(option);
        },
        error : function(){
           console.log('error');
        }
    });
}