import java.util.*;
/*
Brendan Lauterborn
726004578
CSCE 111 504
*/

class notepad {
  public static void main(String[] args) {
    cls();
    for (int i = 0; i < 4 ; i++ ) {
      myNotepad();
    }
    myNotepad();
  }//end main

  public static void myNotepad(){
    try {
      new ProcessBuilder("cmd", "/c", "notepad.exe").inheritIO().start().waitFor();
    }catch (Exception e) {
    //  System.out.println("This didn't work.");
      System.out.println("\033[H\033[2J");
    }
  }//end myNotepad

  public static void cls(){
    try {
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }catch (Exception e) {
    //  System.out.println("This didn't work.");
      System.out.println("\033[H\033[2J");
    }
  }//end cls
}//end class
