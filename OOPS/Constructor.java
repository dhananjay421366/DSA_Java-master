public class Constructor {

    public Constructor() {

        /*
         * constructor rules
         * 1. Constructors have the same name as class or structure
         * 2. Constructors don't have a return type .(not even void)
         * 3.Constructor are only called , at object creation .
         * 4. Memory allocation happens when constructor called.
         */
    }

    public static void main(String[] args) {
        Student std = new Student("Dhananajy");
        System.out.println(std.name);

    }
}

class Student {

    String name;
    int roll;

    Student(String name) {
        this.name = name;
    }
}
