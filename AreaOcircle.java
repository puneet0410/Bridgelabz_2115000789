import java.util.Scanner;

public class AreaOcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        double area = Math.PI * Math.pow(r, 2);
        // Display the result
        System.out.println("The area of the circle is: " + area);
    }
}

