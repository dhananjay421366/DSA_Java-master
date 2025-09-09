
public class SuperKeyword {

    /* 
     * Super keyword in Java
     * - super is used to refer immediate parent class object
     *   1. To access parent's properties 
     *   2. To access parent's methods 
     *   3. To access parent's constructor 
     */
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sound();
    }
}

class Animal {

    String color = "Black";

    public Animal() {
        System.out.println("Animal constructor");
    }

    public void eat() {
        System.out.println("Animal eats food");
    }
}

class Tiger extends Animal {

    String color = "Brown";

    // Constructor
    public Tiger() {
        super();   // 3. calling parent constructor
        System.out.println("Tiger constructor");
    }

    public void sound() {
        System.out.println("Tiger roars");
        super.eat();  // 2. calling parent method
        System.out.println("Tiger color = " + color);
        System.out.println("Animal color = " + super.color); // 1. accessing parent property
    }
}
