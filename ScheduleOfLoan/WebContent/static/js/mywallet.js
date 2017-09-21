$(document).ready(function(){
	StringUtils.datePickerRang('txt_dtStart','txt_dtEnd');
	goPageList(1)	
	$('#btn-addPopup').click(function(){
		top.loan.popup.openPopup('mywalletadd');
	});	
});

function goPageList(page){
	var data = {
		'perPage':$('#perPage').val(),
		'currentPage':page,
		'dtStart':StringUtils.formatDateToString($('#txt_dtStart').val()),
		'dtEnd':StringUtils.formatDateToString($('#txt_dtEnd').val())
	};
	$.ajax({
        type: 'GET',
        url: '/ScheduleOfLoan/mywalletlist',
        data: data,
        success : function(json){
        	  $('#tblMywallet>tbody').empty();
        	  var tbl = '';
        	  var index = ($('#perPage').val() * page) - $('#perPage').val();
        	  if (index == 0 ) { index = index + 1;}else { index++;}
        	  if ( json.list.length >= 0 ){
	        	  for(var i=0;i<json.list.length;i++){
	        		  tbl +=  '<tr>'
									+'<td class="t-center"><input type="checkbox"/></td>'
									+'<td class="t-center">'+index+'</td>'
									+'<td class="t-right">'+StringUtils.numberWithComma(json.list[i].balance_old)+' $</td>'											
									+'<td class="t-right">'+StringUtils.numberWithComma(json.list[i].amount)+' $</td>'
									+'<td class="t-right">'+StringUtils.numberWithComma(json.list[i].balance_new)+' $</td>'
									+'<td class="t-center">'+StringUtils.formatStringToDate(json.list[i].reg_date)+'</td>'
									+'<td class="t-center">'+json.list[i].amout_type+'</td>'
									+'<td class="t-center">view</td>'
								+'</tr>';
	        		  index++;
	        	  }
	        	  $('#tblMywallet>tbody').append(tbl);
	        	  $('#ifr-layout', window.parent.document).height($('#body-mywallet').height());
	        	  $('#indexPage').text(StringUtils.numberWithComma(page));
	        	  $('#ttPage').text(StringUtils.numberWithComma(json.totalPage));
	        	  $('#total').text(StringUtils.numberWithComma(json.total));
	        	  $('#totalBalance').text('$ '+StringUtils.numberWithComma(json.Balance));
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
        	  }else{
        		  $('#totalBalance').text('$ 0');
        		  $('#mywallet-row').hide();
        		  $('#tblMywallet>tbody').append('<tr><td class="t-center" colspan="8">មិនទាន់មានទិន្នន័យទេ</td>');
        	  }
        },
        error : function(){
           console.log('error');
        }
    });
}