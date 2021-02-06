package Function.IfElse.Number;

public class NestedIf1 {

    static void nest1(int a) {
        if (a > 100) {
            if (a < 250) {
                if (a % 7 == 0) {
                    System.out.println("the number meets the requirement");
                } else {
                    System.out.println("the number doesn't meets the requirement");
                }
            }
        }
    }

    public static void main(String[] args) {
        int a = 120;
        nest1(a);
    }
}
