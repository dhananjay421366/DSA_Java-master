
public class InterfaceJava {

    public static void main(String[] args) {
        Car c = new Car();
        c.start();  // Car's implementation

        // Reference as Vehicle
        Vehicle v = c;
        v.start();  // Car's implementation (for Vehicle)

        // Reference as Engine
        Engine e = c;
        e.start();  // Car's implementation (for Engine)
    }
}

interface Vehicle {

    void start();
}

interface Engine {

    void start();

    void stop();
}

class Car implements Engine, Vehicle {

    @Override
    public void start() {
        System.out.println("Car is start");
    }

    @Override
    public void stop() {
        System.out.println("Car Engine is stop");
    }
}
