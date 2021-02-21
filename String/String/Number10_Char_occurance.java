package String.String;
//Write a program that will count the occurrences of a given character in a given string.
public class Number10_Char_occurance {
    public static void main(String[] args) {
        String a = "hello";
        char given_char = 'l';
        int count=0;
        for (int i = 0; i < a.length(); i++){
            if (a.charAt(i)==  given_char){
                count++;
            }
        }
        System.out.println(count);
    }
}
