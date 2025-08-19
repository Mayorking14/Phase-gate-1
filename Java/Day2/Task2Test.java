import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class GradeTest{

@Test

public void testToEnterCorrectScore(){


	int firstScore = 20;
	int secondScore = 60;
	int thirdScore = 70;

int average = firstScore + secondScore + thirdScore;
int result = average / 3;

	AssertEquals(result, 50);

}

@Test
public void testToEnsureCorrectGrade(){


	int gadeSum = 150;
	int average = gradeSum / 3;

if (average == 50){
	int result = D;
}

	AssertEquals(result, D);

}

