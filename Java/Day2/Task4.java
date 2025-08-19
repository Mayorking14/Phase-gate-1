public class Miles{
public static void main(String...arg){



System.out.print(checkMiles());


}


public static boolean checkMiles(){

int carMilesPerGallon = 25;
int gallonsLeft = 2;
int pumpMilesAway = 50;


if(carMilesPerGallon * gallonsLeft >= pumpMilesAway){
	return true;
	}
else {
	return false;
	}

}




}
