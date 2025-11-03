import java.util.*;
/*
Brendan Lauterborn
726004578
CSCE 111 504
*/

class greeting {
  public static void main(String[] args) {
  int a = 20;
  int b = 30;
  int[] ia = {2,4,6,8};

  hw();

  int sum = myAdd(a,b);
  System.out.println("im back from myAdd");
  System.out.println(sum);
  addArray(ia);
  for (int i : ia ) {
    System.out.print(i + " "



    );
  }

  }//end main

public static void hw(){
  System.out.println("Hello World.");
}//end hw
public static int myAdd(int i, int j){
  i = i + j;
  return i;
}//end myAdd
public static void addArray(int[] ar) {
  for (int i=0;i<ar.length ;i++ ) {
    ar[i] +=10;
  }
}//end addArray
}//end class
