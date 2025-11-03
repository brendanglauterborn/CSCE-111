import java.util.*;

class dominoes2 {
  public static void main(String[] args) {
    //initialize variables
    int size = 52;
    ArrayList<String> dominoes = buildset(size);
    ArrayList<String> player1 = new ArrayList<String>();
    ArrayList<String> player2 = new ArrayList<String>();
    ArrayList<String> player3 = new ArrayList<String>();
    ArrayList<String> player4 = new ArrayList<String>();

    System.out.println(dominoes);
    Collections.shuffle(dominoes);
    System.out.println(dominoes);

    deal(dominoes, player1, player2, player3, player4);
    System.out.println(player1);
    System.out.println(player2);
    System.out.println(player3);
    System.out.println(player4);
    System.out.println(dominoes);


  }//end main

  public static void deal(ArrayList<String> d, ArrayList<String> p1,
    ArrayList<String> p2, ArrayList<String> p3, ArrayList<String> p4){
      int size = d.size();
      Collections.shuffle(d);
      for (int i = 0; i < size/4 ; i++) {
        p1.add(d.get(0));
        d.remove(0);
        p2.add(d.get(0));
        d.remove(0);
        p3.add(d.get(0));
        d.remove(0);
        p4.add(d.get(0));
        d.remove(0);
      }//end for
    }//end deal

  public static ArrayList<String> buildset(int s) {
    ArrayList<String> d = new ArrayList<String>();
    for (int i = 0; i <= s; i++ ) {
      for (int j = i; j <= s ; j++ ) {
        d.add(String.format("%d,%d",i, j));
      }//end for
    }//end for
    return d;
  }//end buildset
}//end class
