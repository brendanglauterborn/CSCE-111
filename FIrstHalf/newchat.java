import java.util.Scanner;
/*
Brendan Lauterborn
726004578
CSCE 111 504
*/
class newchat {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //starting the coversation with the user and limiting the topic to sports
    System.out.print("Hello! My name is BrenBot. What is your favorite Sport?");
    String response = input.nextLine();
    response = response.toLowerCase();

    //the conversation will continue to go as long as the user doesnt type "bye"
    myLoop:
    while (!response.contains("bye")) {
      //different cases for each sport
      switch (response) {
        case "football":
          System.out.println("That's Awesome! That's my favorite sport as well! What is your favorite football team?");
          response = input.nextLine();
          //if user types bye the conversation ends mid sentence and goes to myLoop
          if (response.contains("bye")) {
            break myLoop;
          }
          if (response.contains("redskins")) {
            System.out.println("I'm impressed. That's my favorite team!");
          }
          else {
            System.out.println("Wow. What a terrible team...The Washington Redskins are the best");
          }
          break;
        case "soccer":
          System.out.println("I enjoy soccer too.");
          break;
        case "baseball":
          System.out.println("How cool.");
          break;
        case "basketball":
          System.out.println("That is the best sport!");
          break;
        case "volleyball":
          System.out.println("That's a fun sport to watch!");
          break;
        case "swimming":
          System.out.println("That's a fun sport to watch!");
          break;
        case "track":
          System.out.println("That's a fun sport to watch!");
          break;
        case "hockey":
          System.out.println("That's a fun sport to watch!");
          break;
        case "tennis":
          System.out.println("That's a fun sport to watch!");
          break;
        case "boxing":
          System.out.println("That's a fun sport to watch!");
          break;
        //this covers for all the sports that are less common
        default:
        System.out.println("Ooo i've never heard of that one before");
      }
      //asking the user another question
      System.out.println("Do you like to play sport video games?");
      response = input.nextLine();
      response = response.toLowerCase();
      if (response.contains("bye")) {
        break;
      }
      //different responses based on the users answer to video games
      switch (response) {
        case "no":
          System.out.println("Oh ok :( ");
          break;
        case "yes":
          System.out.println("Awesome. Have you ever played NBA 2k?");
          response = input.nextLine();
          response = response.toLowerCase();
            if (response.contains("yes")) {
              System.out.println("You know whats up!");

            }
            else {
              System.out.println("You should check it out.");
            }
            break;
      }
      //asking another question
      System.out.println("Have you ever played a sport?");
      response = input.nextLine();
      response = response.toLowerCase();
      if (response.contains("bye")) {
        break myLoop;
      }
      // different dialogue according to the users answer
      switch (response) {
        case "yes":
          System.out.println("Thats cool. What sport?");
          response = input.nextLine();
          if (response.contains("bye")) {
            break myLoop;
          }
            if (response.contains("track")) {
              System.out.println("Nice! I ran track too.");
            }
            else {
              System.out.println("That's so cool. I've never played that before");
            }
            break;
        case "no":
        System.out.println("Oh ok.");
        break;
      }
      //letting the user to that they can end the conversation if they want to
    System.out.println("You can say bye if you want to stop talking. I wont be upset.");
    response = input.nextLine();
    response = response.toLowerCase();
    }
    //once out of loop, tell the user it was nice chatting
    System.out.println("It was nice talking with you!");

  }//end main
}//end class
