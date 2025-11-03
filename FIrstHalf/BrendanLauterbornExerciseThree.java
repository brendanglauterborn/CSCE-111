import java.util.Scanner;

/*
Brendan Lauterborn
726004578
CSCE 111 504
*/

class BrendanLauterbornExerciseThree {
  public static void main(String[] args) {
    //Setting up to recieve the user's name
    // assigning the inputed name to name
    // tester is assigned the first two letters of the given name.
    // Secondfhalfname is the third letter and beyond of the name given..
    // This will be used when we put the name back together
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter your name:");
    String name = input.nextLine();
    name = name.toLowerCase();
    int nameLength = name.length();
    String tester = name.substring(0,2);
    String secondHalfName = name.substring(2,nameLength);
    String newName1 = "B" + secondHalfName;
    String newName2 = "F" + secondHalfName;
    String newName3 = "M" + secondHalfName;

    // this if statement tests if the first two letters match the case where we need to..
    // remove the first 2 letters and add our B, F and M
    if (tester.equals("sh") || tester.equals("ch") || tester.equals("eh") || tester.equals("ph"))  {
      System.out.printf("%S!\n", name);
      System.out.printf("%S, %S bo %S \n", name, name, newName1);
      System.out.printf("Banana fana fo %S\n", newName2);
      System.out.printf("Fe fi mo %S\n", newName3);
      System.out.printf("%S!\n", name);
    }
    //the cases check to see if the first letter is a vowel
    //if so then we add the B, F or M to the beginning of the given name
      else {
        char f = name.charAt(0);
        switch (f) {
          case 'a':
           newName1 = "B" + name;
           newName2 = "F" + name;
           newName3 = "M" + name;
            System.out.printf("%S!\n", name);
            System.out.printf("%S, %S bo %S \n", name, name, newName1);
            System.out.printf("Banana fana fo %S\n", newName2);
            System.out.printf("Fe fi mo %S\n", newName3);
            System.out.printf("%S!\n", name);
            break;
          case 'e':
            newName1 = "B" + name;
            newName2 = "F" + name;
            newName3 = "M" + name;
            System.out.printf("%S!\n", name);
            System.out.printf("%S, %S bo %S \n", name, name, newName1);
            System.out.printf("Banana fana fo %S\n", newName2);
            System.out.printf("Fe fi mo %S\n", newName3);
            System.out.printf("%S!\n", name);
            break;
          case 'i':
            newName1 = "B" + name;
            newName2 = "F" + name;
            newName3 = "M" + name;
            System.out.printf("%S!\n", name);
            System.out.printf("%S, %S bo %S \n", name, name, newName1);
            System.out.printf("Banana fana fo %S\n", newName2);
            System.out.printf("Fe fi mo %S\n", newName3);
            System.out.printf("%S!\n", name);
            break;
          case 'o':
            newName1 = "B" + name;
            newName2 = "F" + name;
            newName3 = "M" + name;
            System.out.printf("%S!\n", name);
            System.out.printf("%S, %S bo %S \n", name, name, newName1);
            System.out.printf("Banana fana fo %S\n", newName2);
            System.out.printf("Fe fi mo %S\n", newName3);
            System.out.printf("%S!\n", name);
            break;
          case 'u':
            newName1 = "B" + name;
            newName2 = "F" + name;
            newName3 = "M" + name;
            System.out.printf("%S!\n", name);
            System.out.printf("%S, %S bo %S \n", name, name, newName1);
            System.out.printf("Banana fana fo %S\n", newName2);
            System.out.printf("Fe fi mo %S\n", newName3);
            System.out.printf("%S!\n", name);
            break;
          case 'y':
            newName1 = "B" + name;
            newName2 = "F" + name;
            newName3 = "M" + name;
            System.out.printf("%S!\n", name);
            System.out.printf("%S, %S bo %S \n", name, name, newName1);
            System.out.printf("Banana fana fo %S\n", newName2);
            System.out.printf("Fe fi mo %S\n", newName3);
            System.out.printf("%S!\n", name);
            break;

          //these cases check to see if the first letter of the given name matches a B, F or M.
          // if so we have to change it to bo-, fo- or mo-
          case 'b':
            String sameLetterName = name.substring(1,nameLength);
            newName2 = "F" + sameLetterName;
            newName3 = "M" + sameLetterName;
            System.out.printf("%S!\n", name);
            System.out.printf("%S, %S bo-%S \n", name, name, sameLetterName);
            System.out.printf("Banana fana fo %S\n", newName2);
            System.out.printf("Fe fi mo %S\n", newName3);
            System.out.printf("%S!\n", name);
            break;
          case 'f':
            sameLetterName = name.substring(1,nameLength);
            newName1 = "B" + sameLetterName;
            newName3 = "M" + sameLetterName;
            System.out.printf("%S!\n", name);
            System.out.printf("%S, %S bo %S \n", name, name, newName1);
            System.out.printf("Banana fana fo-%S\n", sameLetterName);
            System.out.printf("Fe fi mo %S\n", newName3);
            System.out.printf("%S!\n", name);
            break;
          case 'm':
          sameLetterName = name.substring(1,nameLength);
          newName1 = "B" + sameLetterName;
          newName2 = "F" + sameLetterName;
          System.out.printf("%S!\n", name);
          System.out.printf("%S, %S bo %S \n", name, name, newName1);
          System.out.printf("Banana fana fo %S\n", newName2);
          System.out.printf("Fe fi Mo-%S\n",sameLetterName);
          System.out.printf("%S!\n", name);
          break;

          // if the name does not fit any of the other cases then this will replace the first letter with a B, F or M
          default:
            secondHalfName = name.substring(1,nameLength);
            newName1 = "B" + secondHalfName;
            newName2 = "F" + secondHalfName;
            newName3 = "M" + secondHalfName;
            System.out.printf("%S!\n", name);
            System.out.printf("%S, %S bo %S \n", name, name, newName1);
            System.out.printf("Banana fana fo %S\n", newName2);
            System.out.printf("Fe fi Mo %S\n", newName3);
            System.out.printf("%S!\n", name);
            break;
          }

        }

  }

}
