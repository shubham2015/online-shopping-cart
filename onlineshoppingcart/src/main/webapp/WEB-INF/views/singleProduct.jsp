<div class = "container">
<div class = "row">
<div class = "col-xs-12">
<ol class="breadcrumb">
<li> <a href ="${contextRoot}/home"> Home </a></li>
<li> <a href = "${contextRoot}/show/all/products">All Products</a></li>
<li class = "active">${product.name}</li>
</ol>
</div>

</div>

<div class ="row">

<!-- Image Display -->
<div class = "col-xs-12 col-sm-4">


<div class = "thumbnail">
<img src = "${images}/${product.name}.jpg" class = "img img-responsive"/>
</div>

</div>
<!-- Description -->
<div class = "col-xs-12 col-sm-8">
<h3>${product.name}</h3>
<hr/>
<p>${product.description}</p>
<hr/>
<h4>Price: <strong> &#36; ${product.unitPrice} </strong></h4>
<hr/>


<c:choose>

<c:when test="${product.quantity <1 }">
<h6> Available: <span color="red" >Out of Stock</span></h6>
</c:when>
<c:otherwise>
<h6> Available: ${product.quantity }</h6>
</c:otherwise>
</c:choose>
<c:choose>

<c:when test="${product.quantity <1 }">
<a href = "javascript:void(0)" class ="btn btn-success disabled">Add To Cart</a>


</c:when>
<c:otherwise>
<a href = "${contextRoot}/cart/add/${product.views}/product" class ="btn btn-success">Add To Cart</a>

</c:otherwise>
</c:choose>
<a href = "${contextRoot}/show/all/products" class ="btn btn-success">Back</a>

</div></div>
</div>