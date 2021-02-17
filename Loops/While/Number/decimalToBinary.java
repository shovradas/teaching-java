package Loops.While.Number;

//import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {

        int number = 23;
        int reminder = 0;
        int num = 0;
        int binary = 0;

        while (number > 0) {
            reminder = number % 2;
            // System.out.print(reminder);
            num = num * 10 + reminder; // 11101
            number = number / 2;
        } // System.out.println(num);

        while (num > 0 ) {
            binary = num % 10;
            num = num / 10;
            System.out.print(binary);
        }
    }
}
