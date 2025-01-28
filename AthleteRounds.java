import java.util.*;

public class AthleteRounds {
    static void AthleteRoundsCalculation(int side1, int side2, int side3, int distance) {
        int perimeter = side1 + side2 + side3;
        int max_Rounds = distance / perimeter; 
        System.out.println("Maximum rounds the athlete can complete: " + max_Rounds);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side 1 = ");
        int side1 = sc.nextInt();
        System.out.println("Enter the side 2 = ");
        int side2 = sc.nextInt();
        System.out.println("Enter the side 3 = ");
        int side3 = sc.nextInt();
        
        int distance = 5; 
        AthleteRoundsCalculation(side1, side2, side3, distance);
    }
}
