function handleGetImages(images){
	var img1 = images[0].path;
	var img2 = images[1].path;
	
	setImages($('img'), [img1,img2]);
}

