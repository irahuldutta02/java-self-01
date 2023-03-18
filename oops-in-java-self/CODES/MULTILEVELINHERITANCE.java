class Shape1 {

  public void area() {
    System.out.println("Displays Area of Shape");
  }
}

class Triangle1 extends Shape1 {

  public void area(int h, int b) {
    System.out.println((1 / 2) * b * h);
  }
}

class EquilateralTriangle extends Triangle1 {

  int side;
}

public class MULTILEVELINHERITANCE {

  public static void main(String[] args) {}
}
