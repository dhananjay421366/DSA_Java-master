public class Question5 {

    public static void main(String[] args) {
        Vehicle v = new Car();
        v.print(); // derived class // due to fuc overriding

        Vehicle v2 = new Vehicle();
        v2.print();  // base class
    }

}

class Vehicle {

    void print() {
        System.out.println("Base class");
    }
}

class Car extends Vehicle {

    void print() {
        System.out.println("Derived class");
    }
}
