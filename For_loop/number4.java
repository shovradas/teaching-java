package For_loop;

import java.util.Scanner;

//Write a program to print the formatted Series: 1, 3, 5, 7, 9, …., N
public class number4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of 'n' : ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}
