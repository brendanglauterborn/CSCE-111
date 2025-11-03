import java.lang.*;
import java.io.*;

/*
Brendan Lauterborn
726004578
CSCE 111-504
Final Project: Animation
Credit to Robert Lightfoot
*/


public class Animation{

  public static void main(String[]args) throws IOException, InterruptedException
  {

//the figures that will be "dancing" in the animation
      String[] girl1 =
      {
       "        _____      ",
       "       /(^_^)\\    ",
       "      /   |   \\  ",
       "         /|\\      ",
       "        / | \\     ",
       "       /  |  \\      ",
       "         / \\      ",
       "        /   \\     ",
       "       /     \\       ",
       "                       "

     };

      String[] girl2 =
      {
        "        _____    ",
        "       /(^o^)\\  ",
        "      /   |   \\ ",
        "         /|\\    ",
        "        / | \\   ",
        "        \\ | /   ",
        "         / \\    ",
        "         \\  \\  ",
        "          \\  \\ ",
        "                 "

      };

      String[] girl3 =
      {
        "        _____    ",
        "       /(^o^)\\  ",
        "      /   |   \\ ",
        "         /|\\    ",
        "        / | \\   ",
        "        \\ | /   ",
        "         / \\    ",
        "        /  /     ",
        "       /  /      ",
        "                 "

      };

      //the train that will move to the end of the screen
      String[] train1 =
      {
        "                                                                                     ",
        "                                             _________________________________        ",
        "                                               |    _____      _____      |                     ",
        "                                               |    |   |      |   |      |                      ",
        "                    |  |                       |    |___|      |___|      |                     ",
        "           _________|  |_______________________|                          |               ",
        "           |                                                              |          ",
        "           |                                                              |              ",
        "           |                                                              |                   ",
        "     ______|                                                              |               ",
        "   \\\\                                _________         _________          |                 ",
        "   \\\\       ______                   |       |         |       |          |                 ",
        "    \\\\______|    |___________________|       |_________|       |__________| ",
        "            |____|                   |_______|         |_______|                   ",
        "                                                                             ",
      };


      String[] train2 =
      {
        "                                                                                     ",
        "                                             _________________________________            ",
        "                                               |    _____      _____      |                     ",
        "                     ~                         |    |   |      |   |      |                      ",
        "                    |  |                       |    |___|      |___|      |                     ",
        "           _________|  |_______________________|                          |               ",
        "           |                                                              |          ",
        "           |                                                              |              ",
        "           |                                                              |                   ",
        "     ______|                                                              |               ",
        "   \\\\                                _________         _________          |                 ",
        "   \\\\       ______                   |       |         |       |          |                 ",
        "    \\\\______|    |___________________|       |_________|       |__________| ",
        "            |____|                   |_______|         |_______|                   ",
        "                                                                             ",
      };


      String[] train3 =
      {
        "                                                                                     ",
        "                                             _________________________________                                        ",
        "                     ~                         |    _____      _____      |                     ",
        "                     ~                         |    |   |      |   |      |                      ",
        "                    |  |                       |    |___|      |___|      |                     ",
        "           _________|  |_______________________|                          |               ",
        "           |                                                              |          ",
        "           |                                                              |              ",
        "           |                                                              |                   ",
        "     ______|                                                              |               ",
        "   \\\\                                _________         _________          |                 ",
        "   \\\\       ______                   |       |         |       |          |                 ",
        "    \\\\______|    |___________________|       |_________|       |__________| ",
        "            |____|                   |_______|         |_______|                   ",
        "                                                                             ",
      };


      String[] train4 =
      {
        "                                                                                     ",
        "                     ~                       _________________________________                                        ",
        "                     ~                         |    _____      _____      |                     ",
        "                     ~                         |    |   |      |   |      |                      ",
        "                    |  |                       |    |___|      |___|      |                     ",
        "           _________|  |_______________________|                          |               ",
        "           |                                                              |          ",
        "           |                                                              |              ",
        "           |                                                              |                   ",
        "     ______|                                                              |               ",
        "   \\\\                                _________         _________          |                 ",
        "   \\\\       ______                   |       |         |       |          |                 ",
        "    \\\\______|    |___________________|       |_________|       |__________| ",
        "            |____|                   |_______|         |_______|                   ",
        "                                                                             ",
      };


      String[] train5 =

      {
        "                     ~                                                               ",
        "                     ~                       _________________________________                                        ",
        "                     ~                         |    _____      _____      |                     ",
        "                                               |    |   |      |   |      |                      ",
        "                    |  |                       |    |___|      |___|      |                     ",
        "           _________|  |_______________________|                          |               ",
        "           |                                                              |          ",
        "           |                                                              |              ",
        "           |                                                              |                   ",
        "     ______|                                                              |               ",
        "   \\\\                                _________         _________          |                 ",
        "   \\\\       ______                   |       |         |       |          |                 ",
        "    \\\\______|    |___________________|       |_________|       |__________| ",
        "            |____|                   |_______|         |_______|                   ",
        "                                                                             ",
      };

      //the man that will dance
      String[] man1 =
      {
       "        _____      ",
       "        (^_^)    ",
       "          |     ",
       "         /|\\      ",
       "        / | \\     ",
       "       /  |  \\      ",
       "         / \\      ",
       "        /   \\     ",
       "       /     \\       ",
       "                       "

     };

     String[] man2 =
     {
      "        _____    ",
      "        (^_^)    ",
      "          |      ",
      "         /|\\    ",
      "       \\/ | \\/  ",
      "          |      ",
      "         / \\    ",
      "        /   \\   ",
      "       /     \\  ",
      "                 "

    };

    String[] man3 =
    {
     "       _____      ",
     "       (^o^)    ",
     "         |     ",
     "         /|\\      ",
     "       \\/ | \\/     ",
     "          |        ",
     "         / \\      ",
     "        /   \\     ",
     "       /     \\       ",
     "                       "

   };

   String[] man4 =
   {
    "         _____      ",
    "         (^o^)    ",
    "           |     ",
    "         /|\\      ",
    "       \\/ | \\/     ",
    "          |        ",
    "         / \\      ",
    "        /   \\     ",
    "       /     \\       ",
    "                       "

  };

  String[] man5 =
  {

  "        _____    ",
  "        (^o^)    ",
  "          |      ",
  "         /|\\    ",
  "       \\/ | \\/  ",
  "          |      ",
  "         / \\    ",
  "        /   \\   ",
  "       /     \\  ",
  "                 "

};

  //printing the seperate figures to look like an animation
    print(girl1);
    System.out.println("JUST A SMALL TOWN GIRL");
    Thread.sleep(1000);
    print(girl3);
    Thread.sleep(500);
    print(girl2);
    Thread.sleep(500);
    print(girl3);
    Thread.sleep(500);
    print(girl2);
    Thread.sleep(500);
    print(girl3);
    Thread.sleep(500);
    print(girl3);
    Thread.sleep(500);
    print(girl2);
    Thread.sleep(500);
    print(girl3);
    Thread.sleep(500);
    print(girl2);
    Thread.sleep(500);
    print(girl3);
    Thread.sleep(500);
    print(girl1);
    System.out.println("HERE COMES THE MIDNIGHT TRAIN!");
    Thread.sleep(2000);
    animate(train1);
    Thread.sleep(250);
    print(train2);
    Thread.sleep(500);
    print(train3);
    Thread.sleep(500);
    print(train4);
    Thread.sleep(500);
    print(train5);
    Thread.sleep(1000);
    cls();
    System.out.println("");
    System.out.println("");
    System.out.println("\there comes the .. CITY BOYYY");
    Thread.sleep(2000);
    print(man1);
    Thread.sleep(500);
    print(man2);
    Thread.sleep(500);
    print(man1);
    Thread.sleep(500);
    print(man2);
    Thread.sleep(500);
    print(man3);
    System.out.println("LOOK AT THE DETROIT BOY HIT THE HEAD BOP");
    Thread.sleep(500);
    print(man5);
    System.out.println("LOOK AT THE DETROIT BOY HIT THE HEAD BOP");
    Thread.sleep(500);
    print(man4);
    System.out.println("LOOK AT THE DETROIT BOY HIT THE HEAD BOP");
    Thread.sleep(500);
    print(man5);
    System.out.println("LOOK AT THE DETROIT BOY HIT THE HEAD BOP");
    Thread.sleep(500);
    print(man3);
    System.out.println("LOOK AT THE DETROIT BOY HIT THE HEAD BOP");
    Thread.sleep(500);
    print(man5);
    Thread.sleep(500);
    print(man4);
    Thread.sleep(500);
    print(man5);
    Thread.sleep(500);
    print(man3);
    Thread.sleep(500);
    print(man5);
    Thread.sleep(500);
    print(man4);
    Thread.sleep(500);
    print(man5);
    Thread.sleep(500);
    print(man3);
    Thread.sleep(500);
    print(man5);
    Thread.sleep(500);
    print(man1);
    Thread.sleep(500);
    print(man4);
    Thread.sleep(500);
    print(man5);
    Thread.sleep(500);
    print(man3);
    Thread.sleep(500);
    print(man5);
    Thread.sleep(500);
    print(man1);
  }// end main



//CREDIT TO ROBERT LIGHTFOOT'S ANIMATION CODE
//The method print is used to print one element of a string array per line.


   public static void print(String[] printable) throws IOException, InterruptedException
   {
     cls();

     for(int k = 0; k < printable.length; k++)
     {
    System.out.println(printable[k]);
     }

   }


   // The method Animate is used to print one element of a string array per line.
   // with the addition of space before printing the array. The space is reduced by
   // one each time and then printing continues.
   public static void animate(String[] printable) throws IOException, InterruptedException
   {
     cls();

     for(int path = 0; path < printable.length; path++)
     {
     Thread.sleep(500);
     cls();

       for(int k = 0; k < printable.length; k++)
       {
         for(int space = printable.length; space > path; space--)
         {
          System.out.print(" ");
         }
      System.out.println(printable[k]);
       }
     }

   }// end animate


    public static void cls() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }//end cls
}//end class
