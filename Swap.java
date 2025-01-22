import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int temp=-1;
        temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("The Swapped numbers are "+n1+" and "+n2);

    }
}
