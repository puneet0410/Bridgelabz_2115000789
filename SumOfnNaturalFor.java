import java.util.Scanner;

public class SumOfnNaturalFor{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        int formulaSum = n * (n + 1) / 2;
        
        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }
        
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Sum using for loop: " + sumFor);
        
        if (formulaSum == sumFor) {
            System.out.println("Both computations are correct and equal.");
        }
        
        scanner.close();
    }
}