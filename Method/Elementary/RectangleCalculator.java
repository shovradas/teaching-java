package Method.Elementary;

public class RectangleCalculator {

    static double areaOfRectangle(double height, double width){
        Double area = Math.PI * (height * width);
        return area;
    }

    static double perameterOfRectangle(double height, double width){
        Double perameter = Math.PI * (2*(height * width));
        return perameter;
    }

    public static void main(String[] args) {
        System.out.println("Area of the Rectangle : " + areaOfRectangle(2, 4));
        System.out.println("Perameter of the Rectangle : " + perameterOfRectangle(2, 4));
    }
}
