package For_loop;
//Write a program that will convert a given decimal number to binary
public class number37_dec2bin {
    public static void main(String[] args) {
        int number;
        int reminder = 0;
        int num = 0;
        int binary = 0;

        for (number = 23; number > 0; number = number / 2) {
            reminder = number % 2;
            // System.out.print(reminder);
            num = num * 10 + reminder; // 11101
        } // System.out.println(num);

        for (; num > 0; num = num / 10) {
            binary = num % 10;
            System.out.print(binary);
        }
    }
}
