import java.util.Scanner;

public class SumOfnNatural{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        String input = scanner.nextLine();
        
        // Check if the input is a natural number
        if (isNaturalNumber(input)) {
            int n = Integer.parseInt(input);
            
            // Calculate sum using the formula
            int formulaSum = n * (n + 1) / 2;
            
            // Calculate sum using a while loop
            int sumWhile = 0;
            int i = 1;
            while (i <= n) {
                sumWhile += i;
                i++;
            }
            
            // Compare results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + sumWhile);
            
            if (formulaSum == sumWhile) {
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println("There is a discrepancy between the two computations.");
            }
        } else {
            System.out.println("Please enter a valid natural number.");
        }
        
        scanner.close();
    }
    
    // Function to check if the input is a natural number
    private static boolean isNaturalNumber(String n) {
        return n.matches("\\d+") && Integer.parseInt(n) > 0;
    }
}