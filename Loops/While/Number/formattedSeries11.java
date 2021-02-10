package Loops.While.Number;

//Write a program to print the formatted Series: 11, 22, 34, 48, 516, 632, …., NM
import java.util.Scanner;

public class formattedSeries11 {
    public static void main(String[] args) {
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = scanner.nextInt();
        scanner.close();
        int x = 10;
        // int series = 11;
        while (i < 10) {
            x = num / 10 * 10 + 1; // 1*10+1 = 21
            num = num + x;
            System.out.println(num);
            i++;
        }
    }
}

// 11 -> 22 = 11
// 22 - > 34 = 12
// 34 -> 48 = 14
// 48 ->516 = 468
// 516 -> 632 = 116
