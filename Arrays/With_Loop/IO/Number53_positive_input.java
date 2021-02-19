package Arrays.With_Loop.IO;

import java.util.Scanner;

//Write a program that will take positive numbers as user inputs into an array. The program should stop taking input as soon as it gets a negative value. Print only the given inputs (not the whole array) after all inputs are taken.
public class Number53_positive_input {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);

        a[0] = scanner.nextInt();
        if (a[0] < 0) {
            System.out.println("Error");
            System.out.println("invalid input");
        } else {
            a[1] = scanner.nextInt();
        }
        if (a[1] < 0) {
            System.out.println("error");
            System.out.println(a[0]);
        } else {
            a[2] = scanner.nextInt();
        }
        if (a[2] < 0) {
            System.out.println("error");
            System.out.println(a[1]);
        } else {
            a[3] = scanner.nextInt();
        }
        if (a[4] < 0) {
            System.out.println("error");
            System.out.println(a[2]);
        } else {
            a[4] = scanner.nextInt();
        }
        if (a[4] < 0) {
            System.out.println("error");
            System.out.println(a[3]);
        }
        System.out.println(a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]);
    }
}
