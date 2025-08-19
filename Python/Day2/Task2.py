def  get_Grade(first_Score, second_Score, third_Score):

	average = first_Score + second_Score + third_Score;
	average = average / 3;

	if (average >= 90 and average <= 100):
		print("Grade is: A")

	elif(average >= 80 and average < 90):
			print("Grade is: B")

	elif (average >= 70 and average < 80):
			print("Grade is: C")

	elif (average >= 60 and average < 70):
			print("Grade is: D")

	else:
		print("F");

	return average;


firstNumber = 56
secondNumber = 45
thirdNumber = 70

print(get_Grade(firstNumber, secondNumber, thirdNumber))
