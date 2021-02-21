package String.String;
//Write a program that will determine if a given string ends with a given character. Print Yes or No.
public class Number6_end_char {
    public static void main(String[] args) {
        String a = "hello";
        char given_char = 'h';
        //char given_char = 'o';

        //for(int i = 0; i<a.length(); i++){
            if (a.charAt(a.length()-1) == given_char){
                System.out.println("yes");

            }
            else {System.out.println( "no ");}
        //}
    }
}
