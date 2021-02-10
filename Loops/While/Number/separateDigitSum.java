package Loops.While.Number;


//Write a program that will find and print the summation of all the digits of a given N digit number.
public class separateDigitSum {
    public static void main(String args[]) {
        int number = 1234567;
        int reminder;
        int count = 0;
        int temp = number;
        int sum = 0;
        while (number > 0) {
            number = number / 10; // reduce the number or discard the last digits
            count++;
        }
        while (temp > 0) {
            reminder = temp % 10;
            // System.out.println(reminder);
            temp = temp / 10;
            count--;
            sum = sum + reminder;
        }
        System.out.println(sum);

    }
}
