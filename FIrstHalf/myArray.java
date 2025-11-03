
/*
Brendan Lauterborn
726004578
CSCE 111 504
*/

class myArray {
  public static void main(String[] args) {
    String[] animals = new String[10];
    int[] numbers = new int[100];
    int[] addresses = new int[] {1001,1007,1140,1400,1500};

    animals[0] = "Tiger";
    animals[1] = "Bird";
    animals[2] = "Snake";
    animals[0] = "Lion";

    System.out.println(animals[0]);
    System.out.println(animals[1]);
    System.out.println(animals[2]);
    System.out.println(animals);

    for (int i = 0;i < 100; i++ ) {
      numbers[i] = i+1;
    }
    for (int j = 0; j < 100; j++ ) {
      System.out.println(numbers[j] + " ");
    }
    for (int i = 0; i < 5 ; i++ ) {
      System.out.println("The address is " + addresses[i]);
    }
  }
}
