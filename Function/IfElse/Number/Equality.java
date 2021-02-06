package Function.IfElse.Number;

import java.util.Scanner;

public class Equality {
    static void equal(int a, int b, int c) {
        if ((a == b) && (b == c)) {
            System.out.println("all 3 equal");
        } else {
            System.out.println("not all equal");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();

        System.out.println("Enter the second number : ");
        int b = sc.nextInt();

        System.out.println("Enter the third number : ");
        int c = sc.nextInt();

        equal(a, b, c);
    }
}
