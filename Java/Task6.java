public class ArrayLargest{
public static void main(String... args){


int[] number = {3, 4, 2, 6, 8, 9, 4};

int result = isLargest(number);

System.out.print("Largest is: " + result);

}




public static int isLargest(int[] number){

int largest = number[0];

for(int index = 1; index < number.length; index++){

		if(number[index] > largest) largest = number[index];


		}

return largest;
	}


}