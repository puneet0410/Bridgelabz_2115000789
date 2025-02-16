import java.util.*;

public class Reverse {

    static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String rvr = sc.nextLine();
        sc.close();

        String rverse = reverseString(rvr); 
        System.out.println("Reversed string: " + rverse);
    }
}
