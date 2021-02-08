package Loops.While;

//import java.util.Scanner;

//Write a program that will print all the digits of a given number.
public class PrintDigits {
    public static void main(String args[]) {
        int number = 1234567;
        int reminder;
        int count = 0;
        int temp = number;
        while (number > 0) {
            number = number / 10; // reduce the number or discard the last digits
            count++;
        } // https://beginnersbook.com/2019/02/java-program-to-break-integer-into-digits/
        while (temp > 0) {
            reminder = temp % 10;
            System.out.println(reminder);
            temp = temp / 10;
            count--;
        }
    }
}
