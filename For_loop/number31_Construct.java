package For_loop;

import java.util.Scanner;

public class number31_Construct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, d;
    
        int num =0;
        int reminder = 0;
        int reverse = 0;

        for (n =3; n > 0; n--) {
            System.out.println("enter digits : ");
            d = scanner.nextInt();
            num = num * 10 + d; // same as reverse 0*10+digit =
        }
        int temp=num;
        // System.out.println(num); //123
        // reversing this number
        for (num = temp; num > 0; num/=10) {
            reminder = num % 10;
            reverse = reverse * 10 + reminder;
        }
        System.out.println(reverse);
    }
}
