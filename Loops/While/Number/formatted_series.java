package Loops.While.Number;

//Write a program to print the formatted Series: 9, 99, 999, 9999, …., N

import java.util.Scanner;

public class formatted_series {
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number : ");
        int number = scanner.nextInt();
        scanner.close();
        int limit = 10;

        while (i <= limit) {
            System.out.print(number + " + ");
            number = (number * 10) + 9;
            i++;
        }
    }
}
