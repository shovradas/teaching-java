package Function.IfElse.Number;
import java.util.Scanner;
public class OddEven{
    static void offEven(int a){
        if (a%2==0){
            System.out.println("This is a even number");
        }
        else{
            System.out.println("This is a odd number"); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        offEven(a);       
}
}
