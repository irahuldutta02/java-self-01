class Shape4 {

  public void area() {
    System.out.println("Displays Area of Shape");
  }
}

class Triangle4 extends Shape4 {

  public void area(int h, int b) {
    System.out.println((0.5) * b * h);
  }
}

public class SINGLEINHERITANCE {

  public static void main(String[] args) {
    Shape4 s1 = new Shape4();
    s1.area();

    Triangle4 s2 = new Triangle4();
    s2.area();
    s2.area(20, 30);
  }
}
