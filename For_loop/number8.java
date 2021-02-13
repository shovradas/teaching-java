package For_loop;

import java.util.Scanner;

//Write a program to print the formatted Series: N, …., 1000, 100, 10, 1
public class number8 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of 'n' : ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = n; i >= 1; i /= 10) {
            System.out.print(i);
            if (i == 1) {
            } else {
                System.out.print(",");
            }
        }
    }
}
