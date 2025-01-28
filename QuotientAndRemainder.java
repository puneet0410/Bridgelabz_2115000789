import java.util.*;
public class QuotientAndRemainder {
  static int[] FindQuotientandReamainder(int num1,int num2){
    int quotient = num1/num2;
    int remainder=num1%num2;
    return new int[]{quotient,remainder};
  }


 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number = ");
     int num1=sc.nextInt();
     System.out.println(" 2nd number =");
     int num2 =sc.nextInt();
     int[] result = FindQuotientandReamainder(num1,num2);
     System.out.println("the quotient is "+ result[0]);
     System.out.println("the remainder is "+result[1]);
 } 
}
