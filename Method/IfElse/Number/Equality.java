package Method.IfElse.Number;

import java.util.Scanner;

public class Equality {
    static String equal(int num1, int num2, int num3) {
        if ((num1 == num2) && (num2 == num3)) {
            return "all 3 equal";
        } else {
            return "not all equal";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        System.out.println("Enter the third number : ");
        int num3 = sc.nextInt();

        System.out.println(equal(num1, num2, num3));
    }
}
