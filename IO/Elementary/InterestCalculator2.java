package IO.Elementary;
import java.util.Scanner;
public class InterestCalculator2 {
    public static void main(String[] args) {
        //gain after X years 
        int years = 5;

        //given deposit amount
        double loan_amount = 10000.00;
            
        //flat interest rate
        double interest_percentge = 9.5;

        //calculate the interest amount 
        double interest_amount = (years*loan_amount*interest_percentge)/ 100;
        
        System.out.println ("Total amount to pay : " + (interest_amount+loan_amount));
    }
}
