import java.util.*;

public class Palindrome{

  static boolean isPalindrome(String s){
    int left=0;
    int right=s.length()-1;
    boolean isPlaindrome=true;
    while(left<right){
      if(s.charAt(left)!=s.charAt(right)){
        return false;
      }
      left ++;
      right --;
    }return true;
  

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string = ");
    String str=sc.nextLine();
    System.out.println(isPalindrome(str));

  }
}