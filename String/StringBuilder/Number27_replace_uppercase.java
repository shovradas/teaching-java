package String.StringBuilder;
//Write a program to transform a given string to uppercase and print.
public class Number27_replace_uppercase {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("hEllo hobArt");
        int i=0;
        char a_char = a.charAt(i);
        for( i=0;i < a.length();i++){
            if (a.charAt(i) >=97 && a.charAt(i)<=122){
                a_char = (char) (int) (a.charAt(i)-32);
                a.setCharAt(i, a_char);
            } 
            if(a.charAt(i) == ' '){
                System.out.print( ' ');
            }
        }
        System.out.print(a); 
    }
}
