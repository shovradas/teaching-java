package Function.IfElse.Number;
import java.util.Scanner;
public class GradeCalculator {

    static void gradeCal(double a){
        if((a<=100)&&(a>=90)){
            System.out.println("Grade is A");
        }
        else if((a<=89.99)&&(a>=80)){
            System.out.println("Grade is B");  
        }
        else if ((a<=79.99)&&(a>=70)){
            System.out.println("Grade is C");   
        }
        else if((a<=69.99)&&(a>=60)){
            System.out.println("Grade is D");   
        }
        else if (a<60){
            System.out.println("Grade is F");   
        }
        else{
            System.out.println("Invalid");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        double a = sc.nextDouble();
        
        gradeCal(a);
    }
}
