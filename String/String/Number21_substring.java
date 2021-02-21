package String.String;
//Write a program to print the substring of a given string. A substring is specified by a start and an end index. The end index is not inclusive.
public class Number21_substring {
    public static void main(String[] args) {
        String a = "hello hunny bunny";
        int count = 0;
        int i;
        for (i = 6; i < (a.length()-6); i++) {
            System.out.print(a.charAt(i));
        }
        //System.out.println(count);
    }
}
