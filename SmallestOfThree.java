import java.util.*;
public class SmallestOfThree {
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the first number = ");
    int firstNumber=sc.nextInt();
    System.out.print("Enter the second number = ");
    int secondNumber = sc.nextInt();
    System.out.print("Enter the third number =");
    int thirdNumber=sc.nextInt();
    if(firstNumber<secondNumber && firstNumber<thirdNumber){
      System.out.println("Is the first number the smallest?Yes ");
    }
    else{
      System.out.println("Is the first number the smallest?No");
    }


  }
}
