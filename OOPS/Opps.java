
public class Opps {

    public static void main(String[] args) {

        /*
         * class -> A class body can only contain:

           fields (variables)

           methods

           constructors

           blocks (static or instance initializers)

           nested classes/interfaces/enums

         */
 /* 
         * Class -> Group of Objects || collection of attributes(properties) + functions(behaviours)
         * Object -> Entities in the real world
         */
        Pen p1 = new Pen();
        p1.setColor("Red");
        p1.setTip("Fine");

        // Print attributes
        System.out.println("Pen Color: " + p1.color);
        System.out.println("Pen Tip: " + p1.tip);

        Student s1 = new Student();
        s1.name = "Rahul";
        float perc = s1.calculate(80, 70, 90);
        System.out.println(s1.name + "'s percentage: " + perc + "%");

        /* Bank Account */
        BankAccount myAccount = new BankAccount();
        myAccount.username = "Nimbalkar Dhananjay ";
        // myAccount.password = "1232";  we can't access due to private field

        // but now we can update it || can't access 
        myAccount.setPassword("1232");
        System.out.println(myAccount.username);
    }
}

class Pen {

    String color;
    String tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(String newTip) {
        tip = newTip;
    }
}

class Student {

    String name;
    float percentage;

    float calculate(int phy, int chem, int math) {
        return (phy + chem + math) / 3.0f; // correct percentage calculation
    }
}

class BankAccount {

    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }

}
