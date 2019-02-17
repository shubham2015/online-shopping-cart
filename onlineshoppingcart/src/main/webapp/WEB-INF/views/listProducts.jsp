<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">
	<div class="row">

		<div class="col-md-3">
			<%@include file="./SSI/sidebar.jsp"%>
		</div>

		<div class="col-md-9">
			<!-- BreadCrumb component to get the nav bar in \home\category\product format  on top-->


			<div class="row">




				<div class="col-lg-12">


					<c:if test="${userClickAllProducts == true}">
					<script>
					window.categoryId = '';
					</script>
						<nav aria-label="breadcrumb">
							<ol class="breadcrumb">
								<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
								<li class="breadcrumb-item active">All Products</li>
							</ol>
						</nav>
					</c:if>
					<!-- category keyword with the object is passed on by the pageController -->
					<c:if test="${userClickCategoryProducts == true}">

                           <script>
					window.categoryId = '${category.id}';
					</script>
						<nav aria-label="breadcrumb">
							<ol class="breadcrumb">
								<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
								<li class="breadcrumb-item">Category</li>
								<li class="breadcrumb-item active" aria-current="page">${category.name}</li>
							</ol>
						</nav>
					</c:if>

					<c:if test="${userClickCategoryProducts == true}">
						<script>
							window.categoryId = '${category.id}';
						</script>

						<ol class="breadcrumb">


							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${category.name}</li>


						</ol>
					</c:if>
				</div>

			</div>

			<div class="row">
			
				<div class="col-xs-12">
				
					
					<table id="productListTable" class="table table-striped table-borderd">
					
					
						<thead>
						
							<tr>
								<th></th>
								<th  id = "some">Name</th>
								<th>Brand</th>
								<th>Price</th>
								<th>Qty. Available</th>
								<th></th>
							
							</tr>
						
						</thead>
					

						<tfoot>
						
							<tr>
								<th></th>
								<th>Name</th>
								<th>Brand</th>
								<th>Price</th>
								<th>Qty. Available</th>
								<th></th>
							
							</tr>
						
						</tfoot>
					</table>
				
				</div>
			
			</div>


		</div>



	</div>
<!-- <script src ="${js}/myapp.js"></script>-->

</div>
