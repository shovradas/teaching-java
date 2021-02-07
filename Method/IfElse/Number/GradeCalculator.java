package Method.IfElse.Number;
import java.util.Scanner;
public class GradeCalculator {

    static String gradeCal(double marks){
        if((marks<=100)&&(marks>=90)){
            return "Grade is A";
        }
        else if((marks<=89.99)&&(marks>=80)){
            return "Grade is B";  
        }
        else if ((marks<=79.99)&&(marks>=70)){
            return "Grade is C";   
        }
        else if((marks<=69.99)&&(marks>=60)){
            return "Grade is D";   
        }
        else if (marks<60){
            return "Grade is F";   
        }
        else{
            return "Invalid";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        double marks = sc.nextDouble();
        
        System.out.println(gradeCal(marks));
    }
}
