package String.String;

public class Number17_print_consonenent {
    public static void main(String[] args) {
        String a = "I Love cooking";
        for (int i = 0; i < a.length(); i++) {
            if ((a.charAt(i) != 'a') && (a.charAt(i) != 'e') && (a.charAt(i) != 'i') && (a.charAt(i) != 'o')
                    && (a.charAt(i) != 'u')) {
                System.out.println(a.charAt(i));
            }
        }
    }
}
