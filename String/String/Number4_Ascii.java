package String.String;
//Write a program that will print the ASCII values of all the characters in a given string.
public class Number4_Ascii {
    public static void main(String[] args) {
        String a = "Hello";
        char i;
        int ascii;
        //int l = a.length() -1;
        //System.out.println(a.charAt(0));
        for(i = 0; i<a.length(); i++){
        //if((i=='h')||(i=='e')||(i=='l')||(i=='l')||(i=='0'));
        //System.out.println("Ascii value of     " + (char)i );
        ascii = (int)a.charAt(i);
        System.out.println(ascii);
    }
    }  
}
