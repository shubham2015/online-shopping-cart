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
						<nav aria-label="breadcrumb">
							<ol class="breadcrumb">
								<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
								<li class="breadcrumb-item active">All Products</li>
							</ol>
						</nav>
					</c:if>
					<!-- category keyword with the object is passed on by the pageController -->
					<c:if test="${userClickCategoryProducts == true}">

						<nav aria-label="breadcrumb">
							<ol class="breadcrumb">
								<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
								<li class="breadcrumb-item">Category</li>
								<li class="breadcrumb-item active" aria-current="page">${category.name}</li>
							</ol>
						</nav>
					</c:if>
				</div>

			</div>
		</div>

	</div>