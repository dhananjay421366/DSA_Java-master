import java.util.*;

public class Gst {
    public static void main(String argd[]) {
        Scanner sc = new Scanner(System.in);
        int GST_value = 18;

        System.out.println("Enter the cost of first item");
        float item1 = sc.nextFloat();

        System.out.println("Enter the cost of seond item");
        float item2 = sc.nextFloat();

        System.out.println("Enter the cost of third item");
        float item3 = sc.nextFloat();

        // now find the total cost of all items
        float totalCost = item1 + item2 + item3;
        System.out.println("The total cost is :" + totalCost);

        // now apply the 18 percent GST on it
        // GST Amount = (Original Price × GST Rate) / 100
        // Final Price = Original Price + GST Amount

        int GST_Amount = (int) totalCost * GST_value / 100;
        int FinalPrice = (int) totalCost + GST_Amount;

        System.out.println("Your item cost without GST is :" + totalCost);
        System.out.println("Your item cost with 18% GST is : " + FinalPrice);

        sc.close();

    }

}
