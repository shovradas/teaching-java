package String.String;
//Write a program to find how many "he" is there is in a string.
public class Number20_Count_he {
    public static void main(String[] args) {
        String a = "hello hunny bunny";
        String start = "he";
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (start.charAt(0) == a.charAt(i) && start.charAt(1) == a.charAt(i + 1)) {
                count++;
            } 
        }
        System.out.println(count);
    }
}
