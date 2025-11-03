import java.util.*;
/*
Brendan Lauterborn
726004578
CSCE 111 504
*/

class BrendanLauterborn7 {
  public static void main(String[] args) {
    //this is the void method that simply introduces the program
    intro();
    //getting the length, width and height from the user
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the length of the box in meters");
    double length = input.nextDouble();
    System.out.println("Please enter the width of the box in meters");
    double width = input.nextDouble();
    System.out.println("Please enter the height of the box in meters");
    double height = input.nextDouble();

    // method to find area
    area(length, width);
    System.out.println("Computing...");
    //method to find volume
    double v = volume(height, length, width);
    System.out.println("The volume of the box is " + v + " meters cubed.");


  }//end main

  public static void intro(){
    System.out.println("Hello.\nThis program will calculate the volume of a box given the length, width and height.");

  }//end intro
  
  //calulating area
  public static double area(double l, double w) {
    double area = l * w;
    return area;
  }//end area

//calculating volume
  public static double volume(double h, double l, double w){
    double volume = h * area(l, w);
    return volume;
  }//end volume

}//end class
