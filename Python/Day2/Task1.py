def get_Age(father_Age, son_Age):

	son_Age_Doubled = son_Age * 2;

	yearsAgo = father_Age - son_Age_Doubled;

	return yearsAgo;



father_Age = int(input("Enter father's age: "))

son_Age = int(input("Enter son's age: "))

yearsAgo = get_Age(father_Age, son_Age)

print(yearsAgo)
