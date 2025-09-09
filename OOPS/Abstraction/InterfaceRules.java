// 1. Interface declaration using 'interface'

interface Vehicle {

    // 2. All methods are public + abstract by default
    void start();

    // 3. Variables are public static final
    int MAX_SPEED = 180;

    // 4. From Java 8 → default + static methods allowed
    default void display() {
        System.out.println("Default: Vehicle max speed = " + MAX_SPEED);
    }

    static void info() {
        System.out.println("Static: Vehicle interface info");
    }
}

// 5. Another interface extending Vehicle (interface can extend interface)
interface Engine extends Vehicle {

    void stop();
}

// 6. Class implements multiple interfaces
class Car implements Engine {

    @Override
    public void start() {
        System.out.println("Car starts with key");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stops");
    }
}

// 7. Main class
public class InterfaceRules {

    public static void main(String[] args) {
        // 8. Polymorphism → reference of interface, object of class
        Vehicle v = new Car();  // upcasting 
        v.start();        // Car starts with key
        v.display();      // Default method from Vehicle
        Vehicle.info();   // Static method from Vehicle

        // 9. Access constant
        System.out.println("Max speed = " + Vehicle.MAX_SPEED);

        // 10. Using Engine reference
        Engine e = new Car();
        e.start();
        e.stop();
    }
}
