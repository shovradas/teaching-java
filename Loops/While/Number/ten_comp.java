package Loops.While.Number;

//Write a program to find the 10’s Complement of a given decimal number
public class ten_comp {
    public static void main(String[] args) {

        int number = 1234567;
        int reminder;
        int count = 0;
        int temp = number;
        int ten_complement;

        while (number > 0) {
            number = number / 10; // reduce the number or discard the last digits
            count++;
        }
        while (temp > 0) {
            reminder = temp % 10;
            // System.out.println(reminder);
            temp = temp / 10;
            count--;
            ten_complement = (9 - reminder) + 1;
            System.out.println(ten_complement);
        }
    }
}
