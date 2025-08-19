
public class Likes{
public static void main(String...arg){

String[] input = {"Mike", "Asake"};
	System.out.print(input);


	}




public static String getLikes(String[] Array){

for(int index = 0; index < Array.length; index++){
if(Array.length == 0){
	System.out.println("no one likes this");
}

else if(Array.length == 1){
System.out.println(Array[0], "like this");	
}

else if(Array.length == 2){
System.out.println(Array[0], Array[1], "like this");
	}

else if(Array.length > 2){
System.out.println(Array[0], Array[1], Array[2], Array.length - 3 + "others likes this");
}

}

return Array;

}

}
