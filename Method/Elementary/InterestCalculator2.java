package Method.Elementary;
public class InterestCalculator2 {

    static double TotalPaymen(int years, double loan_amount, double interest_percentge){
        
        double total_Amount= ((years*loan_amount*interest_percentge)/ 100) + loan_amount;
        return total_Amount;
        
    }
    public static void main(String[] args) {        
        System.out.println ("Total amount to pay : " + TotalPaymen(5, 9.5, 10000.00));
    }
}
