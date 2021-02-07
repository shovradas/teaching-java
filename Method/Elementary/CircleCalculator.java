package Method.Elementary;
public class CircleCalculator {

    static double areaOfCircle(double radius){
        Double area = Math.PI * (radius * radius);
        return area;
    }

    public static void main(String[] args) {
        System.out.println("Area of the circle : " + areaOfCircle(2));
        System.out.println("Area of the circle : " + areaOfCircle(5));
        System.out.println("Area of the circle : " + areaOfCircle(7));
    }
}
