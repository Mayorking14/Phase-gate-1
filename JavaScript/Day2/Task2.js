function get_Grade(firstScore, secondScore, thirdScore){
	
	let average = firstScore + secondScore + thirdScore;
average = average / 3;

if (average >= 90 && average <= 100){
	console.log("Grade is: A");
	}
else if (average >= 80 && average < 90){
		console.log("Grade is: B");
}
else if (average >= 70 && average < 80){
	console,log("Grade is: C");
}
else if (average >= 60 && average < 70){
	console.log("Grade is: D");
}	
  else{
	console.log("F");
	}
	

return average;
}

let firstNumber = 45
let secondNumber = 70
let thirdNumber = 30

console.log(get_Grade(firstNumber, secondNumber, thirdNumber))


