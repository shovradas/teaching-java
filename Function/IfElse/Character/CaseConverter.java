package Function.IfElse.Character;
//import java.util.Scanner;
public class CaseConverter {
    static char convert(char ch){
        int ascii_Value = ch;
        
        if ((ch >= 'A') && (ch <='Z')){
            int t = (ascii_Value+32);
            ch = (char)t;}
        else{
            int p =(ascii_Value-32);
            ch = (char)p;}
        return ch;
    }
    public static void main(String[] args) {
    
            System.out.println("UpperCase of the letter is : " + convert('C'));

    }
}
