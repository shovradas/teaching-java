package Function.IfElse.Number;

public class SquareDimension {
    static void square_Dimen(int length){
        if (length >= 0){
            System.out.println("Area of the square is : " + (length*length));
        }
        else{
            System.out.println("Error : Length can't be negative");
        }
    }
    public static void main(String[] args) {
        int length = -20;
        square_Dimen(length);
}
}