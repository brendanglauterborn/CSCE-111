class box {
  private int length;
  private int width;
  private int height;

  public box(){
    length = 2;
    width = 3;
    height =2;
    System.out.println("We created a box");
    System.out.println("Length: " + length);
    System.out.println("Width: " + width);
    System.out.println("Height: " + height);
  }

  public box(int l, int w, int h){
    length = l;
    width = w;
    height =h;
    System.out.println("We created a custom box");
    System.out.println("Length: " + length);
    System.out.println("Width: " + width);
    System.out.println("Height: " + height);
  }

public int getVolume(){
  return height * width * length;
}

public int getlength(){
  return length;
}

public void setLength(int l){
  length = l;
}
}
