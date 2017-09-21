<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@include file="header.jsp" %>
	<body id="body-mywallet">				
				<div class="content">
					<div class="content-box border-blue">
						<div class="content-box-head">
								<span class="count-top">
										<i class="fa fa-briefcase" aria-hidden="true"></i>
										My Wallet
								</span>
								<span class="count" id="totalBalance">$ 10,000,000</span>
								<span class="count-bottom">
									<a href="javascript:" id="btn-addPopup">Add</a>  
									<!-- <a href="javascript:">Delete</a> -->
								</span>
						</div>
						<div class="content-box-body">
							<div class="content-categoris"> 
								<div class="col-sm-4">
									<div>
										<label>Show 
											<select class="form-control input-rows" id="perPage">
												<option value="10">10</option>
												<option value="15">15</option>
												<option value="30">30</option>
												<option value="50">50</option>
											</select> entries
										</label>
									</div>
								
								</div>
								<div class="col-sm-8">
									<div style="text-align:right;">
										<label>Search:
											<input type="text" class="form-control input-dt" id="txt_dtStart" name="txt_dtStart" readonly="readonly">~
											<input type="text" class="form-control input-dt" id="txt_dtEnd" name="txt_dtEnd" readonly="readonly">
											<!-- <input type="search" class="form-control input-search" placeholder=""> -->
											<input class="btn btn-default" type="button" value="Search" onclick="goPageList(1)" style="width:100px;">
										</label>										
									</div>
								</div>
							</div>
							<div class="content-controll-data">
								<table class="tbl tbl-content" id="tblMywallet">
								   <colgroup>
								   		<col style="width:5%; ">
								   		<col style="width:5%  ">
								   		<col style="width:15%; ">
								   		<col style="width:15%; ">
								   		<col style="width:15%; ">
								   		<col style="width:10%; ">
								   		<col style="width:10%; ">
								   		<col style="width:10%; ">
								   </colgroup>
									<thead>
										<tr>
										    <th></th>
											<th>No</th>
											<th>Amount Old</th>											
											<th>Amount</th>
											<th>Balance</th>
											<th>Register Date</th>
											<th>Operation Type</th>
											<th></th>
										</tr>
									</thead>
									<tbody>								
									</tbody>
								</table>
								
							</div>	
							<div style="clear:both;"></div>
							<div class="row" id="mywallet-row">
								<div class="col-sm-4" style="padding-top:5px;">Showing <span id="indexPage">1</span> to <span id="ttPage">10</span> of <span id="total">57</span> entries</div>
								<div class="col-sm-8">
									<div class="pagination-number">
										<ul class="pagination">
											<li><a>←</a></li>
											<li><a>«</a></li>
											<li class="active"><a> 1</a></li>
											<li><a>2</a></li>
											<li><a>3</a></li>
											<li><a>»</a></li>
											<li><a>→</a></li>
										</ul>
									</div>
								</div>
							</div>
							<div style="clear:both;"></div>
						</div>
					</div>
				</div>
			
	</body>	
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script src="${pageContext.request.contextPath }/static/js/jquery-ui-1.9.2.custom.js" charset="UTF-8"></script>
		<script src="${pageContext.request.contextPath }/static/js/StringUtils.js" charset="UTF-8"></script>
		<script src="${pageContext.request.contextPath }/static/js/mywallet.js" charset="UTF-8"></script>
		<script src="${pageContext.request.contextPath }/static/js/pagination.js" charset="UTF-8"></script>
		
			
</html>
		