function getAgeYearsAgo(fatherAge, sonAge){
	let sonAgeDoubled = sonAge * 2;

	let yearsAgo = fatherAge - sonAgeDoubled;

return yearsAgo;
}


let fatherAge = 100
let sonAge = 30

console.log(getAgeYearsAgo(fatherAge, sonAge))