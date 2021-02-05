package Elementary_IO;

public class Swap {
    public static void main(String[] args) {
        String variables1 = "Hello";
        String variables2 = "World";

        System.out.println("Before swap");
        System.out.println ("Variable 1 : " + variables1);
        System.out.println ("Variable 2 : " + variables2);
        
        String temp = variables1; // keeping one value in othe variavle - temp
        variables1 = variables2; // keeping variables2's value in empty variables1 so now variables2 is aso empty
        variables2 = temp;

        System.out.println("After swap ");
        System.out.println("Variable 1 : " + variables1);
        System.out.println("Variable 2 : " + variables2);
    }
}
