function getLikes(Array){


for(int index = 0; index < Array.length; index++){
if(Array.length == 0){
	console.log("no one likes this");
}

else if(Array.length == 1){
	console.log(Array[0], "like this");	
}

else if(Array.length == 2){
	console.log(Array[0], Array[1], "like this");
	}

else if(Array.length > 2){
	console.log(Array[0], Array[1], Array[2], Array.length - 3 + "others likes this");
}

}

return Array;

}

}
