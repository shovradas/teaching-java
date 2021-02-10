package Loops.While.Number;


public class nine_comp {
    public static void main(String[] args) {

        int number = 1234567;
        int reminder;
        int count = 0;
        int temp = number;
        int n_complement;

        while (number > 0) {
            number = number / 10; // reduce the number or discard the last digits
            count++;
        }
        while (temp > 0) {
            reminder = temp % 10;
            // System.out.println(reminder);
            temp = temp / 10;
            count--;
            n_complement = 9 - reminder;
            System.out.println(n_complement);
        }
    }
}