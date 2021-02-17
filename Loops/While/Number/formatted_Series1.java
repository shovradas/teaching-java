package Loops.While.Number;

//Write a program to print the formatted Series: 1, 3, 33, 333, 3333, …., N
import java.util.Scanner;
public class formatted_Series1 {
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number : ");
        int number = scanner.nextInt();
        scanner.close();
        int limit = 7;

        while (i <= limit) {
            System.out.print(number + " , ");
            number = (number * 10) + 3;
            i++;
        }
    }
}

