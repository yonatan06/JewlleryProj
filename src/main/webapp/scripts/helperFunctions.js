function setElementAttr(items,arr,attrName){
	items.each(function(index){
		var item = $(this);
		item.attr(attrName,arr[index]);
	});
}

function setImages(images,arr){
	setElementAttr(images, arr, 'src');
}