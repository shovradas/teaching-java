package Function.IfElse.Character;

public class CaseDeterminer {

    static String determine(char ch) {
        if ((ch >= 'A') && (ch <= 'Z')) {
            return "Uppercase";            
        } else {
            return "Lowercase";
        }
    }

    public static void main(String[] args) {
        System.out.println(determine('c'));
    }


    // static boolean isUpperCase(char ch) {
    //     if ((ch >= 'A') && (ch <= 'Z')) {
    //         return true;            
    //     } else {
    //         return false;
    //     }
    // }

    // public static void main(String[] args) {
    //     if(isUpperCase('c') == true){
    //         System.out.println("uppercase");
    //     } else{
    //         System.out.println("lowercase");
    //     }
    // }
}
