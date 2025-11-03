import java.util.*;
/*
Brendan Lauterborn
726004578
CSCE 111 504
*/
class library1 {
  public static void main(String[] args) {
    String[] books = {"Gone with the Wind", "To Kill a Mocking Bird", "The Grapes of Wrath"};
    String[] books1 = {"Dragons", "Swords", "Arrows"};
    String[] books2 = {"DataBase", "Operating Systems", "Java Complete"};
    String[] books3 = {"diary", "journal", "ebooks"};
    String[] books4 = {"User Manual", "User Guide", "Installation Guide"};

    String[][] allBooks = {books, books1, books2, books3, books4};
    cls();
    for (String[] cat: allBooks) {
      for (String book : cat ) {
      System.out.print(book + ", ");
    }//end for
    System.out.println("\b\b.");
  }int count = 1;
    for (int i = 0; i < allBooks.length ; i++ ) {
      for (int j = 0; j <allBooks[i].length ; j++ ) {
        System.out.println(count++ + ". " + allBooks[i][j]);
      }
    }

    for (int i = 0; i < allBooks[0].length; i++) {
      System.out.println(allBooks[0][i]+ "\t " + allBooks[1][i] + "\t " + allBooks[2][i]
      + "\t " + allBooks[3][i]+ "\t " + allBooks[4][i]+ "\t ");
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
