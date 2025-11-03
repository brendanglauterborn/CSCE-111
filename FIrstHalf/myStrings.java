import java.util.Scanner;
/*
Brendan BrendanLauterborn
*/

class myStrings {
  public static void main(String[] args) {
    String fName = "Brendan";
    String lName = "Lauterborn";
    String yName = "brendan";
    Scanner input = new Scanner(System.in);

    System.out.println(fName +" " + lName );

    String wName = fName + " " + lName;
    System.out.println(wName);

    String iName = fName.substring(0,1) + lName;
    System.out.println(iName);

    String initials = fName.substring(0,1) + lName.substring(0,1);
    System.out.println(initials);

    System.out.println(wName.length());

    System.out.println(fName.equalsIgnoreCase(yName));
    System.out.println(fName.contains("Bren"));
    System.out.println(fName.charAt(3));
    System.out.println(fName.indexOf('e'));
    System.out.println(fName.replace('e','a'));
    //fName = fName.replace('e','a');
    System.out.println(fName);

    int miles = 124;
    String temp = "hot";
    String answer = String.format("My longest single day bike ride is %d miles.", miles);
    System.out.println(answer);

    if (miles > 100 || temp == "hot") {
      System.out.println("This is true.");
      int myMiles = 2000;
      System.out.println("My miles = " + myMiles);

    }//end if

    System.out.print("What mont (int) do you want converted? ");
    int month = input.nextInt();
    switch (month) {
      case 1:
        System.out.println("January");
        break;
      case 2:
        System.out.println("February");
        break;
      case 3:
        System.out.println("March");
        break;
      case 4:
        System.out.println("January");
        break;
      case 5:
        System.out.println("February");
        break;
      case 6:
        System.out.println("March");
        break;
      case 7:
        System.out.println("January");
        break;
      case 8:
        System.out.println("February");
        break;
      case 9:
        System.out.println("March");
        break;
      case 10:
        System.out.println("January");
        break;
      case 11:
        System.out.println("February");
        break;
      case 12:
        System.out.println("March");
        break;
      default:
        System.out.println("That is not a month");

      }
      String day = "Monday";

    switch (day) {
      case "Monday":
        System.out.println("Pizza special");
        break;
      case "Tuesday":
        System.out.println("Taco special");
        break;




      }
  //   if (false) {
  //     System.out.println("This is the 2nd true.");
  //   } else {
  //     System.out.println("This is false.");
  //   }
  //   if (false) {
  //     System.out.println("This is the 3rd true.");
  //   } else if (true) {
  //     System.out.println("This is the 4th true.");
  //   }//end if
  //   miles = 14;
  //   switch (miles) {
  //     case 10:
  //       System.out.println("That isn't very far.");
  //       break;
  //     case 124:
  //       System.out.println("That is far.");
  //       break;
  //     default:
  //       System.out.println("That's a good distance.");
  // }
  // int i = 100;
  // int j = 20;
  //
  // System.out.println("You will get " + i/j + " twenties.");
  // System.out.println("You will get " + i%j + " other money.");
  }//end main

}//end class
