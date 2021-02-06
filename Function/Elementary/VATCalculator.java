package Function.Elementary;

//import java.util.Scanner;

public class VATCalculator {

        static double vat(double amount, double VAT_Percentage){
            double vatCal = (amount * VAT_Percentage) / 100;
            return vatCal;
        }
        public static void main(String[] args) {
    
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the amount : ");
        //double a = sc.nextDouble();

        System.out.println("After VAT calculation : " + vat(1000.00, 10.00));
    }
}
