import java.util.Scanner;

/*
Brendan BrendanLauterborn
*/

 class practice {
   public static void main(String[] args) {
     int i;
     i = 10;
     byte j = 111;
     byte k = 30;
     int l = 4;
     double x = 10;
     double y = 4;
     char initial = 'B';
     boolean answer = true;
     String name = "Brendan";
     String yourName;

     System.out.println("My first int = " + i);
     System.out.println("My second int = " + j);

    // i = i * 100;
     System.out.println("My new I = " + i);

     System.out.println("My new J = " + j);
     System.out.println("10 / 4 = " + i/l);
     System.out.println("10 / 4 = " + x/y);
     System.out.println("My first name is " + initial);
     System.out.println("I like java? " + answer);
     System.out.println("My name is: " + name);
     System.out.println("My name is " + name.length() + " letters long.");

     Scanner input = new Scanner(System.in);
     System.out.print("What is your name? ");
     yourName = input.nextLine();


   }//end main

}//end class
