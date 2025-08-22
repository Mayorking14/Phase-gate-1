//display options of what to do to the user.
//save the user's response to allow them park their vehicle if there's still space in the parking lot and if there isn't, it would display "space //not available".
//also if the user wants to drive out, he would input the number of his car or the number position of where their car is parked.
//at each time when the lot ids full or free, it will always show the list of the parking lot.








let parkingSpace = [];

function checkSpace(input) {
for(let index = 0; index < parkingSpace.length; index++){
	if(parkingSpace[index] == 0){
parkingSpace[index].push(input)
}
}
return "car packed";
	}


function driveOut(car){
if (car in parkingSpace){
car.remove(car)
}
return "space free";
}


function parkingSpaceList(){

return parkingSpace;
}




function main() {
	let function = true;

while (function) {
const prompt = require('prompt-sync')();

let choice = prompt(`
	1. Park car
	2. Drive out
	3. Show parking lot
	0. Exit

What would you like to do?
`);

switch (choice) {

	case 1:
		let carNumber = prompt("Enter car Number to park: ")
			console.log(checkSpace(carNumber))
			break;
	case 2:
		let driveout = prompt("Enter car Number to Drive out: ")
			console.log(driveOut(driveout))	
			break;

	case 3:
		parkingSpaceList();
			break;

	case 0:
		function = false;
		console.log("Good bye!")	
	}






}




}
main()



