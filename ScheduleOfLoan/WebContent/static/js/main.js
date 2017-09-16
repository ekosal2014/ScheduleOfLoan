$(document).ready(function(){
	alet(12345);
	$(".sidebar-menu>li").click(function(){
		$(this).parent(".sidebar-menu").find("li").removeClass("menu-active");
		$(this).addClass("menu-active");
		var src = $(this).find('a').attr('data');
		alert(src);
		$('#ifr-layout').attr('src',src);
	});
});