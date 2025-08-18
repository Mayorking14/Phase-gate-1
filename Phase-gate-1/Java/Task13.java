public class ArraySecondLargest{
public static void main(String... args){


int[] number = {3, 4, 2, 6, 8, 9, 4};

int[] result = isSecondLargest(number);

System.out.print("second largest is: " + result);

}




public static int[] isSecondLargest(int[] number){

int[] secondLargest;
int largest = number[0];

for(int index = 0; index < number.length; index++){
	if(number[index] > largest) largest = number[index];

if(number[index] < largest && number[index] > number[index]){
	secondLargest = number[index];


}


	}
return secondLargest;

}
}
