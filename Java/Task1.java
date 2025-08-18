import java.util.Scanner;
public class Arithmetic1{
public static void main(String... args){

Scanner input = new Scanner(System.in);

System.out.println("Enter an integer: ");
int firstNumber = input.nextInt();

System.out.println("Enter another integer: ");
int secondNumber = input.nextInt();


int squaredFirstNumber = firstNumber * firstNumber;
System.out.println("The square of the first number is: " + squaredFirstNumber);

int squaredSecondNumber = secondNumber * secondNumber;
System.out.println("The square of the second number is: " + squaredSecondNumber);


int sumOfSquares = squaredFirstNumber + squaredSecondNumber;
System.out.println("The sum of squared number is: " + sumOfSquares); 

int squareDifference = squaredFirstNumber - squaredSecondNumber;
System.out.println("The difference of squared number is: " + squareDifference); 



	}




}