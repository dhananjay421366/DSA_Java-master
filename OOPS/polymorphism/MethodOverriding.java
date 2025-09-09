
/*   Method Overriding => run time => Parent and child classes both contain the same function with a different definition(func body) */
public class MethodOverriding {

    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animal {

    void eat() {
        System.out.println("Eating anything");
    }
}

class Deer {

    void eat() {
        System.out.println("Eating grass");
    }
}
