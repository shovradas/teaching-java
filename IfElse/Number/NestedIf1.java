package IfElse.Number;

public class NestedIf1 {
    public static void main(String[] args) {

        int a = 120;
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
}
