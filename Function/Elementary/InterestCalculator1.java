package Elementary;

public class InterestCalculator1 {
    public static void main(String[] args) {
        // gain after X years
        int years = 5;

        // given deposit amount
        double deposit_amount = 10000.00;

        // flat interest rate
        double interest_percentge = 9.5;

        // calculate the interest amount
        double interest_amount = (years * deposit_amount * interest_percentge) / 100;

        System.out.println("calculated interest : " + interest_amount);
    }
}