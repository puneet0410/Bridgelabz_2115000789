import java.util.Scanner;

public class LargestOfThree {
  public static void main(String[]args){
     Scanner sc= new Scanner(System.in);
    System.out.print("Enter the first number = ");
    int firstNumber=sc.nextInt();
    System.out.print("Enter the second number = ");
    int secondNumber = sc.nextInt();
    System.out.print("Enter the third number =");
    int thirdNumber=sc.nextInt();
    if(firstNumber>secondNumber&&firstNumber>thirdNumber){
      System.out.println("Is the first number the largest?Yes");
      System.out.println("Is the second number the largest?No");
      System.out.println("Is the third number the largest?No");
    }
    else if (secondNumber>firstNumber&&secondNumber>thirdNumber) {
        System.out.println("Is the first number the largest?No");
        System.out.println("Is the second number the largest?Yes");
        System.out.println("Is the third number the largest?No");
    }
    else{
      System.out.println("Is the first number the largest?No");
      System.out.println("Is the second number the largest?No");
      System.out.println("Is the third number the largest?Yes");
    }
  }
}
