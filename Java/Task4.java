import java.util.Scanner;
public class PositiveOrNegative{
public static void main(String... args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter number: ");
int number = scanner.nextInt();

if (number >= 0){
	System.out.print("Number is positive");
	}
else {

	System.out.print("Number is Negative");

	}
		}
}