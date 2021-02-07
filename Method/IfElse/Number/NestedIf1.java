package Method.IfElse.Number;

public class NestedIf1 {

    static String nest1(int num) {
        if (num > 100) {
            if (num < 250) {
                if (num % 7 == 0) {
                    return "the number meets the requirement";
                } else {
                    return "the number doesn't meets the requirement";
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(nest1(120));
    }
}
