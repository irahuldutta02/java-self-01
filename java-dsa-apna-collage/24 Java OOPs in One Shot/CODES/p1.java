class Pen {

  String color; // blue || black
  String type; // ball || gel

  public void write() {
    System.out.println("Writing something");
  }

  public void printColor() {
    System.out.println(this.color);
  }

  public void printType() {
    System.out.println(this.type);
  }
}

class Student {

  String name;
  int age;

  public void printInfo() {
    System.out.println(this.name);
    System.out.println(this.age);
  }

  // non - parameterized - constructor

  //   Student() {
  //     System.out.println("Constructor called");
  //   }

  // parameterized - constructor

  //   Student(String name, int age) {
  //     this.name = name;
  //     this.age = age;
  //   }

  //   copy - constructor

  Student(Student s2) {
    this.name = s2.name;
    this.age = s2.age;
  }

  //   default constructor

  Student() {}
  
}

public class p1 {

  public static void main(String[] args) {
    // Pen pen1 = new Pen();
    // pen1.color = "blue";
    // pen1.type = "gel";
    // pen1.write();
    // pen1.printColor();
    // pen1.printType();

    // Pen pen2 = new Pen();
    // pen2.color = "black";
    // pen2.type = "ball";
    // pen2.write();
    // pen2.printColor();
    // pen2.printType();

    // Student s1 = new Student();
    // s1.name = "Rahul";
    // s1.age = 24;
    // s1.printInfo();

    // Student s1 = new Student("Rahul", 20);
    // s1.printInfo();

    Student s1 = new Student();
    s1.name = "Rahul";
    s1.age = 20;

    Student s2 = new Student(s1);
    s2.printInfo();
  }
}
