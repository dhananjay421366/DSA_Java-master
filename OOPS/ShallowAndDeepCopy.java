public class ShallowAndDeepCopy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.roll = 101;
        s1.password = "abc";
        s1.marks[0] = 85;
        s1.marks[1] = 90;
        s1.marks[2] = 95;

        // Deep copy
        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100; // change s1’s marks

        System.out.println("s1.marks:");
        for (int i = 0; i < 3; i++) {
            System.out.println(s1.marks[i]);
        }

        System.out.println("s2.marks:");
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // default constructor
    Student() {
        marks = new int[3];
    }

    // shallow copy constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks; // points to same array
    // }

    // deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i]; // copy values
        }
    }
}
