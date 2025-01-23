import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double total = 0.0; 
        double userInput; 
        System.out.println("Enter numbers to sum them up. Enter 0 to finish.");
        while (true) {
            System.out.print("Enter a number: ");
            userInput = sc.nextDouble(); 
              if (userInput == 0) { 
                break; 
            }
            total += userInput; // Add the user input to the total
        }
        System.out.println("The total sum is: " + total);
    }
}