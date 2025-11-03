//Project Functions: Last updated: Emily Dec 2 2019 6:07pm

import javax.swing.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.*;
import java.io.*;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
/*
These are the functions to run when they are called upon in the gui menu
Gui Menu: by Emily Dupre
Quiz function: by Emily Dupre
Music Video Function: by Emily Dupre
Animation function: by Brendan Lauterborn
Karaoke function: by David Cruz
Webpage function: by Bailee Statham
*/


public class ProjectFunctions
{
  public static void Quiz(){
    /*
    This is a the quiz function made by Emily Dupre
    It is a 5 question quiz based on facts about Journey
    and the song that we chose, Don't Stop Believin'
    Facts and questions based on research from google, wikipedia, and other Journey sites
    https://en.wikipedia.org/wiki/Journey_discography
    https://www.funtrivia.com/playquiz/quiz1926861610698.html
    game ends after question 5 and displays the score.
    The code finishes when after the final score is displayed and the gui closes
    */


    ///initializes score
    int score = 0;
    //Show welcome window, explains the quiz
    JOptionPane.showMessageDialog(null, "Welcome to the Journey Quiz \n We will be testing you on your knowledge of the band and their music.");
    JOptionPane.showMessageDialog(null, "Let's begin");


    //question1
    //create question and answers showing in dropdown menu using gui
    final JPanel panel = new JPanel();
    Object[] options = {"A. Neal Schon", "B. Ross Valory", "C. Steve Smith", "D. Steve Perry"};
    //JOptionPane.showMessageDialog(null, "Question 1: Journey started creating music in 1973 and has had more than 15 members come and go from the group.  \n Which of the following is not a current member of the band? ");
    Object selectionObject = JOptionPane.showInputDialog(panel, "Question 1: Journey started creating music in 1973 and has had more than 15 members come and go from the group.  \n Which of the following is not a current member of the band?",
    "Menu",JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
    String answer1 = selectionObject.toString();
    answer1 = answer1.substring(0);
    // show answer and score
    if (answer1.contains("d") || answer1.contains("D")){
      score = score + 1;
      JOptionPane.showMessageDialog(null,"You got the answer right! \n Your score is now: " + score);
    }
    else {
      JOptionPane.showMessageDialog(null, "Your answer was not correct. \n The correct answer was Steve Perry. \n Your score is now: " + score);
    }


    //question 2
    //create question and answers showing in dropdown menu using gui
    final JPanel panel2 = new JPanel();
    Object[] options2 = {"A. Escape", "B. Frontiers", "C. Greatest Hits", "D. Evolution"};
    //  JOptionPane.showMessageDialog(null, "Question 2:	Which album was their most successful?");
    Object selectionObject2 = JOptionPane.showInputDialog(panel2, "Question 2:	Which album was their most successful?",
    "Menu",JOptionPane.PLAIN_MESSAGE, null, options2, options2[0]);
    String answer2 = selectionObject2.toString();
    answer2 = answer2.substring(0);
    // show answer and score
    if (answer2.contains("A") || answer2.contains("a")){
      score = score + 1;
      JOptionPane.showMessageDialog(null,"You got the answer right! \n Your score is now: " + score);
    }
    else {
      JOptionPane.showMessageDialog(null, "Your answer was not correct. \n The correct answer was Escape. \n Your score is now: " + score);
    }


    //question 3
    //create question and answers showing in dropdown menu using gui
    final JPanel panel3 = new JPanel();
    Object[] options3 = {"A. True", "B. False"};
    //JOptionPane.showMessageDialog(null, "Question 3: True or False: Is Journey still touring today?");
    Object selectionObject3 = JOptionPane.showInputDialog(panel3, "Question 3: True or False: Is Journey still touring today?",
    "Menu",JOptionPane.PLAIN_MESSAGE, null, options3, options3[0]);
    String answer3 = selectionObject3.toString();
    answer3 = answer3.substring(0);
    // show answer and score
    if (answer3.contains("A") || answer3.contains("a")){
      score = score + 1;
      JOptionPane.showMessageDialog(null,"You got the answer right! \n Your score is now: " + score);
    }
    else {
      JOptionPane.showMessageDialog(null, "Your answer was not correct. \n The correct answer was true. \n Your score is now: " + score);
    }


    // question 4
    //create question and answers showing in dropdown menu using gui
    final JPanel panel4 = new JPanel();
    Object[] options4 = {"A. And seeped perfume", "B. And tulips in bloom", "C. And cheap perfume", "D. And roses in bloom"};
    //JOptionPane.showMessageDialog(null, "Question 4: Fill in the blank lyrics: A singer in a smoky room. The smell of wine ____.");
    Object selectionObject4 = JOptionPane.showInputDialog(panel4, "Question 4: Fill in the blank lyrics: A singer in a smoky room. The smell of wine ____.",
    "Menu",JOptionPane.PLAIN_MESSAGE, null, options4, options4[0]);
    String answer4 = selectionObject4.toString();
    answer4 = answer4.substring(0);
    // show answer and score
    if (answer4.contains("C") || answer4.contains("c")){
      score = score + 1;
      JOptionPane.showMessageDialog(null,"You got the answer right! \n Your score is now: " + score);
    }
    else {
      JOptionPane.showMessageDialog(null, "Your answer was not correct. \n The correct answer was ~and cheap perfume~. \n Your score is now: " + score);
    }


    //question 5
    //create question and answers showing in dropdown menu using gui
    final JPanel panel5 = new JPanel();
    Object[] options5 = {"A. 2000", "B. 2012", "C. 2011", "D. 2005"};
    //JOptionPane.showMessageDialog(null, "Question 5: Their latest album was released when?");
    Object selectionObject5 = JOptionPane.showInputDialog(panel5, "Question 5: Their latest album was released when?",
    "Menu",JOptionPane.PLAIN_MESSAGE, null, options5, options5[0]);
    String answer5 = selectionObject5.toString();
    answer5 = answer5.substring(0);
    // show answer and score
    if (answer5.contains("C") || answer5.contains("c")){
      score = score + 1;
      JOptionPane.showMessageDialog(null,"You got the answer right! \n Your score is now: " + score);
    }
    else {
      JOptionPane.showMessageDialog(null, "Your answer was not correct. \n The correct answer was 2011, the album Eclipse. \n Your score is now: " + score);
    }


    //print results
    JOptionPane.showMessageDialog(null, "Thanks for playing! \n Your final score was "+ score + " out of 5.");
    //show message based on score
    if (score < 5){
      JOptionPane.showMessageDialog(null, "Better luck next time!");
    }
    else{
      JOptionPane.showMessageDialog(null, "Great job!");
    }
  }// end Journey Quiz







  //////////////////





  public static void MusicVideo(){
    try {
      URI uri= new URI("https://www.youtube.com/watch?v=SlZRq4S0kzI");
      java.awt.Desktop.getDesktop().browse(uri);
      System.out.println("Web page opened in browser");
    } catch (Exception e) {
      e.printStackTrace();
    }//end catch
  }// end music video


  //////////////////




  /*
  Brendan Lauterborn
  726004578
  CSCE 111-504
  Final Project: Animation
  Credit to Robert Lightfoot
  */

    public static void Animation() throws IOException, InterruptedException  {

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
      //return args;
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




  ////////////////////////////



  public static void Karaoke(){
    //System.out.println("Run Karaoke in functions");
try {
    URI uri = new URI("https://youtu.be/7osMx7AGTA4");

    java.awt.Desktop.getDesktop().browse(uri);
    System.out.println("Web page opened in browser");

  } catch(Exception e) {
    e.printStackTrace();
  }

  }// end karaoke

  public static void Website(){
    try {
      URI uri= new URI("http://people.tamu.edu/~baileestatham/");
      java.awt.Desktop.getDesktop().browse(uri);
      System.out.println("Website opened in browser");
    } catch (Exception e) {
      e.printStackTrace();
    }//end catch
  }// end website method

}//end class
