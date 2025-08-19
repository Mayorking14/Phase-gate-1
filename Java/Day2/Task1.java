import java.util.Scanner;
public class Age{

public static void main(String...arg){
Scanner scanner = new Scanner(System.in);	

System.out.print("Enter father's age: ");
int ageOfFather = scanner.nextInt();

System.out.print("Enter son's age: ");
int ageOfSon = scanner.nextInt();

int yearsAgo = getAgeDifference(ageOfFather, ageOfSon);

System.out.print("The father was twice the age of the son at years ago: " + yearsAgo);
	}

public static int getAgeDifference(int fatherAge, int sonAge){

int sonAgeDoubled = sonAge * 2;

	int yearsAgo = fatherAge - sonAgeDoubled;

return yearsAgo;

	}
}