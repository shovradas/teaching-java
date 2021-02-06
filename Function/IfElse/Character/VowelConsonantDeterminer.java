package Function.IfElse.Character;
import java.util.Scanner;
public class VowelConsonantDeterminer{

    static void VowelConsonant(char ch){
       
        if ((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')){
            System.out.println(ch + " is vowel.");
        }
        else{
            System.out.println(ch + " is consonent.");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter : ");
        char ch = sc.next().charAt(0);

        VowelConsonant(ch);
    }
    
}
