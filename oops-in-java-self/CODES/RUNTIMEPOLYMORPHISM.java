class Shape2 {

  public void area() {
    System.out.println("Displays Area of Shape");
  }
}

class Triangle2 extends Shape2 {

  public void area(int h, int b) {
    System.out.println((0.5) * b * h);
  }
}

class Circle2 extends Shape2 {

  public void area(int r) {
    System.out.println((3.14) * r * r);
  }
}

public class RUNTIMEPOLYMORPHISM {

  public static void main(String[] args) {
    Shape2 s1 = new Shape2();
    s1.area();
    Triangle2 s2 = new Triangle2();
    s2.area();
    s2.area(20, 10);
    Circle2 s3 = new Circle2();
    s3.area();
    s3.area(10);
  }
}
