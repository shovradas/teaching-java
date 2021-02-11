package Loops.While.Number;

//Write a program to find the 10’s Complement of a given decimal number
public class ten_comp {
    public static void main(String[] args) {

        int ten_complement;
        int number = 1234567;
        int reminder = 0;
        int count = 0;
        int n_complement = 0;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        while (reverse > 0) {
            reminder = reverse % 10;
            n_complement = 9 - reminder;
            reverse = reverse / 10;
            count--;
            ten_complement = n_complement + 1;
            System.out.print(ten_complement);
        }

    }
}