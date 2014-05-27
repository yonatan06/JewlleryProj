
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

function getSelectedCarBrandOnSignUp(){
	return $('#carBrands').val();
}

function handleGetCarModelsOnSignUp(carModels,textStatus){
	$('#carModels').html(generateOptions(carModels));
}

function handleGetCarBrandsOnSignUp(carModels){
	$('#carBrands').html(generateOptions(carModels,'Select Car Brand'));
}

function fillCarYearFormSelect(){
	var years,i,startYear,endYear;
	startYear = 1960;
	endYear = 2014;
	years = [];
    for (i = endYear; i >= startYear; i -= 1) {
    	years[endYear-i] = i;
    }
	$('#carYear').html(generateOptions(years,'Select Car Year'));
}

function fillCarColorFormSelect(){
	var colors = ['black','white','silver','gold','cyan','blue','brown','gray','green','orange','pink','purple','red','yellow'];
	$('#carColor').html(generateOptions(colors,'Select Car Color'));
}

