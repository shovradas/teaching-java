package IfElse.Character;
import java.util.Scanner;
public class CaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter : ");
        char ch = sc.next().charAt(0);
        
        if ((ch >= 'A') && (ch <='Z')){
            System.out.println("UpperCase of the letter is : " + Character.toLowerCase(ch));
        }
        else{
           System.out.println("UpperCase of the letter is : " + Character.toUpperCase(ch));
        }
    }
}
