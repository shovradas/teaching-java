package IfElse.Character;
import java.util.Scanner;
public class ASCIIPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char ch = sc.next().charAt(0); //https://www.geeksforgeeks.org/gfact-51-java-scanner-nextchar/

        int ascii_Value = ch;

        System.out.println("the ASCII value of " + ch + " is : " + ascii_Value);
    }
}
