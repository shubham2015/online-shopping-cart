$(function(){
	//Active menu 
	switch(menu){
	case 'about':
		$('#about').addClass('active');
		break;
	case 'contact':
		$('#contact').addClass('active');
		break;
	case 'Home':
		$('#home').addClass('active');
		break;
	}
});