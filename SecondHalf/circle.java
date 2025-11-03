class circle {
  private int radius;
  private double area;

  public circle(){
    radius = 2;
    area = Math.PI * radius * radius;
    System.out.println("We created a circle");
    System.out.println("radius: " + radius);
    System.out.println("Area: " + area);
  }

  public circle(int r){
    radius = r;
    area = Math.PI * radius * radius;
    System.out.println("We created a custom circle");
    System.out.println("Radius: " + radius);
    System.out.println("Area: " + area);
  }


  public int getRadius(){
    return radius;
  }

  public void setRadius(int r){
    radius = r;
      area = Math.PI * radius * radius;
  }
}
