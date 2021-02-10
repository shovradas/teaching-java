package Loops.While.Number;

//Write a program to print the formatted Series: 11, 22, 43, 84, 165, 326, …., NM
import java.util.Scanner;

public class formattedSeries10 {
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
        // System.out.println("Reversed Number: " + num);
        // // 11+11 = 22;
        // // 22+21 = 43;
        // // 43+41 = 85;
        // // 85+81 = 165;
        // }
    }
}
