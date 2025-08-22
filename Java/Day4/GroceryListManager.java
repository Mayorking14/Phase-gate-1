import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class GroceryListManager{

static ArrayList<String> itemList = new ArrayList<String>();


public static void main(String... args){

Scanner scanner = new Scanner(System.in);
boolean function = true;
while(function){
System.out.println("""

	Welcome to your grocery shopping! choose from the options below what you would like to do.

		1. Add item
		2. Remove item
		3. Show all items
		0. Exit
	""");
System.out.print("what would you like to do: ");
int item = scanner.nextInt();

switch(item){
case 1:
	System.out.println("Add item");
	String neededlist = scanner.next();
	GroceryListManager groceryListManager = new GroceryListManager();
	String screenOutput = groceryListManager.addItem(neededlist);
	System.out.print(screenOutput);
	
		break;



case 2:
	System.out.println("Enter item to remove");
	String removed = scanner.next();
	GroceryListManager groceryListManager1 = new GroceryListManager();

	screenOutput = groceryListManager1.removeItem(removed);
	System.out.print(screenOutput);
	break;

case 3:
	System.out.println(Arrays.toString(displayAllItem()));	
	break;

case 0:
	function = exit();	
	break;
}
}
}

public static String addItem(String item){
	itemList.add(item);
	return "Done";
}


public static String removeItem(String item){
	itemList.remove(item);
	return "item removed successfully";
}

public static String[] displayAllItem(){
	return itemList.toArray(new String[0]);
}

public static boolean exit(){
	return false;
}



}






