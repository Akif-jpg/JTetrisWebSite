if(getLangParam() !="null"&&getLangParam() != null){
	console.log(window.location.href);
	var classList = document.getElementsByClassName("topHref");
	for(var i=0;i<classList.length;i++){

		classList[i].href += "?lang=" + getLangParam();
	
		
		console.log(classList[i].href)
	}
}

function getLangParam(){
	var url = new URL(window.location.toString());
	var lang = url.searchParams.get('lang');
	console.log(lang)
	return lang;
}



