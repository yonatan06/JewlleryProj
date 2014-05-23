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

function generateOptions(options) {
    "use strict";
    var i, html;
    html = '<option value="">--Please select one--</option>';
    for (i = 0; i < options.length; i += 1) {
        html += '<option value="' + options[i] + '">'
            + options[i] + '</option>';
    }
    html += '</option>';
    return html;
}

