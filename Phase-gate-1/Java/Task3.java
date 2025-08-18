import java.util.Scanner;
public class Divisible{
public static void main(String... args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter number: ");
int number = scanner.nextInt();

if(number % 3 == 0){
	System.out.print("It's divisible by 3");
   }
else{
System.out.print("It's not divisible by 3");

	}



	}
}