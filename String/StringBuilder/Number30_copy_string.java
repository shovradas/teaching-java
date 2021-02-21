package String.StringBuilder;
//Write a program to copy one string A to another string B and after copying print B.
public class Number30_copy_string {
    public static void main(String[] args) {
    StringBuilder a = new StringBuilder("hEllo hobArt");
    StringBuilder b = new StringBuilder(a.length());
    System.out.println(b.length());
    int i = 0;
    char b_char = b.charAt(i);
       
        for ( i = 0; i<b.length(); i++){
            a.setCharAt(b_char, a.charAt(i));
            System.out.println(b);
        }
    }
}
