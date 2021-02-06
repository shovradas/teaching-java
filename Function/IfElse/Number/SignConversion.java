package Function.IfElse.Number;
import java.util.Scanner;

public class SignConversion {
    static void signCon(int a){
        if (a >= 0) {
            int negativeVal = a*(-1);
            System.out.println("After conversion the nagetive value is : " + negativeVal);
        } else {
            int positiveVal = a*-1;
            System.out.println("After conversion the positive value is : " + positiveVal);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        signCon(a);        
    }
}
