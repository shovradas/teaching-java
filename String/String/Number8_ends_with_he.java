package String.String;

//Write a program that will determine if a given string starts with "he" or not. Print Yes or No.
public class Number8_ends_with_he {
    public static void main(String[] args) {
        // String a = "hello";
        String a = "hilhe";
        String start = "he";

        if (start.charAt(0) == a.charAt(a.length() - 2) && start.charAt(1) == a.charAt(a.length() - 1)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
