package Loops.While.Number;

//Write a program that will print all the digits of a given number.
public class seperateDigits {
    public static void main(String args[]) {
        int number = 1234567;
        int reminder;
        int wrongOrder = 0;
        int digit;
        while (number > 0) {
            reminder = number % 10;
            // System.out.println(reminder);
            number = number / 10;
            wrongOrder = wrongOrder * 10 + reminder;
        }
        while (wrongOrder > 0) {
            digit = wrongOrder % 10;
            System.out.println(digit);
            wrongOrder = wrongOrder / 10;
        }
    }
}
