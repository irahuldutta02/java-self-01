class Person {
    String name;
    int age;
    String address;
}

// set of values stored in the instance variables of an object at any given time
// is called Object state or state of the object

public class ObjectState {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "Rahul";
        p1.age = 20;
        p1.address = "Midnapore";

        // the state of the object p1 is
        // name = Rahul
        // age = 20
        // address = Midnapore

        p1.age = 21;

        // now the state of the object p1 is changed
        // name = Rahul
        // age = 21
        // address = Midnapore

        // State of an object is releviend in OOP as it helps to determine what
        // operations can be performed on the object and how it interact with other
        // objects in a system
    }
}