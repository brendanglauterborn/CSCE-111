import java.util.*;
/*
Brendan Lauterborn
726004578
CSCE 111 504
*/

class shoppingList {
  public static void main(String[] args) {
    ArrayList<String> myList = new ArrayList<String>();
    Scanner input = new Scanner(System.in);
    String nextItem;

    System.out.println("Welcome to the shopping list program.");
    System.out.print("Enter an item to add to the list:(or q to quit.) ");
    nextItem = input.nextLine();
    while (!nextItem.equals("q")) {
      myList.add(nextItem);
      System.out.print("Enter the next item to add to the list:(or q to quit.)");
      nextItem = input.nextLine();
    }
    System.out.println();
    System.out.println(myList);
    System.out.println("You have " + myList.size() + " items.");

    for (String item : myList ) {
      System.out.println(item);
    System.out.println("Your list is\n" + myList);
    System.out.println("type one that you want to remove");
    nextItem = input.nextLine();
    myList.remove(nextItem);
    System.out.println(myList);
    System.out.println(myList.size());
    int i = 1;
    for (String item : myList) {
      System.out.println(i++ +". " + item);
    }
    }

  }
}
