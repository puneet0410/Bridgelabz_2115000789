import java.util.*;
public class DuplicateString{

  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter th string");
      String str=sc.nextLine();
      String d="";
      HashSet<Character> hs =new HashSet<>();
      for(int i=0;i<str.length();i++){
        hs.add(str.charAt(i));
      }
      for(Character c:hs){
        d+=c;
      }
      System.out.println(d);
  }
}