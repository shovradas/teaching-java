package Loops.While.Number;

//Write a program to find the 10’s Complement of a given decimal number
public class ten_comp {
    public static void main(String[] args) {

        int number = 1234;
        int reminder = 0;
        int n_complement = 0;
        int reverse = 0;
        int num = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        while (reverse > 0) {
            reminder = reverse % 10;
            n_complement = 9 - reminder;
            num = num*10+ n_complement;
            reverse = reverse / 10;
        }
        System.out.print(num + 1);
    }
}