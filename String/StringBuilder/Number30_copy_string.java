package String.StringBuilder;

//Write a program to copy one string A to another string B and after copying print B.
public class Number30_copy_string {
    public static void main(String[] args) {
        char[] a = new char[] { 'h', 'e', 'l', 'l', 'o' }; // "hEllo hobArt");
        //System.out.println(a);
        char b[] = new char[a.length];
        char i = 0;
        for(i = 0; i<a.length; i++){
            b[i]=a[i];
            System.out.println(b[i]);
        }

    }
}
