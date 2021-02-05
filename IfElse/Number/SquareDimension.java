package IfElse.Number;

public class SquareDimension {
    public static void main(String[] args) {
        int length = -20;
        if (length >= 0){
            System.out.println("Area of the square is : " + (length*length));
        }
        else{
            System.out.println("Error : Length can't be negative");
        }
}
}