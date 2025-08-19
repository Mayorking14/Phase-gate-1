public class reversedArray{
public static void main(String... args){


int[] number = {3, 4, 2, 6, 8, 9, 4};

int[] result = isReversed(number);

System.out.print("Reversed is: " + result);

}




public static int[] isReversed(int[] number){
int[] reversed;
for(int index = 0; index < number.length -1; index++){

reversed += number[index];

}
return reversed;
	}

}
