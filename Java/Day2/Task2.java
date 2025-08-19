import java.util.Scanner;
public class Scores{
public static void main(String... args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter first score: ");
int firstNumber = scanner.nextInt();

System.out.println("Enter second score: ");
int secondNumber = scanner.nextInt();

System.out.println("Enter third score: ");
int thirdNumber = scanner.nextInt();

System.out.println(getGrade(firstNumber, secondNumber, thirdNumber));
	}





public static int getGrade(int firstScore, int secondScore, int thirdScore){
	
	int average = firstScore + secondScore + thirdScore;
average = average / 3;

if (average >= 90 && average <= 100){
	System.out.println("Grade is: A");
	}
else if (average >= 80 && average < 90){
		System.out.println("Grade is: B");
}
else if (average >= 70 && average < 80){
	System.out.println("Grade is: C");
}
else if (average >= 60 && average < 70){
	System.out.print("Grade is: D");
}	
  else{
	System.out.println("F");
	}
	

return average;
}






}