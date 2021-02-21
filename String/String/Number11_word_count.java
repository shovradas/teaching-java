package String.String;

// Write a program to find how many words are there in given sentence.
public class Number11_word_count {
    public static void main(String[] args) {
        String a = "abc abc abc abc abc";
        int count = 1;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
