import java.util.*;
public class MaximumHanshakes2 {
  static void MaximumHandshakesCalculation(int n){
    int max_Handshakes=(n*(n-1))/2;
    System.out.println("Maximum number of handshakes="+max_Handshakes);
  }
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number of students = ");
      int n = sc.nextInt();
      MaximumHandshakesCalculation(n);
  }
  
}
