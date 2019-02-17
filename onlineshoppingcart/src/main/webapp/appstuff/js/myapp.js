$(function(){
	//Active menu 
	switch(menu){
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'Home':
		$('#home').addClass('active');
		break;
	case 'All Products':
		$('#listProducts').addClass('active');
		break;
	default:
		$('#listProducts').addClass('active');
	    $('#a_'+menu).addClass('active');
	    break;
	}
	/// Jquery dataTable
	
	//Creating a data set
	
	var $table = $('#productListTable');
	if($table.length)
		{
		  var $jsonUrl = '';
		  if(window.categoryId == '')
			  {
			   $jsonUrl =   window.contextRoot + '/json/data/all/products';
			  }
		  else
			  {
			  $jsonUrl = window.contextRoot + '/json/data/category/'+ window.categoryId +'/products';
			  }
		 $table.DataTable({
		 lengthMenu: [[3,5,10,-1],['3 Records','5 Records','10 Records','ALL']],
		  pageLength: 5,
		  data:products
		
		});
		}
});