import java.util.*;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();

        int sum = n1 + n2;
        System.out.println("Here is the sum of two numbers: " + sum);
    }
}
