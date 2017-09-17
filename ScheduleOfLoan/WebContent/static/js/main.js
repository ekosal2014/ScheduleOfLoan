$(document).ready(function(){
	$(".sidebar-menu>li").click(function(){
		$(this).parent(".sidebar-menu").find("li").removeClass("menu-active");
		$(this).addClass("menu-active");
		var src = $(this).find('a').attr('data');
		$('#ifr-layout').attr('src',src);
	});
	$('.navbar-right>li>a').click(function(){
		$(this).parents('.navbar-right').find('ul').hide();
		$(this).parent('li').find('ul').toggle();
	});
	 $(document).click(function(e){
        if(!$(e.target).closest('.navbar-right>li>a, .dropdown-menu').length){
            $(".dropdown-menu").hide();
        }
    });
});
function resizeIframe(obj){
	console.log(obj.contentWindow.document.body.offsetHeight + 'px');
	 obj.style.height = obj.contentWindow.document.body.offsetHeight  + 'px'; 
	// obj.style.height = obj.contentWindow.document.body.scrollHeight + 'px'; 
}