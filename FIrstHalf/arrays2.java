/*
Brendan Lauterborn
726004578
CSCE 111 504
*/

class arrays2 {
  public static void main(String[] args) {
    int[] array1 = {2,4,6,8,10};
    int[] array2 = {2,4,6,8,10};

    // array1[0] = 20;
    // array2[4] = 100;

    System.out.println(array1 + " " + array2);
    if (array1 == array2) {
      System.out.println("Arrays are equal.");
    }
    for (int value : array1 ) {
      System.out.print(value + " ");
    }
    System.out.println();
  }

}
