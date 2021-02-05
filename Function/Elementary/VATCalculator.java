package Elementary;

//import java.util.Scanner;

public class VATCalculator {
    public static void main(String[] args) {
        int VAT_Percentage = 10;
        double amount = 1000.00;

        double vatCal = (amount * VAT_Percentage) / 100;
        
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the amount : ");
        //double a = sc.nextDouble();

        System.out.println("After VAT calculation : " + vatCal);
    }
}
