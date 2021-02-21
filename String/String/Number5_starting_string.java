package String.String;
//Write a program that will determine if a given string starts with a given character. Print Yes or No.
public class Number5_starting_string {
    public static void main(String[] args) {
        String a = "hello";
        //char given_char = 'h';
        char given_char = 'o';

        //for(int i = 0; i<a.length(); i++){
            if (a.charAt(0) == given_char){
                System.out.println("yes");

            }
            else {System.out.println( "no ");}
        //}
    }
}
