function handleGetFuelRecords(fuelRecords){
	$.each(fuelRecords, function( index, fuelRecord ) {
		var tableRow = getFuelRecordTableRow(fuelRecord);
		$(".myStatisticsTable table").append(tableRow);
	});
}

function getFuelRecordTableRow(fuelRecord){
	return getTableRow([fuelRecord.amount,fuelRecord.price,fuelRecord.currentKM,fuelRecord.timestamp]);
}


function handleGetMyStatisticsReport(report){
	handleGetFuelRecords(report.fuelRecords);
	var currentKMTableRow = getTableRowWithHeader(["Current car KM:",""+report.currentCarKM]);
	var avarageFuelConsumeTableRow = getTableRowWithHeader(["Avarage fuel comsume:",""+report.avarageFuelConsume+" KM per liter"]);
	var tableContent = currentKMTableRow+avarageFuelConsumeTableRow;
	$(".myStatisticsBoard table").html(tableContent);
}