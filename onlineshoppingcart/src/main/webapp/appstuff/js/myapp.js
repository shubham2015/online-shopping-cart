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
		console.log('inside this id')
		  var jsonUrl = '';
		  if(window.categoryId == '')
			  {
			   jsonUrl = window.contextRoot + '/json/data/all/products';
			  }
		  else
			  {
			  jsonUrl = window.contextRoot + '/json/data/category/'+ window.categoryId +'/products';
			  }
		  //console.log(jsonUrl)
		  $.ajaxSetup({
			  cache:false
			});
		  $table.DataTable({
		  lengthMenu: [[3,5,10,-1],['3 Records','5 Records','10 Records','ALL']],
		  pageLength: 5,
		  ajax:{
			 cache:false, 
	    	 url: jsonUrl,
	    	 dataSrc:''
	     },
	     columns: [
	    	 {
					data : 'name',
					bSortable : false,
					mRender : function(data, type, row) {

						return '<img src="' + window.contextRoot
								+ '/resources/images/' + data
								+ '.jpg" class="dataTableImg"/>';

					}
				},
	    	 
	    	 {
	    		 data: 'name'
	         },
	    	 {
	    		 data: 'brand'
	    	 },
	    	 {
	    		data: 'unitPrice',
	    			mRender : function(data, type, row) {
						return '&#8377; ' + data
					}
	    	 },
	    	 {
	    		 data: 'quantity',
	    		 mRender : function(data, type, row) {

						if (data < 1) {
							return '<span style="color:red">Out of Stock!</span>';
						}

						return data;

					}
	    	 },
	    	 {
	    		 data:'views',
	    		 mRender: function(data,type,row)
	    		 {
	    			 var str='';
	    			
	    			 str += '<a href="'+window.contextRoot+ '/show/'+data+'/product" class="btn btn-info btn-lg">View</a> &#160';
	    			 if(row.quantity < 1)
	    				 
	    				 {
	    				 str += '<a href="javascript:void(0)" class="btn btn-info btn-lg disabled">Add To Cart</a>';
	    				 }
	    			 else{ 
	    			 str += '<a href="'+window.contextRoot+ '/cart/add/'+data+'/product" class="btn btn-info btn-lg">Add To Cart</a>';
	    			 }
                      return str;
	    		 }
	    	 },
	    	
	    	 
	    	],
	    	 cache:false
		});
		  $.ajaxSetup({
			  cache:false
			});
		}
});
		
