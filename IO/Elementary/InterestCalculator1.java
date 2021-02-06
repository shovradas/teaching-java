package IO.Elementary;

import java.util.Scanner;

public class InterestCalculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter years : ");
        int years = sc.nextInt();

        System.out.println("Enter deposit_amount : ");
        Double deposit_amount = sc.nextDouble();

        System.out.println("Enter interest_percentge : ");
        Double interest_percentge = sc.nextDouble();

        // calculate the interest amount
        double interest_amount = (years * deposit_amount * interest_percentge) / 100;

        System.out.println("calculated interest : " + interest_amount);
    }
}