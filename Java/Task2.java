import java.util.Scanner;
public class Arithmetic2{
public static void main(String... args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter first number: ");
int fistNumber = scanner.nextInt();

System.out.print("Enter second number: ");
int secondNumber = scanner.nextInt();

System.out.print("Enter third number: ");
int thirdNumber = scanner.nextInt();

int sumOfNumbers = fistNumber + secondNumber + thirdNumber;
System.out.println("The sum is: " + sumOfNumbers);

int averageOfNumbers = sumOfNumbers / 3;
System.out.println("The average is: " + averageOfNumbers);

int productOfNumbers = fistNumber * secondNumber * thirdNumber;
System.out.println("The product is: " + productOfNumbers);

int largest = fistNumber;
if (secondNumber > largest) {
	largest = secondNumber;
} 
else if (thirdNumber > largest){ 
largest = thirdNumber;
}
System.out.println("Largest is: " + largest);

int smallest = fistNumber;
if (secondNumber < smallest) {
	smallest = secondNumber;
} 
else if (thirdNumber < smallest){ 
smallest = thirdNumber;
}
System.out.println("Smallest is: " + smallest);




	}
}
