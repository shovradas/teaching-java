package Method.IfElse.Number;

public class SquareDimension {
    static String square_Dimen(int length){
        if (length >= 0){
            return ("Area of the square is : " + (length*length));
        }
        else{
            return ("Error : Length can't be negative");
        }
    }
    public static void main(String[] args) {
        System.out.println(square_Dimen(-20));
}
}