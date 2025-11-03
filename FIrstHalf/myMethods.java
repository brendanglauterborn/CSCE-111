
/*
Brendan Lauterborn
726004578
CSCE 111 504
*/
class myMethods {
  public static void main(String[] args) {
    greeting();
    for(int i = 0; i < 1; i++){
      dice();
    }//end for

    coin();
    System.out.println(myAdd(5,7));
    System.out.println(myAdd(myAdd(5,7,8)));
    System.out.println(myAdd(myAdd(12.5,9.6)));
    System.out.println(myAdd("Brendan", "Susie"));

      int[] numbers = myNumbers();
      for (int val : numbers ) {
        System.out.println("Your value is: " + val);
      }//end for
      int[] numbers2={10,20,30,40,50};
      myNumbers(numbers2);
      for (int val : numbers2 ) {
        System.out.println("Your value is: " + val);
      }//end for

      System.out.println("Im in main.");
      deep();
      System.out.println("im back in main");
    }//end main

    public static void deep() {
      System.out.println("im in deep");
      deeper();
      System.out.println("im in deep");
    }//end deep

    public static void deeper();{
      System.out.println("im in deeper");
    }//end deeper

    public static void myNumbers(int[] n){
      for (int i = 0;i < n.length ; i++) {
        n[i] += 100;
      }//end for
    }//end myNumbers

    public static int[] myNumbers(){
      int[] n = {2,4,6,8,10};
      return n;
    }//end myNumbers

  public static int myAdd(int i, int j){
    return i + j;
  }//end myAdd

  public static String myAdd(String i, String j){
    return i + " " + j;
  }//end myAdd

  public static int myAdd(int i, int j, int k){
    return i + j + k;
  }//end myAdd

  public static double myAdd(double i, double j){
    return i + j;
  }//end myAdd

  public static void coin() {
    Random r1 = new Random();
    boolean toss;

    toss = r1.nextBoolean();

    if (toss) {
      System.out.println("Heads");
    }
    else {
      System.out.println("Tails");
    }
  }



  public static void dice() {
    Scanner input = new Scanner(System.in);
    int min = 1;
    int max = 6;
    int range = max - min + 1;

    System.out.println("how many dice do you want to roll? ");
    int rolls = input.nextInt();
    for (int i = 0; i < rolls ; i++ ) {
      System.out.print((int)(Math.random() * range + min) + " ");
    }//end for

  }//end main

  public static void greeting() {
    System.out.println("Welcome to my program");
  }//end greeting

}//end class
