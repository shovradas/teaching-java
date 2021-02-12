package Loops.While.Number;

public class Dec_bin {
    public static void main(String[] args) {
        int n = 23;
        int reminder = 0;
        int num = 0;
        int binary = 0;

        while (n > 0) {
            reminder = n % 2;
            // System.out.print(reminder);
            n = n / 2;
            num = num * 10 + reminder; //11101
        }  System.out.println(num);

        while (num > 0) {
            binary = num % 10;
            System.out.print(binary);
            num = num / 10;
        }
    }
}