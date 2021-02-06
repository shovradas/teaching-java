package IO.Elementary;

import java.util.Scanner;
//import java.util.Scanner;

public class VATCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter VAT_Percentage : ");
        int VAT_Percentage = sc.nextInt();

        System.out.println("Enter no of seats : ");
        double amount = sc.nextDouble();

        double vatCal = (amount * VAT_Percentage) / 100;

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the amount : ");
        // double a = sc.nextDouble();

        System.out.println("After VAT calculation : " + vatCal);
    }
}
