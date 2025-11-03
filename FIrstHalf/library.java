import java.util.*;
/*
Brendan Lauterborn
726004578
CSCE 111 504
*/
class library {
  public static void main(String[] args) {
    String[] books = {"Gone with the Wind", "To Kill a Mocking Bird", "The Grapes of Wrath"};
    cls();
    for (String book : books ) {
      System.out.print(book + ", ");
    }//end for
    System.out.println("\b\b.");

    for (int i = 0; i < books.length ; i++ ) {
      System.out.println(i+1 + ". " + books[i]);
    }
  }//end main
  public static void cls(){
    try {
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }catch (Exception e) {
    //  System.out.println("This didn't work.");
      System.out.println("\033[H\033[2J");
    }
  }//end cls
}//end class
