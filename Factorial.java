import java.util.Scanner;

public class Factorial {

    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    public static void displayResult(int result) {
        System.out.println("Factorial is: " + result);
    }

    public static void main(String[] args) {
        int number = getInput();
        int factorial = calculateFactorial(number);
        displayResult(factorial);
    }
}
