var pagination;
if (!pagination) pagination = {};
if (!pagination.showPage){
	pagination.showPage = {};
	pagination.goPage   = {};
	var item = {};
	pagination = {
		total : 10,
		maxVisible : 5,
		perPage : 10,
		currentPage : 1,
		numPage : 1,
		nextClass:'next',
		prevClass:'prev',
		lastClass:'last',
		firstClass:'first',
		activeClass:'active',
		disabledClass:'disabled',
		first :'←',
		last:'→',
		next:'»',
		prev:'«',
		wrapClass:'pagination',
		eventLink:''
	};
}
pagination.showPage = function(option){
	this.item        = option;
	this.total       = this.item.total;
	this.maxVisible  = this.item.maxVisible;
	this.perPage     = this.item.perPage;
	this.currentPage = this.item.currentPage;
	this.eventLink   = this.item.eventLink;
	this.numPage     = Math.ceil(this.total / this.perPage);
	if (typeof first != 'undefined') {
		this.first = this.item.first;
	}
	if (typeof last != 'undefined') {
		this.last = this.item.last;
	}
	if (typeof next != 'undefined') {
		this.next = this.item.next;
	}
	if (typeof prev != 'undefined') {
		this.prev = this.item.prev;
	}
	if (typeof wrapClass != 'undefined') {
		this.wrapClass = this.item.wrapClass;
	}
	var start= ((Math.ceil(this.currentPage / this.maxVisible) * this.maxVisible) - this.maxVisible)+1;
	var end  = (Math.ceil(this.currentPage / this.maxVisible) * this.maxVisible);
	if (end > this.numPage){ end = this.numPage; }
	var page = '<li data-lp="1"><a onClick="'+this.eventLink+'(1)">'+this.first+'</a></li>';
	if (this.currentPage < 3){
		page += '<li data-lp="1"><a onClick="'+this.eventLink+'(1)">'+this.prev+'</a></li>';
	}else{
		page += '<li data-lp="'+(this.currentPage - 1)+'"><a onClick="'+this.eventLink+'('+(this.currentPage - 1)+')">«</a></li>';
	}
	for(var i = start; i <= end; i++){		
		if (i==this.currentPage){
			page += '<li data-lp="'+i+'" class="'+this.activeClass+'"><a onClick="'+this.eventLink+'('+i+')">'+i+'</a></li>';
		}else{
			page += '<li data-lp="'+i+'"><a onClick="'+this.eventLink+'('+i+')">'+i+'</a></li>';
		}
		
	}
	if ((end+1) > this.numPage) {
		page += '<li data-lp="'+end+'"><a onClick="'+this.eventLink+'('+end+')">'+this.next+'</a></li>';
	}else{
		page += '<li data-lp="'+(end+1)+'"><a onClick="'+this.eventLink+'('+(end+1)+')">'+this.next+'</a></li>';
	}	
	page += '<li data-lp="'+this.numPage+'"><a onClick="'+this.eventLink+'('+(this.numPage)+')">'+this.last+'</a></li>';
	$('.'+this.wrapClass).empty();
	$('.'+this.wrapClass).append(page);
}

