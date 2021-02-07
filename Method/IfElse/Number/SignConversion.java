package Method.IfElse.Number;
import java.util.Scanner;

public class SignConversion {
    static String signCon(int num){
        if (num >= 0) {
            int negativeVal = num*(-1);
            return ("After conversion the nagetive value is : " + negativeVal);
        } else {
            int positiveVal = num*-1;
            return ("After conversion the positive value is : " + positiveVal);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println(signCon(num));        
    }
}
