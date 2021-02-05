package IfElse.Character;
import java.util.Scanner;
public class CaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter : ");
        char ch = sc.next().charAt(0);
        int ascii_Value = ch;
        
        if ((ch >= 'A') && (ch <='Z')){
            int t = (ascii_Value+32);
            ch = (char)t;
            System.out.println("UpperCase of the letter is : " + ch); //http://www.asciitable.com/
        }
        else{
            int p =(ascii_Value-32);
            ch = (char)p;
           System.out.println("UpperCase of the letter is : " + ch);
        }
    }
}
