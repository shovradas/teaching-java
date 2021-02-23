package String.String;
//Write a program that will print the ASCII values of all the characters in a given string.
public class Number4_Ascii {
    public static void main(String[] args) {
        String a = "Hello";
        char i;
        int ascii;
    
        for(i = 0; i<a.length(); i++){
        ascii = (int)a.charAt(i);
        System.out.println(ascii);
    }
    }  
}
