import java.util.Scanner;

/*
Brendan Lauterborn
CSCE 111 504
726004578
9/6/2019
MadLIB

Source: http://www.redkid.net/cgi-bin/madlibs/videogames.pl
Changed a little of the MadLIB
*/


class BrendanLauterbornExerciseThree {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

//Introducing the strings and integers so that they
//can later be assinged to what the user inputs
    String adjective1;
    String adjective2;
    String adjective3;
    String adjective4;
    String noun1;
    String noun2;
    String noun3;
    int number;
    String bodyPart1;
    String bodyPart2;
    String pluralNoun1;
    String pluralNoun2;
    String pluralNoun3;
    String verb;
    String verbING;

// Asking the user to give a correct input that will be stored
//and used later
    System.out.print("Please enter a verb: ");
    verb = input.nextLine(); //16th term
    System.out.print("Please enter a noun: ");
    noun1 = input.nextLine();//5th term
    System.out.print("Please enter a noun: ");
    noun2 = input.nextLine();//6th term
    System.out.print("Please enter a verb ending in ing: ");
    verbING = input.nextLine();//17th term
    System.out.print("Please enter a noun: ");
    noun3 = input.nextLine();//7th term
    System.out.print("Please enter an adjective: ");
    adjective1 = input.nextLine();//1st term
    System.out.print("Please enter a body part: ");
    bodyPart1 = input.nextLine();//10th term
    System.out.print("Please enter a plural noun: ");
    pluralNoun1 = input.nextLine();//12th term
    System.out.print("Please enter an adjective: ");
    adjective2 = input.nextLine();//2nd term
    System.out.print("Please enter a body part: ");
    bodyPart2 = input.nextLine();//11th term
    System.out.print("Please enter a plural noun: ");
    pluralNoun2 = input.nextLine();//13th term
    System.out.print("Please enter an adjective: ");
    adjective3 = input.nextLine();//3rd term
    System.out.print("Please enter a plural noun: ");
    pluralNoun3 = input.nextLine();//14th term
    System.out.print("Please enter an adjective: ");
    adjective4 = input.nextLine();//4th term
    System.out.print("Please enter a number: ");
    number = input.nextInt();//9th term

//This is printing the MadLIB to the user after recieving all of the inputs
    System.out.println();
    System.out.println("               MadLIB: Video Games");
    System.out.println();
    System.out.printf("I love to %S video games. I can play them day and ", verb);
    System.out.printf("%S! My mom and %S are not too happy with my ", noun1, noun2);
    System.out.printf("%S so much time in front of the television\n %S.", verbING, noun3);
    System.out.printf(" Although Dad believes that these %S games help children ", adjective1);
    System.out.printf("develop hand-%S coordination and improve their ", bodyPart1);
    System.out.printf("learning %S, he also seems to think they have %S ", pluralNoun1, adjective2);
    System.out.printf("side effects on one's %S. Both of my %S ", bodyPart2, pluralNoun2);
    System.out.printf("think this is due to a %S use of violence in the majority ", adjective3);
    System.out.printf("of the %S. Finally, we\n all arrived at a %S ", pluralNoun3, adjective4);
    System.out.printf("compromise! After dinner I can play video games for %S days in a row!", number);

  }// end main

}//end class
