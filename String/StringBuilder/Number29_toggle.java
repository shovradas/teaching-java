package String.StringBuilder;
//Write a program that will toggle the case of all the characters in a given string and print.
public class Number29_toggle {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("hEllo hobArt");
        int i=0;
        char a_char = a.charAt(i);
        for( i=0;i < a.length();i++){
            if (a.charAt(i) >=65 && a.charAt(i)<=90){
                a_char = (char) (int) (a.charAt(i)+32);
                System.out.print(a_char);  
            } else { a_char = (char) (int) (a.charAt(i)-32);
                System.out.print(a_char);}
            if(a.charAt(i) == ' '){
                System.out.print( ' ');
            }
        }
    }
}
