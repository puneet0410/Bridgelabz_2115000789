import java.util.*;
public class CheckNumber {
    static int CheckNumberProgram(int n){
        if(n == 0){
            return 0;
        }
        if(n < 0){
            return -1;
        }
        return 1;
       
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int number = sc.nextInt();
        System.out.println(CheckNumberProgram(number));
    } 
}
