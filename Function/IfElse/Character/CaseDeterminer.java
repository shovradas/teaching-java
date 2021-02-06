package Function.IfElse.Character;

public class CaseDeterminer {

    static void determinant(char ch) {

        if ((ch >= 'A') && (ch <= 'Z')) {
            System.out.println(ch + " : this letter is presented in upper case");
        } else {
            System.out.println(ch + " : this letter is presented in Lower case");
        }
        return;
    }

    public static void main(String[] args) {
        determinant('c');
    }
}
