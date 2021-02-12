package Loops.While.Number;

public class oct_dec {
    public static void main(String[] args) {
        int n = 27;
        int reminder = 0;
        int dec = 0;
        int i = 0;
        int count = 0;
        // int test = 0;

        while (n > 0) {
            reminder = n % 10; // 7 & 2
            dec = dec + (reminder * 8 * count) + reminder; 
            if (i <= n) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(dec);
    }
}
