package Loops.While.Number;

public class dec_oct {
    
public static void main(String[] args) {
    int n = 222;
        int reminder = 0;
        int num = 0;
        int oct = 0;

        while (n > 0) {
            reminder = n % 8;
            n = n / 8;
            num = num * 10 + reminder;
        } // System.out.println(num);

        while (num > 0) {
            oct = num % 10;
            System.out.print(oct);
            num = num / 10;
        }
    }
}