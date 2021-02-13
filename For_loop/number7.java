package For_loop;

import java.util.Scanner;

// Write a program to print the formatted Series: 1, 10, 100, 1000, …., N
public class number7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of 'n' : ");
        int n = scanner.nextInt();
        scanner.close();

        for(int i = 1; i<=n; i*=10){
            System.out.print(i);
            if (i == n) {
            } else {
                System.out.print(",");
            }
        }
    }
}
