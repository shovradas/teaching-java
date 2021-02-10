package Loops.While.Number;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while (i <= 2) {
            System.out.println("Enter " + i + "th digit : ");
            int digit = sc.nextInt();
            //System.out.println(number);
            i++;
            int number = digit + i*10;
            while(i<=2){
            number = (i*10 + digit);
                i++;
        }
            // int temp = digit;
           // int number = digit * 10 + digit;
            // while (digit < 7) {
            //     digit = digit * 10 ; // reduce the number or discard the last digits
            //     System.out.println(digit);
            //     count++;
            // }
            // while (temp < 7) {
            //     int reminder = digit + temp;
            //     System.out.println(reminder);
            //     temp = temp * 10;
            //     count++;
            // }
        }
    }
}
