//display options of what to do to the user.
//save the user's response to allow them park their vehicle if there's still space in the parking lot and if there isn't, it would display "space //not available".
//also if the user wants to drive out, he would input the number of his car or the number position of where their car is parked.
//at each time when the lot ids full or free, it will always show the list of the parking lot.




import java.util.Scanner;
import java.util.Arrays;

public class ParkingLot{
static int[] carParkSlots = new int[20]; 

    public static void main(String...args){
boolean function = true;

while(function){
        Scanner input = new Scanner(System.in);
boolean function = true;
while(function){
           System.out.println("""
		1: Park car
		2. Drive out
		3: Show parking lot
		4: Exit

""");
System.out.print("what would you like to do: ");
     int response = scanner.nextInt();
switch (response){

		case 1:
			for(int check = 0; check < carParkSlots.length; check++){
	if(carParkSlots == 0){
addCar();
System.out.println(Arrays.toString(carParkSlots));
	break;
}
		case 2:
			System.out.println("Enter car number: ");
				int driveout = input.nextInt();
			driveOut();
			System.out.println(driveOut(driveout);
		break;

		case 3:
			showParkingLot();
		break;
		case 4:
			function = false;
			System.out.println("Goodbye");
	}
     }



   
public static int addCar(int car){
for(int count = 0; count < carParkSlots.length; count++){
	if(carParkSlots == 0){	
		carParkSlots.add(car);
	}
}
return carParkSlots;

} 


public static String driveOut(int num){

if(carParkSlots.includes(num)){
	carParkSlots.remove(num);
}

}

public static int[] showParkingLot(){
	return carParkSlots;
	}



}      



