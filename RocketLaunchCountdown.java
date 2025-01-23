import java.util.*;
public class RocketLaunchCountdown{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the countdown start value :");
    int counter = sc.nextInt();
    if(counter<=0){
      System.out.println("Please enter a positive integer greater than 0.");
    }
    else{
      while(counter>=1){
        System.out.println(counter);
        counter--;
      }
      System.out.println("Liftoff!");
    }
}



}