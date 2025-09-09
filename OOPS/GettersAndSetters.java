public class GettersAndSetters {

    /*
     *  Get => to return the value 
     *  Set => to modify the value 
     * 
     *  this keyword => refers to the current object
     */
    public static void main(String[] args) {
        Pen p1 = new Pen();

        // Display default Ink values
        System.out.println("Initial Color: " + p1.displayData());

        // Update using setter (inherited from Ink)
        p1.setColor("Red");
        System.out.println("Updated Color: " + p1.displayData());
    }
}

class Ink {
    private String color = "1232";  // encapsulated
    private String tip = "Default";

    // getters
    public String getColor() {
        return this.color;
    }

    public String getTip() {
        return this.tip;
    }

    // setters
    public void setColor(String newColor) {
        this.color = newColor;
    }

    public void setTip(String newTip) {
        this.tip = newTip;
    }
}

class Pen extends Ink {
    // No duplicate fields here
    // Uses Ink's fields via getters and setters

    public String displayData() {
        return getColor(); // accessing parent private field via getter
    }
}
