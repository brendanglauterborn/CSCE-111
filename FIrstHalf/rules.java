import java.util.*;

class rules {
  public static void main(String[] args) {


        //initializing variables
        ArrayList<String> card = buildset(52);

        List<String> hand1 = new ArrayList<String>();
        List<String> hand2 = new ArrayList<String>();
        List<String> hand3 = new ArrayList<String>();
        List<String> hand4 = new ArrayList<String>();
        List<String> discardPile = new ArrayList<String>();
        List<Integer> players = new ArrayList<Integer>();
        String topCard;

        //Player Order
        players.add(0);
        players.add(1);
        players.add(2);
        players.add(3);
        players = playerOrder(players);
        //System.out.println("This is the player order: ");
        System.out.println("\n" + players);

        //Shuffle deck of cards, deal out 5 to each player
        System.out.println("\nWe will now shuffle the cards...\n\n");
        Collections.shuffle(card);
        System.out.println("Here is the shuffled deck of cards.\n\n" + card);
        deal(card, hand1, hand2, hand3, hand4);
        System.out.println("\n\nDealing the cards...\n\nHere are each of the player's hands:\n");
        System.out.println(hand1);
        System.out.println(hand2);
        System.out.println(hand3);
        System.out.println(hand4);
        System.out.println("\n\nHere's what's left in the deck:\n");
        System.out.println(card);
        discardPile = topCard(card,discardPile);
        topCard = discardPile.get(discardPile.size()-1);
        match(topCard, hand1, discardPile, card);
        //System.out.println(hand1);
        System.out.println(topCard);


        //discard(hand1,discardPile);
        // while () {

        // }// end while

        // switch (players.get(0)) {
        //       case 0:
        //       System.out.println("Player 1 is playing: ");
        //       topCard = match(topCard, hand1, discardPile, card);
        //       break;
        //       case 1:
        //       System.out.println("Player 2 is playing: ");
        //       topCard = match(topCard, hand2, discardPile, card);
        //       break;
        //       case 2:
        //       System.out.println("Player 3 is playing: ");
        //       topCard = match(topCard, hand3, discardPile, card);
        //       break;
        //       case 3:
        //       System.out.println("Player 4 is playing: ");
        //       topCard = match(topCard, hand4, discardPile, card);
        //       break;
        //     } // end switch
        //
        //     switch (players.get(1)) {
        //       case 0:
        //       System.out.println("Player 1 is playing: ");
        //       match(topCard, hand1, discardPile, card);
        //       break;
        //       case 1:
        //       System.out.println("Player 2 is playing: ");
        //       match(topCard, hand2, discardPile, card);
        //       break;
        //       case 2:
        //       System.out.println("Player 3 is playing: ");
        //       match(topCard, hand3, discardPile, card);
        //       break;
        //       case 3:
        //       System.out.println("Player 4 is playing: ");
        //       match(topCard, hand4, discardPile, card);
        //       break;
        //     }
            // switch (players.get(2)) {
            //   case 0:
            //   match(topCard, hand1, discardPile, card);
            //   break;
            //   case 1:
            //   match(topCard, hand2, discardPile, card);
            //   break;
            //   case 2:
            //   match(topCard, hand3, discardPile, card);
            //   break;
            //   case 3:
            //   match(topCard, hand4, discardPile, card);
            //   break;
            // }
            // switch (players.get(3)) {
            //   case 0:
            //   match(topCard, hand1, discardPile, card);
            //   break;
            //   case 1:
            //   match(topCard, hand2, discardPile, card);
            //   break;
            //   case 2:
            //   match(topCard, hand3, discardPile, card);
            //   break;
            //   case 3:
            //   match(topCard, hand4, discardPile, card);
            //   break;
            // }


      }//end main

      //This method puts the deck in order and shows it to the user.
      public static ArrayList<String> buildset(int deck){
        String[] suit = {"S", "C", "H", "D"};
        String[] number = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        ArrayList<String> a = new ArrayList<String>();
        System.out.println("Here is our standard deck of cards!\n");
        for (int i = 0; i < 52 ; i++) {
          a.add(number[i/4] + " " + suit[i%4]);
          System.out.print(a.get(i) + "  ");
          if (i%4 == 3) {
            System.out.println("");
          }//end if
        }//end for
        return a;

      }//end buildset

      public static void deal(List<String> d, List<String> h1,
          List<String> h2, List<String> h3, List<String> h4){
            Collections.shuffle(d);
            for (int i = 0; i < 5 ; i++) {
              h1.add(d.remove(0));
              h2.add(d.remove(0));
              h3.add(d.remove(0));
              h4.add(d.remove(0));
            }
        }//end deal
        //shuffle deck
        public static List<Integer> playerOrder(List<Integer> p) {
          Collections.shuffle(p);
          return p;

        }//end playerOrder

        //flips the top card of the remaining cards and adds it to the discard pile. to start the game
        public static List<String> topCard(List<String> c, List<String> d){
            d.add(c.remove(0));
            System.out.println(d);
            // String topCard = d[d.length-1];
            return d;
        }// end topCard


        public static String match(String topCard, List<String> hand, List<String> discard, List<String> card) {
          int numMatchT = topCard.indexOf(" ");

          String[] parts = topCard.split(" ");
          String numT = parts[0];
          String letterT = parts[1];

          System.out.println("Top card: " + numT + letterT);


          int s = hand.size();

          Boolean checkIfMatch = true;

          while(checkIfMatch == true){
            for (int i = 0; i < hand.size() ;i++ ) {
            //int numMatchH = topCard.indexOf(" ");
            int count = 0;
            String[] partsH = hand.get(i).split(" ");
            String numH = partsH[0];
            String letterH = partsH[1];
            // System.out.print(numH);
            // System.out.println(letterH);

              if ( numH.equals(numT) || letterH.equals(letterT)) {
                checkIfMatch = false;
                System.out.println("Matching card: " + numH + letterH);
                topCard = hand.get(i);
                discard.add(hand.remove(i));
                break;
              }//end if

              else{
                count = count + 1;

              }//end else

              if (count == s) {
                hand.add(card.remove(i));
              }

            }//end for
          } // end while

          System.out.println(hand);
          return topCard;
          // System.out.println(topCard);

if (letterH.equals("K")) {
  hand.add(card.remove(i))
  hand.add(card.remove(i))
  hand.add(card.remove(i))
}
else if (letterH.equals("Q")) {
  hand.add(card.remove(i))
  hand.add(card.remove(i))
}
else if (letterh.equals("J")) {
  hand.add(card.remove(i))
}
else {
  System.out.println("no rules broken");
}


  }
}
