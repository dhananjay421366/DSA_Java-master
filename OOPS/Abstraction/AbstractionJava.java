
public class AbstractionJava {

    public static void main(String[] args) {
        /*
         *  Abstraction => Hiding all the unnecessary details     and showing only the important part of the user
         * 
         * Rule => 1. Cannot create instance of abstract class
         *         2. Can have abstract and normal method 
         *         3. Can have constructors
         * 
         *1. Abstract classes 
         *2. Interfaces
         */
 /*
         * Animal animal = new Animal();
         * this line showing error due to we cannot create the object of abstract class
         */

        Animal a = new Horse();  // upcasting
        // a.eat();
        // a.walk();
        System.out.println(a.color);

        Horse h = new Horse();
        // System.out.println("Horse object");
        // h.eat();
        // h.walk();
        System.out.println(h.color);
        h.changeColor();
        System.out.println(h.color);

        Chicken c = new Chicken();
        // System.out.println("Chicken object");
        // // c.eat();
        // c.walk();
        System.out.println(c.color);
    }
}

/*  Abstract classes  */
abstract class Animal {

    String color;

    public Animal() {
        color = "brown";
    }

    void eat() {
        System.out.println("animal eating");
    }

    abstract void walk();
}

class Horse extends Animal {

    void walk() {
        System.out.println("Walk on 4 legs");
    }

    void changeColor() {
        color = "dark  brown";
    }
}

class Chicken extends Animal {

    void walk() {
        System.out.println("walk on 2 legs");
    }
}
