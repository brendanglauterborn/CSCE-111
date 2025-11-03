/*
Brendan Lauterborn
726004578
CSCE 111 504
*/

class myRandom {
  public static void main(String[] args) {
    System.out.println(Math.random());
    int min = 10;
    int max = 40;
    int range = max - min + 1;
    double guess = Math.random() * range + min;
    System.out.println("your random number is: " + (int)guess);
  }//end main

}//end class
