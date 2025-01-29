import java.util.Scanner;

public class Prime {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    public static void displayResult(boolean result) {
        if (result) {
            System.out.println("The number is prime.");
        } else {
            System.out.println("The number is not prime.");
        }
    }

    public static void main(String[] args) {
        int number = getInput();
        boolean prime = isPrime(number);
        displayResult(prime);
    }
}
