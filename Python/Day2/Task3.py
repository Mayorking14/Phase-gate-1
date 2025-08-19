def get_Likes(Array):
	for index in Array:
if(len(Array) == 0){
	print("no one likes this");
}

	elif(len(Array) == 1){
		print(Array[index], "like this");	
}

	elif(len(Array) == 2){
		print(Array[index] "like this");
	}

	elif(len(Array) > 3){
		print(Array[0], Array[1], Array[2], Array.length - 3 + "others likes this");
}

}

	return Array;

}

input = {'Mike', 'Queen', 'steven'}
print(get_Likes(input))



	