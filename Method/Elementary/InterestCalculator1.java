package Method.Elementary;

public class InterestCalculator1 {
    
    static double calculatedInterest(double years, double deposit_amount, double interest_percentge) {
        double interest_amount = (years * deposit_amount * interest_percentge) / 100;
        return interest_amount;
    }

    public static void main(String[] args) {
        System.out.println("calculated interest : " + calculatedInterest(5.00, 10000.00, 9.5));
    }
}