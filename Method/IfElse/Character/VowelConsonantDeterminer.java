package Method.IfElse.Character;
import java.util.Scanner;

public class VowelConsonantDeterminer {
    static String VowelConsonant(char ch) {

        if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
            return "is vowel.";
        } else {
            return "is consonent.";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter : ");
        char ch = sc.next().charAt(0);

        System.out.println(VowelConsonant(ch));
    }

}
