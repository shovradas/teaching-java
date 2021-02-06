package IO.Elementary;

import java.util.Scanner;

public class CircleCalculator {

    static double areaOfCircle(double radius){
        Double area = Math.PI * (radius * radius);
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter redius");
        int a = sc.nextInt();

        Double area = Math.PI * (a * a);
        System.out.println("Area of the circle : " + area);
    }
}
