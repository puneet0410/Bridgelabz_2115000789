import java.util.*;
public class NumberOfChocolates {
  static int[] findRemainderAndQuotient(int num1,int num2){
    int quotient=num1/num2;
    int remainder=num1%num2;
      return new int[]{quotient,remainder};

  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number = ");
    int num1=sc.nextInt();
    System.out.println(" 2nd number =");
    int num2 =sc.nextInt();
    int[] result = findRemainderAndQuotient(num1,num2);
    System.out.println("Number of chocolates each child gets are "+result[0]+" "+"remaining chocolates"+" "+result[1]);

  }
}
