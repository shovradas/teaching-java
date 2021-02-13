package For_loop;

import java.util.Scanner;

//Write a program to print the formatted series: N, …., 6, 5, 4, 3, 2, 1
public class number3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of 'n' : ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = n; i >= 1; i--) {
            System.out.print(i);
            if (i == 1) { 
            }
            else{
                System.out.print(",");
            }
        }
    }
}
