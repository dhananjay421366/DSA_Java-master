
public class RunTime_Polymorphism {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.sound();

        Dog d = new Dog();
        d.sound();

        Cat c = new Cat();
        c.sound();
    }
}

class Animal {

    void sound() {
        System.out.println("different sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Barks");
    }
}

class Cat extends Animal {

    void sound() {
        System.out.println("Meow");
    }
}
