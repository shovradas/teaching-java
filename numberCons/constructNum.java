package numberCons;

import java.util.Scanner;

public class constructNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter digit limit : ");
        int n, d;
        n = scanner.nextInt();
        int num = 0;
        int reminder = 0;
        int reverse = 0;
        while (n-- != 0) {
            System.out.println("enter digits : ");
            d = scanner.nextInt();
            num = num * 10 + d; // same as reverse 0*10+digit =
        }
        // System.out.println(num); //123
        // reversing this number
        while (num > 0) {
            reminder = num % 10;
            reverse = reverse * 10 + reminder;
            num = num / 10;
        }
        System.out.println(reverse);
    }
}