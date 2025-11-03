import java.util.Scanner;
/*
CSCE 111 504
Brendan Lauterborn
726004578
9/3/2019
ex 1
*/
class lab2  {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //initialize variables
    String name;
    String color;
    int age;
    //set up to input variables
    System.out.print("What is your name?");
    name = input.nextLine();
    System.out.print("What is your favorite color?");
    color = input.nextLine();
    System.out.print("How old are you?");
    age = input.nextInt();

    System.out.println("Hello, your name is " + name + ". You are " + age + " years old.");
    System.out.println("You favorite color is " + color + ". ");

  }

}
