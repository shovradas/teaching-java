package Loops.While.Number;

//Write a program to print the formatted Series: 11, 22, 34, 48, 516, 632, …., NM
import java.util.Scanner;

public class formattedSeries11 {
    public static void main(String[] args) {
        int i = 1;
        int x = 1;
        int y;
        // int series = 11;
        while (i <= 5) {
            y = i;
            System.out.print(y + "" + x);
            x = x * 2;
            if (i < 5) {
                System.out.print(",");
            }
            i++;
        }
    }
}

// 11 -> 22 = 11
// 22 - > 34 = 12
// 34 -> 48 = 14
// 48 ->516 = 468
// 516 -> 632 = 116
