package Loops.While.Number;

public class nine_comp {
    public static void main(String[] args) {

        int number = 1234567;
        int reminder = 0;
        int count = 0;
        int n_complement = 0;
        int reverse = 0;
        // int temp = reverse;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        while (reverse > 0) {
            reminder = reverse % 10;
            n_complement = 9 - reminder;
            System.out.print(n_complement);
            reverse = reverse / 10;
            count--;
        }

    }
}