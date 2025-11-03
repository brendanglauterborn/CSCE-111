import java.util.*;
/*
Team Alien Out (Group 1)
Brendan Lauterborn 726004578
Davis Henley       326009127
Bryana Moya        227000596
Heidi Riddle       526009932
Michael Ajibola    826005740
CSCE 111 504
Rules:
1. If you are forced to play a KING, you must draw one card.
2. If you are forced to play a QUEEN, you must draw one card.
3. If you are forced to play a JACK, you must draw one card.
4. If you play the Ace of Diamonds, the player makes everyone else draw one card from the deck
5. If you play the Ace of Hearts, the player makes everyone else draw one cards from the deck.
6. If you play the Ace of Clubs , the player makes everyone else draw three one card from the deck.
7. If you play the Ace of Spades, the player makes everyone else draw one card from the deck.
*/
class rules {
  public static void main(String[] args) throws InterruptedException{
        //Initializing variables
        ArrayList<String> card = buildset(52);
        List<String> hand1 = new ArrayList<String>();
        List<String> hand2 = new ArrayList<String>();
        List<String> hand3 = new ArrayList<String>();
        List<String> hand4 = new ArrayList<String>();
        List<String> discardPile = new ArrayList<String>();
        List<Integer> players = new ArrayList<Integer>();
        String topCard;
        String answer = "";
        String answer2 = "";
        Scanner input = new Scanner(System.in);
        String userInput = "";
        String player;
        String playerCard;

        //Player Order
        players.add(1);
        players.add(2);
        players.add(3);
        players.add(4);
        players = playerOrder(players);

        clear();
        intro();

        //the user can quit the game if they want
        while (!answer.equals("q")) {
          System.out.println("\nEnter to continue,'q' to quit");
          answer = input.nextLine();
          if (answer.equals("q")) {
            break;
          }// end if

          clear();//this method clears screen
          shuffle(card);//this method shuffles the cards
          deal(card, hand1, hand2, hand3, hand4);//method to deal cards
          System.out.println("\n\nDealing the cards...\n\nHere are each of the player's hands:\n");
          Thread.sleep(1000);
          System.out.println(hand1);
          Thread.sleep(1000);
          System.out.println(hand2);
          Thread.sleep(1000);
          System.out.println(hand3);
          Thread.sleep(1000);
          System.out.println(hand4);
          Thread.sleep(3000);
          System.out.println("\n\nHere's what's left in the deck:\n");
          System.out.println(card);
          discardPile = topCard(card,discardPile);
          topCard = discardPile.get(discardPile.size()-1);

          System.out.println("Enter to continue,'q' to quit");
          answer = input.nextLine();
          if (answer.equals("q")) {
            break;
          }// end if

          clear();
          System.out.println("Here is the order of the players: " + players);
          while (!userInput.equals("q")) {

          for (int i = 0; i < 4; i++ ) {

            switch (players.get(i)) {
                  case 1:
                  player = "Player 1";
                  topCard = user(topCard, hand1, discardPile, card, hand2, hand3, hand4);
                  Thread.sleep(1000);
                  break;
                  case 2:
                  player = "Player 2";
                  topCard = match(player, topCard, hand2, discardPile, card, hand1, hand3, hand4);
                  Thread.sleep(1000);
                  break;
                  case 3:
                  player = "Player 3";
                  topCard = match(player, topCard, hand3, discardPile, card, hand1, hand2, hand4);
                  Thread.sleep(1000);
                  break;
                  case 4:
                  player = "Player 4";
                  topCard = match(player, topCard, hand4, discardPile, card, hand1, hand2, hand3);
                  Thread.sleep(1000);
                  break;
                } // end switch
                if (card.size() == 0) {
                  reloadDeck(card, discardPile);
                }// end if
          }// end for

          if (hand1.size() == 0) {
            System.out.println("Congratulations Player 1, you've won! ");
            break;
          }
          if (hand2.size() == 0) {
            System.out.println("Congratulations Player 2, you've won! ");
            break;
          }
          if (hand3.size() == 0) {
            System.out.println("Congratulations Player 3, you've won! ");
            break;
          }
          if (hand4.size() == 0) {
            System.out.println("Congratulations Player 4, you've won! ");
            break;
          }

          System.out.println("Enter to continue to the next round, or to quit press 'q' ");
          userInput = input.nextLine();
        }//end while to quit
      }// end while
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

      //dealing method
      public static void deal(List<String> d, List<String> h1,
          List<String> h2, List<String> h3, List<String> h4){
            Collections.shuffle(d);
            for (int i = 0; i < 5 ; i++) {
              h1.add(d.remove(0));
              h2.add(d.remove(0));
              h3.add(d.remove(0));
              h4.add(d.remove(0));
            }// end for
        }//end deal

      public static List<Integer> playerOrder(List<Integer> p) {
          Collections.shuffle(p);
          return p;
        }//end playerOrder

        //flips the top card of the remaining cards and adds it to the discard pile. to start the game
      public static List<String> topCard(List<String> c, List<String> d){
          d.add(c.remove(0));
          return d;
      }// end topCard

      public static List<String> reloadDeck(List<String> c, List<String> d){
        while (d.size() != 1) {
          c.add(d.remove(d.size()-1));
        }
          return c;
      }// end topCard

      // this method allows the user to choose the card to play
      public static String user(String topCard, List<String> hand1, List<String> discard, List<String> deck, List<String> hand2, List<String> hand3, List<String> hand4){

        Scanner input = new Scanner(System.in);
        int numMatchT = topCard.indexOf(" ");
        String[] parts = topCard.split(" ");
        String numT = parts[0];
        String letterT = parts[1];
        String playerCard;

        System.out.println("\nTop card: " + numT + letterT);

        System.out.println("Here is your hand:");
        System.out.println(hand1);
        System.out.println("Which card would you like to play for " + topCard);
        System.out.println("Please enter your card in the format '# L'");
        System.out.println("If you would like to draw a card, type 'DRAW'");
        Boolean checkIfMatch = true;
        // int n = 0;

        //Repeats loop if checkIfMatch is true
        //The following while loop is the main code where the user plays the game
        while (checkIfMatch == true) {
          System.out.println("Play a card.");
          playerCard = input.nextLine();
          playerCard = playerCard.toUpperCase();
          System.out.println(playerCard);
          //Checks if card is valid to play
        if (playerCard.charAt(0) == (topCard.charAt(0)) || playerCard.charAt(2) == (topCard.charAt(2))){
          checkIfMatch = false;
          topCard = playerCard;
          discard.add(hand1.remove(hand1.indexOf(playerCard)));
        }//end if

          //Checks if card is valid to play if user card is a 10
        else if(playerCard.equals("10 D") || playerCard.equals("10 C") || playerCard.equals("10 H") || playerCard.equals("10 S")){
          if (topCard.charAt(2) == playerCard.charAt(3)) {
          checkIfMatch = false;
          topCard = playerCard;
          discard.add(hand1.remove(hand1.indexOf(playerCard)));
          }//end if
        }// end else if

          //Checks if card is valid if topCard is a 10
        else if(topCard.equals("10 D") || topCard.equals("10 C") || topCard.equals("10 H") || topCard.equals("10 S")){
          if (topCard.charAt(3) == playerCard.charAt(2)) {
          checkIfMatch = false;
          topCard = playerCard;
          discard.add(hand1.remove(hand1.indexOf(playerCard)));
          }//end if
        }// end else if

        //adds a card to the user's hand if they have no card to play
        if(playerCard.equals("DRAW")){
          checkIfMatch = false;
          hand1.add(deck.remove(0));
          System.out.println("You drew a card.");
        }//end if

          //Rule for player drawing a card if a King is played
        if (playerCard.equals("K D") || playerCard.equals("K H") || playerCard.equals("K S") || playerCard.equals("K C")) {
          System.out.println("Now drawing 1 card for playing a King.");
          hand1.add(deck.remove(0));
        }// end if
          //Rule for player drawing a card if a Queen is played
        else if (playerCard.equals("Q D") || playerCard.equals("Q H") || playerCard.equals("Q S") || playerCard.equals("Q C")) {
          System.out.println("Now drawing 1 card for playing a Queen.");
          hand1.add(deck.remove(0));
        }// end else if
          //Rule for player drawing a card if a Jack is played
        else if (playerCard.equals("J D") || playerCard.equals("J H") || playerCard.equals("J S") || playerCard.equals("J C")) {
          System.out.println("Now drawing 1 card for playing a Jack.");
          hand1.add(deck.remove(0));
        }// end else if
          //Rule for player drawing a card if an Ace is played
        else if(playerCard.equals("A D") || playerCard.equals("A H") || playerCard.equals("A S") || playerCard.equals("A C")){
          System.out.println("Other players draw one card each.");
          hand2.add(deck.remove(0));
          hand3.add(deck.remove(0));
          hand4.add(deck.remove(0));
        }// end else if

        //reloads the deck with discard cards
        if (deck.size() == 0){
          Collections.shuffle(discard);
          deck = discard;
        }// end if

    }//end while
      return topCard;
    }//end user

      // this method allows for the match to continue and players to continue playing
      public static String match(String player, String topCard, List<String> hand, List<String> discard, List<String> card, List<String> oHand1,List<String> oHand2,List<String> oHand3) {
          int numMatchT = topCard.indexOf(" ");
          String[] parts = topCard.split(" ");
          String numT = parts[0];
          String letterT = parts[1];

          System.out.println("\nTop card: " + numT + letterT);
          int s = hand.size();
          Boolean checkIfMatch = true;

          while(checkIfMatch == true){
            int count = 0;
            for (int i = 0; i < hand.size() ;i++ ) {
              String[] partsH = hand.get(i).split(" ");
              String numH = partsH[0];
              String letterH = partsH[1];

            if (numH.equals(numT) || letterH.equals(letterT)) {
              checkIfMatch = false;
              System.out.println(player + " is now playing their " + numH + letterH);

            //these are the rules being implemented
            if (numH.equals("K")) {
              System.out.println("Now drawing 1 card for playing a King.");
              hand.add(card.remove(i));
            }// end if

            else if (numH.equals("Q")) {
              System.out.println("Now drawing 1 card for playing a Queen.");
              hand.add(card.remove(i));
            }// end else if

            else if (numH.equals("J")) {
              System.out.println("Now drawing 1 card for playing a Jack.");
              hand.add(card.remove(i));
            }// end else if

            else if(numH.equals("A") && letterH.equals("D")){
              System.out.println("Other players draw one card each.");
              oHand1.add(card.remove(i));
              oHand2.add(card.remove(i));
              oHand3.add(card.remove(i));
            }// end else if

            else if (numH.equals("A") && letterH.equals("H")) {
              System.out.println("Other players draw one card each.");
              oHand1.add(card.remove(i));
              oHand2.add(card.remove(i));
              oHand3.add(card.remove(i));
            }// end else if

            else if(numH.equals("A") && letterH.equals("C")){
              System.out.println("Other players draw one card each.");
              oHand1.add(card.remove(i));
              oHand2.add(card.remove(i));
              oHand3.add(card.remove(i));
            }// end else if

            else if(numH.equals("A") && letterH.equals("S")){
              System.out.println("Other players draw one card each.");
              oHand1.add(card.remove(i));
              oHand2.add(card.remove(i));
              oHand3.add(card.remove(i));
            }// end else if

            else {
              System.out.println("no rules broken");
            } // end else

              topCard = hand.get(i);
              discard.add(hand.remove(i));
              break;
            }//end if

            else{
                checkIfMatch = false;
                count = count + 1;
            }//end else
            }//end for

            if (count == s) {
              System.out.println(player + " is having to draw a card.");
              hand.add(card.remove(0));
            }// end if
          } // end while

          // Davis Henley did lines 370 - 638
          String Hearts2;
          String Hearts3;
          String Hearts4;
          String Hearts5;
          String Hearts6;
          String Hearts7;
          String Hearts8;
          String Hearts9;
          String Hearts10;
          String Hearts11;
          String Hearts12;
          String Hearts13;
          String Hearts14;
          String Spades2;
          String Spades3;
          String Spades4;
          String Spades5;
          String Spades6;
          String Spades7;
          String Spades8;
          String Spades9;
          String Spades10;
          String Spades11;
          String Spades12;
          String Spades13;
          String Spades14;
          String Clubs2;
          String Clubs3;
          String Clubs4;
          String Clubs5;
          String Clubs6;
          String Clubs7;
          String Clubs8;
          String Clubs9;
          String Clubs10;
          String Clubs11;
          String Clubs12;
          String Clubs13;
          String Clubs14;
          String Diamonds2;
          String Diamonds3;
          String Diamonds4;
          String Diamonds5;
          String Diamonds6;
          String Diamonds7;
          String Diamonds8;
          String Diamonds9;
          String Diamonds10;
          String Diamonds11;
          String Diamonds12;
          String Diamonds13;
          String Diamonds14;

          //  public static void buildDeck();
          Hearts2 = "---------------\n| 2           |\n|             |\n|     ^ ^     |\n|     \\ /     |\n|             |\n|           2 |\n---------------";
          Hearts3 = "---------------\n| 3           |\n|             |\n|     ^ ^     |\n|     \\ /     |\n|             |\n|           3 |\n---------------";
          Hearts4 = "---------------\n| 4           |\n|             |\n|     ^ ^     |\n|     \\ /     |\n|             |\n|           4 |\n---------------";
          Hearts5 = "---------------\n| 5           |\n|             |\n|     ^ ^     |\n|     \\ /     |\n|             |\n|           5 |\n---------------";
          Hearts6 = "---------------\n| 6           |\n|             |\n|     ^ ^     |\n|     \\ /     |\n|             |\n|           6 |\n---------------";
          Hearts7 = "---------------\n| 7           |\n|             |\n|     ^ ^     |\n|     \\ /     |\n|             |\n|           7 |\n---------------";
          Hearts8 = "---------------\n| 8           |\n|             |\n|     ^ ^     |\n|     \\ /     |\n|             |\n|           8 |\n---------------";
          Hearts9 = "---------------\n| 9           |\n|             |\n|     ^ ^     |\n|     \\ /     |\n|             |\n|           9 |\n---------------";
          Hearts10 = "---------------\n| 10          |\n|             |\n|     ^ ^     |\n|     \\ /     |\n|             |\n|          10 |\n---------------";
          Hearts11 = "---------------\n| J           |\n|             |\n|     ^ ^     |\n|     \\ /     |\n|             |\n|           J |\n---------------";
          Hearts12 = "---------------\n| Q           |\n|             |\n|     ^ ^     |\n|     \\ /     |\n|             |\n|           Q |\n---------------";
          Hearts13 = "---------------\n| K           |\n|             |\n|     ^ ^     |\n|     \\ /     |\n|             |\n|           K |\n---------------";
          Hearts14 = "---------------\n| A           |\n|             |\n|     ^ ^     |\n|     \\ /     |\n|             |\n|           A |\n---------------";

          Spades2 = "---------------\n| 2           |\n|             |\n|     / \\     |\n|     \\ /     |\n|      |      |\n|           2 |\n---------------";
          Spades3 = "---------------\n| 3           |\n|             |\n|     / \\     |\n|     \\ /     |\n|      |      |\n|           3 |\n---------------";
          Spades4 = "---------------\n| 4           |\n|             |\n|     / \\     |\n|     \\ /     |\n|      |      |\n|           4 |\n---------------";
          Spades5 = "---------------\n| 5           |\n|             |\n|     / \\     |\n|     \\ /     |\n|      |      |\n|           5 |\n---------------";
          Spades6 = "---------------\n| 6           |\n|             |\n|     / \\     |\n|     \\ /     |\n|      |      |\n|           6 |\n---------------";
          Spades7 = "---------------\n| 7           |\n|             |\n|     / \\     |\n|     \\ /     |\n|      |      |\n|           7 |\n---------------";
          Spades8 = "---------------\n| 8           |\n|             |\n|     / \\     |\n|     \\ /     |\n|      |      |\n|           8 |\n---------------";
          Spades9 = "---------------\n| 9           |\n|             |\n|     / \\     |\n|     \\ /     |\n|      |      |\n|           9 |\n---------------";
          Spades10 = "---------------\n| 10          |\n|             |\n|     / \\     |\n|     \\ /     |\n|      |      |\n|          10 |\n---------------";
          Spades11 = "---------------\n| J           |\n|             |\n|     / \\     |\n|     \\ /     |\n|      |      |\n|           J |\n---------------";
          Spades12 = "---------------\n| Q           |\n|             |\n|     / \\     |\n|     \\ /     |\n|      |      |\n|           Q |\n---------------";
          Spades13 = "---------------\n| K           |\n|             |\n|     / \\     |\n|     \\ /     |\n|      |      |\n|           K |\n---------------";
          Spades14 = "---------------\n| A           |\n|             |\n|     / \\     |\n|     \\ /     |\n|      |      |\n|           A |\n---------------";

          Clubs2 = "---------------\n| 2           |\n|             |\n|      o      |\n|     o o     |\n|      |      |\n|           2 |\n---------------";
          Clubs3 = "---------------\n| 3           |\n|             |\n|      o      |\n|     o o     |\n|      |      |\n|           3 |\n---------------";
          Clubs4 = "---------------\n| 4           |\n|             |\n|      o      |\n|     o o     |\n|      |      |\n|           4 |\n---------------";
          Clubs5 = "---------------\n| 5           |\n|             |\n|      o      |\n|     o o     |\n|      |      |\n|           5 |\n---------------";
          Clubs6 = "---------------\n| 6           |\n|             |\n|      o      |\n|     o o     |\n|      |      |\n|           6 |\n---------------";
          Clubs7 = "---------------\n| 7           |\n|             |\n|      o      |\n|     o o     |\n|      |      |\n|           7 |\n---------------";
          Clubs8 = "---------------\n| 8           |\n|             |\n|      o      |\n|     o o     |\n|      |      |\n|           8 |\n---------------";
          Clubs9 = "---------------\n| 9           |\n|             |\n|      o      |\n|     o o     |\n|      |      |\n|           9 |\n---------------";
          Clubs10 = "---------------\n| 10          |\n|             |\n|      o      |\n|     o o     |\n|      |      |\n|          10 |\n---------------";
          Clubs11 = "---------------\n| J           |\n|             |\n|      o      |\n|     o o     |\n|      |      |\n|           J |\n---------------";
          Clubs12 = "---------------\n| Q           |\n|             |\n|      o      |\n|     o o     |\n|      |      |\n|           Q |\n---------------";
          Clubs13 = "---------------\n| K           |\n|             |\n|      o      |\n|     o o     |\n|      |      |\n|           K |\n---------------";
          Clubs14 = "---------------\n| A           |\n|             |\n|      o      |\n|     o o     |\n|      |      |\n|           A |\n---------------";

          Diamonds2 = "---------------\n| 2           |\n|             |\n|     / \\     |\n|     \\ /     |\n|             |\n|           2 |\n---------------";
          Diamonds3 = "---------------\n| 3           |\n|             |\n|     / \\     |\n|     \\ /     |\n|             |\n|           3 |\n---------------";
          Diamonds4 = "---------------\n| 4           |\n|             |\n|     / \\     |\n|     \\ /     |\n|             |\n|           4 |\n---------------";
          Diamonds5 = "---------------\n| 5           |\n|             |\n|     / \\     |\n|     \\ /     |\n|             |\n|           5 |\n---------------";
          Diamonds6 = "---------------\n| 6           |\n|             |\n|     / \\     |\n|     \\ /     |\n|             |\n|           6 |\n---------------";
          Diamonds7 = "---------------\n| 7           |\n|             |\n|     / \\     |\n|     \\ /     |\n|             |\n|           7 |\n---------------";
          Diamonds8 = "---------------\n| 8           |\n|             |\n|     / \\     |\n|     \\ /     |\n|             |\n|           8 |\n---------------";
          Diamonds9 = "---------------\n| 9           |\n|             |\n|     / \\     |\n|     \\ /     |\n|             |\n|           9 |\n---------------";
          Diamonds10 = "---------------\n| 10          |\n|             |\n|     / \\     |\n|     \\ /     |\n|             |\n|          10 |\n---------------";
          Diamonds11 = "---------------\n| J           |\n|             |\n|     / \\     |\n|     \\ /     |\n|             |\n|           J |\n---------------";
          Diamonds12 = "---------------\n| Q           |\n|             |\n|     / \\     |\n|     \\ /     |\n|             |\n|           Q |\n---------------";
          Diamonds13 = "---------------\n| K           |\n|             |\n|     / \\     |\n|     \\ /     |\n|             |\n|           K |\n---------------";
          Diamonds14 = "---------------\n| A           |\n|             |\n|     / \\     |\n|     \\ /     |\n|             |\n|           A |\n---------------";


          System.out.println(player+"'s hand: " + hand);
          for (String i : hand) {
            if (i.equals("2 H")){
              System.out.println(Hearts2 + " ");
            }
            if (i.equals("3 H")){
              System.out.println(Hearts3 + " ");
            }
            if (i.equals("4 H")){
              System.out.println(Hearts4 + " ");
            }
            if (i.equals("5 H")){
              System.out.println(Hearts5 + " ");
            }
            if (i.equals("6 H")){
              System.out.println(Hearts6 + " ");
            }
            if (i.equals("7 H")){
              System.out.println(Hearts7 + " ");
            }
            if (i.equals("8 H")){
              System.out.println(Hearts8 + " ");
            }
            if (i.equals("9 H")){
              System.out.println(Hearts9 + " ");
            }
            if (i.equals("10 H")){
              System.out.println(Hearts10 + " ");
            }
            if (i.equals("J H")){
              System.out.println(Hearts11 + " ");
            }
            if (i.equals("Q H")){
              System.out.println(Hearts12 + " ");
            }
            if (i.equals("K H")){
              System.out.println(Hearts13 + " ");
            }
            if (i.equals("A H")){
              System.out.println(Hearts14 + " ");
            }
            if (i.equals("2 S")){
              System.out.println(Spades2 + " ");
            }
            if (i.equals("3 S")){
              System.out.println(Spades3 + " ");
            }
            if (i.equals("4 S")){
              System.out.println(Spades4 + " ");
            }
            if (i.equals("5 S")){
              System.out.println(Spades5 + " ");
            }
            if (i.equals("6 S")){
              System.out.println(Spades6 + " ");
            }
            if (i.equals("7 S")){
              System.out.println(Spades7 + " ");
            }
            if (i.equals("8 S")){
              System.out.println(Spades8 + " ");
            }
            if (i.equals("9 S")){
              System.out.println(Spades9 + " ");
            }
            if (i.equals("10 S")){
              System.out.println(Spades10 + " ");
            }
            if (i.equals("J S")){
              System.out.println(Spades11 + " ");
            }
            if (i.equals("Q S")){
              System.out.println(Spades12 + " ");
            }
            if (i.equals("K S")){
              System.out.println(Spades13 + " ");
            }
            if (i.equals("A S")){
              System.out.println(Spades14 + " ");
            }
            if (i.equals("2 C")){
              System.out.println(Clubs2 + " ");
            }
            if (i.equals("3 C")){
              System.out.println(Clubs3 + " ");
            }
            if (i.equals("4 C")){
              System.out.println(Clubs4 + " ");
            }
            if (i.equals("5 C")){
              System.out.println(Clubs5 + " ");
            }
            if (i.equals("6 C")){
              System.out.println(Clubs6 + " ");
            }
            if (i.equals("7 C")){
              System.out.println(Clubs7 + " ");
            }
            if (i.equals("8 C")){
              System.out.println(Clubs8 + " ");
            }
            if (i.equals("9 C")){
              System.out.println(Clubs9 + " ");
            }
            if (i.equals("10 C")){
              System.out.println(Clubs10 + " ");
            }
            if (i.equals("J C")){
              System.out.println(Clubs11 + " ");
            }
            if (i.equals("Q C")){
              System.out.println(Clubs12 + " ");
            }
            if (i.equals("K C")){
              System.out.println(Clubs13 + " ");
            }
            if (i.equals("A C")){
              System.out.println(Clubs14 + " ");
            }
            if (i.equals("2 D")){
              System.out.println(Diamonds2 + " ");
            }
            if (i.equals("3 D")){
              System.out.println(Diamonds3 + " ");
            }
            if (i.equals("4 D")){
              System.out.println(Diamonds4 + " ");
            }
            if (i.equals("5 D")){
              System.out.println(Diamonds5 + " ");
            }
            if (i.equals("6 D")){
              System.out.println(Diamonds6 + " ");
            }
            if (i.equals("7 D")){
              System.out.println(Diamonds7 + " ");
            }
            if (i.equals("8 D")){
              System.out.println(Diamonds8 + " ");
            }
            if (i.equals("9 D")){
              System.out.println(Diamonds9 + " ");
            }
            if (i.equals("10 D")){
              System.out.println(Diamonds10 + " ");
            }
            if (i.equals("J D")){
              System.out.println(Diamonds11 + " ");
            }
            if (i.equals("Q D")){
              System.out.println(Diamonds12 + " ");
            }
            if (i.equals("K D")){
              System.out.println(Diamonds13 + " ");
            }
            if (i.equals("A D")){
              System.out.println(Diamonds14 + " ");
            }
          }// end for
          return topCard;
          // System.out.println(topCard);
        }// end Match

    // this method allows for the screen to clear and start the game
    public static void clear(){
          try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); //clear screen for PC
          }// end try
          catch (Exception e){
            System.out.println("\033[H\033[2J"); //clear screen special character for mac
          }// end catch
    }//end clear

    //method that intoduces the rules
    public static void intro() throws InterruptedException{
          System.out.println("Welcome to our card game.... The Worst ACE-enario");
          Thread.sleep(2000);
          System.out.println("The following rules will be implemented throughout the game, aside from basic card rules.");
          Thread.sleep(1000);
          System.out.println("1. If you are forced to play a KING, player must draw one card. ");
          Thread.sleep(1000);
          System.out.println("2. If you are forced to play a QUEEN, player must draw one card. ");
          Thread.sleep(1000);
          System.out.println("3. If you are forced to play a JACK, player must draw one card.");
          Thread.sleep(1000);
          System.out.println("4. If you play the Ace of Diamonds, the player makes everyone else draw one card from the deck.");
          Thread.sleep(1000);
          System.out.println("5. If you play the Ace of Hearts, the player makes everyone elese draw one card from the deck.");
          Thread.sleep(1000);
          System.out.println("6. If you play the Ace of Clubs , the player makes everyone else draw one card from the deck.");
          Thread.sleep(1000);
          System.out.println("7. If you play the Ace of Spades, the player makes everyone else draw one card from the deck.");
          Thread.sleep(1000);
          Thread.sleep(1000);
    }//end intro

    // shuffle method
      public static void shuffle(List<String> card) throws InterruptedException{
          System.out.println("We will now shuffle the cards...\n\n");
          Collections.shuffle(card);
          Thread.sleep(2000);
          System.out.println("Here is the shuffled deck of cards.\n\n" + card);
      }//end shuffle
}//end class
