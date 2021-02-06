package IO.Elementary;

import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height : ");
        Double height = sc.nextDouble();

        System.out.println("Enter width : ");
        Double width = sc.nextDouble();

        System.out.println("rectangle area :" + (height * width));
        System.out.println("rectangle perimeter :" + (2 * (height * width)));
    }
}
