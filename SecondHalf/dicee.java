
class dicee {

    private int min;
    private int max;
    private int range;
    private int roll;

public dicee(){
  min = 1;
  max = 6;
  range = max - min + 1;
  roll = (int)(Math.random() * range + min);
  System.out.println(roll);
}

}//end class
