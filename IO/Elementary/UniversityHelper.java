package IO.Elementary;

import java.util.Scanner;

public class UniversityHelper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Examinees : ");
        int numOfExaminees = sc.nextInt();

        System.out.println("Enter no of seats : ");
        int numOfSeats = sc.nextInt();

        System.out.println("Contestants are going to compete for each seat : " + (numOfExaminees / numOfSeats));
    }
}
