public class SumOfArray{
public static void main(String... args){


int[] number = {3, 4, 2, 6, 8, 9, 4};

int result = isSum(number);

System.out.print("Sum is: " + result);

}




public static int isSum(int[] number){

int sum = 0;

for(int index = 0; index < number.length; index++){
	sum += number[index];
		
		}
return sum;
	}


}