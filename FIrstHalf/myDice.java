import java.util.Scanner;
/*
Brendan Lauterborn
726004578
CSCE 111 504
*/

class myDice {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int min = 1;
    int max = 6;
    int range = max - min + 1;

    System.out.println("how many dice do you want to roll? ");
    int rolls = input.nextInt();
    for (int i = 0; i < rolls ; i++ ) {
      System.out.print((int)(Math.random() * range + min) + " ");
    }//end for


    //System.out.println("\n\n you rolled a: " + (int)guess);
  }//end main

}//end class
