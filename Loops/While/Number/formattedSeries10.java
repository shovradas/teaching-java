package Loops.While.Number;

//Write a program to print the formatted Series: 11, 22, 43, 84, 165, 326, …., NM
import java.util.Scanner;

public class formattedSeries10 {
    public static void main(String[] args) {
        int i = 1;
        int x = 1;
        int y = 1;
        int n = 5;
        // int series = 11;
        while (i <= 5) {
            y = i;
            System.out.print(x + "" + y);
            x = x * 2;
            if (i < n) {
                System.out.print(",");
            }
            i++;
        }
    }
}
