package Loops.While.Number;

//Write a program to find the 2’s Complement of a given binary number
public class two_comp {
    public static void main(String[] args) {
        int number = 1101;
        int reminder = 0;
        int count = 0;
        int one_complement = 0;
        int reverse = 0;
        int two_complement = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        // System.out.print(reverse);
        while (reverse > 0) {
            reminder = reverse % 10;
            one_complement = 1 - reminder;
            // System.out.print(one_complement);
            reverse = reverse / 10;
            count--;
            two_complement = 1 + one_complement;
            System.out.print(two_complement);
        }
    }
}
