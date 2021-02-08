package Loops.While;

import java.util.Scanner;

//Write a program that will take the N number of digits as input and construct the number out of those digits. Print the constructed number.
public class constructedNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digits : ");
        int number = sc.nextInt();
        sc.close();

        int reminder;
        int count = 0;
        int temp = number;

        while (number > 0) {
            number = number * 10; // reduce the number or discard the last digits
            count++;
            System.out.println(number);
        } // https://beginnersbook.com/2019/02/java-program-to-break-integer-into-digits/
        while (temp > 0) {
            reminder = temp % 10;
            System.out.println(reminder);
            temp = temp * 10;
            count--;
        }
    }
}
