 class Student2 {

	String name;
	int age;
	
	public void displayInfo() {
		System.out.println("Now the name is "+ this.name);
		System.out.println("Now the age is "+ this.age);
	}

	// example of method over loading
	public void setAnddisplayInfo(String name) {
		this.name = name;
		System.out.println("Now the name is "+ this.name);
	}

	public void setAnddisplayInfo(int age) {
		this.age =age;
		System.out.println("Now the age is "+ this.age);
	}

	public void setAnddisplayInfo(String name, int age) {
		this.name = name;
		this.age =age;
		System.out.println("Now the name is "+ this.name);
		System.out.println("Now the age is "+ this.age);
	}
}

public class COMPILETIMEPOLYMORPHISM {
	public static void main(String[] args) {
		Student2 s1 = new Student2();
		s1.name = "Rahul";
		s1.age = 25;
		s1.displayInfo();
		s1.setAnddisplayInfo("Anudip");
		s1.setAnddisplayInfo(20);
		s1.setAnddisplayInfo("Anudip2",23);
	}
}
