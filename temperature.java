import java.util.*;

public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        double temp1 = sc.nextDouble();
        // Convert Celsius to Fahrenheit
        double Fahrenheit = (temp1 * 9 / 5) + 32;
         System.out.println("Here is the temperature in Fahrenheit: " + Fahrenheit);
    }
}
