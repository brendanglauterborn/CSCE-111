import java.util.*;
/*
Brendan Lauterborn
726004578
CSCE 111 504
*/
class BrendanLauterbornExerciseSix {
  public static void main(String[] args) {

    //initializing variables
    ArrayList<String> card = buildset(52);
    String[] suit = {"Spade", "Club", "Heart", "Diamond"};
    String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    ArrayList<String> userHand = new ArrayList<String>();
    System.out.println("\nWe will now shuffle the cars...\n\n");
    Collections.shuffle(card);
    System.out.println("Here is the shuffled deck of cards.\n\n" + card);
    deal(card,userHand);
    System.out.println(userHand);
  }//end main

  public static ArrayList<String> buildset(int deck){
    String[] suit = {"Spade", "Club", "Heart", "Diamond"};
    String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    ArrayList<String> a = new ArrayList<String>();
    System.out.println("Here is our standard deck of cards!\n");
    for (int i = 0; i < 52 ; i++) {
      a.add(number[i/4] + suit[i%4]);
      System.out.print(a.get(i) + " ");
      if (i%4 == 3) {
        System.out.println("");
      }//end if
    }//end for
    return a;
  }//end buildset

  public static void deal(ArrayList<String> hand, ArrayList<String> p1){
      System.out.println("Here is your hand.");
      int size = hand.size();
      Collections.shuffle(hand);
      for (int i = 0; i < 5 ; i++) {
        p1.add(hand.get(0));
        hand.remove(0);
      }//end for
    }//end deal



}//end class
