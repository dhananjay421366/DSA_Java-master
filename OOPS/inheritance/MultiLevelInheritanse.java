
public class MultiLevelInheritanse {
    public static void main(String[] args) {
        Dog doby = new Dog();
        doby.eat();

    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eat");
    }
}

class Mammals {

    int leg;
}

class Dog {

    String name;

    void eat() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
