class objects {
  public static void main(String[] args) {
    box myBox = new box();
    box yourBox = new box(10, 20, 10);
    circle  myCircle = new circle();
    circle  yourCircle = new circle();    

    yourBox.setLength(15);

    System.out.println("my box volume is " + myBox.getVolume());
    System.out.println("your box volume is " + yourBox.getVolume());
    System.out.println("my box length is: " + myBox.getlength());
  }
}
