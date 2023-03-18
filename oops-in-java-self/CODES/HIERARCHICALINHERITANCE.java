class Shape {

  public void area() {
    System.out.println("Displays Area of Shape");
  }
}

class Triangle extends Shape {

  public void area(int h, int b) {
    System.out.println("Area of triangle is : " + ((0.5) * b * h));
  }
}

class Circle extends Shape {

  public void area(int r) {
    System.out.println("Area of circle is : " + ((3.14) * r * r));
  }
}

public class HIERARCHICALINHERITANCE {

  public static void main(String[] args) {
    Shape s1 = new Shape();
    s1.area();
    Triangle s2 = new Triangle();
    s2.area(5, 3);
    Circle s3 = new Circle();
    s3.area(20);
  }
}
