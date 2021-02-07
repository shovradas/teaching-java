package Method.IfElse.Number;
import java.util.Scanner;
public class OddEven{
    static String offEven(int num){
        if (num%2==0){
            return "This is an even number";
        }
        else{
            return "This is an odd number"; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println(offEven(num));       
}
}
