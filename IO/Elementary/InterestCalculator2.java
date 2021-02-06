package IO.Elementary;

import java.util.Scanner;

public class InterestCalculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter years : ");
        int years = sc.nextInt();

        System.out.println("Enter deposit_amount : ");
        Double loan_amount = sc.nextDouble();

        System.out.println("Enter interest_percentge : ");
        Double interest_percentge = sc.nextDouble();

        // calculate the interest amount
        double interest_amount = (years * loan_amount * interest_percentge) / 100;

        System.out.println("Total amount to pay : " + (interest_amount + loan_amount));
    }
}
