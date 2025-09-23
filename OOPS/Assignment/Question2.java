
public class Question2 {

    public static void main(String[] args) {
        // que => which variables can the class Person access in the following code

        /*
         * Ans => name , weight
         */

         Person p = new Person();
         System.out.println(p.name);
         System.out.println(p.weight);
    }
}

class Person {

    String name;
    int weight;
}

class Student extends Person {

    int rollNumber;
    String schoolName;
}
