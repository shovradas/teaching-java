package String.String;
// Write a program that will print all the characters of a given string in reverse order (by index).
public class Number3_reverse_order {
    public static void main(String[] args) {
        String a = "Hello";
        int i;
        int l = a.length() -1;
        //System.out.println(a.charAt(0));

        for(i=l; i>=0; i--){
            System.out.println(a.charAt(i));
        }
    }
}
