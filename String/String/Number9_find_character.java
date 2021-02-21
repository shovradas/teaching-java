package String.String;

//Write a program that will search for a given character in a given string. If found print the position else print "NOT FOUND"
public class Number9_find_character {
    public static void main(String[] args) {
        String a = "hello";
        char given_char = 'h';
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == given_char) {
                System.out.println("FOUND");
            } else {
                count++;
            }
        }
        if (count >= a.length()) {
            System.out.println("NOT FOUND");
        }
    }
}
