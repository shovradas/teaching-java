package String.String;
//Write a program that will print all the characters of a given string.
public class Number2_Print_Character {
    public static void main(String[] args) {
        String a = "Hello";
        char i;

        //System.out.println(a.charAt(0));

        for(i= 0; i<a.length();i++){
            System.out.println(a.charAt(i));
        }
    }
}
