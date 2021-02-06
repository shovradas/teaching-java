package IO.Elementary;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Variable : ");       
        String variables1 = sc.nextLine();

        System.out.println("Enter second Variable : ");
        String variables2 = sc.nextLine();

        System.out.println("Before swap");
        System.out.println("Variable 1 : " + variables1);
        System.out.println("Variable 2 : " + variables2);

        String temp = variables1; // keeping one value in othe variavle - temp
        variables1 = variables2; // keeping variables2's value in empty variables1 so now variables2 is aso empty
        variables2 = temp;

        System.out.println("After swap ");
        System.out.println("Variable 1 : " + variables1);
        System.out.println("Variable 2 : " + variables2);
    }
}
