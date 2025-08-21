import java.util.Scanner;
import java.util.ArrayList;

public class GroceryListManager{

static ArrayList<String> itemList = new ArrayList<String>();

static Scanner scanner = new Scanner(System.in);

public static void main(String... arg){



menu();


}
boolean function = true;
while(function){

public static String menu(){

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
	System.out.println("Input item to add or Exit to go back to menu: ");
	String neededlist = scanner.next();
		itemList.add(neededlist);
	System.out.print(itemList);
	System.out.print("item added succesfully");
		break;
case 2:
	System.out.println("Enter item to remove");
	String removed = scanner.next();
		itemList.remove(removed);
	System.out.print(itemList);
	System.out.print("item removed successfully");
		break;
case 3:
	for(int allItems = 0; allItems < itemList.size(); allItems++){
	System.out.println(itemList.get(allItems));
}
	break;
case 0:
	function = false;
	System.out.println("Goodbye! Thanks for choosing us.");
	break;


}
	}
	return menu();
	}


}
























