$(document).ready(function(){
	goPageList (1);
});

function  goPageList(page){
	var data = {
			'perPage':$('#perPage').val(),
			'currentPage':page,
			'txtName':$('#txtName').val()
		};
		console.log(data);
		$.ajax({
	        type: 'GET',
	        url: '/ScheduleOfLoan/userList',
	        data: data,
	        success : function(json){
	        	  console.log(json);
	        	  $('#tblEmployee>tbody').empty();
	        	  $('.pagination-row').show();
	        	  var tbl = '';
	        	  var index = ($('#perPage').val() * page) - $('#perPage').val();
	        	  if (index == 0 ) { index = index + 1;}else { index++;}
	        	  if ( json.list.length > 0 ){
		        	  for(var i=0;i<json.list.length;i++){
		        		/*  tbl +=  '<tr>'
										+'<td class="t-center"><input type="checkbox"/></td>'
										+'<td class="t-center">'+index+'</td>'
										+'<td class="t-right">'+StringUtils.numberWithComma(json.list[i].balance_old)+' $</td>'											
										+'<td class="t-right">'+StringUtils.numberWithComma(json.list[i].amount)+' $</td>'
										+'<td class="t-right">'+StringUtils.numberWithComma(json.list[i].balance_new)+' $</td>'
										+'<td class="t-center">'+StringUtils.formatStringToDate(json.list[i].reg_date)+'</td>'
										+'<td class="t-center">'+json.list[i].amout_type+'</td>'
										+'<td class="t-center">view</td>'
									+'</tr>';
		        		  index++;*/
		        	  }
		        	  $('#tblEmployee>tbody').append(tbl);
		        	  $('#ifr-layout', window.parent.document).height($('.body-content').height());
		        	  $('#indexPage').text(StringUtils.numberWithComma(page));
		        	  $('#ttPage').text(StringUtils.numberWithComma(json.totalPage));
		        	  $('#total').text(StringUtils.numberWithComma(json.total));
		        	  $('#totalBalance').text(StringUtils.numberWithComma(json.total));
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
	        		  $('#totalBalance').text(' 0');
	        		  $('.pagination-row').hide();
	        		  $('#tblEmployee>tbody').append('<tr><td class="t-center" colspan="8">មិនទាន់មានទិន្នន័យទេ</td>');
	        	  }
	        },
	        error : function(){
	           console.log('error');
	        }
	    });
}