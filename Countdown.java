import java.util.*;
public class Countdown {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the countdown number :");
      int count = sc.nextInt();
      if(count<=0){
        System.out.println("Please enter the positive number!");

      }
      else{
       for(int i=count;i>=1;i--){
        System.out.println(i);
       }
       System.out.println("Liftoff");
      }
  }
}
