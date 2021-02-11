package Loops.While.Number;

//import java.util.Scanner;

public class decimalToBinary {
    static String decToBin(int n) {
        if (n == 0)
            return "0";
        String s = "";
        while (n > 0) {
            if ((n & 1) == 0) { // if n =00 & 1 = 01 the 00 & 01 = 0
                System.out.print('0' + s);
            } else {
                System.out.print('1' + s);
            }
            n = n >> 1; //
        }
        return s;
    }

    public static void main(String[] args) {
        int n = 75;
        String bina = decToBin(n);
        // System.out.print (bina);
        long num = Long.parseLong(bina);
        // System.out.println(num);
        long binary = 0;
        while (num > 0) {
            long digit = num % 10;
            binary = binary * 10 + digit;
            num = num / 10;
        }
        System.out.println(binary);

    }
}
