import java.util.Random;
/*
Brendan Lauterborn
726004578
CSCE 111 504
*/

class coin {
  public static void main(String[] args) {
    Random r1 = new Random();
    boolean toss;

    toss = r1.nextBoolean();

    if (toss) {
      System.out.println("Heads");
    }
    else {
      System.out.println("Tails");
    }


  }//end main

}//end class
