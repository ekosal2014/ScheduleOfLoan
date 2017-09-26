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
	        	  if (typeof json.code != 'undefined'){
	        		  if (json.code == '0001') {
	        			  alert(json.message);
	        			  window.parent.location.href = './login'
	        		  }
	        	  }else{
		        	  $('#tblEmployee>tbody').empty();
		        	  $('.pagination-row').show();
		        	  var tbl = '';
		        	  var index = ($('#perPage').val() * page) - $('#perPage').val();
		        	  if (index == 0 ) { index = index + 1;}else { index++;}
		        	  if ( json.list.length > 0 ){
			        	  for(var i=0;i<json.list.length;i++){
			        		  tbl += '<tr>'
										+'<td class="t-center"><input type="checkbox"/></td>'
										+'<td class="t-center">'+index+'</td>'
										+'<td class="t-left">'+json.list[i].full_name+'</td>'											
										+'<td class="t-center">'+json.list[i].gender+'</td>'
										+'<td class="t-left">'+StringUtils.numberWithComma(json.list[i].phone,'-')+'</td>'
										+'<td class="t-left">'+json.list[i].email+'</td>'
										+'<td class="t-left">'+json.list[i].username+'</td>'
										+'<td class="t-left">'+json.list[i].address+'</td>'
										+'<td class="t-center" style="color:red;"><a href="javaScript:" onclick="userEditInfo()">'+json.list[i].sts+'</a></td>'
										+'<td class="t-center">view</td>'
									+'</tr>';		        		
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
	        	  }
	        },
	        error : function(){
	           console.log('error');
	        }
	    });
}
function userEditInfo(){
	top.loan.popup.openPopup('myModal');
}