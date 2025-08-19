public class ArraySmallest{
public static void main(String... args){


int[] number = {3, 4, 2, 6, 8, 9, 4};

int result = isSmallest(number);

System.out.print("Smallest is: " + result);

}




public static int isSmallest(int[] number){

int smallest = number[0];

for(int index = 1; index < number.length; index++){

		if(number[index] < smallest) smallest = number[index];


		}

return smallest;
	}


}