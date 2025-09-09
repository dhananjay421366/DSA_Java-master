
class Student {

    int rollNo;
    String name;
    static String college = "ABC College"; // shared by all references always

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}

public class StaticVariable {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Amit");
        Student s2 = new Student(2, "Priya");

        s1.display();
        s2.display();

        Student.college = "XYZ College"; // change static variable
        System.out.println(Student.college);
        s1.display();
        s2.display();
    }
}
