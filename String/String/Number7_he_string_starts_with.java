package String.String;
//Write a program that will determine if a given string starts with "he" or not. Print Yes or No.
public class Number7_he_string_starts_with {
    public static void main(String[] args) {
        //String a = "hello";
        String a = "hillo";
        String start = "he";

            if (start.charAt(0)==a.charAt(0) && start.charAt(1)==a.charAt(1)){
                System.out.println("yes");
        }else{System.out.println("no");}
    }
}
