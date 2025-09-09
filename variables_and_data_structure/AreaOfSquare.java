import java.util.*;

public class AreaOfSquare {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the side of square");
    int side = sc.nextInt();

    // now find the area of square
    int area = side*side;
    System.out.println("The area of square is :" + area);
}

}
