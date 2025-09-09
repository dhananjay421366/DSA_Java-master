

/*
 * Constructor chaining means calling one constructor from another constructor in the same class or calling the parent class constructor from the child class using super().
 * 
 * 👉 this keyword is a reference variable in Java that refers to the current object of the class.
 */
class Student {

    String name;
    int age;
    String course;

    // Constructor 1
    Student() {
        this("Unknown");  // calls Constructor 2
        System.out.println("Default constructor");
    }

    // Constructor 2
    Student(String name) {
        this(name, 18);  // calls Constructor 3
        System.out.println("Name constructor: " + name);
    }

    // Constructor 3
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name + Age constructor: " + name + ", " + age);
    }
}

public class ConstructorChaining {

    public static void main(String[] args) {
        Student s = new Student(); // starts chaining
    }
}
