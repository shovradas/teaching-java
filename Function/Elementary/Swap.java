package Function.Elementary;

public class Swap {

    public static void main(String[] args) {

        String variables1 = "Hello";
        String variables2 = "World";
        System.out.println("Before swap String : " + (variables1 + " " + variables2));
        swap(variables1, variables2); // swap("Hello", "World");

        System.out.println("After swap String : " + (variables1 + " " + variables2));
    }

    public static void swap(String variables1, String variables2) {
        String temp = variables1; // keeping one value in othe variavle - temp
        variables1 = variables2; // keeping variables2's value in empty variables1 so now variables2 is aso empty
        variables2 = temp;

        System.out.println("Inside method: " + (variables1 + " " + variables2));
        return;
    }
}
