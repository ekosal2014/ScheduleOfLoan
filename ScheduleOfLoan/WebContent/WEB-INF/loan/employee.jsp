<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@include file="header.jsp" %>
	<body>
		
				<div class="content">
					<div class="content-box border-blue">
						<div class="content-box-head">
								<span class="count-top">
										<i class="fa fa-briefcase" aria-hidden="true"></i>
										My Wallet
								</span>
								<span class="count">$ 10,000,000</span>
								<span class="count-bottom">
									<a href="javascript;">Add</a> | 
									<a href="javascript:">Delete</a>
								</span>
						</div>
						<div class="content-box-body">
							<div class="content-categoris"> 
								<div class="col-sm-4">
									<div>
										<label>Show 
											<select class="form-control input-rows">
												<option value="10">10</option>
												<option value="25">25</option>
												<option value="50">50</option>
												<option value="100">100</option>
											</select> entries
										</label>
									</div>
								
								</div>
								<div class="col-sm-8">
									<div style="text-align:right;">
										<label>Search:
											<!--<input type="search" class="form-control input-dt" placeholder="">~
											<input type="search" class="form-control input-dt" placeholder="">-->
											<input type="search" class="form-control input-search" placeholder="">
											<input class="btn btn-default" type="button" value="Search" style="width:100px;">
										</label>										
									</div>
								</div>
							</div>
							<div class="content-controll-data">
								<table class="tbl tbl-content">
									<thead>
										<tr>
										    <th></th>
											<th>No</th>
											<th>Full Name</th>											
											<th>Gender</th>
											<th>Phone</th>
											<th>E-mail</th>
											<th>UserName</th>
											<th>Status</th>
											<th></th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td class="t-center"><input type="checkbox"/></td>
											<td class="t-center">001</td>
											<td class="t-left">E Kosal</td>											
											<td class="t-center">Male</td>
											<td class="t-left">010-789-456</td>
											<td class="t-left">longkosal7@gmail.com</td>
											<td class="t-left">ekosal</td>
											<td class="t-center">pending</td>
											<td class="t-center">view</td>
										</tr>
										<tr>
											<td class="t-center"><input type="checkbox"/></td>
											<td class="t-center">001</td>
											<td class="t-left">E Kosal</td>											
											<td class="t-center">Male</td>
											<td class="t-left">010-789-456</td>
											<td class="t-left">longkosal7@gmail.com</td>
											<td class="t-left">ekosal</td>
											<td class="t-center">pending</td>
											<td class="t-center">view</td>
										</tr>
										<tr>
											<td class="t-center"><input type="checkbox"/></td>
											<td class="t-center">001</td>
											<td class="t-left">E Kosal</td>											
											<td class="t-center">Male</td>
											<td class="t-left">010-789-456</td>
											<td class="t-left">longkosal7@gmail.com</td>
											<td class="t-left">ekosal</td>
											<td class="t-center">pending</td>
											<td class="t-center">view</td>
										</tr>
										<tr>
											<td class="t-center"><input type="checkbox"/></td>
											<td class="t-center">001</td>
											<td class="t-left">E Kosal</td>											
											<td class="t-center">Male</td>
											<td class="t-left">010-789-456</td>
											<td class="t-left">longkosal7@gmail.com</td>
											<td class="t-left">ekosal</td>
											<td class="t-center">pending</td>
											<td class="t-center">view</td>
										</tr>
										<tr>
											<td class="t-center"><input type="checkbox"/></td>
											<td class="t-center">001</td>
											<td class="t-left">E Kosal</td>											
											<td class="t-center">Male</td>
											<td class="t-left">010-789-456</td>
											<td class="t-left">longkosal7@gmail.com</td>
											<td class="t-left">ekosal</td>
											<td class="t-center">pending</td>
											<td class="t-center">view</td>
										</tr>
										<tr>
											<td class="t-center"><input type="checkbox"/></td>
											<td class="t-center">001</td>
											<td class="t-left">E Kosal</td>											
											<td class="t-center">Male</td>
											<td class="t-left">010-789-456</td>
											<td class="t-left">longkosal7@gmail.com</td>
											<td class="t-left">ekosal</td>
											<td class="t-center">pending</td>
											<td class="t-center">view</td>
										</tr>
									</tbody>
								</table>
								
							</div>	
							<div style="clear:both;"></div>
							<div class="row">
								<div class="col-sm-4" style="padding-top:5px;">Showing 1 to 10 of 57 entries</div>
								<div class="col-sm-8">
									<div class="pagination-number">
										<ul class="pagination">
											<li><a><<</a></li>
											<li class="active"><a> 1</a></li>
											<li><a>2</a></li>
											<li><a>3</a></li>
											<li><a>>></a></li>
										</ul>
									</div>
								</div>
							</div>
							<div style="clear:both;"></div>
						</div>
					</div>
				</div>
	</body>
</html>