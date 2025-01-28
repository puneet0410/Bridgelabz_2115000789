import java.util.*;
public class SimpleInterest {
  static void SimpleInterestCalculation(int principle, int rate,int time){
    int simpleInterest=(principle*rate*time)/100;
    System.out.println("The Simple Interest is"+" "+simpleInterest+" "+"for Principle"+" "+principle+" "+"Rate of Interest"+" "+rate+" "+"amd Time"+" "+time);


  }
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the principle =");
      int principle=sc.nextInt();
      System.out.println("enter the rate = ");
      int rate = sc.nextInt();
      System.out.println("Enter the time :");
      int time =sc.nextInt();
      SimpleInterestCalculation(principle,rate,time);
  }
}
