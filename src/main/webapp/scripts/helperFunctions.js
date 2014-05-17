function setElementAttr(items,arr,attrName){
	items.each(function(index){
		var item = $(this);
		item.attr(attrName,arr[index]);
	});
}

function setImages(images,arr){
	setElementAttr(images, arr, 'src');
}

function getTableRow(arr){
	var tableRow = "<tr>";
	$.each(arr, function( index, value ) {
		tableRow += "<td>"+value+"</td>";
	});
	tableRow += "</tr>";
	return tableRow;
}

function getTableRowWithHeader(arr){
	var x = 0;
	var tableRow = "<tr>";
	$.each(arr, function( index, value ) {
		if(x==0){
			tableRow += "<th>"+value+"</th>";
			x=1;
		}
		else{
			tableRow += "<td>"+value+"</td>";
		}
	});
	tableRow += "</tr>";
	return tableRow;	
}

function generateOptions(options){
	var html = '<option value="">--Please select one--</option>';
	var len = options.length;
	for (var i = 0; i < len; i++) {
		html += '<option value="' + options[i].desc + '">'
				+ options[i].desc + '</option>';
	}
	html += '</option>';
	return html;
}

